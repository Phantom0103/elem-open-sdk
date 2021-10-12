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
 * @date 2021-10-12
 */
@Getter
@Setter
public class ActMultiChannelQueryInfosResult extends ElemResponseData {

    private static final long serialVersionUID = -4532512062089700666L;

    private Integer activityId;
    private String activityName;
    private Integer activityType;
    private Integer childType;
    @JSONField(name = "startTime", deserializeUsing = Long2DateDeserializer.class)
    private Date startTime;
    @JSONField(name = "endTime", deserializeUsing = Long2DateDeserializer.class)
    private Date endTime;
    private Integer activityPlatform;
    private Integer status;
    @JSONField(name = "createTime", deserializeUsing = Long2DateDeserializer.class)
    private Date createTime;
    private Integer deliveryChannel;
    @JSONField(name = "usedStartTime", deserializeUsing = Long2DateDeserializer.class)
    private Date usedStartTime;
    @JSONField(name = "usedEndTime", deserializeUsing = Long2DateDeserializer.class)
    private Date usedEndTime;
    private Integer effectiveDays;
    private Integer usedType;
    private Integer skuTotal;

    @JSONField(name = "skuList")
    private List<Sku> skus;
    @JSONField(name = "periodsAndRuleApiList")
    private List<PeriodsAndRuleApix> periodsAndRuleApisx;
    @JSONField(name = "limitRuleApi")
    private LimitRuleApix limitRuleApix;

    @Getter
    @Setter
    public static class Sku {
        private String skuId;
        private String itemId;
        private Long wid;
        private String customShopId;
        private String storeId;
        private String upcName;
        private Integer realStock;
        private Integer dayRealStock;

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

    @Getter
    @Setter
    public static class PeriodsAndRuleApix {
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
    public static class LimitRuleApix {
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
