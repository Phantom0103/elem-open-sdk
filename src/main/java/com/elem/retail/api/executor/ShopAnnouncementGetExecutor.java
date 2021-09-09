package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.shop.ShopAnnouncementGetRequest;
import elem.retail.dto.shop.ShopAnnouncementGetResult;

import java.io.Serializable;

/**
 * 获取商户公告。
 *
 * @Author zhouw
 * @Description 获取商户公告
 * @Date 2021-09-09
 */
public class ShopAnnouncementGetExecutor extends ElemApiExecutor {

    private ShopAnnouncementGetRequest request;

    public ShopAnnouncementGetExecutor(String appid, String secret, ShopAnnouncementGetRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ShopAnnouncementGetResult.class;
    }
}
