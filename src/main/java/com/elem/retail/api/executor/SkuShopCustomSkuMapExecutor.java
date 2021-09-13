package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuShopCustomSkuMapRequest;

import java.io.Serializable;

/**
 * 绑定商品与商品自定义ID。
 *
 * @author zhouw
 * @description 绑定商品与商品自定义ID
 * @date 2021-09-13
 */
public class SkuShopCustomSkuMapExecutor extends ElemApiExecutor {

    private SkuShopCustomSkuMapRequest request;

    public SkuShopCustomSkuMapExecutor(String appid, String secret, SkuShopCustomSkuMapRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return String.class;
    }
}
