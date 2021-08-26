package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderRefundDeliveryGetRequest;
import elem.retail.dto.order.OrderRefundDeliveryGetResult;

import java.io.Serializable;

/**
 * 逆向单配送信息获取。
 *
 * @Author zhouw
 * @Description 逆向单配送信息获取
 * @Date 2021-08-26
 */
public class OrderRefundDeliveryGetExecutor extends ElemApiExecutor {

    private OrderRefundDeliveryGetRequest request;

    public OrderRefundDeliveryGetExecutor(String appid, String secret, OrderRefundDeliveryGetRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return OrderRefundDeliveryGetResult.class;
    }
}
