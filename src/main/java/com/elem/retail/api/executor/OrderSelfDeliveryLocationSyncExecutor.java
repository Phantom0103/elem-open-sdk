package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderSelfDeliveryLocationSyncRequest;

import java.io.Serializable;

/**
 * 此接口主要用于商家自配送场景，将骑手轨迹同步到饿了么平台，用户可在饿了么APP端订单详情地图中查看骑手实时配送轨迹。
 * 商家自配送接入流程图请查看：接入指南-API调用场景-订单整体方案中的订单（商家自配送）接入流程。
 *
 * @Author zhouw
 * @Description 自配送接入骑手轨迹
 * @Date 2021-08-25
 */
public class OrderSelfDeliveryLocationSyncExecutor extends ElemApiExecutor {

    private OrderSelfDeliveryLocationSyncRequest request;

    public OrderSelfDeliveryLocationSyncExecutor(String appid, String secret, OrderSelfDeliveryLocationSyncRequest request) {
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
