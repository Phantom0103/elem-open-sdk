package elem.retail.dto.shop;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-09-07
 */
@Getter
@Setter
public class ShopDeliveryInfoSyncRequest extends BaseElemRequest {

    private static final long serialVersionUID = -995153395151230869L;

    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "product_id")
    private String productId;

    @JSONField(name = "delivery_areas")
    private List<DeliveryArea> deliveryAreas;

    @Getter
    @Setter
    public static class DeliveryArea {
        private String uuid;
        @JSONField(name = "area_type")
        private String areaType;
        @JSONField(name = "delivery_price")
        private int deliveryPrice;
        @JSONField(name = "agent_fee")
        private int agentFee;
        @JSONField(name = "max_weight")
        private int maxWeight;

        private List<Coordinate> coordinates;

        @JSONField(name = "multi_period")
        private List<MultiPeriod> multiPeriods;

        @Getter
        @Setter
        public static class Coordinate {
            private String longitude;
            private String latitude;
        }

        @Getter
        @Setter
        public static class MultiPeriod {
            private String start;
            private String end;
        }
    }

    @Override
    public String getCmd() {
        return "shop.deliveryinfo.sync";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
    }

    @Override
    public String getKeyword() {
        return baiduShopId;
    }
}
