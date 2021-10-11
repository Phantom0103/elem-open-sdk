package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityNgiftmSkuAddRequest;

import java.io.Serializable;

/**
 * 添加买N赠M活动商品。
 *
 * @author zhouw
 * @description 添加买N赠M活动商品和相应赠品
 * @date 2021-10-11
 */
public class ActivityNgiftmSkuAddExecutor extends ElemApiExecutor {

    private ActivityNgiftmSkuAddRequest request;

    public ActivityNgiftmSkuAddExecutor(String appid, String secret, ActivityNgiftmSkuAddRequest request) {
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
