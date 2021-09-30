package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.cpc.CpcGetSuggestWagerInfoRequest;
import elem.retail.dto.cpc.CpcGetSuggestWagerInfoResult;

import java.io.Serializable;

/**
 * 查询推荐价格、预估信息。
 *
 * @author zhouw
 * @description 查询推荐价格、预估信息
 * @date 2021-09-30
 */
public class CpcGetSuggestWagerInfoExecutor extends ElemApiExecutor {

    private CpcGetSuggestWagerInfoRequest request;

    public CpcGetSuggestWagerInfoExecutor(String appid, String secret, CpcGetSuggestWagerInfoRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return CpcGetSuggestWagerInfoResult.class;
    }
}
