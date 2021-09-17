package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuCategoryPropertyQueryRequest;
import elem.retail.dto.sku.SkuCategoryPropertyQueryResult;

import java.io.Serializable;

/**
 * 查询渠道商品的类目属性值。
 *
 * @author zhouw
 * @description 查询渠道商品的类目属性值
 * @date 2021-09-17
 */
public class SkuCategoryPropertyQueryExecutor extends ElemApiExecutor {

    private SkuCategoryPropertyQueryRequest request;

    public SkuCategoryPropertyQueryExecutor(String appid, String secret, SkuCategoryPropertyQueryRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return SkuCategoryPropertyQueryResult.class;
    }
}
