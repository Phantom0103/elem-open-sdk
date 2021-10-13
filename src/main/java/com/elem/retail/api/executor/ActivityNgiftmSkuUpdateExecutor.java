package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityNgiftmSkuUpdateRequest;

import java.io.Serializable;

/**
 * 更新买赠活动商品库存、日库存等。
 *
 * @author zhouw
 * @description 更新买N赠M活动商品库存、日库存等
 * @date 2021-10-13
 */
public class ActivityNgiftmSkuUpdateExecutor extends ElemApiExecutor {

    private ActivityNgiftmSkuUpdateRequest request;

    public ActivityNgiftmSkuUpdateExecutor(String appid, String secret, ActivityNgiftmSkuUpdateRequest request) {
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
