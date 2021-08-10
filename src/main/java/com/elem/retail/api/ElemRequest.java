package com.elem.retail.api;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-02
 */
public interface ElemRequest {

    String getCmd();

    String getVersion();

    String getEncrypt();

    String getBody();

    String getKeyword();
}
