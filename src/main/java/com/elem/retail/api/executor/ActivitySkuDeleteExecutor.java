package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivitySkuDeleteRequest;

import java.io.Serializable;

/**
 * 删除活动商品（除N选1外，所有活动类型）。
 *
 * @author zhouw
 * @description 删除活动商品（除N选1外，所有活动类型）
 * @date 2021-10-13
 */
public class ActivitySkuDeleteExecutor extends ElemApiExecutor {

    private ActivitySkuDeleteRequest request;

    public ActivitySkuDeleteExecutor(String appid, String secret, ActivitySkuDeleteRequest request) {
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
