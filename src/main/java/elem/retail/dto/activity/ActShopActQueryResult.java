package elem.retail.dto.activity;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import com.elem.retail.api.util.Long2DateDeserializer;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * @author zhouw
 * @description
 * @date 2021-10-13
 */
@Getter
@Setter
public class ActShopActQueryResult extends ElemResponseData {

    private static final long serialVersionUID = 1038818908826928771L;

    private Long activityId;
    private String activityName;
    private Integer activityType;
    private Integer childType;
    @JSONField(name = "startTime", deserializeUsing = Long2DateDeserializer.class)
    private Date startTime;
    @JSONField(name = "endTime", deserializeUsing = Long2DateDeserializer.class)
    private Date endTime;
    private Integer activityPlatform;
    private Integer getActivityType;
    private Long wid;
    private Integer status;
    private String customShopId;
    private String storeId;
    private String supplierId;
    private Integer userType;
    private Integer deliveryType;

    @JSONField(name = "periodsAndRuleList")
    private List<PeriodsAndRule> periodsAndRules;
    @JSONField(name = "limitRule")
    private LimitRule limitRule;

    @Getter
    @Setter
    public static class PeriodsAndRule {
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
    public static class LimitRule {
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
