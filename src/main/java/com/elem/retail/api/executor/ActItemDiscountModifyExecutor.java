package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActItemDiscountModifyRequest;

import java.io.Serializable;

/**
 * 商品真折扣修改活动信息，如需此接口请提交工单申请权限。
 *
 * @author zhouw
 * @description 商品真折扣修改活动信息
 * @date 2021-10-13
 */
public class ActItemDiscountModifyExecutor extends ElemApiExecutor {

    private ActItemDiscountModifyRequest request;

    public ActItemDiscountModifyExecutor(String appid, String secret, ActItemDiscountModifyRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return Boolean.class;
    }
}
