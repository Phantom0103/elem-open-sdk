package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.im.ImUpdateImOnlineStatusRequest;

import java.io.Serializable;

/**
 * 设置im线上状态
 *
 * @author zhouw
 * @date 2022-01-27
 */
public class ImUpdateImOnlineStatusExecutor extends ElemApiExecutor {

    private ImUpdateImOnlineStatusRequest request;

    public ImUpdateImOnlineStatusExecutor(String appid, String secret, ImUpdateImOnlineStatusRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return Boolean.class;
    }
}
