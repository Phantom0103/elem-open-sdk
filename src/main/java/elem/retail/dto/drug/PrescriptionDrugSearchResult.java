package elem.retail.dto.drug;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-09-02
 */
@Getter
@Setter
public class PrescriptionDrugSearchResult extends ElemResponseData {

    private static final long serialVersionUID = 4261219630772961040L;
    
    private int totalCount;

    @JSONField(name = "itemList")
    private List<Item> items;

    @Getter
    @Setter
    public static class Item {
        private String brandName;
        private Integer deliveryDuration;
        private String dosageAdministration;
        private String genericName;
        private String itemId;
        private String itemName;
        private String productName;
        private Integer quantity;
        private boolean rx;
        private String sellerId;
        private String specification;
        private String storeId;
        private int unitPrice;
        private String upcCode;
        private String upcId;
    }
}
