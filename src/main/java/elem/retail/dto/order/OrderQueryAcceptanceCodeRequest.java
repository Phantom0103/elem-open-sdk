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
public class OrderQueryAcceptanceCodeRequest extends BaseElemRequest {

    private static final long serialVersionUID = 8333677697165130894L;

    @JSONField(name = "order_id")
    private String orderId;

    @Override
    public String getCmd() {
        return "order.query.acceptancecode";
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
