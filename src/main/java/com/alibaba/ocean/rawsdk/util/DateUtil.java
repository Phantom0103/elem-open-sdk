/**
 * Project: ocean.client.java.basic
 * <p>
 * File Created at 2011-11-23
 * $Id: DateUtil.java 311300 2013-12-23 06:15:28Z yichun.wangyc $
 * <p>
 * Copyright 2008 Alibaba.com Croporation Limited.
 * All rights reserved.
 * <p>
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
package com.alibaba.ocean.rawsdk.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author hongbang.hb
 *
 */
public final class DateUtil {
    // 这个格式一般用来处理从Ocean返回的日期格式。原因是从Ocean端返回的日期格式，通常是"yyyyMMddHHmmssSSSZ"
    public static final String DEFAULT_DATE_FORMAT_STR = "yyyyMMddHHmmssSSSZ";

    // 有时，后端应用程序会使用fastJson,
    // 但fastJson不支持"yyyyMMddHHmmssSSSZ"这种日期格式，所以在这里增加了"yyyy-MM-dd HH:mm:ss.SSS".而这种格式却没有时区
    public static final String SIMPLE_DATE_FORMAT_STR = "yyyy-MM-dd HH:mm:ss.SSS";

    private static SimpleDateFormat DEFAULT_FORMAT = new SimpleDateFormat(DEFAULT_DATE_FORMAT_STR);

    public static String format(Date d) {
        return format(d, null);
    }

    public static String format(Date d, String pattern) {
        return format(d, pattern, null);
    }

    public static String format(Date d, String pattern, TimeZone timeZone) {
        if (d == null) {
            return null;
        }
        final SimpleDateFormat format;
        if (pattern != null) {
            format = new SimpleDateFormat(pattern);
        } else {
            format = (SimpleDateFormat) DEFAULT_FORMAT.clone();
        }
        if (timeZone != null) {
            format.setTimeZone(timeZone);
        }
        return format.format(d);
    }

    public static Date parse(String str) throws ParseException {
        return parse(str, null);
    }

    public static Date parse(String source, String pattern) throws ParseException {
        return parse(source, pattern, null);
    }

    public static Date parse(String source, String pattern, TimeZone timeZone) throws ParseException {
        if (source == null) {
            return null;
        }
        final SimpleDateFormat format;
        if (pattern != null) {
            format = new SimpleDateFormat(pattern);
        } else {
            format = (SimpleDateFormat) DEFAULT_FORMAT.clone();
        }
        if (timeZone != null) {
            format.setTimeZone(timeZone);
        }
        return format.parse(source);
    }

    private DateUtil() {
    }

    ;
}
