package elem.retail.dto.order;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-27
 */
@Getter
@Setter
public class OrderSelfDeliveryStateSyncRequest extends BaseElemRequest {

    private static final long serialVersionUID = 6033544623225653417L;

    @JSONField(name = "order_id")
    private String orderId;
    @JSONField(name = "distributor_id")
    private int distributorId = 201;
    private int state = 21;

    private Knight knight;

    @Getter
    @Setter
    public static class Knight {
        private String id;
        private String name;
        private String phone;
    }

    @Override
    public String getCmd() {
        return "order.selfDeliveryStateSync";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return orderId;
    }
}
