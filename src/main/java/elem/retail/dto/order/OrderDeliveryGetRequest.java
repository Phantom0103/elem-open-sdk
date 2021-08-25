package elem.retail.dto.order;

import com.elem.retail.api.BaseElemRequest;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-25
 */
public class OrderDeliveryGetRequest extends BaseElemRequest {

    private static final long serialVersionUID = -2380190134116742464L;

    private String orderId;

    @Override
    public String getCmd() {
        return "order.delivery.get";
    }

    @Override
    public String getBody() {
        return "{\"order_id\":\"" + orderId + "\"}";
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
}
