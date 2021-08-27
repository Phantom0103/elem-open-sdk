package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.BillOrderDetailRequest;
import elem.retail.dto.order.BillOrderDetailResult;

import java.io.Serializable;

/**
 * 获取账单订单明细信息。
 *
 * @Author zhouw
 * @Description 获取账单订单明细信息
 * @Date 2021-08-27
 */
public class BillOrderDetailExecutor extends ElemApiExecutor {

    private BillOrderDetailRequest request;

    public BillOrderDetailExecutor(String appid, String secret, BillOrderDetailRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return BillOrderDetailResult.class;
    }
}
