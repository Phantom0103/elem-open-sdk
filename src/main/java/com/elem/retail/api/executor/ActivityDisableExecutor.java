package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityDisableRequest;

import java.io.Serializable;

/**
 * 下线商品营销活动（所有活动类型）。
 *
 * @author zhouw
 * @description 下线商品营销活动（所有活动类型）
 * @date 2021-10-09
 */
public class ActivityDisableExecutor extends ElemApiExecutor {

    private ActivityDisableRequest request;

    public ActivityDisableExecutor(String appid, String secret, ActivityDisableRequest request) {
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
