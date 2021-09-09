package elem.retail.dto.shop;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-09-09
 */
@Getter
@Setter
public class ShopDeliveryInfoGetResult extends ElemResponseData {

    private static final long serialVersionUID = -6892398168939668516L;

    @JSONField(name = "product_id")
    private Long productId;

    @JSONField(name = "delivery_areas")
    private List<DeliveryArea> deliveryAreas;

    @Getter
    @Setter
    public static class DeliveryArea {
        private String uuid;
        @JSONField(name = "area_type")
        private int areaType;
        @JSONField(name = "delivery_price")
        private int deliveryPrice;
        @JSONField(name = "agent_fee")
        private int agentFee;
        @JSONField(name = "max_weight")
        private int maxWeight;

        @JSONField(name = "coordinates")
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
}
