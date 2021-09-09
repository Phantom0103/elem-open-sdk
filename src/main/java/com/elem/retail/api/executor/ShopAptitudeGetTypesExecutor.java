package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.shop.ShopAptitudeGetTypesRequest;
import elem.retail.dto.shop.ShopAptitudeGetTypesResult;

import java.io.Serializable;

/**
 * 获取全部资质类型。
 *
 * @Author zhouw
 * @Description 获取全部资质类型
 * @Date 2021-09-09
 */
public class ShopAptitudeGetTypesExecutor extends ElemApiExecutor {

    private ShopAptitudeGetTypesRequest request;

    public ShopAptitudeGetTypesExecutor(String appid, String secret, ShopAptitudeGetTypesRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ShopAptitudeGetTypesResult.class;
    }
}
