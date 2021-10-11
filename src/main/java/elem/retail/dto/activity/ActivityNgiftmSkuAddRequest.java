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
public class ActivityNgiftmSkuAddRequest extends BaseElemRequest {

    private static final long serialVersionUID = -8841548354154701033L;

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
    @JSONField(name = "gift_sku_id")
    private String giftSkuId;
    @JSONField(name = "gift_custom_sku_id")
    private String giftCustomSkuId;
    @JSONField(name = "gift_item_id")
    private String giftItemId;
    private Integer stock;
    @JSONField(name = "day_stock")
    private Integer dayStock;

    @Override
    public String getCmd() {
        return "activity.ngiftm.sku.add";
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
