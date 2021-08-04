package com.elem.retail.api.mapping;

import java.lang.annotation.*;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-04
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ApiField {

    String value();

    FieldType type() default FieldType.VALUE;
}
