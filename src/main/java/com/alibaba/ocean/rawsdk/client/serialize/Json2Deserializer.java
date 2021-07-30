package com.alibaba.ocean.rawsdk.client.serialize;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.ocean.rawsdk.client.entity.ResponseWrapper;
import com.alibaba.ocean.rawsdk.client.util.ExceptionParser;
import com.alibaba.ocean.rawsdk.common.BizResultWrapper;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;

public class Json2Deserializer {

    public static <T> ResponseWrapper<T> deSerialize(String content) {

        BizResultWrapper<T> result = JSON.parseObject(content, new TypeReference<BizResultWrapper<T>>() {
        });

        ResponseWrapper<T> responseWrapper = new ResponseWrapper<T>();
        responseWrapper.setResult(result);
        return responseWrapper;
    }

    public static Throwable buildException(String content) {
        Map result = JSON.parseObject(content, Map.class);
        return ExceptionParser.buildException4Json2(result);
    }
}
