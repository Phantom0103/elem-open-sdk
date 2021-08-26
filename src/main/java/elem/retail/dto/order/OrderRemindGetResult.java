package elem.retail.dto.order;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-26
 */
@Getter
@Setter
public class OrderRemindGetResult extends ElemResponseData {

    private static final long serialVersionUID = 149692662836171216L;

    private int total;
    private int page;
    @JSONField(name = "page_count")
    private int pageCount;
    @JSONField(name = "order_id")
    private List<OrderRemind> orderReminds;

    @Getter
    @Setter
    public static class OrderRemind {

        @JSONField(name = "order_id")
        private String orderId;
    }
}
