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
public class ActivityDisableRequest extends BaseElemRequest {

    private static final long serialVersionUID = -5852237278289342872L;

    @JSONField(name = "activity_id")
    private Long activityId;
    @JSONField(name = "supplier_id")
    private String supplierId;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "store_id")
    private String storeId;

    @Override
    public String getCmd() {
        return "activity.disable";
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
