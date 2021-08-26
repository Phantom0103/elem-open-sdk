package elem.retail.dto.order;

import com.elem.retail.api.BaseElemRequest;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-26
 */
public class OrderPartRefundGetRequest extends BaseElemRequest {

    private static final long serialVersionUID = 4620585762272473113L;

    private String orderId;

    @Override
    public String getCmd() {
        return "order.partrefund.get";
    }

    @Override
    public String getBody() {
        return "{\"order_id\":\"" + orderId + "\"}";
    }

    @Override
    public String getKeyword() {
        return orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
