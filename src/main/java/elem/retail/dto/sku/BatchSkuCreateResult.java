package elem.retail.dto.sku;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-09-24
 */
@Getter
@Setter
public class BatchSkuCreateResult extends ElemResponseData {

    private static final long serialVersionUID = 7224585948509891288L;

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
}
