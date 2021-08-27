package elem.retail.dto.order;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import com.elem.retail.api.util.Long2DateDeserializer;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-25
 */
@Getter
@Setter
public class OrderPartRefundUntreListResult extends ElemResponseData {

    private static final long serialVersionUID = -4245766176265868582L;

    private int total;

    @JSONField(name = "list")
    private List<PartRefundTodo> partRefundTodos;

    @Getter
    @Setter
    public static class PartRefundTodo {
        @JSONField(name = "order_id")
        private String orderId;
        @JSONField(name = "refund_id")
        private String refundId;
        @JSONField(name = "apply_time", deserializeUsing = Long2DateDeserializer.class)
        private Date applyTime;
        @JSONField(name = "cancel_reason")
        private String cancelReason;
        @JSONField(name = "addition_reason")
        private String additionReason;
        private List<String> photos;
    }
}
