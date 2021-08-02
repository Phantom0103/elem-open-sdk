package com.elem.retail.api;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-02
 */
public class ElemApiException extends RuntimeException {

    private static final long serialVersionUID = 1861972679859152501L;

    private String errorCode;

    public ElemApiException(String errorCode, String errorMessage) {
        super(errorCode + ":" + errorMessage);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
