package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.cpc.CpcGetRankAndCostInfoRequest;
import elem.retail.dto.cpc.CpcGetRankAndCostInfoResult;

import java.io.Serializable;

/**
 * 根据店铺ID，查询今日、近7天、近30天推广点击分布。
 *
 * @author zhouw
 * @description 查询推广点击分布信息
 * @date 2021-09-30
 */
public class CpcGetRankAndCostInfoExecutor extends ElemApiExecutor {

    private CpcGetRankAndCostInfoRequest request;

    public CpcGetRankAndCostInfoExecutor(String appid, String secret, CpcGetRankAndCostInfoRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return CpcGetRankAndCostInfoResult.class;
    }
}
