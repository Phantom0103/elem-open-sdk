package com.alibaba.ocean.rawsdk.example.param;

public class CBCRequestBody {

    private Integer category_id;

    /**
     * @return 分类ID
     */
    public Integer getCategory_id() {
        return category_id;
    }

    /**
     * 设置分类ID * 参数示例：
     *
     * <pre>
     * 123
     * </pre>
     * <p>
     * 此参数必填
     */
    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

}
