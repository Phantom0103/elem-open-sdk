package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.BatchSkuUpdateRequest;
import elem.retail.dto.sku.BatchSkuUpdateResult;

import java.io.Serializable;

/**
 * 批量更新渠道商品。
 *
 * @author zhouw
 * @description 批量更新渠道商品
 * @date 2021-09-26
 */
public class BatchSkuUpdateExecutor extends ElemApiExecutor {

    private BatchSkuUpdateRequest request;

    public BatchSkuUpdateExecutor(String appid, String secret, BatchSkuUpdateRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return BatchSkuUpdateResult.class;
    }
}
