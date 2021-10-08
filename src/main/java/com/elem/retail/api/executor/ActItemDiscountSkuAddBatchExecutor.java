package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActItemDiscountSkuAddBatchRequest;

import java.io.Serializable;

/**
 * 商品真折扣批量添加商品明细，如需此接口请提交工单申请权限。
 *
 * @author zhouw
 * @description 商品真折扣批量添加商品明细
 * @date 2021-10-08
 */
public class ActItemDiscountSkuAddBatchExecutor extends ElemApiExecutor {

    private ActItemDiscountSkuAddBatchRequest request;

    public ActItemDiscountSkuAddBatchExecutor(String appid, String secret, ActItemDiscountSkuAddBatchRequest request) {
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
