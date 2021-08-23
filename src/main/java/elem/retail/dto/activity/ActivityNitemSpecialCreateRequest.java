package elem.retail.dto.activity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-23
 */
@Getter
@Setter
public class ActivityNitemSpecialCreateRequest extends BaseElemRequest {

    private static final long serialVersionUID = -1848807721276010125L;

    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "store_id")
    private String storeId;
    @JSONField(name = "supplier_id")
    private String supplierId;
    @JSONField(name = "activity_type")
    private Integer activityType;
    @JSONField(name = "activity_name")
    private String activityName;
    @JSONField(name = "child_type")
    private String childType;
    @JSONField(name = "start_time")
    private Long startTime;
    @JSONField(name = "end_time")
    private Long endTime;
    @JSONField(name = "open_time")
    private String openTime;
    @JSONField(name = "close_time")
    private String closeTime;
    private String weekday;
    @JSONField(name = "user_type")
    private Integer userType;
    @JSONField(name = "delivery_type")
    private Integer deliveryType;
    @JSONField(name = "store_user_limit")
    private Integer storeUserLimit;
    @JSONField(name = "store_user_day_limit")
    private Integer storeUserDayLimit;
    @JSONField(name = "custom_activity_id")
    private String customActivityId;

    @JSONField(name = "rule")
    private List<Rule> rules;

    @Getter
    @Setter
    public static class Rule {
        private Integer hit;
        @JSONField(name = "special_price")
        private Integer specialPrice;
    }

    @Override
    public String getCmd() {
        return "activity.nitemspecial.create";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
    }

    @Override
    public String getKeyword() {
        return this.getCustomActivityId();
    }
}
