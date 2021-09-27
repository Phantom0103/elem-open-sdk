package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuStdupcExistRequest;
import elem.retail.dto.sku.SkuStdupcExistResult;

import java.io.Serializable;

/**
 * 根据条形码查询是否平台药品SPU。
 *
 * @author zhouw
 * @description 根据条形码查询是否平台药品SPU
 * @date 2021-09-27
 */
public class SkuStdupcExistExecutor extends ElemApiExecutor {

    private SkuStdupcExistRequest request;

    public SkuStdupcExistExecutor(String appid, String secret, SkuStdupcExistRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return SkuStdupcExistResult.class;
    }
}
