package com.elem.retail.api.client;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.elem.retail.api.*;
import com.elem.retail.api.util.HttpUtils;
import com.elem.retail.api.util.Md5Utils;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import static com.elem.retail.api.ElemConstants.*;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-02
 */
@Slf4j(topic = "com.elem.retail.api")
public class DefaultElemClient implements ElemClient {

    private String appid;
    private String secret;

    private int connectTimeout;
    private int readTimeout;

    private ElemApiHook hook;

    /**
     * 签名模板
     */
    private static final String SIGN_TEMPLATE = "body=%s&cmd=%s&encrypt=%s&secret=%s&source=%s&ticket=%s&timestamp=%s&version=%s";
    private static final String SIGN_TEMPLATE_TOKEN = "access_token=%s&" + SIGN_TEMPLATE;

    /**
     * 请求体模板
     */
    private static final String REQUEST_TEMPLATE = "body=%s&cmd=%s&encrypt=%s&secret=%s&source=%s&sign=%s&ticket=%s&timestamp=%s&version=%s";
    private static final String REQUEST_TEMPLATE_TOKEN = "access_token=%s&" + REQUEST_TEMPLATE;

    public DefaultElemClient(String appid, String secret, int connectTimeout, int readTimeout, ElemApiHook hook) {
        this.appid = appid;
        this.secret = secret;
        this.connectTimeout = connectTimeout;
        this.readTimeout = readTimeout;
        this.hook = hook;
    }

    @Override
    public <T extends Serializable> ElemResponse<T> execute(ElemRequest request, Class<T> clazz) throws ElemApiException {
        return execute0(request, null, clazz);
    }

    @Override
    public <T extends Serializable> ElemResponse<T> execute(ElemRequest request, String token, Class<T> clazz) throws ElemApiException {
        return execute0(request, token, clazz);
    }

    @SuppressWarnings("unchecked")
    private <T extends Serializable> ElemResponse<T> execute0(ElemRequest request, String token, Class<T> clazz) throws ElemApiException {
        try {
            String ticket = UUID.randomUUID().toString().toUpperCase();
            doBeforeHook(ticket, request);
            String requestBody = getRequestBody(request, token, ticket);
            HttpResponseData response = HttpUtils.doPost(API_URL, requestBody, connectTimeout, readTimeout);
            doAfterHook(ticket, request, response);

            String responseBody = response.getBody();

            log.info("执行请求平台接口，keyword: {}，request: {}，response: {}", request.getKeyword(), requestBody, responseBody);

            if (!response.isSuccess()) {
                throw new ElemApiException("请求失败，response_code: " + response.getResponseCode() +
                        "，response_message: " + response.getResponseMessage());
            }

            JSONObject responseData = JSON.parseObject(responseBody);
            ElemResponse elemResponse = initElemResponse(responseData);
            JSONObject body = responseData.getJSONObject("body");
            if (body != null) {
                String errno = body.getString("errno");
                String message = body.getString("error");
                elemResponse.setCode(errno);
                elemResponse.setMessage(message);

                if (ElemResponseData.class.isAssignableFrom(clazz)) {
                    Object data = body.get("data");
                    if (OK_CODE.equals(errno) && data != null) {
                        if (data instanceof Collection) {
                            body.getString("data");
                            List<T> v = JSON.parseArray(data.toString(), clazz);
                            elemResponse.setData((ArrayList) v);
                        } else {
                            T v = JSON.toJavaObject((JSONObject) data, clazz);
                            elemResponse.setData(v);
                        }
                    }
                } else {
                    if (OK_CODE.equals(errno)) {
                        T v = body.getObject("data", clazz);
                        elemResponse.setData(v);
                    }
                }

            }

            return elemResponse;
        } catch (Exception e) {
            log.error("执行请求平台接口", e);
            throw new ElemApiException("执行请求平台接口", e);
        }
    }

    private ElemResponse initElemResponse(JSONObject response) {
        ElemResponse elemResponse = new ElemResponse();
        elemResponse.setCmd(response.getString("cmd"));
        elemResponse.setEncrypt(response.getString("encrypt"));
        elemResponse.setSign(response.getString("sign"));
        elemResponse.setSource(response.getString("source"));
        elemResponse.setTicket(response.getString("ticket"));
        elemResponse.setTimestamp(response.getLongValue("timestamp"));
        elemResponse.setTraceid(response.getString("traceid"));
        elemResponse.setVersion(response.getString("version"));

        elemResponse.setCode(ERROR_CODE);
        elemResponse.setMessage(NULL_BODY_ERROR);

        return elemResponse;
    }

    private String getRequestBody(ElemRequest request, String token, String ticket) throws UnsupportedEncodingException {
        int timestamp = (int) (System.currentTimeMillis() / 1000);
        String body = request.getBody();

        if (token == null) {
            String signPlaintext = String.format(SIGN_TEMPLATE, body, request.getCmd(), request.getEncrypt(),
                    secret, appid, ticket, timestamp, request.getVersion());
            String sign = Md5Utils.get32Md5(signPlaintext);

            return String.format(REQUEST_TEMPLATE, URLEncoder.encode(body, DEFAULT_CHARSET_NAME), request.getCmd(), request.getEncrypt(),
                    secret, appid, sign, ticket, timestamp, request.getVersion());
        } else {
            String signPlaintext = String.format(SIGN_TEMPLATE_TOKEN, token, request.getBody(), request.getCmd(),
                    request.getEncrypt(), secret, appid, ticket, timestamp, request.getVersion());
            String sign = Md5Utils.get32Md5(signPlaintext);

            return String.format(REQUEST_TEMPLATE_TOKEN, token, URLEncoder.encode(body, DEFAULT_CHARSET_NAME), request.getCmd(),
                    request.getEncrypt(), secret, appid, sign, ticket, timestamp, request.getVersion());
        }
    }

    private void doBeforeHook(String ticket, ElemRequest request) {
        if (hook != null) {
            try {
                hook.doBeforeRequest(ticket, request);
            } catch (Exception e) {
                log.error("请求API之前执行hook异常", e);
            }
        }
    }

    private void doAfterHook(String ticket, ElemRequest request, HttpResponseData response) {
        if (hook != null) {
            try {
                hook.doAfterResponse(ticket, request, response);
            } catch (Exception e) {
                log.error("请求API之后执行hook异常", e);
            }
        }
    }
}
