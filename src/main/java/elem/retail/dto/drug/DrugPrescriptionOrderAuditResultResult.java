package elem.retail.dto.drug;

import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-09-02
 */
@Getter
@Setter
public class DrugPrescriptionOrderAuditResultResult extends ElemResponseData {

    private static final long serialVersionUID = -661520093686522850L;

    private Integer code;
    private String message;
    private boolean success;

    @Getter
    @Setter
    public static class Data {
        private String orderId;
        private boolean auditSuccess;
        private boolean existApothecary;
    }
}
