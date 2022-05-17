package elem.retail.dto.order;

import com.elem.retail.api.BaseElemRequest;

/**
 * @author zhouw
 * @date 2022-05-17
 */
public class OrderCallPlatformDeliveryRequest extends BaseElemRequest {

    private static final long serialVersionUID = -4695411471631289858L;

    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String getCmd() {
        return "order.callPlatformDelivery";
    }

    @Override
    public String getBody() {
        return "{\"orderId\":\"" + orderId + "\"}";
    }

    @Override
    public String getKeyword() {
        return orderId;
    }
}
