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
public class ActivitySkuDeleteBatchRequest extends BaseElemRequest {

    private static final long serialVersionUID = -7083492587401949298L;

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
    @JSONField(name = "item_ids")
    private String itemIds;

    @Override
    public String getCmd() {
        return "activity.sku.delete.batch";
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
