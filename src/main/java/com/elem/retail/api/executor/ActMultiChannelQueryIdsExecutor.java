package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActMultiChannelQueryIdsRequest;
import elem.retail.dto.activity.ActMultiChannelQueryIdsResult;

import java.io.Serializable;

/**
 * 多渠道查询获取参与的活动IdList。
 *
 * @author zhouw
 * @description 多渠道查询获取参与的活动IdList
 * @date 2021-10-12
 */
public class ActMultiChannelQueryIdsExecutor extends ElemApiExecutor {

    private ActMultiChannelQueryIdsRequest request;

    public ActMultiChannelQueryIdsExecutor(String appid, String secret, ActMultiChannelQueryIdsRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ActMultiChannelQueryIdsResult.class;
    }
}
