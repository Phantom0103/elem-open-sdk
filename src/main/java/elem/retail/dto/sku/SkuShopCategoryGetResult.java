package elem.retail.dto.sku;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhouw
 * @description
 * @date 2021-09-27
 */
@Getter
@Setter
public class SkuShopCategoryGetResult extends ElemResponseData {

    private static final long serialVersionUID = -1741979659139973157L;

    @JSONField(name = "categorys")
    private List<Category> categories;

    @Getter
    @Setter
    public static class Category {
        @JSONField(name = "category_id")
        private String categoryId;
        private String name;
        private int rank;

        private List<Children> children;

        @Getter
        @Setter
        public static class Children {
            @JSONField(name = "category_id")
            private String categoryId;
            private String name;
            private int rank;
        }
    }
}
