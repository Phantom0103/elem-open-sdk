package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderCancelListRequest;
import elem.retail.dto.order.OrderCancelListResult;

import java.io.Serializable;

/**
 * 此接口主要用于售中商家主动获取未处理用户申请的全单取消列表场景，以防止遗漏未处理退款单引起客诉和资损。
 *
 * @Author zhouw
 * @Description 获取未处理取消单/退单
 * @Date 2021-08-27
 */
public class OrderCancelListExecutor extends ElemApiExecutor {

    private OrderCancelListRequest request;

    public OrderCancelListExecutor(String appid, String secret, OrderCancelListRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return OrderCancelListResult.class;
    }
}
