package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.BatchSkuCreateRequest;
import elem.retail.dto.sku.BatchSkuCreateResult;

import java.io.Serializable;

/**
 * 批量创建渠道商品。
 *
 * @author zhouw
 * @description 批量创建渠道商品
 * @date 2021-09-24
 */
public class BatchSkuCreateExecutor extends ElemApiExecutor {

    private BatchSkuCreateRequest request;

    public BatchSkuCreateExecutor(String appid, String secret, BatchSkuCreateRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return BatchSkuCreateResult.class;
    }
}
