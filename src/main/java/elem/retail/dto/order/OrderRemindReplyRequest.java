package elem.retail.dto.order;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-26
 */
@Getter
@Setter
public class OrderRemindReplyRequest extends BaseElemRequest {

    private static final long serialVersionUID = -4131487478295244146L;

    @JSONField(name = "order_id")
    private String orderId;

    @JSONField(name = "reply_type")
    private String replyType;

    @JSONField(name = "reply_msg")
    private String replyMsg;

    @Override
    public String getCmd() {
        return "order.remind.reply";
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
