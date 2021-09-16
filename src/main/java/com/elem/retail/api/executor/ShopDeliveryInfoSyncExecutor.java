package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.shop.ShopDeliveryInfoSyncRequest;

import java.io.Serializable;

/**
 * 同步自配送物流信息。
 *
 * @Author zhouw
 * @Description 同步自配送物流信息
 * @Date 2021-09-08
 */
public class ShopDeliveryInfoSyncExecutor extends ElemApiExecutor {

    private ShopDeliveryInfoSyncRequest request;

    public ShopDeliveryInfoSyncExecutor(String appid, String secret, ShopDeliveryInfoSyncRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return null;
    }
}
