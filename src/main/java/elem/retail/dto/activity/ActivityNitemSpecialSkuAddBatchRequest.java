package elem.retail.dto.activity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhouw
 * @description
 * @date 2021-10-11
 */
@Getter
@Setter
public class ActivityNitemSpecialSkuAddBatchRequest extends BaseElemRequest {

    private static final long serialVersionUID = 3665315586959618878L;

    @JSONField(name = "activity_id")
    private Long activityId;
    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "store_id")
    private String storeId;

    @JSONField(name = "sku_info")
    private List<SkuInfo> skuInfos;

    @Getter
    @Setter
    public static class SkuInfo {
        @JSONField(name = "sku_id")
        private String skuId;
        @JSONField(name = "custom_sku_id")
        private String customSkuId;
        @JSONField(name = "item_id")
        private String itemId;
        private Integer stock;
        @JSONField(name = "day_stock")
        private Integer dayStock;
    }

    @Override
    public String getCmd() {
        return "activity.nitemspecial.sku.add.batch";
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
