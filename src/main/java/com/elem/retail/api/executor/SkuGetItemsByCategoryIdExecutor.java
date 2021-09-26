package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuGetItemsByCategoryIdRequest;
import elem.retail.dto.sku.SkuGetItemsByCategoryIdResult;

import java.io.Serializable;

/**
 * 根据店铺内分类获取商品。
 *
 * @author zhouw
 * @description 根据店铺内分类获取商品
 * @date 2021-09-26
 */
public class SkuGetItemsByCategoryIdExecutor extends ElemApiExecutor {

    private SkuGetItemsByCategoryIdRequest request;

    public SkuGetItemsByCategoryIdExecutor(String appid, String secret, SkuGetItemsByCategoryIdRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return SkuGetItemsByCategoryIdResult.class;
    }
}
