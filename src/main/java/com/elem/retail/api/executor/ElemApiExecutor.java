package com.elem.retail.api.executor;

import com.alibaba.fastjson.JSONObject;
import com.elem.retail.api.ElemApiException;
import com.elem.retail.api.ElemRequest;
import com.elem.retail.api.ElemResponse;
import com.elem.retail.api.client.DefaultElemClient;
import org.apache.commons.lang3.StringUtils;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-03
 */
public abstract class ElemApiExecutor {

    private String appid;
    private String secret;

    public ElemApiExecutor(String appid, String secret) {
        if (StringUtils.isBlank(appid) || StringUtils.isBlank(secret)) {
            throw new NullPointerException("appid or secret is null");
        }

        this.appid = appid;
        this.secret = secret;
    }

    abstract ElemRequest getRequest();

    abstract ElemResponse getResponse(JSONObject response);

    public final ElemResponse execute() throws ElemApiException {
        try {
            ElemRequest request = getRequest();
            DefaultElemClient elemClient = new DefaultElemClient(appid, secret);
            elemClient.execute(request);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public final ElemResponse execute(String token) throws ElemApiException {
        try {
            ElemRequest request = getRequest();
            DefaultElemClient elemClient = new DefaultElemClient(appid, secret);
            elemClient.execute(request, token);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
