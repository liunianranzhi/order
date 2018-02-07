package com.shanyuan.platform.ms.dao.store.entity;

/**
 * 描述:sy_store_bind_class表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-16
 */
public class SyStoreBindClass {
    /**
     * 
     */
    private Integer bid;

    /**
     * 店铺ID
     */
    private Integer storeId;

    /**
     * 佣金比例
     */
    private Byte commisRate;

    /**
     * 一级分类
     */
    private Integer class1;

    /**
     * 二级分类
     */
    private Integer class2;

    /**
     * 三级分类
     */
    private Integer class3;

    /**
     * 
     * @return bid 
     */
    public Integer getBid() {
        return bid;
    }

    /**
     * 
     * @param bid 
     */
    public void setBid(Integer bid) {
        this.bid = bid;
    }

    /**
     * 店铺ID
     * @return store_id 店铺ID
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * 店铺ID
     * @param storeId 店铺ID
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * 佣金比例
     * @return commis_rate 佣金比例
     */
    public Byte getCommisRate() {
        return commisRate;
    }

    /**
     * 佣金比例
     * @param commisRate 佣金比例
     */
    public void setCommisRate(Byte commisRate) {
        this.commisRate = commisRate;
    }

    /**
     * 一级分类
     * @return class_1 一级分类
     */
    public Integer getClass1() {
        return class1;
    }

    /**
     * 一级分类
     * @param class1 一级分类
     */
    public void setClass1(Integer class1) {
        this.class1 = class1;
    }

    /**
     * 二级分类
     * @return class_2 二级分类
     */
    public Integer getClass2() {
        return class2;
    }

    /**
     * 二级分类
     * @param class2 二级分类
     */
    public void setClass2(Integer class2) {
        this.class2 = class2;
    }

    /**
     * 三级分类
     * @return class_3 三级分类
     */
    public Integer getClass3() {
        return class3;
    }

    /**
     * 三级分类
     * @param class3 三级分类
     */
    public void setClass3(Integer class3) {
        this.class3 = class3;
    }
}