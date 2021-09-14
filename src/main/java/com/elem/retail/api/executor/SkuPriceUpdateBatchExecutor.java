package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuPriceUpdateBatchRequest;

import java.io.Serializable;

/**
 * 批量修改商品价格。
 *
 * @author zhouw
 * @description 批量修改商品价格
 * @date 2021-09-14
 */
public class SkuPriceUpdateBatchExecutor extends ElemApiExecutor {

    private SkuPriceUpdateBatchRequest request;

    public SkuPriceUpdateBatchExecutor(String appid, String secret, SkuPriceUpdateBatchRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return Boolean.class;
    }
}
