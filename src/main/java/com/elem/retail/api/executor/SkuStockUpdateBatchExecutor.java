package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuStockUpdateBatchRequest;

import java.io.Serializable;

/**
 * 批量修改商品库存。
 *
 * @author zhouw
 * @description 批量修改商品库存
 * @date 2021-09-27
 */
public class SkuStockUpdateBatchExecutor extends ElemApiExecutor {

    private SkuStockUpdateBatchRequest request;

    public SkuStockUpdateBatchExecutor(String appid, String secret, SkuStockUpdateBatchRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return String.class;
    }
}
