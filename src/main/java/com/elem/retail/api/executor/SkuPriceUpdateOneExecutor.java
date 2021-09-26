package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuPriceUpdateOneRequest;

import java.io.Serializable;

/**
 * 单个修改商品价格。
 *
 * @author zhouw
 * @description 单个修改商品价格
 * @date 2021-09-26
 */
public class SkuPriceUpdateOneExecutor extends ElemApiExecutor {

    private SkuPriceUpdateOneRequest request;

    public SkuPriceUpdateOneExecutor(String appid, String secret, SkuPriceUpdateOneRequest request) {
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
