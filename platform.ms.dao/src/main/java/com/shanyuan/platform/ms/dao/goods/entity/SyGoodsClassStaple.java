package com.shanyuan.platform.ms.dao.goods.entity;

/**
 * 描述:sy_goods_class_staple表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-16
 */
public class SyGoodsClassStaple {
    /**
     * 常用分类id
     */
    private Integer stapleId;

    /**
     * 常用分类名称
     */
    private String stapleName;

    /**
     * 一级分类id
     */
    private Integer gcId1;

    /**
     * 二级商品分类
     */
    private Integer gcId2;

    /**
     * 三级商品分类
     */
    private Integer gcId3;

    /**
     * 类型id
     */
    private Integer typeId;

    /**
     * 会员id
     */
    private Integer memberId;

    /**
     * 计数器
     */
    private Integer counter;

    /**
     * 常用分类id
     * @return staple_id 常用分类id
     */
    public Integer getStapleId() {
        return stapleId;
    }

    /**
     * 常用分类id
     * @param stapleId 常用分类id
     */
    public void setStapleId(Integer stapleId) {
        this.stapleId = stapleId;
    }

    /**
     * 常用分类名称
     * @return staple_name 常用分类名称
     */
    public String getStapleName() {
        return stapleName;
    }

    /**
     * 常用分类名称
     * @param stapleName 常用分类名称
     */
    public void setStapleName(String stapleName) {
        this.stapleName = stapleName == null ? null : stapleName.trim();
    }

    /**
     * 一级分类id
     * @return gc_id_1 一级分类id
     */
    public Integer getGcId1() {
        return gcId1;
    }

    /**
     * 一级分类id
     * @param gcId1 一级分类id
     */
    public void setGcId1(Integer gcId1) {
        this.gcId1 = gcId1;
    }

    /**
     * 二级商品分类
     * @return gc_id_2 二级商品分类
     */
    public Integer getGcId2() {
        return gcId2;
    }

    /**
     * 二级商品分类
     * @param gcId2 二级商品分类
     */
    public void setGcId2(Integer gcId2) {
        this.gcId2 = gcId2;
    }

    /**
     * 三级商品分类
     * @return gc_id_3 三级商品分类
     */
    public Integer getGcId3() {
        return gcId3;
    }

    /**
     * 三级商品分类
     * @param gcId3 三级商品分类
     */
    public void setGcId3(Integer gcId3) {
        this.gcId3 = gcId3;
    }

    /**
     * 类型id
     * @return type_id 类型id
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 类型id
     * @param typeId 类型id
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * 会员id
     * @return member_id 会员id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 会员id
     * @param memberId 会员id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 计数器
     * @return counter 计数器
     */
    public Integer getCounter() {
        return counter;
    }

    /**
     * 计数器
     * @param counter 计数器
     */
    public void setCounter(Integer counter) {
        this.counter = counter;
    }
}