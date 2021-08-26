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
public class OrderDisagreeRefundRequest extends BaseElemRequest {

    private static final long serialVersionUID = 4980169100969058246L;

    @JSONField(name = "order_id")
    private String orderId;
    @JSONField(name = "refund_order_id")
    private String refundOrderId;
    @JSONField(name = "refuse_reason")
    private String refuseReason;

    @Override
    public String getCmd() {
        return "order.disagreerefund";
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
