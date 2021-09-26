package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuStockUpdateOneRequest;

import java.io.Serializable;

/**
 * 单个修改商品库存。
 *
 * @author zhouw
 * @description 单个修改商品库存
 * @date 2021-09-26
 */
public class SkuStockUpdateOneExecutor extends ElemApiExecutor {

    private SkuStockUpdateOneRequest request;

    public SkuStockUpdateOneExecutor(String appid, String secret, SkuStockUpdateOneRequest request) {
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
