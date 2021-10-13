package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActItemDiscountCreateRequest;
import elem.retail.dto.activity.ActItemDiscountCreateResult;

import java.io.Serializable;

/**
 * 商品真折扣创建活动，如需此接口请提交工单申请权限。
 *
 * @author zhouw
 * @description 【商品特价真折扣】商品真折扣创建活动
 * @date 2021-10-13
 */
public class ActItemDiscountCreateExecutor extends ElemApiExecutor {

    private ActItemDiscountCreateRequest request;

    public ActItemDiscountCreateExecutor(String appid, String secret, ActItemDiscountCreateRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ActItemDiscountCreateResult.class;
    }
}
