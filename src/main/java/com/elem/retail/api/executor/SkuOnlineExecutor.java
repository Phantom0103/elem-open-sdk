package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuOnlineRequest;

import java.io.Serializable;

/**
 * 批量商品上架。
 *
 * @author zhouw
 * @description 批量商品上架
 * @date 2021-09-27
 */
public class SkuOnlineExecutor extends ElemApiExecutor {

    private SkuOnlineRequest request;

    public SkuOnlineExecutor(String appid, String secret, SkuOnlineRequest request) {
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
