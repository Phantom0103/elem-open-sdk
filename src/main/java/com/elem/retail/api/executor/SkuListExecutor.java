package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuListRequest;
import elem.retail.dto.sku.SkuListResult;

import java.io.Serializable;

/**
 * 商品列表。
 *
 * @author zhouw
 * @description 商品列表
 * @date 2021-09-23
 */
public class SkuListExecutor extends ElemApiExecutor {

    public SkuListExecutor(String appid, String secret, SkuListRequest request) {
        super(appid, secret);
        this.request = request;
    }

    private SkuListRequest request;

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return SkuListResult.class;
    }
}
