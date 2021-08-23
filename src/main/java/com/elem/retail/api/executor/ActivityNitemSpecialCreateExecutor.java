package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityNitemSpecialCreateRequest;
import elem.retail.dto.activity.ActivityNitemSpecialCreateResult;

import java.io.Serializable;

/**
 * 创建第N件特价营销活动。
 *
 * @Author zhouw
 * @Description 创建第N件特价活动
 * @Date 2021-08-23
 */
public class ActivityNitemSpecialCreateExecutor extends ElemApiExecutor {

    private ActivityNitemSpecialCreateRequest request;

    public ActivityNitemSpecialCreateExecutor(String appid, String secret, ActivityNitemSpecialCreateRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ActivityNitemSpecialCreateResult.class;
    }
}
