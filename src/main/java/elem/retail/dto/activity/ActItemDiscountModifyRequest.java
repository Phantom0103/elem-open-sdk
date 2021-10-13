package elem.retail.dto.activity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-10-13
 */
@Getter
@Setter
public class ActItemDiscountModifyRequest extends BaseElemRequest {

    private static final long serialVersionUID = 8212602609957387334L;

    @JSONField(name = "activity_id")
    private Long activityId;
    @JSONField(name = "start_time")
    private Long startTime;
    @JSONField(name = "end_time")
    private Long endTime;
    @JSONField(name = "open_time")
    private String openTime;
    @JSONField(name = "close_time")
    private String closeTime;
    private String weekday;
    @JSONField(name = "supplier_id")
    private String supplierId;
    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    private String customShopId;
    private Integer storeUserDayLimit;
    @JSONField(name = "store_user_limit")
    private Integer storeUserLimit;

    @Override
    public String getCmd() {
        return "act.itemdiscount.modify";
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
