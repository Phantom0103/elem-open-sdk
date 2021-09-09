package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.shop.ShopListRequest;
import elem.retail.dto.shop.ShopListResult;

import java.io.Serializable;

/**
 * 商户列表，返回soruce下所有绑定的门店信息。
 *
 * @Author zhouw
 * @Description 商户列表
 * @Date 2021-09-09
 */
public class ShopListExecutor extends ElemApiExecutor {

    private ShopListRequest request;

    public ShopListExecutor(String appid, String secret, ShopListRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ShopListResult.class;
    }
}
