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
public class OrderAgreePartRefundRequest extends BaseElemRequest {

    private String orderId;
    @JSONField(name = "refund_id")
    private String refundId;
    @JSONField(name = "refund_order_id")
    private String refundOrderId;

    private List<Product> products;

    @Getter
    @Setter
    public static class Product {
        @JSONField(name = "custom_sku_id")
        private String customSkuId;
        @JSONField(name = "sku_id")
        private String skuId;
        private int number;
        @JSONField(name = "refund_price")
        private int refundPrice;
        private String subBizOrderId;
        private String upc;
    }

    @Override
    public String getCmd() {
        return "order.agreepartrefund";
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
