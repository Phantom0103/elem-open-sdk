package com.alibaba.ocean.rawsdk.example.param;

import com.alibaba.ocean.rawsdk.client.APIId;
import com.alibaba.ocean.rawsdk.common.AbstractAPIRequest;

public class CommonBusinessCatParam extends AbstractAPIRequest<CommonBusinessCatResult> {

    public CommonBusinessCatParam() {
        super();
        oceanApiId = new APIId("me.ele.retail", "common.businesscategories", 3);
    }

    private CBCRequestBody body;

    /**
     * @return 请求参数
     */
    public CBCRequestBody getBody() {
        return body;
    }

    /**
     * 设置请求参数     *
     * 参数示例：<pre>参见内容</pre>
     * 此参数必填
     */
    public void setBody(CBCRequestBody body) {
        this.body = body;
    }

}
