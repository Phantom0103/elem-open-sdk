package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.other.CommonShopCategoryRequest;
import elem.retail.dto.other.CommonShopCategoryResult;

import java.io.Serializable;

/**
 * 商户分类信息。
 *
 * @Author zhouw
 * @Description 商户分类信息
 * @Date 2021-09-01
 */
public class CommonShopCategoryExecutor extends ElemApiExecutor {

    private CommonShopCategoryRequest request;

    public CommonShopCategoryExecutor(String appid, String secret, CommonShopCategoryRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return CommonShopCategoryResult.class;
    }
}
