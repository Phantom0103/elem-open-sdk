package elem.retail.dto.order;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.BaseElemRequest;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-27
 */
public class BillOrderDetailRequest extends BaseElemRequest {

    private static final long serialVersionUID = -3150747630956651371L;

    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "shop_id")
    private String shopId;
    private long date;
    private int page = 1;

    @Override
    public String getCmd() {
        return "bill.orderdetail";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this);
    }

    @Override
    public String getKeyword() {
        return baiduShopId;
    }
}
