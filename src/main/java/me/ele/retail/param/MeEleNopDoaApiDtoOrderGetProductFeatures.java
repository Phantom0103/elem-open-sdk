package me.ele.retail.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class MeEleNopDoaApiDtoOrderGetProductFeatures {

    private Long baidu_feature_id;

    /**
     * @return 属性ID
     */
    public Long getBaidu_feature_id() {
        return baidu_feature_id;
    }

    /**
     * 设置属性ID     *
     * 参数示例：<pre>1703572074</pre>     
     * 此参数必填
     */
    public void setBaidu_feature_id(Long baidu_feature_id) {
        this.baidu_feature_id = baidu_feature_id;
    }

    private String name;

    /**
     * @return 属性名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置属性名称     *
     * 参数示例：<pre>温度</pre>     
     * 此参数必填
     */
    public void setName(String name) {
        this.name = name;
    }

    private String option;

    /**
     * @return 属性
     */
    public String getOption() {
        return option;
    }

    /**
     * 设置属性     *
     * 参数示例：<pre>常温</pre>     
     * 此参数必填
     */
    public void setOption(String option) {
        this.option = option;
    }

}
