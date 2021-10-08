package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityNs1UpdateRequest;

import java.io.Serializable;

/**
 * 更新N选1活动信息。
 *
 * @author zhouw
 * @description 更新N选1活动信息
 * @date 2021-10-08
 */
public class ActivityNs1UpdateExecutor extends ElemApiExecutor {

    private ActivityNs1UpdateRequest request;

    public ActivityNs1UpdateExecutor(String appid, String secret, ActivityNs1UpdateRequest request) {
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
