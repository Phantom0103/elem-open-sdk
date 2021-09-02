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
public class ErpConfirmOrderStatusRequest extends BaseElemRequest {

    private static final long serialVersionUID = -6881873350322565663L;

    private String orderId;
    private String storeId;
    private String confirmationStatus;

    @Override
    public String getCmd() {
        return "erp.confirm.order.status";
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
