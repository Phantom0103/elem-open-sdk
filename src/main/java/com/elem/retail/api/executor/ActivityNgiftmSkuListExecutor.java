package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActivityNgiftmSkuListRequest;
import elem.retail.dto.activity.ActivityNgiftmSkuListResult;

import java.io.Serializable;

/**
 * 查看买N赠M查询活动商品信息列表。
 *
 * @author zhouw
 * @description 查看买N赠M查询活动商品信息列表
 * @date 2021-10-08
 */
public class ActivityNgiftmSkuListExecutor extends ElemApiExecutor {

    private ActivityNgiftmSkuListRequest request;

    public ActivityNgiftmSkuListExecutor(String appid, String secret, ActivityNgiftmSkuListRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ActivityNgiftmSkuListResult.class;
    }
}
