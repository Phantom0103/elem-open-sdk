package elem.retail.dto.activity;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhouw
 * @description
 * @date 2021-10-13
 */
@Getter
@Setter
public class ActShopActDetailQueryResult extends ElemResponseData {

    private static final long serialVersionUID = -2727083496763198011L;

    private Long activityId;
    private String activityName;
    private Integer activityType;
    private Integer childType;

    private int page;
    private int pageSize;
    private int totalPage;

    @JSONField(name = "shopList")
    private List<Shop> shops;

    @Getter
    @Setter
    public static class Shop {
        private String skuId;
        private String itemId;
        private String storeId;
        private Integer realStock;
        private Integer dayRealStock;
        private Integer status;
        private String upcName;

        @JSONField(name = "periodsAndRuleApiList")
        private List<PeriodsAndRuleApi> periodsAndRuleApis;
        private LimitRuleApi limitRuleApi;

        @Getter
        @Setter
        public static class PeriodsAndRuleApi {
            private List<Period> periods;
            private RuleApi ruleApi;

            @Getter
            @Setter
            public static class Period {
                private String weekday;
                private String openTime;
                private String closeTime;
            }

            @Getter
            @Setter
            public static class RuleApi {
                private Integer condition;
                private Integer conditionType;
                private Integer discount;
                private Integer discountType;
                private Integer giftType;
                private Long gift;
                private String giftName;
                private SubsidyApi subsidyApi;

                @Getter
                @Setter
                public static class SubsidyApi {
                    private Integer agentSubsidy;
                    private Integer elemeSubsidy;
                    private Integer shopSubsidy;
                }
            }
        }

        @Getter
        @Setter
        public static class LimitRuleApi {
            private Long activityCountLimit;
            private Long activityDayCountLimit;
            private Long detailCountLimit;
            private Long detailDayCountLimit;
            private Long userDayOrderLimit;
            private Long userTotalOrderLimit;
            private Long userTotalCountLimit;
            private Long userDayCountLimit;
            private Long activityUserCountLimit;
            private Long activityUserDayCountLimit;
        }
    }
}
