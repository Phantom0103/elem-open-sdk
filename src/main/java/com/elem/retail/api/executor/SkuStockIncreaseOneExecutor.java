package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuStockIncreaseOneRequest;

import java.io.Serializable;

/**
 * 增量更新单个商品库存接口，增量值可正可负，取值范围为-99999~99999。校验规则为：可售库存 - 预扣库存 + 入参增量库存值大于等于0。
 *
 * @author zhouw
 * @description 增量更新单个商品库存
 * @date 2021-09-27
 */
public class SkuStockIncreaseOneExecutor extends ElemApiExecutor {

    private SkuStockIncreaseOneRequest request;

    public SkuStockIncreaseOneExecutor(String appid, String secret, SkuStockIncreaseOneRequest request) {
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
