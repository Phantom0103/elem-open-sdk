package elem.retail.dto.drug;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-09-02
 */
@Getter
@Setter
public class PrescriptionDrugSearchRequest extends BaseElemRequest {

    private static final long serialVersionUID = 5260622707573169202L;

    private int pageNum = 1;
    private int pageLimit = 20;
    private String brandName;
    private String genericName;
    private String partnerId;

    @JSONField(name = "userloc")
    private UserLoc userLoc;

    @Getter
    @Setter
    public static class UserLoc {
        private String userAddress;
        private String userLat;
        private String userLng;
    }

    @Override
    public String getCmd() {
        return "prescription.drug.search";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return null;
    }
}
