package elem.retail.dto.shop;

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
 * @Date 2021-09-09
 */
@Getter
@Setter
public class ShopUpdateRequest extends BaseElemRequest {

    private static final long serialVersionUID = -242349504290933190L;

    @JSONField(name = "baidu_shop_id")
    private String baiduShopId;
    @JSONField(name = "shop_id")
    private String shopId;
    private String name;
    @JSONField(name = "shop_logo")
    private String shopLogo;
    private String phone;
    @JSONField(name = "ivr_phone")
    private String ivrPhone;
    @JSONField(name = "service_phone")
    private String servicePhone;
    @JSONField(name = "service_phones")
    private List<String> servicePhones;
    private String longitude;
    private String latitude;
    @JSONField(name = "coord_type")
    private String coordType;
    @JSONField(name = "invoice_support")
    private Integer invoiceSupport;
    @JSONField(name = "package_box_price")
    private Integer packageBoxPrice;
    @JSONField(name = "pick_time")
    private Integer pickTime;
    @JSONField(name = "delivery_time_type")
    private String deliveryTimeType;
    @JSONField(name = "shipment_platform_computing")
    private Integer shipmentPlatformComputing;

    @JSONField(name = "im_data")
    private List<ImData> imData;

    @JSONField(name = "slice_shipment_time")
    private List<SliceShipmentTime> sliceShipmentTimes;

    @JSONField(name = "special_shipment_time")
    private List<SpecialShipmentTime> specialShipmentTimes;

    @Getter
    @Setter
    public static class SliceShipmentTime {
        private String start;
        private String end;
        private Integer time;
    }

    @Getter
    @Setter
    public static class SpecialShipmentTime {
        @JSONField(name = "start_date")
        private String startDate;
        @JSONField(name = "end_date")
        private String endDate;
        @JSONField(name = "start_time")
        private String startTime;
        @JSONField(name = "end_time")
        private String endTime;
        private Integer time;
    }

    @Getter
    @Setter
    public static class ImData {
        private String id;
        private String type;
    }

    @Override
    public String getCmd() {
        return "shop.update";
    }

    @Override
    public String getBody() {
        return JSON.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
    }

    @Override
    public String getKeyword() {
        return baiduShopId;
    }
}
