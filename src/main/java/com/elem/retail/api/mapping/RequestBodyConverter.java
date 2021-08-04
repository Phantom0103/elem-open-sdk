package com.elem.retail.api.mapping;

import com.alibaba.fastjson.JSON;
import com.elem.retail.api.ElemRequest;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-04
 */
public class RequestBodyConverter {

    public static String getRequestBody(ElemRequest request) {
        Field[] fields = request.getClass().getDeclaredFields();
        HashMap<String, Object> map = new HashMap<>();
        for (Field field : fields) {
            ApiField apiField = field.getAnnotation(ApiField.class);
            if (apiField == null) {
                continue;
            }
        }

        if (map.isEmpty()) {
            return null;
        }

        return JSON.toJSONString(map);
    }

    private void parseField(Object object, Field field, HashMap<String, Object> map) throws Exception {
        ApiField apiField = field.getAnnotation(ApiField.class);
        if (apiField == null) {
            return;
        }

        Object value = field.get(object);
        if (value == null) {
            return;
        }

        FieldType type = apiField.type();
        if (type == FieldType.OBJECT) {
            HashMap map0 = new HashMap();
            map.put(field.getName(), map0);
            Field[] fields0 = value.getClass().getDeclaredFields();
            for (Field field0 : fields0) {
                parseField(value, field0, map0);
            }
        } else if (type == FieldType.LIST) {
            ArrayList<Object> list = new ArrayList<>();
        } else {
            map.put(field.getName(), value);
        }
    }
}
