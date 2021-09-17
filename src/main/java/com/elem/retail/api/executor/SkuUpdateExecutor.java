package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuUpdateRequest;
import elem.retail.dto.sku.SkuUpdateResult;

import java.io.Serializable;

/**
 * 单个商品修改。 注意：连锁店修改时，同条码商品会统一修改商品名称、后台分类、图片、重量、属性值、图文详情。
 *
 * @author zhouw
 * @description 单个商品修改
 * @date 2021-09-17
 */
public class SkuUpdateExecutor extends ElemApiExecutor {

    private SkuUpdateRequest request;

    public SkuUpdateExecutor(String appid, String secret, SkuUpdateRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return SkuUpdateResult.class;
    }
}
