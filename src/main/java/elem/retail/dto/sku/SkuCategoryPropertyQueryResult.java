package elem.retail.dto.sku;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhouw
 * @description
 * @date 2021-09-17
 */
@Getter
@Setter
public class SkuCategoryPropertyQueryResult extends ElemResponseData {

    private static final long serialVersionUID = -4475895087631640052L;

    @JSONField(name = "sku_id")
    private String skuId;
    @JSONField(name = "custom_sku_id")
    private String customSkuId;
    private String upc;
    private String name;

    private List<ItemPropValue> itemPropValues;

    @Getter
    @Setter
    public static class ItemPropValue {
        private String propId;
        private String propText;
        private String valueId;
        private String valueText;
        private boolean saleProp;
    }
}
