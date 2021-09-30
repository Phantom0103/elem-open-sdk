package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.cpc.CpcUpdateAutoStatusRequest;

import java.io.Serializable;

/**
 * 根据店铺ID，更新自动投放状态（增加投放时段）。设置后，下一个时间段即可进行触发。
 *
 * @author zhouw
 * @description 更新自动投放状态
 * @date 2021-09-30
 */
public class CpcUpdateAutoStatusExecutor extends ElemApiExecutor {

    private CpcUpdateAutoStatusRequest request;

    public CpcUpdateAutoStatusExecutor(String appid, String secret, CpcUpdateAutoStatusRequest request) {
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
