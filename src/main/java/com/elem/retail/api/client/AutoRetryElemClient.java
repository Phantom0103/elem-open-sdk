package com.elem.retail.api.client;

import com.elem.retail.api.ElemApiException;
import com.elem.retail.api.ElemRequest;
import com.elem.retail.api.ElemResponse;
import com.elem.retail.api.ElemResponseData;
import com.elem.retail.api.client.config.AutoRetryDelegate;
import com.elem.retail.api.client.config.AutoRetryFeature;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-02
 */
public class AutoRetryElemClient extends DefaultElemClient {

    private AutoRetryDelegate delegate = new AutoRetryDelegate() {
        @Override
        public <T extends ElemResponseData> ElemResponse<T> clientExecute(ElemRequest request, String token, Class<T> clazz) throws ElemApiException {
            return AutoRetryElemClient.super.execute(request, token, clazz);
        }
    };

    public AutoRetryElemClient(String appid, String secret, int connectTimeout, int readTimeout) {
        super(appid, secret, connectTimeout, readTimeout);
    }

    public void setAutoRetryFeature(AutoRetryFeature feature) {
        if (feature == null) {
            return;
        }

        if (feature.getRetryCount() > 0) {
            this.delegate.setRetryCount(feature.getRetryCount());
        }

        if (feature.getWaitTime() > 0) {
            this.delegate.setWaitTime(feature.getWaitTime());
        }

        if (feature.getRetryErrorCodes() != null && feature.getRetryErrorCodes().size() > 0) {
            this.delegate.addRetryErrorCodes(feature.getRetryErrorCodes());
        }
    }

    @Override
    public <T extends ElemResponseData> ElemResponse<T> execute(ElemRequest request, Class<T> clazz) throws ElemApiException {
        return this.execute(request, null, clazz);
    }

    @Override
    public <T extends ElemResponseData> ElemResponse<T> execute(ElemRequest request, String token, Class<T> clazz) throws ElemApiException {
        return this.delegate.execute(request, token, clazz);
    }
}
