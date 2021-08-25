package elem.retail.dto.order;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import com.elem.retail.api.util.Long2DateDeserializer;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-25
 */
@Getter
@Setter
public class OrderDeliveryGetResult extends ElemResponseData {

    private static final long serialVersionUID = -5416861971541502850L;

    @JSONField(name = "order_id")
    private String orderId;
    private int status;
    @JSONField(name = "substatus")
    private int subStatus;
    @JSONField(name = "update_time", deserializeUsing = Long2DateDeserializer.class)
    private Date updateTime;
    private String name;
    private String phone;
}
