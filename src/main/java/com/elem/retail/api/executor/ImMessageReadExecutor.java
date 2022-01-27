package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.im.ImMessageReadRequest;

import java.io.Serializable;

/**
 * 消息已读
 *
 * @author zhouw
 * @date 2022-01-27
 */
public class ImMessageReadExecutor extends ElemApiExecutor {

    private ImMessageReadRequest request;

    public ImMessageReadExecutor(String appid, String secret, ImMessageReadRequest request) {
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
