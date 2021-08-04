package com.elem.retail.api;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-03
 */
public abstract class BaseElemRequest implements ElemRequest {

    @Override
    public String getVersion() {
        return "3";
    }

    @Override
    public String getEncrypt() {
        return "";
    }
}
