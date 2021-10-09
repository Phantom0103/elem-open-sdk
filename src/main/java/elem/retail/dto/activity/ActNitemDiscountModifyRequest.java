package elem.retail.dto.activity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-10-09
 */
@Getter
@Setter
public class ActNitemDiscountModifyRequest extends BaseElemRequest {

    private static final long serialVersionUID = -7326443550036862651L;

    @JSONField(name = "activity_id")
    private Long activityId;
    @JSONField(name = "open_time")
    private String openTime;
    @JSONField(name = "close_time")
    private String closeTime;
    @JSONField(name = "start_time")
    private Long startTime;
    @JSONField(name = "end_time")
    private Long endTime;
    @JSONField(name = "supplier_id")
    private String supplierId;
    private String weekday;
    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    private String customShopId;
    @JSONField(name = "store_user_day_limit")
    private Integer storeUserDayLimit;
    @JSONField(name = "store_user_limit")
    private Integer storeUserLimit;

    @Override
    public String getCmd() {
        return "act.nitemdiscount.modify";
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
