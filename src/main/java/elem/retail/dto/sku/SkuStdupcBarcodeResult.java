package elem.retail.dto.sku;

import com.elem.retail.api.ElemResponseData;

/**
 * @author zhouw
 * @description
 * @date 2021-09-13
 */
public class SkuStdupcBarcodeResult extends ElemResponseData {

    private static final long serialVersionUID = 820556144867664527L;

    private String barcode;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
