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
public class ActivityNs1SkuAddRequest extends BaseElemRequest {

    private static final long serialVersionUID = 7695277330708404102L;

    @JSONField(name = "activity_id")
    private Long activityId;
    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "store_id")
    private String storeId;
    @JSONField(name = "activity_skus")
    private String activitySkus;
    @JSONField(name = "activity_custom_skus")
    private String activityCustomSkus;
    @JSONField(name = "activity_items")
    private String activityItems;

    @Override
    public String getCmd() {
        return "activity.ns1.sku.add";
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
