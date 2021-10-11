package elem.retail.dto.activity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-10-11
 */
@Getter
@Setter
public class ActivitySkuAddRequest extends BaseElemRequest {

    private static final long serialVersionUID = 4159610206307251054L;

    @JSONField(name = "activity_id")
    private Long activityId;
    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "store_id")
    private String storeId;
    @JSONField(name = "sku_id")
    private String skuId;
    @JSONField(name = "custom_sku_id")
    private String customSkuId;
    @JSONField(name = "item_id")
    private String itemId;
    private Integer stock;
    @JSONField(name = "store_user_limit")
    private Integer storeUserLimit;
    @JSONField(name = "store_user_day_limit")
    private Integer storeUserDayLimit;
    @JSONField(name = "special_price")
    private Integer specialPrice;

    @Override
    public String getCmd() {
        return "activity.sku.add";
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
