package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuWarehouseStockUpdateRequest;

import java.io.Serializable;

/**
 * 本接口用与修改仓货品库存相关功能。
 *
 * @author zhouw
 * @description 修改仓货品库存
 * @date 2021-09-25
 */
public class SkuWarehouseStockUpdateExecutor extends ElemApiExecutor {

    private SkuWarehouseStockUpdateRequest request;

    public SkuWarehouseStockUpdateExecutor(String appid, String secret, SkuWarehouseStockUpdateRequest request) {
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
