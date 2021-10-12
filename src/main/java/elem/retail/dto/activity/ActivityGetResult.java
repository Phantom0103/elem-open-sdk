package elem.retail.dto.activity;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
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
public class ActivityGetResult extends ElemResponseData {

    private static final long serialVersionUID = -1070161302487671337L;

    @JSONField(name = "activity_id")
    private Long activityId;
    @JSONField(name = "activity_name")
    private String activityName;
    @JSONField(name = "activity_desc")
    private String activityDesc;
    @JSONField(name = "activity_platform")
    private Integer activityPlatform;
    @JSONField(name = "activity_type")
    private Integer activityType;
    @JSONField(name = "child_type")
    private Integer childType;
    @JSONField(name = "supplier_id")
    private String supplierId;
    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "store_id")
    private String storeId;
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
    @JSONField(name = "order_limit")
    private Integer orderLimit;
    @JSONField(name = "is_conflict_activity")
    private Integer isConflictActivity;
    @JSONField(name = "show_status")
    private Integer showStatus;
    @JSONField(name = "user_type")
    private Integer userType;
    @JSONField(name = "store_user_limit")
    private Integer storeUserLimit;
    @JSONField(name = "store_user_day_limit")
    private Integer storeUserDayLimit;
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
        private Integer sale;
        @JSONField(name = "sku_amount")
        private Integer skuAmount;
        @JSONField(name = "special_price")
        private Integer specialPrice;
    }
}
