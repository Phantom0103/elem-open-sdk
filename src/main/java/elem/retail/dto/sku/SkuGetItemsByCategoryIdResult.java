package elem.retail.dto.sku;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhouw
 * @description
 * @date 2021-09-26
 */
@Getter
@Setter
public class SkuGetItemsByCategoryIdResult extends ElemResponseData {

    private static final long serialVersionUID = 3350056730569688279L;

    private int page;
    private int pages;
    private int total;

    @JSONField(name = "list")
    private List<Item> items;

    public static class Item {
        @JSONField(name = "custom_sku_id")
        private String customSkuId;
        @JSONField(name = "custom_cat_ids")
        private String customCatIds;
        @JSONField(name = "left_num")
        private Integer leftNum;
        @JSONField(name = "market_price")
        private Integer marketPrice;
        private String name;
        @JSONField(name = "need_ice")
        private String needIce;
        @JSONField(name = "preparation_time")
        private Integer preparationTime;
        @JSONField(name = "process_type")
        private Integer processType;
        @JSONField(name = "production_addr1")
        private String productionAddr1;
        @JSONField(name = "production_addr2")
        private String productionAddr2;
        @JSONField(name = "production_addr3")
        private String productionAddr3;
        private Integer rank;
        @JSONField(name = "sale_price")
        private Integer salePrice;
        @JSONField(name = "shelf_number")
        private Integer shelfNumber;
        @JSONField(name = "sku_id")
        private String skuId;
        private String status;
        private String summary;
        private String upc;
        @JSONField(name = "upc_type")
        private Integer upcType;
        private String weight;

        @JSONField(name = "custom_cat_list")
        private List<CustomCat> customCats;

        private List<Photo> photos;

        @JSONField(name = "process_detail")
        private List<ProcessDetail> processDetails;

        @JSONField(name = "sku_property")
        private List<SkuProperty> skuProperties;

        @JSONField(name = "sku_spec")
        private List<SkuSpec> skuSpecs;

        @Getter
        @Setter
        public static class CustomCat {
            @JSONField(name = "custom_cat_id")
            private String customCatId;
            @JSONField(name = "custom_cat_name")
            private String customCatName;
            private Integer rank;
        }

        @Getter
        @Setter
        public static class Photo {
            @JSONField(name = "is_master")
            private Integer isMaster;
            private String url;
        }

        @Getter
        @Setter
        public static class ProcessDetail {
            private Integer time;
            private String type;
        }

        @Getter
        @Setter
        public static class SkuProperty {
            private String name;

            @JSONField(name = "detail")
            private List<Detail> details;

            @Getter
            @Setter
            public static class Detail {
                private boolean ice;
                private String k;
            }
        }

        @Getter
        @Setter
        public static class SkuSpec {
            @JSONField(name = "sku_spec_id")
            private String skuSpecId;
            private String upc;
            @JSONField(name = "sale_price")
            private Integer salePrice;
            @JSONField(name = "left_num")
            private Double leftNum;
            private Integer weight;
            @JSONField(name = "product_spec_id")
            private String productSpecId;
            @JSONField(name = "sku_spec_custom_id")
            private String skuSpecCustomId;

            @JSONField(name = "spec_property")
            private List<SpecProperty> specProperties;

            @Getter
            @Setter
            public static class SpecProperty {
                @JSONField(name = "prop_id")
                private String propId;
                @JSONField(name = "prop_text")
                private String propText;
                @JSONField(name = "value_id")
                private String valueId;
                @JSONField(name = "value_text")
                private String valueText;
            }
        }
    }
}
