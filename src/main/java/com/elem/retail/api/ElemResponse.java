package com.elem.retail.api;

import java.io.Serializable;

/**
 * @Author zhouw
 * @Description api基础响应信息
 * @Date 2021-08-02
 */
public abstract class ElemResponse implements Serializable {

    private static final long serialVersionUID = 6963059547678465383L;

    private String code;

    private String message;
}
