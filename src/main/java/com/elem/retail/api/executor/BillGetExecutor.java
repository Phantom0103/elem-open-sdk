package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.order.BillGetRequest;
import elem.retail.dto.order.BillGetResult;

import java.io.Serializable;

/**
 * 获取账单。
 *
 * @Author zhouw
 * @Description 获取账单
 * @Date 2021-08-24
 */
public class BillGetExecutor extends ElemApiExecutor {

    private BillGetRequest request;

    public BillGetExecutor(String appid, String secret, BillGetRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return BillGetResult.class;
    }
}
