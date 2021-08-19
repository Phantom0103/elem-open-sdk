package com.elem.retail.api;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-02
 */
public interface ElemRequest {

    @JSONField(serialize = false)
    String getCmd();

    @JSONField(serialize = false)
    String getVersion();

    @JSONField(serialize = false)
    String getEncrypt();

    @JSONField(serialize = false)
    String getBody();

    @JSONField(serialize = false)
    String getKeyword();
}
