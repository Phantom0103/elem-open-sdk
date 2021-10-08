package elem.retail.dto.activity;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhouw
 * @description
 * @date 2021-10-08
 */
@Getter
@Setter
public class ActivityNgiftmSkuListResult extends ElemResponseData {

    private static final long serialVersionUID = 4598597946410802188L;

    @JSONField(name = "activity_id")
    private Long activityId;
    @JSONField(name = "activity_name")
    private String activityName;
    @JSONField(name = "activity_type")
    private Integer activityType;
    @JSONField(name = "child_type")
    private Integer childType;

    private Integer total;
    @JSONField(name = "total_page")
    private Integer totalPage;
    private Integer page;
    @JSONField(name = "page_size")
    private Integer pageSize;

    @JSONField(name = "gift_sku_list")
    private List<GiftSku> giftSkus;

    @Getter
    @Setter
    public static class GiftSku {
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
        @JSONField(name = "gift_sku_id")
        private String giftSkuId;
        @JSONField(name = "gift_custom_sku_id")
        private String giftCustomSkuId;
        @JSONField(name = "gift_item_id")
        private String giftItemId;
        @JSONField(name = "gift_day_stock")
        private Integer giftDayStock;
        @JSONField(name = "gift_real_day_stock")
        private Integer giftRealDayStock;
        @JSONField(name = "gift_stock")
        private Integer giftStock;
        @JSONField(name = "gift_real_stock")
        private Integer giftRealStock;
        @JSONField(name = "purchase_sku_amount")
        private Integer purchaseSkuAmount;
        @JSONField(name = "accords_sku_amount")
        private Integer accordsSkuAmount;
        @JSONField(name = "store_user_day_limit")
        private Integer storeUserDayLimit;
        @JSONField(name = "store_user_limit")
        private Integer storeUserLimit;
    }
}
