package com.shanyuan.platform.ms.dao.store.entity;

/**
 * 描述:sy_area_full表的实体类
 * @version
 * @author:  caoyongjun
 * @创建时间: 2017-10-31
 */
public class SyAreaFull {
    /**
     * 索引ID
     */
    private Long areaId;

    /**
     * 省份名称
     */
    private String areaName;

    /**
     * 地区父ID
     */
    private Long areaParentId;

    /**
     * 排序
     */
    private Byte areaSort;

    /**
     * 地区深度，从1开始
     */
    private Byte areaDeep;

    /**
     * 索引ID
     * @return area_id 索引ID
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * 索引ID
     * @param areaId 索引ID
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    /**
     * 省份名称
     * @return area_name 省份名称
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 省份名称
     * @param areaName 省份名称
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * 地区父ID
     * @return area_parent_id 地区父ID
     */
    public Long getAreaParentId() {
        return areaParentId;
    }

    /**
     * 地区父ID
     * @param areaParentId 地区父ID
     */
    public void setAreaParentId(Long areaParentId) {
        this.areaParentId = areaParentId;
    }

    /**
     * 排序
     * @return area_sort 排序
     */
    public Byte getAreaSort() {
        return areaSort;
    }

    /**
     * 排序
     * @param areaSort 排序
     */
    public void setAreaSort(Byte areaSort) {
        this.areaSort = areaSort;
    }

    /**
     * 地区深度，从1开始
     * @return area_deep 地区深度，从1开始
     */
    public Byte getAreaDeep() {
        return areaDeep;
    }

    /**
     * 地区深度，从1开始
     * @param areaDeep 地区深度，从1开始
     */
    public void setAreaDeep(Byte areaDeep) {
        this.areaDeep = areaDeep;
    }
}