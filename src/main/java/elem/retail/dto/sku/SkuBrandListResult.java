package elem.retail.dto.sku;

import com.alibaba.fastjson.annotation.JSONField;
import com.elem.retail.api.ElemResponseData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhouw
 * @description
 * @date 2021-09-25
 */
@Getter
@Setter
public class SkuBrandListResult extends ElemResponseData {

    private static final long serialVersionUID = -936752865145161767L;

    private int count;
    @JSONField(name = "max_page_num")
    private int maxPageNum;
    @JSONField(name = "page_num")
    private int pageNum;
    @JSONField(name = "page_size")
    private int pageSize;

    @JSONField(name = "detail")
    private List<Detail> details;

    @Getter
    @Setter
    public static class Detail {
        @JSONField(name = "brand_id")
        private String brandId;
        @JSONField(name = "brand_name")
        private String brandName;
    }
}
