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
public class OrderPartRefundRequest extends BaseElemRequest {

    private static final long serialVersionUID = 5731104155552508102L;

    @JSONField(name = "order_id")
    private String orderId;

    private List<Product> products;

    @Getter
    @Setter
    public static class Product {
        @JSONField(name = "sku_id")
        private String skuId;
        @JSONField(name = "custom_sku_id")
        private String customSkuId;
        private String upc;
        private int number;
        @JSONField(name = "sub_biz_order_id")
        private String subBizOrderId;
    }

    @Override
    public String getCmd() {
        return "order.partrefund";
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
