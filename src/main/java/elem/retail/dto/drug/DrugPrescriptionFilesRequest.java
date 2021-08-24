package elem.retail.dto.drug;

import com.elem.retail.api.BaseElemRequest;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-24
 */
public class DrugPrescriptionFilesRequest extends BaseElemRequest {

    private static final long serialVersionUID = 1340018922771215888L;

    private String orderId;

    @Override
    public String getCmd() {
        return "drug.prescription.files";
    }

    @Override
    public String getBody() {
        return "{\"orderId\":\"" + orderId + "\"}";
    }

    @Override
    public String getKeyword() {
        return this.getOrderId();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
