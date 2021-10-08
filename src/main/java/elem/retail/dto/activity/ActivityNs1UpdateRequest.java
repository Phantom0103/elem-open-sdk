package elem.retail.dto.activity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-10-08
 */
@Getter
@Setter
public class ActivityNs1UpdateRequest extends BaseElemRequest {

    private static final long serialVersionUID = -6528207407984800366L;

    @JSONField(name = "activity_id")
    private Long activityId;
    @JSONField(name = "supplier_id")
    private String supplierId;
    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "store_id")
    private String storeId;
    @JSONField(name = "user_type")
    private Integer userType;
    @JSONField(name = "start_time")
    private Long startTime;
    @JSONField(name = "end_time")
    private Long endTime;
    @JSONField(name = "open_time")
    private String openTime;
    @JSONField(name = "close_time")
    private String close_time;
    private String weekday;
    @JSONField(name = "sku_amount")
    private Integer skuAmount;
    @JSONField(name = "special_price")
    private Double specialPrice;
    @JSONField(name = "day_limit")
    private Integer dayLimit;

    @Override
    public String getCmd() {
        return "activity.ns1.update";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return activityId == null ? "" : activityId.toString();
    }
}
