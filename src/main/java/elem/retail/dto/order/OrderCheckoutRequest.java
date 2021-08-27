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
public class OrderCheckoutRequest extends BaseElemRequest {

    private static final long serialVersionUID = 6487214027904410622L;

    @JSONField(name = "order_id")
    private String orderId;

    @JSONField(name = "pick_up_code")
    private String pickUpCode;

    @JSONField(name = "qr_code")
    private String qrCode;

    @Override
    public String getCmd() {
        return "order.checkout";
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
