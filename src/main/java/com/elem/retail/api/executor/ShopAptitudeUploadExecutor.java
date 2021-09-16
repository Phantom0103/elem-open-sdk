package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.shop.ShopAptitudeUploadRequest;

import java.io.Serializable;

/**
 * 上传资质。
 *
 * @Author zhouw
 * @Description 上传资质
 * @Date 2021-09-09
 */
public class ShopAptitudeUploadExecutor extends ElemApiExecutor {

    private ShopAptitudeUploadRequest request;

    public ShopAptitudeUploadExecutor(String appid, String secret, ShopAptitudeUploadRequest request) {
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
