package elem.retail.dto.order;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-27
 */
@Getter
@Setter
public class OrderPrivateInfoResult extends ElemResponseData {

    private static final long serialVersionUID = -5465155205134578872L;

    @JSONField(name = "expire_date")
    private Date expireDate;

    @JSONField(name = "short_number")
    private String shortNumber;
}
