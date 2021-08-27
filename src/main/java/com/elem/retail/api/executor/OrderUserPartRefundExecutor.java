package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderUserPartRefundRequest;

import java.io.Serializable;

/**
 * 此接口主要用于商家代客户发起退款申请场景，用户和商家协商退款后商家代用户发起退款申请，需商户同意退款后，方可退款成功。
 *
 * @Author zhouw
 * @Description 代客发起
 * @Date 2021-08-27
 */
public class OrderUserPartRefundExecutor extends ElemApiExecutor {

    private OrderUserPartRefundRequest request;

    public OrderUserPartRefundExecutor(String appid, String secret, OrderUserPartRefundRequest request) {
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
