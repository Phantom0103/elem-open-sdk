package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActXdiscountyModifyRequest;

import java.io.Serializable;

/**
 * 商品真折扣修改活动信息。
 *
 * @author zhouw
 * @description 商品X件Y元/折修改活动信息
 * @date 2021-10-12
 */
public class ActXdiscountyModifyExecutor extends ElemApiExecutor {

    private ActXdiscountyModifyRequest request;

    public ActXdiscountyModifyExecutor(String appid, String secret, ActXdiscountyModifyRequest request) {
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
