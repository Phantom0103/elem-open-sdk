package elem.retail.dto.order;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @date 2022-02-24
 */
@Getter
@Setter
public class OrderDisagreeReturnGoodsRequest extends BaseElemRequest {

    private static final long serialVersionUID = -2442650476878305453L;

    @JSONField(name = "order_id")
    private String orderId;
    @JSONField(name = "refund_order_id")
    private String refundOrderId;
    @JSONField(name = "refuse_code")
    private String refuseCode;
    @JSONField(name = "refuse_reason")
    private String refuseReason;

    @Override
    public String getCmd() {
        return "order.disagreereturngoods";
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
