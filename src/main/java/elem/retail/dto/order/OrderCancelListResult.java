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
 * @Date 2021-08-27
 */
@Getter
@Setter
public class OrderCancelListResult extends ElemResponseData {

    private static final long serialVersionUID = -1802621301720364382L;

    private int total;

    @JSONField(name = "list")
    private List<OrderCancel> orderCancelList;

    public static class OrderCancel {
        @JSONField(name = "order_id")
        private String orderId;
        @JSONField(name = "refund_order_id")
        private String refundOrderId;
        @JSONField(name = "cancle_type")
        private String cancleType;
        @JSONField(name = "cancel_reason")
        private String cancelReason;
        @JSONField(name = "addition_reason")
        private String additionReason;
        @JSONField(name = "cancel_time", deserializeUsing = Long2DateDeserializer.class)
        private Date cancelTime;
        private List<String> pictures;
    }
}
