package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActItemDiscountSkuUpdateRequest;

import java.io.Serializable;

/**
 * 商品真折扣修改商品明细，如需此接口请提交工单申请权限。
 *
 * @author zhouw
 * @description 【商品特价真折扣】商品真折扣修改商品
 * @date 2021-10-13
 */
public class ActItemDiscountSkuUpdateExecutor extends ElemApiExecutor {

    private ActItemDiscountSkuUpdateRequest request;

    public ActItemDiscountSkuUpdateExecutor(String appid, String secret, ActItemDiscountSkuUpdateRequest request) {
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
