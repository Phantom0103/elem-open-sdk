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
public class OrderUserPartRefundRequest extends BaseElemRequest {

    private static final long serialVersionUID = 5108995665412402975L;

    @JSONField(name = "order_id")
    private String orderId;
    private int type;
    @JSONField(name = "addition_reason")
    private String additionReason;
    private List<String> photos;

    private List<Product> products;

    @Getter
    @Setter
    public static class Product {
        @JSONField(name = "sku_id")
        private String skuId;
        @JSONField(name = "custom_sku_id")
        private String customSkuId;
        private int number;
        private String upc;
        @JSONField(name = "sub_biz_order_id")
        private String subBizOrderId;

        @JSONField(name = "feature")
        private List<Feature> features;

        @Getter
        @Setter
        public static class Feature {
            private int number;

            @JSONField(name = "product_feature")
            private List<ProductFeature> productFeatures;

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
        return "order.user.partrefund";
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
