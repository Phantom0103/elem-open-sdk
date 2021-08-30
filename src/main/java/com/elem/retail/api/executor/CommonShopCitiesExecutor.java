package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.other.CommonShopCitiesRequest;
import elem.retail.dto.other.CommonShopCitiesResult;

import java.io.Serializable;

/**
 * 城市信息接口。
 *
 * @Author zhouw
 * @Description 城市信息
 * @Date 2021-08-30
 */
public class CommonShopCitiesExecutor extends ElemApiExecutor {

    private CommonShopCitiesRequest request;

    public CommonShopCitiesExecutor(String appid, String secret, CommonShopCitiesRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return CommonShopCitiesResult.class;
    }
}
