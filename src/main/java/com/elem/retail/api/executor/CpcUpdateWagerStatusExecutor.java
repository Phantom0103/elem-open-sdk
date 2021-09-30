package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.cpc.CpcUpdateWagerStatusRequest;

import java.io.Serializable;

/**
 * 根据店铺ID，设置推广状态。
 *
 * @author zhouw
 * @description 设置推广状态
 * @date 2021-09-30
 */
public class CpcUpdateWagerStatusExecutor extends ElemApiExecutor {

    private CpcUpdateWagerStatusRequest request;

    public CpcUpdateWagerStatusExecutor(String appid, String secret, CpcUpdateWagerStatusRequest request) {
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
