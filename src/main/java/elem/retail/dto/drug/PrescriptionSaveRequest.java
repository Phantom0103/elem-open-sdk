package elem.retail.dto.drug;

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
 * @Date 2021-09-03
 */
@Getter
@Setter
public class PrescriptionSaveRequest extends BaseElemRequest {

    private static final long serialVersionUID = 3945375573246732392L;

    private String doctorName;
    private String icd;
    private String outId;
    private String partnerId;
    private String patientId;
    private String serialNumber;
    private String prescriptionUri;
    private Long prescriptionTime;

    @JSONField(name = "patientInfoDTO")
    private PatientInfo patientInfo;

    @JSONField(name = "drugParams")
    private List<Drug> drugs;

    @Getter
    @Setter
    public static class PatientInfo {
        private Integer allergy;
        private String allergyMessage;
        private Long birthday;
        private Integer familyConditions;
        private String familyDiseaseMessage;
        private Integer gender;
        private String idCard;
        private Integer liverDysfunction;
        private String patientId;
        private String patientName;
        private String phone;
        private String preDiseaseMessage;
        private Integer preExistingConditions;
        private Integer preparePregnant;
        private Integer renalDysfunction;
        private Integer weight;
    }

    @Getter
    @Setter
    public static class Drug {
        private String drugUpc;
        private String drugName;
        private String drugUnit;
        private String specification;
        private int total;
    }

    @Override
    public String getCmd() {
        return "prescription.save";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
    }

    @Override
    public String getKeyword() {
        return null;
    }
}
