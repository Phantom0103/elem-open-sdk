package elem.retail.dto.shop;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-09-08
 */
@Getter
@Setter
public class ShopStatusGetResult extends ElemResponseData {

    private static final long serialVersionUID = 4747277259226016511L;

    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "sys_status")
    private String sysStatus;
    @JSONField(name = "business_status")
    private String businessStatus;
}
