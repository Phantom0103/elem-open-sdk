package elem.retail.dto.order;

import com.elem.retail.api.BaseElemRequest;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-03
 */
public class OrderGetRequest extends BaseElemRequest {

    private static final long serialVersionUID = -6975358305836040872L;

    private String orderId;

    @Override
    public String getCmd() {
        return "order.get";
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    @Override
    public String getKeyword() {
        return this.getOrderId();
    }

    @Override
    public String getBody() {
        return "{\"order_id\":\"" + orderId + "\"}";
    }
}
