package elem.retail.dto.cpc;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhouw
 * @description
 * @date 2021-09-30
 */
@Getter
@Setter
public class CpcGetUvSummaryResult extends ElemResponseData {

    private static final long serialVersionUID = 2344907971084305712L;

    @JSONField(name = "average_click_rate")
    private Double averageClickRate;
    @JSONField(name = "average_cost")
    private Double averageCost;
    @JSONField(name = "total_exposure_amount")
    private Integer totalExposureAmount;
    @JSONField(name = "uv_count")
    private Integer uvCount;
    @JSONField(name = "total_cost")
    private Double totalCost;

    private List<Detail> details;

    @Getter
    @Setter
    public static class Detail {
        @JSONField(name = "average_cost")
        private Double averageCost;
        @JSONField(name = "exposure_amount")
        private Integer exposureAmount;
        @JSONField(name = "click_rate")
        private Double clickRate;
        @JSONField(name = "time_sign")
        private String timeSign;
        @JSONField(name = "total_count")
        private Integer totalCount;
        @JSONField(name = "total_cost")
        private Double totalCost;
    }
}
