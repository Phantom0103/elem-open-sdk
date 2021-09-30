package elem.retail.dto.cpc;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhouw
 * @description
 * @date 2021-09-30
 */
@Getter
@Setter
public class CpcGetActualRankingResult extends ElemResponseData {

    private static final long serialVersionUID = 8437176707169597535L;

    private Channel channel;
    private Home home;
    private Search search;

    @Getter
    @Setter
    public static class Channel {
        private Integer rank;
        @JSONField(name = "more_then_others")
        private Integer moreThenOthers;
        private Integer rate;
    }

    @Getter
    @Setter
    public static class Home {
        private Integer rank;
        @JSONField(name = "more_then_others")
        private Integer moreThenOthers;
        private Integer rate;
    }

    @Getter
    @Setter
    public static class Search {
        private Integer rank;
        @JSONField(name = "more_then_others")
        private Integer moreThenOthers;
        private Integer rate;
    }
}
