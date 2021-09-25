package elem.retail.dto.sku;

import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhouw
 * @description
 * @date 2021-09-25
 */
@Getter
@Setter
public class SkuCategoryPropertyListResult extends ElemResponseData {

    private static final long serialVersionUID = 3744918574997714435L;

    private Long propertyId;
    private Long categoryId;
    private String propertyName;
    private Boolean required;
    private Boolean multiSelect;
    private Boolean enumProp;
    private Boolean inputProp;
    private Boolean saleProp;
    private Boolean sortOrder;

    private List<PropertyValue> propertyValues;

    @Getter
    @Setter
    public static class PropertyValue {
        private Long valueId;
        private String valueData;
        private Integer sortOrder;
    }
}
