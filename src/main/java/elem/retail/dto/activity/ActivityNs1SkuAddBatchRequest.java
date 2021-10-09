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
 * @date 2021-10-09
 */
@Getter
@Setter
public class ActivityNs1SkuAddBatchRequest extends BaseElemRequest {

    private static final long serialVersionUID = -5907722229397463401L;

    @JSONField(name = "skuInfo")
    private List<SkuInfo> skuInfos;

    @Getter
    @Setter
    public static class SkuInfo {
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
    }

    @Override
    public String getCmd() {
        return "activity.ns1.sku.add.batch";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
    }

    @Override
    public String getKeyword() {
        return null;
    }
}
