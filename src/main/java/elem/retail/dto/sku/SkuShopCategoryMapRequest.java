package elem.retail.dto.sku;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.elem.retail.api.BaseElemRequest;

import java.util.List;

/**
 * @author zhouw
 * @description
 * @date 2021-09-16
 */
public class SkuShopCategoryMapRequest extends BaseElemRequest {

    private static final long serialVersionUID = 537332496606497091L;

    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "sku_id")
    private String skuId;
    @JSONField(name = "custom_sku_id")
    private String customSkuId;
    @JSONField(name = "category_id")
    private String categoryId;
    @JSONField(name = "category_name")
    private String categoryName;
    private int rank = 1;

    @JSONField(name = "category_list")
    private List<Category> categories;

    public static class Category {
        @JSONField(name = "category_id")
        private String categoryId;
        @JSONField(name = "category_name")
        private String categoryName;
        private int rank = 1;
    }

    @Override
    public String getCmd() {
        return "sku.shop.category.map";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
    }

    @Override
    public String getKeyword() {
        return skuId;
    }
}
