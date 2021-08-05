package com.elem.retail.api;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Author zhouw
 * @Description api基础响应信息
 * @Date 2021-08-02
 */
@Getter
@Setter
public class ElemResponse<T extends ElemResponseData> implements Serializable {

    private static final long serialVersionUID = 6963059547678465383L;

    private String code;

    private String message;

    private T data;

    private String cmd;

    private String encrypt;

    private String sign;

    private String source;

    private String ticket;

    private long timestamp;

    private String traceid;

    private String version;
}
