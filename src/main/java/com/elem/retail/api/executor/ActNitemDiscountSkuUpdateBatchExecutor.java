package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActNitemDiscountSkuUpdateBatchRequest;

import java.io.Serializable;

/**
 * 商品第N件特价真折扣批量修改商品明细，如需此接口请提交工单申请权限。
 *
 * @author zhouw
 * @description 【第N件特价真折扣】商品第N件特价真折扣批量修改商品明细
 * @date 2021-10-08
 */
public class ActNitemDiscountSkuUpdateBatchExecutor extends ElemApiExecutor {

    private ActNitemDiscountSkuUpdateBatchRequest request;

    public ActNitemDiscountSkuUpdateBatchExecutor(String appid, String secret, ActNitemDiscountSkuUpdateBatchRequest request) {
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
