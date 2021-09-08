package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.shop.ShopCloseRequest;

import java.io.Serializable;

/**
 * 设置商户营业状态为休息中(用户端显示为休息或休息中)。
 *
 * @Author zhouw
 * @Description 商户休息中
 * @Date 2021-09-08
 */
public class ShopCloseExecutor extends ElemApiExecutor {

    private ShopCloseRequest request;

    public ShopCloseExecutor(String appid, String secret, ShopCloseRequest request) {
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
