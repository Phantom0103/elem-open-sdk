package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuDeleteRequest;

import java.io.Serializable;

/**
 * 批量删除商品，单次最多支持100个商品。由于删除为异步操作，不可删除后立刻重新创建同条码商品。建议可以修改原商品的场景尽量用修改而不是删除。
 * 如果删除后不需要重新创建的场景，建议用删除接口。
 *
 * @author zhouw
 * @description
 * @date 2021-09-27
 */
public class SkuDeleteExecutor extends ElemApiExecutor {

    private SkuDeleteRequest request;

    public SkuDeleteExecutor(String appid, String secret, SkuDeleteRequest request) {
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
