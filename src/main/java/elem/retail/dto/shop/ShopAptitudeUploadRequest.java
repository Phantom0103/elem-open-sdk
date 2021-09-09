package elem.retail.dto.shop;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-09-09
 */
@Getter
@Setter
public class ShopAptitudeUploadRequest extends BaseElemRequest {

    private static final long serialVersionUID = 6026974909142902707L;

    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "shop_id")
    private String shopId;
    @JSONField(name = "is_delete")
    private int isDelete;

    @JSONField(name = "aptitude")
    private List<Aptitude> aptitudes;

    @Getter
    @Setter
    public static class Aptitude {
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
        private String licenseValiddate;
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
            private String waterprinterUrl;
        }
    }

    @Override
    public String getCmd() {
        return "shop.aptitude.upload";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
    }

    @Override
    public String getKeyword() {
        return baiduShopId;
    }
}
