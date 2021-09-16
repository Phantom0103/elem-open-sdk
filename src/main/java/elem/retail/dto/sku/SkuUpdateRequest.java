package elem.retail.dto.sku;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;

/**
 * @author zhouw
 * @description
 * @date 2021-09-16
 */
public class SkuUpdateRequest extends BaseElemRequest {

    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "sku_id")
    private String skuId;
    @JSONField(name = "upc_update")
    private String upcUpdate;
    private String name;
    private Integer status;
    private String shelfNumber;
    @JSONField(name = "brand_id")
    private String brandId;
    @JSONField(name = "brand_name")
    private String brandName;
    @JSONField(name = "category_id")
    private String categoryId;
    @JSONField(name = "category_name")
    private String categoryName;
    @JSONField(name = "cat3_id")
    private String cat3Id;
    private String rtf;
    @JSONField(name = "left_num")
    private Integer leftNum;
    @JSONField(name = "custom_sku_id")
    private String customSkuId;
    @JSONField(name = "sale_price")
    private Integer salePrice;
    private String desc;
    @JSONField(name = "preparation_time")
    private Integer preparationTime;
    @JSONField(name = "process_type")
    private Integer processType;
    private Double minimum;
    @JSONField(name = "preminus_weight")
    private Double preminusWeight;
    @JSONField(name = "sale_step")
    private Double saleStep;
    @JSONField(name = "sale_unit")
    private String saleUnit;
    private Integer weight;
    private String summary;
    @JSONField(name = "seller_id")
    private String sellerId;
    @JSONField(name = "store_id")
    private String storeId;
    @JSONField(name = "item_id")
    private String itemId;
    @JSONField(name = "platform_shop_id")
    private String platformShopId;
    @JSONField(name = "package_flag")
    private Long packageFlag;
    @JSONField(name = "single_package_flag")
    private Boolean singlePackageFlag;
    @JSONField(name = "single_package_number")
    private Integer singlePackageNumber;
    @JSONField(name = "single_package_fee")
    private Long singlePackageFee;

    @Override
    public String getCmd() {
        return null;
    }

    @Override
    public String getBody() {
        return null;
    }

    @Override
    public String getKeyword() {
        return null;
    }
}
