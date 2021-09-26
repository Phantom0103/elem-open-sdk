package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuOfflineOneRequest;

import java.io.Serializable;

/**
 * 单个商品下架。
 *
 * @author zhouw
 * @description 单个商品下架
 * @date 2021-09-26
 */
public class SkuOfflineOneExecutor extends ElemApiExecutor {

    private SkuOfflineOneRequest request;

    public SkuOfflineOneExecutor(String appid, String secret, SkuOfflineOneRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return null;
    }
}
