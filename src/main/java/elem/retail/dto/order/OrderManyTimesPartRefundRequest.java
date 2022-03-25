package elem.retail.dto.order;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-27
 */
@Getter
@Setter
public class OrderManyTimesPartRefundRequest extends BaseElemRequest {

    private static final long serialVersionUID = 6768323979388850724L;

    @JSONField(name = "order_id")
    private String orderId;
    @JSONField(name = "idempotent_id")
    private String idempotentId;
    private String source;
    @JSONField(name = "fund_calculate_type")
    private int fundCalculateType;

    private List<Product> products;

    @Getter
    @Setter
    public static class Product {
        @JSONField(name = "sku_id")
        private String skuId;
        private String customSkuId;
        private String upc;
        @JSONField(name = "sub_biz_order_id")
        private String subBizOrderId;
        private int number;
        @JSONField(name = "refund_amount")
        private Integer refundAmount;
    }

    @Override
    public String getCmd() {
        return "order.manyTimesPartrefund";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
    }

    @Override
    public String getKeyword() {
        return orderId;
    }
}
