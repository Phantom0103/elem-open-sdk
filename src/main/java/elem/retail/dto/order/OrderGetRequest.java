package elem.retail.dto.order;

import com.elem.retail.api.BaseElemRequest;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-03
 */
public class OrderGetRequest extends BaseElemRequest {

    private String orderId;

    @Override
    public String getCmd() {
        return "order.get";
    }

    @Override
    public String getVersion() {
        return "3";
    }
}
