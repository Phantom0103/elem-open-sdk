package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.other.CommonShopCategoryGetRequest;
import elem.retail.dto.other.CommonShopCategoryGetResult;

import java.io.Serializable;

/**
 * 查询商户分类信息。
 *
 * @Author zhouw
 * @Description 查询商户分类信息
 * @Date 2021-09-01
 */
public class CommonShopCategoryGetExecutor extends ElemApiExecutor {

    private CommonShopCategoryGetRequest request;

    public CommonShopCategoryGetExecutor(String appid, String secret, CommonShopCategoryGetRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return CommonShopCategoryGetResult.class;
    }
}
