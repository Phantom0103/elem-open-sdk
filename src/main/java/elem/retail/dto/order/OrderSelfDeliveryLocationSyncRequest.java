package elem.retail.dto.order;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-25
 */
@Getter
@Setter
public class OrderSelfDeliveryLocationSyncRequest extends BaseElemRequest {

    private static final long serialVersionUID = -2243578381186854063L;

    @JSONField(name = "order_id")
    private String orderId;

    private Location location;

    @Getter
    @Setter
    public static class Location {
        @JSONField(name = "UTC")
        private Long utc;
        private String altitude;
        private String latitude;
        private String longitude;
    }

    @Override
    public String getCmd() {
        return "order.selfDeliveryLocationSync";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return this.getOrderId();
    }
}
