package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityNgiftmCreateRequest;
import elem.retail.dto.activity.ActivityNgiftmCreateResult;

import java.io.Serializable;

/**
 * 创建买赠营销活动，主商品和赠品可相同。
 *
 * @author zhouw
 * @description 创建买N赠M营销活动
 * @date 2021-10-13
 */
public class ActivityNgiftmCreateExecutor extends ElemApiExecutor {

    private ActivityNgiftmCreateRequest request;

    public ActivityNgiftmCreateExecutor(String appid, String secret, ActivityNgiftmCreateRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ActivityNgiftmCreateResult.class;
    }
}
