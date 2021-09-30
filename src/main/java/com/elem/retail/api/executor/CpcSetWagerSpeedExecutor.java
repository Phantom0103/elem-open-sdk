package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.cpc.CpcSetWagerSpeedRequest;

import java.io.Serializable;

/**
 * 根据店铺ID，设置推广速率。
 *
 * @author zhouw
 * @description 根据店铺ID，设置推广速率
 * @date 2021-09-30
 */
public class CpcSetWagerSpeedExecutor extends ElemApiExecutor {

    private CpcSetWagerSpeedRequest request;

    public CpcSetWagerSpeedExecutor(String appid, String secret, CpcSetWagerSpeedRequest request) {
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
