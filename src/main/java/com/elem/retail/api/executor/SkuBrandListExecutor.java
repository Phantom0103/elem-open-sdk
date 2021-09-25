package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuBrandListRequest;
import elem.retail.dto.sku.SkuBrandListResult;

import java.io.Serializable;

/**
 * 获取品牌列表。
 *
 * @author zhouw
 * @description 获取品牌列表
 * @date 2021-09-25
 */
public class SkuBrandListExecutor extends ElemApiExecutor {

    private SkuBrandListRequest request;

    public SkuBrandListExecutor(String appid, String secret, SkuBrandListRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return SkuBrandListResult.class
    }
}
