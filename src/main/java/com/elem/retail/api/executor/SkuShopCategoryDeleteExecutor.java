package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuShopCategoryDeleteRequest;

import java.io.Serializable;

/**
 * 店铺内分类：是商家自己对每个门店自定义的一套前台类目，用于展示给消费者。提供给合作方删除商家自定义分类所用。
 *
 * @author zhouw
 * @description 删除店铺内分类
 * @date 2021-09-26
 */
public class SkuShopCategoryDeleteExecutor extends ElemApiExecutor {

    private SkuShopCategoryDeleteRequest request;

    public SkuShopCategoryDeleteExecutor(String appid, String secret, SkuShopCategoryDeleteRequest request) {
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
