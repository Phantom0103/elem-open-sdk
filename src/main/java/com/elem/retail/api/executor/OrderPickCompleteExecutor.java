package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderPickCompleteRequest;

import java.io.Serializable;

/**
 * 此接口主要用于商家确认订单拣货已完成场景，商家接单后支持调用此接口。在拣货时如果发现有缺货现象，商家可主动调订单取消/部分退款接口退款给用户。
 *
 * @Author zhouw
 * @Description 订单拣货完成
 * @Date 2021-08-25
 */
public class OrderPickCompleteExecutor extends ElemApiExecutor {

    private OrderPickCompleteRequest request;

    public OrderPickCompleteExecutor(String appid, String secret, OrderPickCompleteRequest request) {
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
