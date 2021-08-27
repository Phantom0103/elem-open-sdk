package elem.retail.dto.order;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-27
 */
@Getter
@Setter
public class OrderConfirmRequest extends BaseElemRequest {

    private static final long serialVersionUID = -4009460733108995447L;

    @JSONField(name = "order_id")
    private String orderId;

    @Override
    public String getCmd() {
        return "order.confirm";
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
