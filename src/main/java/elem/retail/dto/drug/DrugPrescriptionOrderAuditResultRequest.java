package elem.retail.dto.drug;

import com.alibaba.fastjson.JSON;
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
public class DrugPrescriptionOrderAuditResultRequest extends BaseElemRequest {

    private static final long serialVersionUID = 6573093674192092826L;
    
    private String orderId;
    private Integer auditState;
    private String registrationCode;
    private String qualificationCode;
    private String name;
    private String rejectReason;

    @Override
    public String getCmd() {
        return "drug.prescription.order.audit.result";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return orderId;
    }
}
