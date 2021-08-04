package com.elem.retail.api.executor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.elem.retail.api.ElemApiException;
import com.elem.retail.api.ElemRequest;
import com.elem.retail.api.ElemResponse;
import com.elem.retail.api.util.HttpUtils;
import com.elem.retail.api.util.Md5Utils;
import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-03
 */
public abstract class ElemApiExecutor {

    public static final String API_URL = "https://api-be.ele.me";

    // 签名模板
    public static final String SIGN_TEMPLATE = "body=%s&cmd=%s&encrypt=%s&secret=%s&source=%s&ticket=%s&timestamp=%s&version=%s";
    public static final String SIGN_TEMPLATE_TOKEN = "access_token=%s&" + SIGN_TEMPLATE;

    // 请求体模板
    public static final String REQUEST_TEMPLATE = "body=%s&cmd=%s&encrypt=%s&secret=%s&source=%s&sign=%s&ticket=%s&timestamp=%s&version=%s";
    public static final String REQUEST_TEMPLATE_TOKEN = "access_token=%s&" + REQUEST_TEMPLATE;

    private String appid;
    private String secret;
    private String accessToken;

    public ElemApiExecutor(String appid, String secret, String accessToken) {
        if (StringUtils.isBlank(appid) || StringUtils.isBlank(secret)) {
            throw new NullPointerException("appid or secret is null");
        }

        this.appid = appid;
        this.secret = secret;
        this.accessToken = accessToken;
    }

    abstract ElemRequest getRequest();

    abstract ElemResponse getResponse(JSONObject response);

    public final ElemResponse execute() throws ElemApiException {
        try {
            ElemRequest request = getRequest();
            String requestBody = getRequestBody(request);
            String result = HttpUtils.doPost(API_URL, requestBody);
            JSONObject response = JSON.parseObject(result);
            return getResponse(response);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private String getRequestBody(ElemRequest request) {
        String ticket = UUID.randomUUID().toString().toUpperCase();
        int timestamp = (int) (System.currentTimeMillis() / 1000);
        String requestBody;

        if (StringUtils.isBlank(accessToken)) {
            String signPlaintext = String.format(SIGN_TEMPLATE, request.getBody(), request.getCmd(), request.getEncrypt(),
                    secret, appid, ticket, timestamp, request.getVersion());
            String sign = Md5Utils.get32Md5(signPlaintext);
            requestBody = String.format(REQUEST_TEMPLATE, request.getBody(), request.getCmd(), request.getEncrypt(),
                    secret, appid, sign, ticket, timestamp, request.getVersion());
        } else {
            String signPlaintext = String.format(SIGN_TEMPLATE_TOKEN, accessToken, request.getBody(), request.getCmd(),
                    request.getEncrypt(), secret, appid, ticket, timestamp, request.getVersion());
            String sign = Md5Utils.get32Md5(signPlaintext);
            requestBody = String.format(REQUEST_TEMPLATE_TOKEN, accessToken, request.getBody(), request.getCmd(),
                    request.getEncrypt(), secret, appid, sign, ticket, timestamp, request.getVersion());
        }

        return requestBody;
    }
}
