package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuSpecUpdatePriceRequest;

import java.io.Serializable;

/**
 * 更新渠道商品多规格价格。
 *
 * @author zhouw
 * @description 更新渠道商品多规格价格
 * @date 2021-09-27
 */
public class SkuSpecUpdatePriceExecutor extends ElemApiExecutor {

    private SkuSpecUpdatePriceRequest request;

    public SkuSpecUpdatePriceExecutor(String appid, String secret, SkuSpecUpdatePriceRequest request) {
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
