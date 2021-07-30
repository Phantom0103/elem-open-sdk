package com.alibaba.ocean.rawsdk.example.param;

public class CBCResponseData {

    private String business_form_id;

    /**
     * @return 业态ID;二级业态时返回;
     */
    public String getBusiness_form_id() {
        return business_form_id;
    }

    /**
     * 设置业态ID;二级业态时返回; * 参数示例：
     *
     * <pre>
     * 1
     * </pre>
     * <p>
     * 此参数必填
     */
    public void setBusiness_form_id(String business_form_id) {
        this.business_form_id = business_form_id;
    }

    private String category_id;

    /**
     * @return 分类ID
     */
    public String getCategory_id() {
        return category_id;
    }

    /**
     * 设置分类ID * 参数示例：
     *
     * <pre>
     * 166
     * </pre>
     * <p>
     * 此参数必填
     */
    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    private String category_name;

    /**
     * @return 分类名称
     */
    public String getCategory_name() {
        return category_name;
    }

    /**
     * 设置分类名称 * 参数示例：
     *
     * <pre>
     * 商超
     * </pre>
     * <p>
     * 此参数必填
     */
    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

}
