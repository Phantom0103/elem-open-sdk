package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuOfflineRequest;

import java.io.Serializable;

/**
 * 批量商品下架。
 *
 * @author zhouw
 * @description 批量商品下架
 * @date 2021-09-27
 */
public class SkuOfflineExecutor extends ElemApiExecutor {

    private SkuOfflineRequest request;

    public SkuOfflineExecutor(String appid, String secret, SkuOfflineRequest request) {
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
