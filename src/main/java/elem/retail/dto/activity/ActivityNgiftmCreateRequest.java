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
 * @date 2021-10-13
 */
@Getter
@Setter
public class ActivityNgiftmCreateRequest extends BaseElemRequest {

    private static final long serialVersionUID = -1453003946781683710L;

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
        @JSONField(name = "purchase_sku_amount")
        private Integer purchaseSkuAmount;
        @JSONField(name = "accords_sku_amount")
        private Integer accordsSkuAmount;
    }

    @Override
    public String getCmd() {
        return "activity.ngiftm.create";
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
