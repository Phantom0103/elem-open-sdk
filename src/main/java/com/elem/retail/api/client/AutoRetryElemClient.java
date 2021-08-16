package com.elem.retail.api.client;

import com.elem.retail.api.ElemApiException;
import com.elem.retail.api.ElemRequest;
import com.elem.retail.api.ElemResponse;
import com.elem.retail.api.ElemResponseData;
import com.elem.retail.api.client.feature.AutoRetryFeature;

import java.util.Set;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-02
 */
public class AutoRetryElemClient extends DefaultElemClient {

    private AutoRetryFeature feature;

    public AutoRetryElemClient(String appid, String secret, int connectTimeout, int readTimeout) {
        super(appid, secret, connectTimeout, readTimeout);

        this.feature = new AutoRetryFeature() {
            @Override
            public <T extends ElemResponseData> ElemResponse<T> clientExecute(ElemRequest request, String token, Class<T> clazz) throws ElemApiException {
                return AutoRetryElemClient.super.execute(request, token, clazz);
            }
        };
    }

    public void setRetryCount(int retryCount) {
        this.feature.setRetryCount(retryCount);
    }

    public void setWaitTime(long waitTime) {
        this.feature.setWaitTime(waitTime);
    }

    public void setRetryErrorCodes(Set<String> retryErrorCodes) {
        this.feature.setRetryErrorCodes(retryErrorCodes);
    }

    @Override
    public <T extends ElemResponseData> ElemResponse<T> execute(ElemRequest request, Class<T> clazz) throws ElemApiException {
        return this.execute(request, null, clazz);
    }

    @Override
    public <T extends ElemResponseData> ElemResponse<T> execute(ElemRequest request, String token, Class<T> clazz) throws ElemApiException {
        return this.feature.execute(request, token, clazz);
    }
}
