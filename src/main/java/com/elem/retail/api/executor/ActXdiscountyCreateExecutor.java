package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActXdiscountyCreateRequest;
import elem.retail.dto.activity.ActXdiscountyCreateResult;

import java.io.Serializable;

/**
 * 商品真折扣创建活动。
 *
 * @author zhouw
 * @description 商品X件Y元/折创建活动
 * @date 2021-10-09
 */
public class ActXdiscountyCreateExecutor extends ElemApiExecutor {

    private ActXdiscountyCreateRequest request;

    public ActXdiscountyCreateExecutor(String appid, String secret, ActXdiscountyCreateRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ActXdiscountyCreateResult.class;
    }
}
