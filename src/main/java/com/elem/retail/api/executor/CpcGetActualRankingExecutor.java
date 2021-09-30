package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.cpc.CpcGetActualRankingRequest;
import elem.retail.dto.cpc.CpcGetActualRankingResult;

import java.io.Serializable;

/**
 * 根据店铺ID，获取竞价推广实时排名。
 *
 * @author zhouw
 * @description 获取竞价推广实时排名
 * @date 2021-09-30
 */
public class CpcGetActualRankingExecutor extends ElemApiExecutor {

    private CpcGetActualRankingRequest request;

    public CpcGetActualRankingExecutor(String appid, String secret, CpcGetActualRankingRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return CpcGetActualRankingResult.class;
    }
}
