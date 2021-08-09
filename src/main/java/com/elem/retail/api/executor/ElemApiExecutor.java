package com.elem.retail.api.executor;

import com.elem.retail.api.ElemApiException;
import com.elem.retail.api.ElemRequest;
import com.elem.retail.api.ElemResponse;
import com.elem.retail.api.ElemResponseData;
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

    /**
     * 限定返回类型
     *
     * @return
     */
    abstract Class<? extends ElemResponseData> getResponseDataClass();

    public final ElemResponse execute() throws ElemApiException {
        try {
            ElemRequest request = getRequest();
            Class<? extends ElemResponseData> clazz = getResponseDataClass();
            DefaultElemClient elemClient = new DefaultElemClient(appid, secret);
            return elemClient.execute(request, null, clazz);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public final ElemResponse execute(String token) throws ElemApiException {
        try {
            ElemRequest request = getRequest();
            Class<? extends ElemResponseData> clazz = getResponseDataClass();
            DefaultElemClient elemClient = new DefaultElemClient(appid, secret);
            return elemClient.execute(request, token, clazz);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
