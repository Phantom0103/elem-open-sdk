package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderRemindReplyRequest;

import java.io.Serializable;

/**
 * 此接口主要用于商家回复用户催单信息场景。
 *
 * @Author zhouw
 * @Description 商户回复催单
 * @Date 2021-08-26
 */
public class OrderRemindReplyExecutor extends ElemApiExecutor {

    private OrderRemindReplyRequest request;

    public OrderRemindReplyExecutor(String appid, String secret, OrderRemindReplyRequest request) {
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
