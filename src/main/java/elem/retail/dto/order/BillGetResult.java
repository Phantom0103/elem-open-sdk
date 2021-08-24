package elem.retail.dto.order;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import com.elem.retail.api.util.Long2DateDeserializer;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-24
 */
@Getter
@Setter
public class BillGetResult extends ElemResponseData {

    private static final long serialVersionUID = 7966412853196480621L;

    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "date", deserializeUsing = Long2DateDeserializer.class)
    private Date date;
    @JSONField(name = "payment_date", deserializeUsing = Long2DateDeserializer.class)
    private Date paymentDate;
    @JSONField(name = "order_count")
    private int orderCount;
    @JSONField(name = "expend_fee")
    private long expendFee;
    @JSONField(name = "pay_fee")
    private long payFee;
    @JSONField(name = "shop_fee")
    private long shopFee;
    @JSONField(name = "pay_entity")
    private String payEntity;

    @JSONField(name = "order_detail_fee")
    private OrderDetailFee orderDetailFee;

    @Getter
    @Setter
    public static class OrderDetailFee {
        @JSONField(name = "product_fee")
        private long productFee;
        @JSONField(name = "user_fee")
        private long userFee;
        private long commission;
        @JSONField(name = "package_fee")
        private long packageFee;
        @JSONField(name = "send_fee")
        private long sendFee;
        @JSONField(name = "shop_rate")
        private long shopRate;
        @JSONField(name = "platform_rate")
        private long platformRate;
        @JSONField(name = "agent_rate")
        private long agentRate;
        @JSONField(name = "cold_box_fee")
        private long coldBoxFee;
        @JSONField(name = "zhongbao_call_fee")
        private long zhongbaoCallFee;
        @JSONField(name = "actual_base_logistics_amount")
        private long actualBaseLogisticsAmount;
        @JSONField(name = "actual_base_distance_amount")
        private long actualBaseDistanceAmount;
        @JSONField(name = "actual_base_time_amount")
        private long actualBaseTimeAmount;
        @JSONField(name = "base_logistics_amount")
        private long baseLogisticsAmount;
        @JSONField(name = "delivery_tip_amount")
        private long deliveryTipAmount;
    }
}
