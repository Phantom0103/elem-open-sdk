package com.elem.retail.api.util;

import java.util.Date;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-05
 */
public class DateUtils {

    public static Date castToDate(long ts, boolean unixtime) {
        if (ts > 0) {
            return new Date(unixtime ? ts * 1000 : ts);
        } else {
            return null;
        }
    }
}
