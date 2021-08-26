package elem.retail.dto.order;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-26
 */
@Getter
@Setter
public class OrderAgreeRefundRequest extends BaseElemRequest {

    private static final long serialVersionUID = -8966194790160563433L;

    @JSONField(name = "order_id")
    private String orderId;
    @JSONField(name = "refund_order_id")
    private String refundOrderId;

    @Override
    public String getCmd() {
        return "order.agreerefund";
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
