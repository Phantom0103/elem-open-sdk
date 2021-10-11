package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityNs1SkuAddRequest;

import java.io.Serializable;

/**
 * N选1添加活动商品。
 *
 * @author zhouw
 * @description N选1添加活动商品
 * @date 2021-10-11
 */
public class ActivityNs1SkuAddExecutor extends ElemApiExecutor {

    private ActivityNs1SkuAddRequest request;

    public ActivityNs1SkuAddExecutor(String appid, String secret, ActivityNs1SkuAddRequest request) {
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
