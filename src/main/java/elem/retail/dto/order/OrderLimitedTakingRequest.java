package elem.retail.dto.order;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.elem.retail.api.BaseElemRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-25
 */
@Getter
@Setter
public class OrderLimitedTakingRequest extends BaseElemRequest {

    private static final long serialVersionUID = -5845955508003685298L;

    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "shop_Id")
    private String shopId;

    @JSONField(name = "limit_data")
    private List<LimitData> limitData;

    @Getter
    @Setter
    public static class LimitData {
        private String startTime;
        private String endTime;
        @JSONField(name = "order_limit_num")
        private int orderLimitNum;
    }

    @Override
    public String getCmd() {
        return "order.limited.taking";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
    }

    @Override
    public String getKeyword() {
        return this.getBaiduShopId();
    }
}
