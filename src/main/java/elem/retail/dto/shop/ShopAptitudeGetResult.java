package elem.retail.dto.shop;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-09-09
 */
public class ShopAptitudeGetResult extends ElemResponseData {

    private static final long serialVersionUID = -2640086346139097671L;

    @JSONField(name = "type_1")
    private String type1;
    @JSONField(name = "type_2")
    private String type2;
    @JSONField(name = "type_3")
    private String type3;
    @JSONField(name = "license_name")
    private String licenseName;
    @JSONField(name = "license_number")
    private String licenseNumber;
    @JSONField(name = "license_address")
    private String licenseAddress;
    @JSONField(name = "license_validdate")
    private String licenseValidate;
    @JSONField(name = "long_term_valid")
    private String longTermValid;
    @JSONField(name = "legal_representative_name")
    private String legalRepresentativeName;

    private List<Photo> photos;

    @Getter
    @Setter
    public static class Photo {
        @JSONField(name = "photo_url")
        private String photoUrl;
        @JSONField(name = "waterprinter_url")
        private String waterPrinterUrl;
    }
}
