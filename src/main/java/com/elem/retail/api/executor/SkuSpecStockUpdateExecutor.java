package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuSpecStockUpdateRequest;
import elem.retail.dto.sku.SkuSpecStockUpdateResult;

import java.io.Serializable;

/**
 * 商品多规格修改库存。
 *
 * @author zhouw
 * @description 商品多规格
 * @date 2021-09-26
 */
public class SkuSpecStockUpdateExecutor extends ElemApiExecutor {

    private SkuSpecStockUpdateRequest request;

    public SkuSpecStockUpdateExecutor(String appid, String secret, SkuSpecStockUpdateRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return SkuSpecStockUpdateResult.class;
    }
}
