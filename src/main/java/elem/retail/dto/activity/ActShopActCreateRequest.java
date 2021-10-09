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
public class ActShopActCreateRequest extends BaseElemRequest {

    private static final long serialVersionUID = -2412278804966657553L;

    @JSONField(name = "supplier_id")
    private String supplierId;
    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "store_id")
    private String storeId;
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
    @JSONField(name = "open_time")
    private String openTime;
    @JSONField(name = "close_time")
    private String closeTime;
    private String weekday;
    @JSONField(name = "user_day_order_limit")
    private Integer userDayOrderLimit;
    @JSONField(name = "user_type")
    private Integer userType;
    @JSONField(name = "delivery_type")
    private Integer deliveryType;

    private List<Rule> rules;

    @Getter
    @Setter
    public static class Rule {
        private Long condition;
        private Long discount;
    }

    @Override
    public String getCmd() {
        return "act.shopact.create";
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
