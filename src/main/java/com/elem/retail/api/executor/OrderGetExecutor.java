package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderGetRequest;
import elem.retail.dto.order.OrderGetResult;

import java.io.Serializable;

/**
 * 此接口主要用于订单下单后获取订单详细信息，包括订单信息、商品信息、营销信息、用户信息以及商户信息等。
 * 注意：1. 如订单详情中down_flag为1时，标识该订单因网络或信息交互异常被降级，此时订单会被标记为“已降级”状态。
 * 此类订单不影响订单履约流程（无需拒单），重试查询获取订单完整数据即可。
 *
 * @Author zhouw
 * @Description 查看订单详情
 * @Date 2021-08-04
 */
public class OrderGetExecutor extends ElemApiExecutor {

    private OrderGetRequest request;

    public OrderGetExecutor(String appid, String secret, OrderGetRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return OrderGetResult.class;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }
}
