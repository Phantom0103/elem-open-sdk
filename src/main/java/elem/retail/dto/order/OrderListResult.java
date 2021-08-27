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
public class OrderListResult extends ElemResponseData {

    private static final long serialVersionUID = 4498506321676762287L;

    private int total;
    private int page;
    private int pages;

    @JSONField(name = "list")
    private List<OrderShort> orderShorts;

    @Getter
    @Setter
    public static class OrderShort {
        @JSONField(name = "order_id")
        private String orderId;
        @JSONField(name = "baidu_shop_id")
        private String baiduShopId;
        @JSONField(name = "shop_id")
        private String shopId;
        @JSONField(name = "create_time", deserializeUsing = Long2DateDeserializer.class)
        private Date createTime;
        @JSONField(name = "order_from")
        private String orderFrom;
        @JSONField(name = "order_status")
        private int orderStatus;
        @JSONField(name = "pay_status")
        private String payStatus;
        @JSONField(name = "pay_type")
        private String payType;
        @JSONField(name = "user_phone")
        private String userPhone;
    }
}
