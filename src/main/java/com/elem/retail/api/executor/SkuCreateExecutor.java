package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuCreateRequest;
import elem.retail.dto.sku.SkuCreateResult;

import java.io.Serializable;

/**
 * 单个创建商品。
 *
 * @Author zhouw
 * @Description 单个创建商品
 * @Date 2021-08-04
 */
public class SkuCreateExecutor extends ElemApiExecutor {

    private SkuCreateRequest request;

    public SkuCreateExecutor(String appid, String secret, SkuCreateRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return SkuCreateResult.class;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }
}
