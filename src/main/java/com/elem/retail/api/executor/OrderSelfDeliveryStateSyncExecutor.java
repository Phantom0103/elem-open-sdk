package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderSelfDeliveryStateSyncRequest;

import java.io.Serializable;

/**
 * 此接口主要用于商家自配送场景，将骑手信息（包括姓名和手机号）同步到饿了么平台，用户可在饿了么APP端订单详情也中查看骑手信息/呼叫骑手。
 * 商家自配送接入流程图请查看 接入指南-API调用场景-订单整体方案中的订单（商家自配送）接入流程。
 * 注意：此接口有两个功能（1. 订单送出 2. 同步骑手信息），如果调用此接口将无需再调用order.sendout （两个接口互斥）。
 *
 * @Author zhouw
 * @Description 自配送接入骑手状态
 * @Date 2021-08-27
 */
public class OrderSelfDeliveryStateSyncExecutor extends ElemApiExecutor {

    private OrderSelfDeliveryStateSyncRequest request;

    public OrderSelfDeliveryStateSyncExecutor(String appid, String secret, OrderSelfDeliveryStateSyncRequest request) {
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
