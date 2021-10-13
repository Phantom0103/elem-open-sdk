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
 * @date 2021-10-13
 */
@Getter
@Setter
public class ActivityNgiftmSkuUpdateBatchRequest extends BaseElemRequest {

    private static final long serialVersionUID = -1023443799395176736L;

    @JSONField(name = "activity_id")
    private Long activityId;

    @JSONField(name = "act_sku_info")
    private List<ActSkuInfo> actSkuInfos;

    @Getter
    @Setter
    public static class ActSkuInfo {
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
        @JSONField(name = "gift_day_stock")
        private Integer giftDayStock;
        @JSONField(name = "gift_stock")
        private Integer giftStock;
    }

    @Override
    public String getCmd() {
        return "activity.ngiftm.sku.update.batch";
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
