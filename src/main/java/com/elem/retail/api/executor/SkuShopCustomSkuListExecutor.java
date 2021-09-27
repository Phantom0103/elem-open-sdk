package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuShopCustomSkuListRequest;
import elem.retail.dto.sku.SkuShopCustomSkuListResult;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 获取店铺内分类下商品。
 *
 * @author zhouw
 * @description 获取店铺内分类下商品
 * @date 2021-09-27
 */
@Getter
@Setter
public class SkuShopCustomSkuListExecutor extends ElemApiExecutor {

    private SkuShopCustomSkuListRequest request;

    public SkuShopCustomSkuListExecutor(String appid, String secret, SkuShopCustomSkuListRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return SkuShopCustomSkuListResult.class;
    }
}
