package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.im.ImGetImOnlineStatusRequest;
import elem.retail.dto.im.ImGetImOnlineStatusResult;

import java.io.Serializable;

/**
 * @author zhouw
 * @date 2022-01-27
 */
public class ImGetImOnlineStatusExecutor extends ElemApiExecutor {

    private ImGetImOnlineStatusRequest request;

    public ImGetImOnlineStatusExecutor(String appid, String secret, ImGetImOnlineStatusRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ImGetImOnlineStatusResult.class;
    }
}
