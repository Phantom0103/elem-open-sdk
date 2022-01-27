package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.im.ImGetImStatusRequest;
import elem.retail.dto.im.ImGetImStatusResult;

import java.io.Serializable;

/**
 * 查询店铺IM状态
 *
 * @author zhouw
 * @date 2022-01-27
 */
public class ImGetImStatusExecutor extends ElemApiExecutor {

    private ImGetImStatusRequest request;

    public ImGetImStatusExecutor(String appid, String secret, ImGetImStatusRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ImGetImStatusResult.class;
    }
}
