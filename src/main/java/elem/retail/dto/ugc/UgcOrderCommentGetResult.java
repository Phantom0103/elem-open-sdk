package elem.retail.dto.ugc;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import com.elem.retail.api.util.Long2DateDeserializer;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * @Author zhouw
 * @Description
 * @Date 2021-08-23
 */
@Getter
@Setter
public class UgcOrderCommentGetResult extends ElemResponseData {

    private static final long serialVersionUID = 8933448601575358063L;

    private int total;
    private int page;
    @JSONField(name = "page_count")
    private int pageCount;

    @JSONField(name = "comment_list")
    private List<Comment> commentList;

    @Getter
    @Setter
    public static class Comment {
        @JSONField(name = "order_id")
        private long orderId;
        @JSONField(name = "anonymous_rating")
        private String anonymousRating;
        @JSONField(name = "canReply")
        private String canReply;
        @JSONField(name = "can_edit_reply")
        private String canEditReply;

        @JSONField(name = "order_rate_list")
        private List<OrderRate> orderRateList;

        @JSONField(name = "dish_rate_list")
        private List<DishRate> dishRateList;

        @Getter
        @Setter
        public static class OrderRate {
            @JSONField(name = "comment_id")
            private long comment_id;

            @JSONField(name = "service_rating")
            private int serviceRating;
            @JSONField(name = "quality_rating")
            private int qualityRating;
            @JSONField(name = "package_rating")
            private int packageRating;

            @JSONField(name = "rating_content")
            private String ratingContent;
            @JSONField(name = "rating_at", deserializeUsing = Long2DateDeserializer.class)
            private Date ratingAt;

            @JSONField(name = "reply_content")
            private String replyContent;
            @JSONField(name = "reply_at", deserializeUsing = Long2DateDeserializer.class)
            private Date replyAt;
        }

        @Getter
        @Setter
        public static class DishRate {
            @JSONField(name = "comment_id")
            private long comment_id;
            private String name;
            private int rating;
            @JSONField(name = "rating_content")
            private String ratingContent;
        }
    }
}
