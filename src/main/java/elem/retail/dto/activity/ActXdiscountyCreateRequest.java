package elem.retail.dto.activity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhouw
 * @description
 * @date 2021-10-09
 */
@Getter
@Setter
public class ActXdiscountyCreateRequest extends BaseElemRequest {

    private static final long serialVersionUID = -7600003272786157755L;

    @JSONField(name = "activity_desc")
    private String activityDesc;
    @JSONField(name = "activity_name")
    private String activityName;
    @JSONField(name = "activity_type")
    private Integer activityType;
    @JSONField(name = "child_type")
    private Integer childType;
    @JSONField(name = "start_time")
    private Long startTime;
    @JSONField(name = "end_time")
    private Long endTime;
    private String weekday;
    @JSONField(name = "open_time")
    private String openTime;
    @JSONField(name = "close_time")
    private String closeTime;
    @JSONField(name = "user_type")
    private Integer userType;
    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "supplier_id")
    private String supplierId;
    @JSONField(name = "store_user_day_limit")
    private Integer storeUserDayLimit;
    @JSONField(name = "store_user_limit")
    private Integer storeUserLimit;
    @JSONField(name = "delivery_type")
    private Integer deliveryType;
    @JSONField(name = "custom_activity_id")
    private String customActivityId;
    @JSONField(name = "store_id")
    private String storeId;
    @JSONField(name = "total_limit")
    private Integer totalLimit;

    @JSONField(name = "rule")
    private List<Rule> rules;

    @Getter
    @Setter
    public static class Rule {
        private Integer xNumber;
        private Double yDiscount;
        private Double yPrice;
    }

    @Override
    public String getCmd() {
        return "act.xdiscounty.create";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
    }

    @Override
    public String getKeyword() {
        return null;
    }
}
