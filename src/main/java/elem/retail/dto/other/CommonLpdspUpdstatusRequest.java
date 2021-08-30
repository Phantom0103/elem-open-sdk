package elem.retail.dto.other;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-30
 */
@Getter
@Setter
public class CommonLpdspUpdstatusRequest extends BaseElemRequest {

    private static final long serialVersionUID = 8147908541649709461L;

    @JSONField(name = "order_id")
    private String orderId;

    @JSONField(name = "UpdateWaybillStatusReq")
    private UpdateWaybillStatusReq updateWaybillStatusReq;

    @Getter
    @Setter
    public static class UpdateWaybillStatusReq {
        private String requestId;
        private String source;
        private boolean isTest;
        private String waybillId;
        private String entityId;
        private String statusCode;
        private long occurredAt;

        @JSONField(name = "deliveryProviderDTO")
        private DeliveryProvider deliveryProvider;

        private ExtInfo extInfo;

        @Getter
        @Setter
        public static class DeliveryProvider {
            private String partner;
        }

        @Getter
        @Setter
        public static class ExtInfo {
            @JSONField(name = "DELIVERY_BILL_ID")
            private String deliveryBillId;
            @JSONField(name = "DELIVERY_CORP_ID")
            private String deliveryCorpId;
            @JSONField(name = "DELIVERY_CORP_NAME")
            private String deliveryCorpName;
        }
    }

    @Override
    public String getCmd() {
        return "common.lpdsp.updstatus";
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
