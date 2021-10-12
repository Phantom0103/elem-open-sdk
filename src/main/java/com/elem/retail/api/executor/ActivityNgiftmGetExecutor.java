package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityNgiftmGetRequest;
import elem.retail.dto.activity.ActivityNgiftmGetResult;

import java.io.Serializable;

/**
 * 查看买赠活动信息。
 *
 * @author zhouw
 * @description 查看买赠活动信息
 * @date 2021-10-09
 */
public class ActivityNgiftmGetExecutor extends ElemApiExecutor {

    private ActivityNgiftmGetRequest request;

    public ActivityNgiftmGetExecutor(String appid, String secret, ActivityNgiftmGetRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ActivityNgiftmGetResult.class;
    }
}
