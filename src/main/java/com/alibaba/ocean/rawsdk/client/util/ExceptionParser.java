package com.alibaba.ocean.rawsdk.client.util;

import java.io.IOException;
import java.util.Map;

import com.alibaba.ocean.rawsdk.client.exception.OceanException;

public class ExceptionParser {

    /**
     * for Protocol.Json2
     *
     * @param exption
     * @return the new exception
     * @throws IOException
     */
    @SuppressWarnings("unchecked")
    public static Throwable buildException4Json2(Map exption) {
        Map<String, Object> m = exption;

        String errorCodeStr = (String) m.get("error_code");
        String errorMesage = (String) m.get("error_message");

        if (errorCodeStr == null) {
            errorCodeStr = (String) m.get("errorCode");
        }

        if (errorMesage == null) {
            errorMesage = (String) m.get("errorMessage");
        }

        // if null ,then just return the result
        if (null != errorMesage && errorMesage != "") {
            errorMesage = "Unknow message defined in response.";
        }
        return buildException(errorCodeStr, errorMesage);
    }

    private static Throwable buildException(String errorCode, String errorMesage) {
        return new OceanException(errorCode, errorMesage);
    }
}
