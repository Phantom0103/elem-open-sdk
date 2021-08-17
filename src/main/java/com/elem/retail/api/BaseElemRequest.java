package com.elem.retail.api;

import java.io.Serializable;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-03
 */
public abstract class BaseElemRequest implements ElemRequest, Serializable {

    private static final long serialVersionUID = 3599429137644207551L;

    @Override
    public String getVersion() {
        return "3";
    }

    @Override
    public String getEncrypt() {
        return "";
    }
}
