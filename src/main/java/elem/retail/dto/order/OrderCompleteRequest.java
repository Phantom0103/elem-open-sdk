package elem.retail.dto.order;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-24
 */
@Getter
@Setter
public class OrderCompleteRequest extends BaseElemRequest {

    private static final long serialVersionUID = -5141414921781542169L;

    @JSONField(name = "order_id")
    private String orderId;
    private String phone;

    @Override
    public String getCmd() {
        return "order.complete";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return this.getOrderId();
    }
}
