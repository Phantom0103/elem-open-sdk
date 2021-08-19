package elem.retail.dto.sku;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.elem.retail.api.BaseElemRequest;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-19
 */
public class SkuCreateRequest extends BaseElemRequest {

    private static final long serialVersionUID = -1214872696703101582L;

    @JSONField(name = "brand_id")
    private Long brandId;
    @JSONField(name = "brand_name")
    private String brandName;
    @JSONField(name = "cat3_id")
    private Long cat3Id;
    @JSONField(name = "category_id")
    private Long categoryId;
    @JSONField(name = "category_name")
    private String categoryName;
    @JSONField(name = "custom_sku_id")
    private String customSkuId;
    private String desc;
    @JSONField(name = "left_num")
    private Double leftNum;
    private Double minimum;
    private String name;
    @JSONField(name = "preminus_weight")
    private Double preminusWeight;
    @JSONField(name = "preparation_time")
    private Integer preparationTime;
    @JSONField(name = "process_type")
    private Integer processType;
    private String rtf;
    @JSONField(name = "sale_price")
    private Integer salePrice;
    @JSONField(name = "sale_step")
    private Double saleStep;
    @JSONField(name = "sale_unit")
    private String saleUnit;
    @JSONField(name = "shelf_number")
    private String shelfNumber;
    @JSONField(name = "shop_id")
    private String shopId;
    private int status;
    private String summary;
    private String upc;
    private Integer weight;
    @JSONField(name = "weight_flag")
    private Integer weightFlag;
    @JSONField(name = "seller_id")
    private Long sellerId;
    @JSONField(name = "store_id")
    private Long storeId;
    @JSONField(name = "ele_source")
    private String eleSource;
    @JSONField(name = "platform_shop_id")
    private String platformShopId;
    @JSONField(name = "product_id")
    private Long productId;
    @JSONField(name = "package_flag")
    private Boolean packageFlag;
    @JSONField(name = "package_fee")
    private Long packageFee;
    @JSONField(name = "single_package_flag")
    private Boolean singlePackageFlag;
    @JSONField(name = "single_package_number")
    private Integer singlePackageNumber;
    @JSONField(name = "single_package_fee")
    private Long singlePackageFee;

    @Override
    public String getCmd() {
        return "sku.create";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
    }

    @Override
    public String getKeyword() {
        return null;
    }
}
