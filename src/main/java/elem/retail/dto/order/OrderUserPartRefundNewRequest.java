package elem.retail.dto.order;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-19
 */
@Getter
@Setter
public class OrderUserPartRefundNewRequest extends BaseElemRequest {

    private static final long serialVersionUID = 7555335806438464943L;

    @JSONField(name = "order_id")
    private String orderId;
    @JSONField(name = "addition_reason")
    private String additionReason;
    private int type;
    private List<String> photos;
    private List<Product> products;

    @Getter
    @Setter
    public static class Product {
        @JSONField(name = "custom_sku_id")
        private String customSkuId;
        @JSONField(name = "sku_id")
        private String skuId;
        private String upc;
        @JSONField(name = "sub_biz_order_id")
        private String subBizOrderId;
        private int number;
        private Feature feature;

        @Getter
        @Setter
        public static class Feature {
            private int number;
            @JSONField(name = "product_feature")
            private ProductFeature productFeature;

            @Getter
            @Setter
            public static class ProductFeature {
                @JSONField(name = "baidu_feature_id")
                private String baiduFeatureId;
                @JSONField(name = "feature_name")
                private String featureName;
                @JSONField(name = "feature_option")
                private String featureOption;
            }
        }
    }

    @Override
    public String getCmd() {
        return "order.user.partrefund.new";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
    }

    @Override
    public String getKeyword() {
        return this.getOrderId();
    }

    public static void main(String[] args) {
        OrderUserPartRefundNewRequest request = new OrderUserPartRefundNewRequest();
        request.setOrderId("2127061420291152123");
        request.setAdditionReason("顾客不想要了，商品已带回");
        request.setType(0);

        List<Product> products = new ArrayList<>();
        Product product = new Product();
        product.setNumber(2);
        product.setSkuId("1570530839071121");
        products.add(product);

        request.setProducts(products);

        System.out.println(request.getBody());
    }
}
