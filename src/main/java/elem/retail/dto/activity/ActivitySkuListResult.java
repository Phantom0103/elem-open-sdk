package elem.retail.dto.activity;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhouw
 * @description
 * @date 2021-10-11
 */
@Getter
@Setter
public class ActivitySkuListResult extends ElemResponseData {

    private static final long serialVersionUID = -3914160834810680157L;

    @JSONField(name = "activity_id")
    private Long activityId;
    @JSONField(name = "activity_name")
    private String activityName;
    @JSONField(name = "activity_type")
    private Integer activityType;
    @JSONField(name = "child_type")
    private Integer childType;

    private int total;
    @JSONField(name = "total_page")
    private int totalPage;
    private int page;
    @JSONField(name = "page_size")
    private int pageSize;

    @JSONField(name = "sku_list")
    private List<Sku> skus;

    @Getter
    @Setter
    public static class Sku {
        @JSONField(name = "baidu_shop_id")
        private String baiduShopId;
        @JSONField(name = "shop_id")
        private String shopId;
        @JSONField(name = "store_id")
        private String storeId;
        @JSONField(name = "sku_id")
        private String skuId;
        @JSONField(name = "custom_sku_id")
        private String customSkuId;
        @JSONField(name = "item_id")
        private String itemId;
        @JSONField(name = "upc_name")
        private String upcName;
        @JSONField(name = "original_price")
        private Integer originalPrice;
        @JSONField(name = "promotion_price")
        private Integer promotionPrice;
        private Integer stock;
        @JSONField(name = "real_stock")
        private Integer realStock;
        @JSONField(name = "day_stock")
        private Integer dayStock;
        @JSONField(name = "day_real_stock")
        private Integer dayRealStock;
        @JSONField(name = "store_user_limit")
        private Integer storeUserLimit;
        @JSONField(name = "store_user_day_limit")
        private Integer storeUserDayLimit;
    }
}
