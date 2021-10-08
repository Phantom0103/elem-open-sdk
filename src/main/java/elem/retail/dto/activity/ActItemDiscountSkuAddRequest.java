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
public class ActItemDiscountSkuAddRequest extends BaseElemRequest {

    private static final long serialVersionUID = 3220947806880712572L;

    @JSONField(name = "activity_id")
    private Long activityId;
    private Integer stock;
    @JSONField(name = "day_stock")
    private Integer dayStock;
    private String discountIntensity;
    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "supplier_id")
    private String supplierId;
    @JSONField(name = "sku_id")
    private String skuId;
    @JSONField(name = "custom_sku_id")
    private String customSkuId;
    @JSONField(name = "store_id")
    private String storeId;
    @JSONField(name = "item_id")
    private String itemId;

    @Override
    public String getCmd() {
        return "act.itemdiscount.sku.add";
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
