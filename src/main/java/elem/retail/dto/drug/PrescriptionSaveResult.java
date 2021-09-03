package elem.retail.dto.drug;

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
 * @Date 2021-09-03
 */
@Getter
@Setter
public class PrescriptionSaveResult extends ElemResponseData {

    private static final long serialVersionUID = 3464941809908889843L;

    @JSONField(name = "currentTime", deserializeUsing = Long2DateDeserializer.class)
    private Date currentTime;

    private BizOrder bizOrder;

    @Getter
    @Setter
    public static class BizOrder {
        private String orderId;
        private long discountFee;
        private String address;
        @JSONField(name = "payTime", deserializeUsing = Long2DateDeserializer.class)
        private Date payTime;
        private long postFee;
        private Integer orderStatus;
        @JSONField(name = "completeTime", deserializeUsing = Long2DateDeserializer.class)
        private Date completeTime;
        private Integer refundStatus;
        private long actualTotalFee;
        private long totalFee;
        private long boxFee;
        @JSONField(name = "createTime", deserializeUsing = Long2DateDeserializer.class)
        private Date createTime;
        private String storeName;

        @JSONField(name = "subBizOrderList")
        private List<SubBizOrder> subBizOrders;

        @Getter
        @Setter
        public static class SubBizOrder {
            private boolean isPrescriptionItem;
            private String itemId;
            private String itemName;
            private int buyAmount;
            private long discountFee;
            private long itemOriginalPrice;
            private String pmd;
            private long itemAfterDiscountPrice;
            private String saleUnit;
        }
    }
}
