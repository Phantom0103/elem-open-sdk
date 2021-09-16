package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuOnlineOneRequest;

import java.io.Serializable;

/**
 * 单个商品上架。
 *
 * @author zhouw
 * @description 单个商品上架
 * @date 2021-09-16
 */
public class SkuOnlineOneExecutor extends ElemApiExecutor {

    private SkuOnlineOneRequest request;

    public SkuOnlineOneExecutor(String appid, String secret, SkuOnlineOneRequest request) {
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
