package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityGetRequest;
import elem.retail.dto.activity.ActivityGetResult;

import java.io.Serializable;

/**
 * 查看活动（直降、品类满减、选一）。
 *
 * @author zhouw
 * @description 查看活动（直降、品类满减、选一）
 * @date 2021-10-12
 */
public class ActivityGetExecutor extends ElemApiExecutor {

    private ActivityGetRequest request;

    public ActivityGetExecutor(String appid, String secret, ActivityGetRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ActivityGetResult.class;
    }
}
