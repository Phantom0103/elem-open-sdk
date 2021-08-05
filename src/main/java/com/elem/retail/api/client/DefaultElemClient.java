package com.elem.retail.api.client;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.elem.retail.api.ElemApiException;
import com.elem.retail.api.ElemClient;
import com.elem.retail.api.ElemRequest;
import com.elem.retail.api.ElemResponse;
import com.elem.retail.api.util.HttpUtils;
import com.elem.retail.api.util.Md5Utils;

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

    // 签名模板
    public static final String SIGN_TEMPLATE = "body=%s&cmd=%s&encrypt=%s&secret=%s&source=%s&ticket=%s&timestamp=%s&version=%s";
    public static final String SIGN_TEMPLATE_TOKEN = "access_token=%s&" + SIGN_TEMPLATE;

    // 请求体模板
    public static final String REQUEST_TEMPLATE = "body=%s&cmd=%s&encrypt=%s&secret=%s&source=%s&sign=%s&ticket=%s&timestamp=%s&version=%s";
    public static final String REQUEST_TEMPLATE_TOKEN = "access_token=%s&" + REQUEST_TEMPLATE;

    public DefaultElemClient(String appid, String secret) {
        this.appid = appid;
        this.secret = secret;
    }

    @Override
    public ElemResponse execute(ElemRequest request) throws ElemApiException {
        return execute0(request, null);
    }

    @Override
    public ElemResponse execute(ElemRequest request, String token) throws ElemApiException {
        return execute0(request, token);
    }

    private ElemResponse execute0(ElemRequest request, String token) throws ElemApiException {
        try {
            String requestBody = getRequestBody(request, token);
            String result = HttpUtils.doPost(API_URL, requestBody);
            JSONObject response = JSON.parseObject(result);


        } catch (Exception e) {

        }

        return null;
    }

    private String getRequestBody(ElemRequest request, String token) {
        String ticket = UUID.randomUUID().toString().toUpperCase();
        int timestamp = (int) (System.currentTimeMillis() / 1000);
        String requestBody;

        if (token == null) {
            String signPlaintext = String.format(SIGN_TEMPLATE, request.getBody(), request.getCmd(), request.getEncrypt(),
                    secret, appid, ticket, timestamp, request.getVersion());
            String sign = Md5Utils.get32Md5(signPlaintext);
            requestBody = String.format(REQUEST_TEMPLATE, request.getBody(), request.getCmd(), request.getEncrypt(),
                    secret, appid, sign, ticket, timestamp, request.getVersion());
        } else {
            String signPlaintext = String.format(SIGN_TEMPLATE_TOKEN, token, request.getBody(), request.getCmd(),
                    request.getEncrypt(), secret, appid, ticket, timestamp, request.getVersion());
            String sign = Md5Utils.get32Md5(signPlaintext);
            requestBody = String.format(REQUEST_TEMPLATE_TOKEN, token, request.getBody(), request.getCmd(),
                    request.getEncrypt(), secret, appid, sign, ticket, timestamp, request.getVersion());
        }

        return requestBody;
    }
}
