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
public class CpcGetRankAndCostInfoResult extends ElemResponseData {

    private static final long serialVersionUID = 1728565073226669153L;

    @JSONField(name = "category_info")
    private CategoryInfo categoryInfo;
    @JSONField(name = "search_info")
    private SearchInfo searchInfo;
    @JSONField(name = "home_info")
    private HomeInfo homeInfo;

    @Getter
    @Setter
    public static class CategoryInfo {
        @JSONField(name = "total_cost")
        private Double totalCost;
        @JSONField(name = "average_cost")
        private Double averageCost;
        @JSONField(name = "total_click_count")
        private Integer totalClickCount;

        @JSONField(name = "data_list")
        private List<Data> dataList;

        @Getter
        @Setter
        public static class Data {
            @JSONField(name = "average_cost")
            private Double averageCost;
            @JSONField(name = "cost_rate_in_page")
            private Double costRateInPage;
            @JSONField(name = "click_count")
            private Integer clickCount;
            @JSONField(name = "total_cost")
            private Double totalCost;
            private Integer rank;
        }
    }

    @Getter
    @Setter
    public static class SearchInfo {
        @JSONField(name = "total_cost")
        private Double totalCost;
        @JSONField(name = "average_cost")
        private Double averageCost;
        @JSONField(name = "total_click_count")
        private Integer totalClickCount;

        @JSONField(name = "data_list")
        private List<Data> dataList;

        @Getter
        @Setter
        public static class Data {
            @JSONField(name = "average_cost")
            private Double averageCost;
            @JSONField(name = "cost_rate_in_page")
            private Double costRateInPage;
            @JSONField(name = "click_count")
            private Integer clickCount;
            @JSONField(name = "total_cost")
            private Double totalCost;
            private Integer rank;
        }
    }

    @Getter
    @Setter
    public static class HomeInfo {
        @JSONField(name = "total_cost")
        private Double totalCost;
        @JSONField(name = "average_cost")
        private Double averageCost;
        @JSONField(name = "total_click_count")
        private Integer totalClickCount;

        @JSONField(name = "data_list")
        private List<Data> dataList;

        @Getter
        @Setter
        public static class Data {
            @JSONField(name = "average_cost")
            private Double averageCost;
            @JSONField(name = "cost_rate_in_page")
            private Double costRateInPage;
            @JSONField(name = "click_count")
            private Integer clickCount;
            @JSONField(name = "total_cost")
            private Double totalCost;
            private Integer rank;
        }
    }
}
