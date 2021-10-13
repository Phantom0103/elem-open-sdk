package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActNitemDiscountSkuAddBatchRequest;

import java.io.Serializable;

/**
 * 商品第N件特价真折扣批量添加商品明细，如需此接口请提交工单申请权限。
 *
 * @author zhouw
 * @description 【第N件特价真折扣】商品第N件特价真折扣批量添加商品明细
 * @date 2021-10-13
 */
public class ActNitemDiscountSkuAddBatchExecutor extends ElemApiExecutor {

    private ActNitemDiscountSkuAddBatchRequest request;

    public ActNitemDiscountSkuAddBatchExecutor(String appid, String secret, ActNitemDiscountSkuAddBatchRequest request) {
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
