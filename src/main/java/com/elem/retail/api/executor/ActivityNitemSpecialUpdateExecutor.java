package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityNitemSpecialUpdateRequest;

import java.io.Serializable;

/**
 * 更新第N件特价活动信息。
 *
 * @author zhouw
 * @description 更新第N件特价活动信息
 * @date 2021-10-13
 */
public class ActivityNitemSpecialUpdateExecutor extends ElemApiExecutor {

    private ActivityNitemSpecialUpdateRequest request;

    public ActivityNitemSpecialUpdateExecutor(String appid, String secret, ActivityNitemSpecialUpdateRequest request) {
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
