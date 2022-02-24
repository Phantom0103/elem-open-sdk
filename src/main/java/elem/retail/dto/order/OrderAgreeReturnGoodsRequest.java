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
public class OrderAgreeReturnGoodsRequest extends BaseElemRequest {

    private static final long serialVersionUID = -1568491803677485210L;

    @JSONField(name = "order_id")
    private String orderId;
    @JSONField(name = "refund_order_id")
    private String refundOrderId;

    @Override
    public String getCmd() {
        return "order.agreereturngoods";
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
