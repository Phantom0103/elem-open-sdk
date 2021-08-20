package elem.retail.dto.sku;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-03
 */
@Getter
@Setter
public class SkuCreateResult extends ElemResponseData {

    private static final long serialVersionUID = -2849480410621031073L;

    @JSONField(name = "brand_id")
    private Long brand_id;
    @JSONField(name = "cat1_id")
    private Long cat1Id;
    @JSONField(name = "cat2_id")
    private Long cat2Id;
    @JSONField(name = "cat3_id")
    private Long cat3Id;
    private String name;
    private String upc;
    @JSONField(name = "sku_id")
    private String skuId;
    @JSONField(name = "item_id")
    private Long itemId;

    @JSONField(name = "sku_spec_result")
    private List<SkuSpecResult> skuSpecResults;

    @Getter
    @Setter
    public static class SkuSpecResult {
        private String upc;
        @JSONField(name = "sku_spec_id")
        private String skuSpecId;
        @JSONField(name = "sku_spec_custom_id")
        private int skuSpecCustomId;
    }
}
