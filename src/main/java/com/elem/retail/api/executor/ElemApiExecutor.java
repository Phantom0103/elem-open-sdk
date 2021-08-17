package com.elem.retail.api.executor;

import com.elem.retail.api.ElemApiException;
import com.elem.retail.api.ElemRequest;
import com.elem.retail.api.ElemResponse;
import com.elem.retail.api.ElemResponseData;
import com.elem.retail.api.client.AutoRetryElemClient;
import com.elem.retail.api.client.DefaultElemClient;
import com.elem.retail.api.client.config.AutoRetryFeature;
import org.apache.commons.lang3.StringUtils;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-03
 */
public abstract class ElemApiExecutor {

    private String appid;
    private String secret;

    private int connectTimeout = 60000;
    private int readTimeout = 60000;

    ElemApiExecutor(String appid, String secret) {
        if (StringUtils.isBlank(appid) || StringUtils.isBlank(secret)) {
            throw new NullPointerException("appid or secret is null");
        }

        this.appid = appid;
        this.secret = secret;
    }

    abstract ElemRequest getRequest();

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    /**
     * 限定返回类型
     *
     * @return
     */
    abstract Class<? extends ElemResponseData> getResponseDataClass();

    /**
     * 执行公开的API请求
     *
     * @return
     * @throws ElemApiException
     */
    public final ElemResponse execute() throws ElemApiException {
        return execute0(null);
    }

    /**
     * 执行需要授权的API请求
     *
     * @param token
     * @return
     * @throws ElemApiException
     */
    public final ElemResponse execute(String token) throws ElemApiException {
        return execute0(token);
    }

    /**
     * 自动重试执行公开的API请求
     *
     * @param feature
     * @return
     * @throws ElemApiException
     */
    public final ElemResponse execute(AutoRetryFeature feature) throws ElemApiException {
        if (feature == null) {
            return execute0(null);
        } else {
            return execute0(null, feature);
        }
    }

    /**
     * 自动重试执行需要授权的API请求
     *
     * @param token
     * @param feature
     * @return
     * @throws ElemApiException
     */
    public final ElemResponse execute(String token, AutoRetryFeature feature) throws ElemApiException {
        if (feature == null) {
            return execute0(token);
        } else {
            return execute0(token, feature);
        }
    }

    private ElemResponse execute0(String token) {
        ElemRequest request = getRequest();
        Class<? extends ElemResponseData> clazz = getResponseDataClass();
        DefaultElemClient elemClient = new DefaultElemClient(appid, secret, connectTimeout, readTimeout);
        return elemClient.execute(request, token, clazz);
    }

    private ElemResponse execute0(String token, AutoRetryFeature feature) {
        ElemRequest request = getRequest();
        Class<? extends ElemResponseData> clazz = getResponseDataClass();
        AutoRetryElemClient elemClient = new AutoRetryElemClient(appid, secret, connectTimeout, readTimeout);
        elemClient.setAutoRetryFeature(feature);
        return elemClient.execute(request, token, clazz);
    }
}
