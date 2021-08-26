package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderRemindGetRequest;
import elem.retail.dto.order.OrderRemindGetResult;

import java.io.Serializable;

/**
 * 此接口主要用于获取商户未处理的催单数据。
 *
 * @Author zhouw
 * @Description 获取商户未处理催单
 * @Date 2021-08-26
 */
public class OrderRemindGetExecutor extends ElemApiExecutor {

    private OrderRemindGetRequest request;

    public OrderRemindGetExecutor(String appid, String secret, OrderRemindGetRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return OrderRemindGetResult.class;
    }
}
