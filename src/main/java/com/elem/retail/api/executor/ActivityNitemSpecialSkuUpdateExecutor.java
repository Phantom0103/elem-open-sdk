package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityNitemSpecialSkuUpdateRequest;

import java.io.Serializable;

/**
 * 更新第N件特价更新活动商品库存、日库存。
 *
 * @author zhouw
 * @description 更新第N件特价更新活动商品库存、日库存
 * @date 2021-10-12
 */
public class ActivityNitemSpecialSkuUpdateExecutor extends ElemApiExecutor {

    private ActivityNitemSpecialSkuUpdateRequest request;

    public ActivityNitemSpecialSkuUpdateExecutor(String appid, String secret, ActivityNitemSpecialSkuUpdateRequest request) {
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
