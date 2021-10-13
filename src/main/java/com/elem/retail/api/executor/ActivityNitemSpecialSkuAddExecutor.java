package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityNitemSpecialSkuAddRequest;

import java.io.Serializable;

/**
 * 添加第N件特价活动商品。
 *
 * @author zhouw
 * @description 添加第N件特价活动商品
 * @date 2021-10-13
 */
public class ActivityNitemSpecialSkuAddExecutor extends ElemApiExecutor {

    private ActivityNitemSpecialSkuAddRequest request;

    public ActivityNitemSpecialSkuAddExecutor(String appid, String secret, ActivityNitemSpecialSkuAddRequest request) {
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
