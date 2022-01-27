package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.im.ImUpdateImStatusRequest;

import java.io.Serializable;

/**
 * 更新店铺IM开关状态
 *
 * @author zhouw
 * @date 2022-01-27
 */
public class ImUpdateImStatusExecutor extends ElemApiExecutor {

    private ImUpdateImStatusRequest request;

    public ImUpdateImStatusExecutor(String appid, String secret, ImUpdateImStatusRequest request) {
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
