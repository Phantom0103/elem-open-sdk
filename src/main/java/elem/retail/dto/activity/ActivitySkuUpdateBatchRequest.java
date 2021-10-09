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
public class ActivitySkuUpdateBatchRequest extends BaseElemRequest {

    private static final long serialVersionUID = -1157325491449796056L;

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
        @JSONField(name = "special_price")
        private Integer specialPrice;
        private Integer stock;
        @JSONField(name = "store_user_limit")
        private Integer storeUserLimit;
        @JSONField(name = "store_user_day_limit")
        private Integer storeUserDayLimit;
    }

    @Override
    public String getCmd() {
        return "activity.sku.update.batch";
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
