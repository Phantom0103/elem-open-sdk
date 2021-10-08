package elem.retail.dto.activity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
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
public class ActXdiscountySkuAddBatchRequest extends BaseElemRequest {

    private static final long serialVersionUID = 2220583780539252440L;

    @JSONField(name = "activity_id")
    private Long activityId;
    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "store_id")
    private String storeId;

    @Getter
    @Setter
    public static class SkuInfo {
        @JSONField(name = "sku_id")
        private String skuId;
        @JSONField(name = "custom_sku_id")
        private String customSkuId;
        @JSONField(name = "item_id")
        private String itemId;
    }

    @Override
    public String getCmd() {
        return "act.xdiscounty.sku.add.batch";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
    }

    @Override
    public String getKeyword() {
        return activityId == null ? "" : activityId.toString();
    }
}
