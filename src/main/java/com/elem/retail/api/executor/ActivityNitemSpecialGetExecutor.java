package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityNitemSpecialGetRequest;
import elem.retail.dto.activity.ActivityNitemSpecialGetResult;

import java.io.Serializable;

/**
 * 查看第N件特价活动信息。
 *
 * @author zhouw
 * @description 查看第N件特价活动信息
 * @date 2021-10-09
 */
public class ActivityNitemSpecialGetExecutor extends ElemApiExecutor {

    private ActivityNitemSpecialGetRequest request;

    public ActivityNitemSpecialGetExecutor(String appid, String secret, ActivityNitemSpecialGetRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ActivityNitemSpecialGetResult.class;
    }
}
