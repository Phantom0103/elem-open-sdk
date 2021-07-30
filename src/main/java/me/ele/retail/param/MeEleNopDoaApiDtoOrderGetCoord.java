package me.ele.retail.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class MeEleNopDoaApiDtoOrderGetCoord {

    private Object latitude;

    /**
     * @return 送货地址百度纬度
     */
    public Object getLatitude() {
        return latitude;
    }

    /**
     * 设置送货地址百度纬度     *
     * 参数示例：<pre>40.0392334321169</pre>     
     * 此参数必填
     */
    public void setLatitude(Object latitude) {
        this.latitude = latitude;
    }

    private Object longitude;

    /**
     * @return 送货地址百度经度
     */
    public Object getLongitude() {
        return longitude;
    }

    /**
     * 设置送货地址百度经度     *
     * 参数示例：<pre>116.31222321306</pre>     
     * 此参数必填
     */
    public void setLongitude(Object longitude) {
        this.longitude = longitude;
    }

}
