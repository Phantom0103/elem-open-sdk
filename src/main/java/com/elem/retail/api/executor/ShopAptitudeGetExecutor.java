package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.shop.ShopAptitudeGetRequest;
import elem.retail.dto.shop.ShopAptitudeGetResult;

import java.io.Serializable;

/**
 * 获取商户资质。
 *
 * @Author zhouw
 * @Description 获取商户资质
 * @Date 2021-09-09
 */
public class ShopAptitudeGetExecutor extends ElemApiExecutor {

    private ShopAptitudeGetRequest request;

    public ShopAptitudeGetExecutor(String appid, String secret, ShopAptitudeGetRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ShopAptitudeGetResult.class;
    }
}
