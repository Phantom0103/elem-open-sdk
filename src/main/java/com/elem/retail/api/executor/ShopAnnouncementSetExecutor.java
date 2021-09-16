package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.shop.ShopAnnouncementSetRequest;

import java.io.Serializable;

/**
 * 设置商户公告。
 *
 * @Author zhouw
 * @Description 设置商户公告
 * @Date 2021-09-09
 */
public class ShopAnnouncementSetExecutor extends ElemApiExecutor {

    private ShopAnnouncementSetRequest request;

    public ShopAnnouncementSetExecutor(String appid, String secret, ShopAnnouncementSetRequest request) {
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
