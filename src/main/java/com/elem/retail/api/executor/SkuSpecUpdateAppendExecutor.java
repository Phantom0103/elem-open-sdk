package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuSpecUpdateAppendRequest;
import elem.retail.dto.sku.SkuSpecUpdateAppendResult;

import java.io.Serializable;

/**
 * 渠道商品追加多规格sku。
 *
 * @author zhouw
 * @description 渠道商品追加多规格sku
 * @date 2021-09-14
 */
public class SkuSpecUpdateAppendExecutor extends ElemApiExecutor {

    private SkuSpecUpdateAppendRequest request;

    public SkuSpecUpdateAppendExecutor(String appid, String secret, SkuSpecUpdateAppendRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return SkuSpecUpdateAppendResult.class;
    }
}
