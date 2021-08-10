package com.elem.retail.api.client;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.elem.retail.api.*;
import com.elem.retail.api.util.HttpUtils;
import com.elem.retail.api.util.Md5Utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-02
 */
public class DefaultElemClient implements ElemClient {

    private String appid;
    private String secret;

    public static final String API_URL = "https://api-be.ele.me";

    /**
     * 签名模板
     */
    public static final String SIGN_TEMPLATE = "body=%s&cmd=%s&encrypt=%s&secret=%s&source=%s&ticket=%s&timestamp=%s&version=%s";
    public static final String SIGN_TEMPLATE_TOKEN = "access_token=%s&" + SIGN_TEMPLATE;

    /**
     * 请求体模板
     */
    public static final String REQUEST_TEMPLATE = "body=%s&cmd=%s&encrypt=%s&secret=%s&source=%s&sign=%s&ticket=%s&timestamp=%s&version=%s";
    public static final String REQUEST_TEMPLATE_TOKEN = "access_token=%s&" + REQUEST_TEMPLATE;

    public DefaultElemClient(String appid, String secret) {
        this.appid = appid;
        this.secret = secret;
    }

    @Override
    public <T extends ElemResponseData> ElemResponse<T> execute(ElemRequest request, Class<T> clazz) throws ElemApiException {
        return execute0(request, null, clazz);
    }

    @Override
    public <T extends ElemResponseData> ElemResponse<T> execute(ElemRequest request, String token, Class<T> clazz) throws ElemApiException {
        return execute0(request, token, clazz);
    }

    @SuppressWarnings("unchecked")
    private <T extends ElemResponseData> ElemResponse<T> execute0(ElemRequest request, String token, Class<T> clazz) throws ElemApiException {
        try {
            String requestBody = getRequestBody(request, token);
            String result = HttpUtils.doPost(API_URL, requestBody);
            if (result == null) {
                throw new ElemApiException("请求结果为空，url：" + API_URL);
            }

            JSONObject response = JSON.parseObject(result);
            ElemResponse elemResponse = getBaseElemResponse(response);
            JSONObject body = response.getJSONObject("body");
            if (body != null) {
                int errno = body.getIntValue("errno");
                JSONObject data = body.getJSONObject("data");
                if (errno == 0 && data != null) {
                    T v = JSON.toJavaObject(data, clazz);
                    elemResponse.setData(v);
                }
            }

            return elemResponse;
        } catch (Exception e) {
            throw new ElemApiException(e.getMessage());
        }

    }

    private ElemResponse getBaseElemResponse(JSONObject response) {
        ElemResponse elemResponse = new ElemResponse();
        elemResponse.setCmd(response.getString("cmd"));
        elemResponse.setEncrypt(response.getString("encrypt"));
        elemResponse.setSign(response.getString("sign"));
        elemResponse.setSource(response.getString("source"));
        elemResponse.setTicket(response.getString("ticket"));
        elemResponse.setTimestamp(response.getLongValue("timestamp"));
        elemResponse.setTraceid(response.getString("traceid"));
        elemResponse.setVersion(response.getString("version"));

        return elemResponse;
    }

    private String getRequestBody(ElemRequest request, String token) throws UnsupportedEncodingException {
        String ticket = UUID.randomUUID().toString().toUpperCase();
        int timestamp = (int) (System.currentTimeMillis() / 1000);
        String body = request.getBody();

        if (token == null) {
            String signPlaintext = String.format(SIGN_TEMPLATE, body, request.getCmd(), request.getEncrypt(),
                    secret, appid, ticket, timestamp, request.getVersion());
            String sign = Md5Utils.get32Md5(signPlaintext);

            return String.format(REQUEST_TEMPLATE, URLEncoder.encode(body, "utf-8"), request.getCmd(), request.getEncrypt(),
                    secret, appid, sign, ticket, timestamp, request.getVersion());
        } else {
            String signPlaintext = String.format(SIGN_TEMPLATE_TOKEN, token, request.getBody(), request.getCmd(),
                    request.getEncrypt(), secret, appid, ticket, timestamp, request.getVersion());
            String sign = Md5Utils.get32Md5(signPlaintext);

            return String.format(REQUEST_TEMPLATE_TOKEN, token, URLEncoder.encode(body, "utf-8"), request.getCmd(),
                    request.getEncrypt(), secret, appid, sign, ticket, timestamp, request.getVersion());
        }
    }
}
