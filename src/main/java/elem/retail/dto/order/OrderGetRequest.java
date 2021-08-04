package elem.retail.dto.order;

import com.elem.retail.api.BaseElemRequest;
import com.elem.retail.api.mapping.ApiField;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-03
 */
public class OrderGetRequest extends BaseElemRequest {

    @ApiField("order_id")
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
    public String getBody() {
        return "{\"order_id\":\"" + orderId + "\"}";
    }
}
