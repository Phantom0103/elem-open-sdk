package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.other.CommonBusinessCategoryRequest;
import elem.retail.dto.other.CommonBusinessCategoryResult;

import java.io.Serializable;

/**
 * 业态分类接口：1. category_id为空返回所有一级业态分类；2. 返回二级业态分类时，category_id为一级业态的分类ID。
 * 一级业态不返回business_form_id；3. 目前业态分类只到2级。
 *
 * @Author zhouw
 * @Description 业态分类
 * @Date 2021-09-01
 */
public class CommonBusinessCategoryExecutor extends ElemApiExecutor {

    private CommonBusinessCategoryRequest request;

    public CommonBusinessCategoryExecutor(String appid, String secret, CommonBusinessCategoryRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return CommonBusinessCategoryResult.class;
    }
}
