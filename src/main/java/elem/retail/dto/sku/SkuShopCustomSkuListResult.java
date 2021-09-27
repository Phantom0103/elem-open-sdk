package elem.retail.dto.sku;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhouw
 * @description
 * @date 2021-09-27
 */
@Getter
@Setter
public class SkuShopCustomSkuListResult extends ElemResponseData {

    private static final long serialVersionUID = -5806911238365331071L;

    private int page;
    private int pages;
    private int total;

    @JSONField(name = "list")
    private List<SkuDetail> skuDetails;

    @Getter
    @Setter
    public static class SkuDetail {
        @JSONField(name = "custom_cat_ids")
        private String customCatIds;
        @JSONField(name = "custom_sku_id")
        private String customSkuId;
        @JSONField(name = "is_in_activity")
        private int isInActivity;
        @JSONField(name = "left_num")
        private int leftNum;
        @JSONField(name = "market_price")
        private long marketPrice;
        private Integer minimum;
        private String name;
        @JSONField(name = "need_ice")
        private int needIce;
        @JSONField(name = "preminus_weight")
        private Integer preminusWeight;
        @JSONField(name = "preparation_time")
        private Integer preparationTime;
        @JSONField(name = "prescription_type")
        private String prescriptionType;
        @JSONField(name = "process_type")
        private int processType;
        @JSONField(name = "production_addr1")
        private String productionAddr1;
        @JSONField(name = "production_addr2")
        private String productionAddr2;
        @JSONField(name = "production_addr3")
        private String productionAddr3;
        @JSONField(name = "sale_price")
        private long salePrice;
        @JSONField(name = "sale_step")
        private Integer saleStep;
        @JSONField(name = "sale_unit")
        private String saleUnit;
        @JSONField(name = "shelf_number")
        private String shelfNumber;
        @JSONField(name = "sku_id")
        private String skuId;
        private String status;
        private String summary;
        private String upc;
        @JSONField(name = "upc_type")
        private int upcType;
        private long weight;
        @JSONField(name = "weight_flag")
        private int weightFlag;
        @JSONField(name = "cate_id1")
        private String cateId1;
        @JSONField(name = "cate_name1")
        private String cateName1;
        @JSONField(name = "cate_id2")
        private String cateId2;
        @JSONField(name = "cate_name2")
        private String cateName2;
        @JSONField(name = "cate_id")
        private String cateId;
        @JSONField(name = "cate_name")
        private String cateName;
        private Integer rank;

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
            private int isMaster;
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
                private String ice;
                private String k;
            }
        }

        @Getter
        @Setter
        public static class SkuSpec {
            @JSONField(name = "product_spec_id")
            private String productSpecId;
            @JSONField(name = "sku_spec_id")
            private String skuSpecId;
            @JSONField(name = "sku_spec_custom_id")
            private String skuSpecCustomId;
            @JSONField(name = "left_num")
            private int leftNum;
            @JSONField(name = "sale_price")
            private long salePrice;
            private String upc;
            private int weight;

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
