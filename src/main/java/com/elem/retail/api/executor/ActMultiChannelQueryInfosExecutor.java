package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.activity.ActMultiChannelQueryInfosRequest;
import elem.retail.dto.activity.ActMultiChannelQueryInfosResult;

import java.io.Serializable;

/**
 * 多渠道查询活动详情。
 *
 * @author zhouw
 * @description 多渠道查询活动详情
 * @date 2021-10-12
 */
public class ActMultiChannelQueryInfosExecutor extends ElemApiExecutor {

    private ActMultiChannelQueryInfosRequest request;

    public ActMultiChannelQueryInfosExecutor(String appid, String secret, ActMultiChannelQueryInfosRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return ActMultiChannelQueryInfosResult.class;
    }
}
