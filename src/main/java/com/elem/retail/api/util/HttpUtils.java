package com.elem.retail.api.util;

import com.elem.retail.api.HttpResponseData;
import org.apache.commons.lang3.StringUtils;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-03
 */
public class HttpUtils {

    public static HttpResponseData doPost(String url, String param, int connectTimeout, int readTimeout) throws IOException {
        HttpResponseData response = new HttpResponseData();
        HttpURLConnection connection = null;
        try {
            connection = getConnection(new URL(url), "POST", null, null);
            connection.setConnectTimeout(connectTimeout);
            connection.setReadTimeout(readTimeout);

            OutputStream out = connection.getOutputStream();
            out.write(param.getBytes(StandardCharsets.UTF_8));
            String body = getResponseAsString(connection);

            response.setBody(body);
            response.setResponseCode(connection.getResponseCode());
            response.setResponseMessage(connection.getResponseMessage());
            response.setHeaders(connection.getHeaderFields());
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }

        return response;
    }

    public static HttpResponseData doGet(String url, Map<String, String> param, int connectTimeout, int readTimeout) throws IOException {
        HttpResponseData response = new HttpResponseData();
        HttpURLConnection connection = null;
        try {
            String query = buildQuery(param);
            connection = getConnection(buildGetUrl(url, query), "GET", null, null);
            connection.setConnectTimeout(connectTimeout);
            connection.setReadTimeout(readTimeout);

            String body = getResponseAsString(connection);
            response.setBody(body);
            response.setResponseCode(connection.getResponseCode());
            response.setResponseMessage(connection.getResponseMessage());
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }

        return response;
    }

    private static HttpURLConnection getConnection(URL url, String method, Map<String, String> headers, Proxy proxy)
            throws IOException {
        HttpURLConnection connection;
        if (proxy == null) {
            connection = (HttpURLConnection) url.openConnection();
        } else {
            connection = (HttpURLConnection) url.openConnection(proxy);
        }

        if (connection instanceof HttpsURLConnection) {
            HttpsURLConnection connectionHttps = (HttpsURLConnection) connection;
            try {
                SSLContext ctx = SSLContext.getInstance("TLS");
                ctx.init(null, new TrustManager[]{
                        new X509TrustManager() {
                            @Override
                            public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

                            }

                            @Override
                            public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

                            }

                            @Override
                            public X509Certificate[] getAcceptedIssuers() {
                                return new X509Certificate[0];
                            }
                        }
                }, new SecureRandom());
                connectionHttps.setSSLSocketFactory(ctx.getSocketFactory());
                connectionHttps.setHostnameVerifier((hostname, session) -> true);
            } catch (Exception e) {
                throw new IOException(e);
            }

            connection = connectionHttps;
        }

        connection.setRequestMethod(method);
        connection.setDoOutput(true);

        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                connection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }

        connection.setRequestProperty("Accept", "text/xml,text/javascript");
        connection.setRequestProperty("User-Agent", "elem-sdk-java");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");

        return connection;
    }

    private static String getResponseAsString(HttpURLConnection connection) throws IOException {
        int responseCode = connection.getResponseCode();
        if (responseCode < HttpURLConnection.HTTP_BAD_REQUEST) {
            String contentEncoding = connection.getContentEncoding();
            if ("gzip".equals(contentEncoding)) {
                return getStreamAsString(new GZIPInputStream(connection.getInputStream()));
            } else {
                return getStreamAsString(connection.getInputStream());
            }
        } else {
            InputStream error = connection.getErrorStream();
            if (error != null) {
                return getStreamAsString(error);
            }

            throw new IOException(responseCode + ":" + connection.getResponseMessage());
        }
    }

    private static String getStreamAsString(InputStream in) throws IOException {
        try {
            Reader reader = new InputStreamReader(in, StandardCharsets.UTF_8);
            StringBuilder sb = new StringBuilder();
            char[] buffer = new char[1024];

            int p;
            while ((p = reader.read(buffer)) > 0) {
                sb.append(buffer, 0, p);
            }

            return sb.toString();
        } finally {
            if (in != null) {
                in.close();
            }
        }

    }

    private static String buildQuery(Map<String, String> param) throws IOException {
        if (param == null || param.isEmpty()) {
            return null;
        }

        StringBuilder query = new StringBuilder();
        Set<Map.Entry<String, String>> entries = param.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String name = entry.getKey();
            String value = entry.getValue();
            if (StringUtils.isNoneBlank(name, value)) {
                query.append(name).append("=").append(URLEncoder.encode(value, "UTF-8")).append("&");
            }
        }

        if (query.length() > 0) {
            query.setLength(query.length() - 1);
        }

        return query.toString();
    }

    private static URL buildGetUrl(String url, String query) throws IOException {
        if (StringUtils.isBlank(query)) {
            return new URL(url);
        }

        return new URL(url + "?" + query);
    }
}
