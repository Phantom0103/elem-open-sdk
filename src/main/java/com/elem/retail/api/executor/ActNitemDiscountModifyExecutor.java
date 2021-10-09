package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActNitemDiscountModifyRequest;

import java.io.Serializable;

/**
 * 商品第N件特价真折扣修改活动信息，如需此接口请提交工单申请权限。
 *
 * @author zhouw
 * @description 【第N件特价真折扣】商品第N件特价真折扣修改活动信息
 * @date 2021-10-09
 */
public class ActNitemDiscountModifyExecutor extends ElemApiExecutor {

    private ActNitemDiscountModifyRequest request;

    public ActNitemDiscountModifyExecutor(String appid, String secret, ActNitemDiscountModifyRequest request) {
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
