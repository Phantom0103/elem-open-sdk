package com.elem.retail.api.executor;

import com.elem.retail.api.ElemRequest;
import elem.retail.dto.other.CommonLpdspUpdstatusRequest;
import elem.retail.dto.other.CommonLpdspUpdstatusResult;

import java.io.Serializable;

/**
 * 物流多服务商平台提供物流履约状态回传功能API。
 *
 * @Author zhouw
 * @Description 物流履约状态更新
 * @Date 2021-08-30
 */
public class CommonLpdspUpdstatusExecutor extends ElemApiExecutor {

    private CommonLpdspUpdstatusRequest request;

    public CommonLpdspUpdstatusExecutor(String appid, String secret, CommonLpdspUpdstatusRequest request) {
        super(appid, secret);
        this.request = request;
    }

    @Override
    ElemRequest getRequest() {
        return request;
    }

    @Override
    Class<? extends Serializable> getResponseDataClass() {
        return CommonLpdspUpdstatusResult.class;
    }
}
