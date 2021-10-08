package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActItemDiscountSkuAddRequest;

import java.io.Serializable;

/**
 * 商品真折扣添加商品明细，如需此接口请提交工单申请权限。
 *
 * @author zhouw
 * @description 商品真折扣添加商品明细
 * @date 2021-10-08
 */
public class ActItemDiscountSkuAddExecutor extends ElemApiExecutor {

    private ActItemDiscountSkuAddRequest request;

    public ActItemDiscountSkuAddExecutor(String appid, String secret, ActItemDiscountSkuAddRequest request) {
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
