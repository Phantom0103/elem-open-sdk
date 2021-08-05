package com.elem.retail.api;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-03
 */
public abstract class ElemResponseData implements Serializable {

    private static final long serialVersionUID = -8205640551444382408L;

    public abstract void parse(JSONObject json);
}
