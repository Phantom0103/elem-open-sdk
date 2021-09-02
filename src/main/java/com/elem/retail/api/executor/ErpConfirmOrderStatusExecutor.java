package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.drug.ErpConfirmOrderStatusRequest;

import java.io.Serializable;

/**
 * ERP店铺确认订单状态。
 *
 * @Author zhouw
 * @Description ERP店铺确认订单状态
 * @Date 2021-09-02
 */
public class ErpConfirmOrderStatusExecutor extends ElemApiExecutor {

    private ErpConfirmOrderStatusRequest request;

    public ErpConfirmOrderStatusExecutor(String appid, String secret, ErpConfirmOrderStatusRequest request) {
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
