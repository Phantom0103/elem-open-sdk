package me.ele.retail.param;

import com.alibaba.ocean.rawsdk.client.APIId;
import com.alibaba.ocean.rawsdk.common.AbstractAPIRequest;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class OrderGetParam extends AbstractAPIRequest<OrderGetResult> {

    public OrderGetParam() {
        super();
        oceanApiId = new APIId("me.ele.retail", "order.get", 3);
    }

    private MeEleRetailOrderGetReqDto body;

    /**
     * @return 请求参数
     */
    public MeEleRetailOrderGetReqDto getBody() {
        return body;
    }

    /**
     * 设置请求参数     *
     * 参数示例：<pre>见消息体</pre>     
     * 此参数必填
     */
    public void setBody(MeEleRetailOrderGetReqDto body) {
        this.body = body;
    }

}
