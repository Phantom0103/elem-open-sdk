package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuShopCategoryUpdateRequest;

import java.io.Serializable;

/**
 * 修改店铺内分类。
 *
 * @author zhouw
 * @description 修改店铺内分类
 * @date 2021-09-27
 */
public class SkuShopCategoryUpdateExecutor extends ElemApiExecutor {

    private SkuShopCategoryUpdateRequest request;

    public SkuShopCategoryUpdateExecutor(String appid, String secret, SkuShopCategoryUpdateRequest request) {
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
