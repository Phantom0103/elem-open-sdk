package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuCategoryListRequest;
import elem.retail.dto.sku.SkuCategoryListResult;

import java.io.Serializable;

/**
 * 获取商品类目列表。
 *
 * @author zhouw
 * @description 获取商品类目列表
 * @date 2021-09-26
 */
public class SkuCategoryListExecutor extends ElemApiExecutor {

    private SkuCategoryListRequest request;

    public SkuCategoryListExecutor(String appid, String secret, SkuCategoryListRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return SkuCategoryListResult.class;
    }
}
