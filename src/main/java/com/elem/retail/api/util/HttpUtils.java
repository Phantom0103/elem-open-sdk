package com.elem.retail.api.util;

import com.elem.retail.api.HttpResponseData;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;

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
            connection.setDoOutput(true);
            connection.setUseCaches(false);

            OutputStream out = connection.getOutputStream();
            out.write(param.getBytes(StandardCharsets.UTF_8));
            InputStream in = connection.getInputStream();
            String body = getStreamAsString(in);

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

        if (headers != null) {
            String host = headers.get("TOP_HTTP_DNS_HOST");
            connection.setRequestProperty("Host", host == null ? url.getHost() : host);

            for (Map.Entry<String, String> entry : headers.entrySet()) {
                if (!"TOP_HTTP_DNS_HOST".equals(entry.getKey())) {
                    connection.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
        }

        connection.setRequestProperty("Accept", "text/xml,text/javascript");
        connection.setRequestProperty("User-Agent", "elem-sdk-java");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");

        return connection;
    }

    private static String getStreamAsString(InputStream in) throws IOException {
        Reader reader = new InputStreamReader(in, StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] buffer = new char[1024];

        int p;
        while ((p = reader.read(buffer)) > 0) {
            sb.append(buffer, 0, p);
        }

        return sb.toString();
    }
}
