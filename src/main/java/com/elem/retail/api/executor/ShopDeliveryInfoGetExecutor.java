package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.shop.ShopDeliveryInfoGetRequest;
import elem.retail.dto.shop.ShopDeliveryInfoGetResult;

import java.io.Serializable;

/**
 * 查询自配送物流信息。
 *
 * @Author zhouw
 * @Description 查询自配送物流信息
 * @Date 2021-09-09
 */
public class ShopDeliveryInfoGetExecutor extends ElemApiExecutor {

    private ShopDeliveryInfoGetRequest request;

    public ShopDeliveryInfoGetExecutor(String appid, String secret, ShopDeliveryInfoGetRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ShopDeliveryInfoGetResult.class;
    }
}
