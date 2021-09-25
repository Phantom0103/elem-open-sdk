package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.sku.SkuCategoryPropertyListRequest;
import elem.retail.dto.sku.SkuCategoryPropertyListResult;

import java.io.Serializable;

/**
 * 查询类目属性值列表。
 *
 * @author zhouw
 * @description 查询类目属性值列表
 * @date 2021-09-25
 */
public class SkuCategoryPropertyListExecutor extends ElemApiExecutor {

    private SkuCategoryPropertyListRequest request;

    public SkuCategoryPropertyListExecutor(String appid, String secret, SkuCategoryPropertyListRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return SkuCategoryPropertyListResult.class;
    }
}
