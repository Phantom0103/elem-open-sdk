package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.im.ImMessageSendRequest;

import java.io.Serializable;

/**
 * 商家IM消息发送
 *
 * @author zhouw
 * @date 2022-01-27
 */
public class ImMessageSendExecutor extends ElemApiExecutor {

    private ImMessageSendRequest request;

    public ImMessageSendExecutor(String appid, String secret, ImMessageSendRequest request) {
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
