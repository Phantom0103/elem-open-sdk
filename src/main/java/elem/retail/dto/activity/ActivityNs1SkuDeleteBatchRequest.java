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
 * @date 2021-10-12
 */
@Getter
@Setter
public class ActivityNs1SkuDeleteBatchRequest extends BaseElemRequest {

    private static final long serialVersionUID = 2162264511954079738L;

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
        @JSONField(name = "sku_id")
        private String skuId;
        @JSONField(name = "custom_sku_id")
        private String customSkuId;
        @JSONField(name = "item_ids")
        private String itemIds;
    }

    @Override
    public String getCmd() {
        return "activity.ns1.sku.delete.batch";
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
