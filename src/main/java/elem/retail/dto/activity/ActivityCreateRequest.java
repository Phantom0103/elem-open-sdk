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
 * @date 2021-10-12
 */
@Getter
@Setter
public class ActivityCreateRequest extends BaseElemRequest {

    private static final long serialVersionUID = -5975676846435743707L;

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
    @JSONField(name = "activity_desc")
    private String activityDesc;
    @JSONField(name = "activity_type")
    private Integer activityType;
    @JSONField(name = "child_type")
    private Integer childType;
    @JSONField(name = "open_time")
    private String openTime;
    @JSONField(name = "close_time")
    private String closeTime;
    @JSONField(name = "start_time")
    private Long startTime;
    @JSONField(name = "end_time")
    private Long endTime;
    private String weekday;
    @JSONField(name = "day_limit")
    private Integer dayLimit;
    @JSONField(name = "total_limit")
    private Integer totalLimit;
    @JSONField(name = "user_type")
    private Integer userType;
    @JSONField(name = "delivery_type")
    private Integer deliveryType;
    @JSONField(name = "promotion_sku_desc")
    private String promotionSkuDesc;
    @JSONField(name = "show_category")
    private String showCategory;
    @JSONField(name = "custom_activity_id")
    private String customActivityId;

    @JSONField(name = "rule")
    private List<Rule> rules;

    @Getter
    @Setter
    public static class Rule {
        private Integer accords;
        private Double sale;
        @JSONField(name = "sku_amount")
        private Integer skuAmount;
        @JSONField(name = "special_price")
        private Double specialPrice;
    }

    @Override
    public String getCmd() {
        return "activity.create";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
    }

    @Override
    public String getKeyword() {
        return customActivityId;
    }
}
