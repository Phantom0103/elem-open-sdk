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
 * @date 2021-10-08
 */
@Getter
@Setter
public class ActItemDiscountSkuUpdateBatchRequest extends BaseElemRequest {

    private static final long serialVersionUID = 8045100603546809198L;

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
        @JSONField(name = "sku_id")
        private String skuId;
        @JSONField(name = "custom_sku_id")
        private String customSkuId;
        @JSONField(name = "day_stock")
        private Integer dayStock;
        private Integer stock;
    }

    @Override
    public String getCmd() {
        return "act.itemdiscount.sku.update.batch";
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
