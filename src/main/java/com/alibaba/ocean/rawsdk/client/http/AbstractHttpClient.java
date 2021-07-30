package com.alibaba.ocean.rawsdk.client.http;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.ParseException;
import java.util.Map;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.ocean.rawsdk.client.entity.ResponseWrapper;
import com.alibaba.ocean.rawsdk.client.pollicy.RequestPolicy;
import com.alibaba.ocean.rawsdk.client.serialize.Json2Deserializer;
import com.alibaba.ocean.rawsdk.common.AbstractAPIRequest;
import com.alibaba.ocean.rawsdk.common.BizResultWrapper;
import com.alibaba.ocean.rawsdk.common.EleConstants;
import com.alibaba.ocean.rawsdk.client.Request;
import com.alibaba.ocean.rawsdk.client.Response;

public class AbstractHttpClient {

    private static Logger logger = Logger.getLogger("AbstractHttpClient");

    public AbstractHttpClient() {
        super();
    }

    public Response doPost(URL url, Map<String, Object> parameters, AbstractAPIRequest request) throws IOException {
        HttpURLConnection conn = null;
        OutputStream out = null;
        Response response = null;
        try {
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoInput(true);
            conn.setDoOutput(true);
            RequestPolicy clientPolicy = request.getOceanRequestPolicy();
            Map<String, String> clientHttpHeader = HttpSupport.buildHttpHeader(clientPolicy);
            for (Map.Entry<String, String> entry : clientHttpHeader.entrySet()) {
                conn.setRequestProperty(entry.getKey(), entry.getValue());
            }
            String query = HttpSupport.buildQuery(parameters);
            byte[] content = {};
            if (query != null) {
                content = query.getBytes(clientPolicy.getContentCharset());
            }
            out = conn.getOutputStream();
            out.write(content);

            // 解析请求结果
            response = parseResponseInfo(request, conn);
        } catch (IOException e) {
            logger.warning("doPost请求异常");
            throw e;
        } finally {
            if (out != null) {
                out.close();
            }
            if (conn != null) {
                conn.disconnect();
            }
        }
        return response;
    }


    private Response parseResponseInfo(AbstractAPIRequest request, HttpURLConnection conn) throws IOException {

        InputStream inputStream = null;
        int httpCode = conn.getResponseCode();
        if (httpCode >= 200 && httpCode <= 299) {
            inputStream = conn.getInputStream();
        } else {
            inputStream = conn.getErrorStream();
        }

        String contentEncoding = conn.getContentEncoding();
        String contentType = conn.getContentType();

        return buildResponse(inputStream, httpCode, contentEncoding, contentType, request);
    }


    public Response buildResponse(InputStream istream, int httpCode, String contentEncoding, String contentType,
                                  AbstractAPIRequest request) {
        logger.finer("--Start init Response--");
        final Response response = new Response();
        response.setStatusCode(httpCode);
        if (contentEncoding != null) {
            response.setEncoding(contentEncoding);
        }
        if (contentType == null) {
            response.setException(new IllegalStateException("response need content type"));
        } else {
            String charset = HttpSupport.parseResponseCharset(request.getOceanRequestPolicy(), contentType);
            response.setCharset(charset);
        }
        try {
            if (EleConstants.CONTENT_ENCODING_GZIP.equalsIgnoreCase(response.getEncoding())) {
                logger.info(" translate InputStream to GZIPInputStream ");
                istream = new GZIPInputStream(istream);
            }
            logger.info("Response status code :" + response.getStatusCode());
            String content = getStreamAsString(istream, response.getCharset());
            if (response.getStatusCode() >= 200 && response.getStatusCode() <= 399) {
                Object result = buildResult(content, request.getResponseClass());
                response.setResult(result);
            } else {
                logger.warning("响应结果异常：" + JSON.toJSONString(content));
                Throwable exception = buildException(content);
                response.setException(exception);
            }
        } catch (IOException e) {
            logger.warning("buildResponse操作异常，异常信息：" + e);
            response.setException(e);
        } catch (RuntimeException e) {
            response.setException(e);
        } catch (ParseException e) {
            response.setException(e);
        }
        return response;
    }

    protected <T> BizResultWrapper<T> buildResult(String content, Class<T> classType)
            throws IOException, ParseException {
        BizResultWrapper<T> result = JSON.parseObject(content, new TypeReference<BizResultWrapper<T>>() {
        });
        return result;
    }

    protected static Throwable buildException(String content)
            throws IOException, ParseException {
        Throwable rhrowable = Json2Deserializer.buildException(content);
        return rhrowable;
    }


    public String getStreamAsString(InputStream stream, String charset) throws IOException {

        Reader reader = new InputStreamReader(stream, charset);
        StringBuilder response = new StringBuilder();

        final char[] buff = new char[1024];
        int read = 0;
        while ((read = reader.read(buff)) > 0) {
            response.append(buff, 0, read);
        }
        return response.toString();

    }

}
