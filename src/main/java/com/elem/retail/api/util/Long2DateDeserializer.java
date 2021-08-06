package com.elem.retail.api.util;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

import java.lang.reflect.Type;
import java.util.Date;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-06
 */
public class Long2DateDeserializer implements ObjectDeserializer {

    @Override
    @SuppressWarnings("unchecked")
    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {
        Long v = parser.parseObject(Long.TYPE, fieldName);
        if (v != null) {
            if (v > 9999999999L) {
                return (T) new Date(v);
            } else if (v > 0) {
                return (T) new Date(v * 1000);
            }
        }

        return null;
    }

    @Override
    public int getFastMatchToken() {
        return 0;
    }
}
