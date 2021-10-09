package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityNgiftmUpdateRequest;

import java.io.Serializable;

/**
 * 更新买N赠M活动信息。
 *
 * @author zhouw
 * @description 更新买N赠M活动信息
 * @date 2021-10-09
 */
public class ActivityNgiftmUpdateExecutor extends ElemApiExecutor {

    private ActivityNgiftmUpdateRequest request;

    public ActivityNgiftmUpdateExecutor(String appid, String secret, ActivityNgiftmUpdateRequest request) {
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
