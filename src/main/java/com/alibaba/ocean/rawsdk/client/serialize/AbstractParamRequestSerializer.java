package com.alibaba.ocean.rawsdk.client.serialize;

import com.alibaba.fastjson.JSON;
import com.alibaba.ocean.rawsdk.util.DateUtil;
import com.alibaba.ocean.rawsdk.util.DefaultPropertyUtils;
import com.alibaba.ocean.rawsdk.util.GenericsUtil;
import com.alibaba.ocean.rawsdk.util.SimplePropertyDescriptor;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class AbstractParamRequestSerializer implements Serializable {


    public static Map<String, Object> serialize(Object serializer) {
        if (serializer == null) {
            return new LinkedHashMap<String, Object>();
        }
        Map<String, Object> params = new LinkedHashMap<String, Object>();
        SimplePropertyDescriptor[] propertyDescriptors = DefaultPropertyUtils.getPropertyDescriptors(serializer.getClass());

        for (SimplePropertyDescriptor propertyDescriptor : propertyDescriptors) {
            String name = propertyDescriptor.getName();
            if (name.equals("class")) {
                continue;
            }
            try {
                Method method = propertyDescriptor.getReadMethod();
                if (method == null) {
                    // 对于Boolean的返回值，也许API生成的isXXX方法，补救一下
                    if (Boolean.class.isAssignableFrom(propertyDescriptor.getPropertyType())) {
                        Method booleanMethod = null;
                        try {
                            booleanMethod = serializer.getClass().getMethod("is" + GenericsUtil.capitalize(name));
                        } catch (NoSuchMethodException e) {
                        } catch (SecurityException e) {
                        }
                        method = booleanMethod;
                    }
                }
                if (method == null) {
                    throw new RuntimeException("Could not parse the property[" + name + "] of "
                            + serializer.getClass().getSimpleName());
                }
                Object value = method.invoke(serializer);

                if (value != null) {
                    Class<?> valueType = value.getClass();
                    String valueStr;
                    if (valueType.isPrimitive() || CharSequence.class.isAssignableFrom(valueType)
                            || Number.class.isAssignableFrom(valueType) || Boolean.class.equals(valueType)
                            || Character.class.equals(valueType)) {
                        valueStr = value.toString();
                    } else if (Date.class.isAssignableFrom(valueType)) {
                        valueStr = DateUtil.format((Date) value);
                    } else {
                        valueStr = JSON.toJSONString(value);
                    }
                    params.put(name, valueStr);
                }

            } catch (InvocationTargetException e) {
                throw new IllegalArgumentException("illegal argument " + name + ", error:" + e.getMessage(), e);
            } catch (IllegalAccessException e) {
                throw new IllegalArgumentException("illegal argument " + name + ", error:" + e.getMessage(), e);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("illegal argument " + name + ", error:" + e.getMessage(), e);
            }
        }
        return params;
    }

}
