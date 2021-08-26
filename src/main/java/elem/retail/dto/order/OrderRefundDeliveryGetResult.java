package elem.retail.dto.order;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-26
 */
@Getter
@Setter
public class OrderRefundDeliveryGetResult extends ElemResponseData {

    private static final long serialVersionUID = -616966601832068854L;

    private String orderId;
    private Integer currentState;

    @JSONField(name = "carrierDriverInfoDTO")
    private CarrierDriverInfo carrierDriverInfo;

    @Getter
    @Setter
    public static class CarrierDriverInfo {
        private Long carrierDriverId;
        private String carrierDriverName;
        private String carrierDriverPhone;
    }
}
