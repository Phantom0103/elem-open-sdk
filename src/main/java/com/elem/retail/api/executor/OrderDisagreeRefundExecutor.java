package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.OrderDisagreeRefundRequest;

import java.io.Serializable;

/**
 * 此接口主要用于用户发起全单和部分取消/退款时，商家审核不同意/拒绝的场景。注意：1. 售中用户发起全单取消的审核时效为15分钟，若超过时未处理系统将
 * 自动同意 2. 售后用户发起的全单退款和部分退款的审核时效为24小时，若超时未处理系统将自动同意。3. 若用户发起退款，被商家拒绝后，可以申请饿了么
 * 客服仲裁（饿了么客服会与用户、商家沟通协商处理）
 *
 * @Author zhouw
 * @Description 拒绝用户全部和部分取消单/退单
 * @Date 2021-08-26
 */
public class OrderDisagreeRefundExecutor extends ElemApiExecutor {

    private OrderDisagreeRefundRequest request;

    public OrderDisagreeRefundExecutor(String appid, String secret, OrderDisagreeRefundRequest request) {
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
