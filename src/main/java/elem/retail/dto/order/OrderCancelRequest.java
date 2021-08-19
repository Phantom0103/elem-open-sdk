package elem.retail.dto.order;

import com.alibaba.fastjson.JSONObject;
import com.elem.retail.api.BaseElemRequest;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-18
 */
public class OrderCancelRequest extends BaseElemRequest {

    private static final long serialVersionUID = 3192566792128578739L;

    private String orderId;
    private String type;
    private String reason;

    @Override
    public String getCmd() {
        return "order.cancel";
    }

    @Override
    public String getBody() {
        JSONObject body = new JSONObject();
        body.put("order_id", orderId);
        body.put("type", type);
        body.put("reason", reason);

        return body.toJSONString();
    }

    @Override
    public String getKeyword() {
        return this.getOrderId();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
