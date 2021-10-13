package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityUpdateRequest;

import java.io.Serializable;

/**
 * 商品营销活动更新活动信息。
 *
 * @author zhouw
 * @description 更新活动信息（单品直降、品类满减）
 * @date 2021-10-13
 */
public class ActivityUpdateExecutor extends ElemApiExecutor {

    private ActivityUpdateRequest request;

    public ActivityUpdateExecutor(String appid, String secret, ActivityUpdateRequest request) {
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
