package com.shanyuan.platform.ms.dao.store.entity;

/**
 * 描述:sy_store_class表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-10-16
 */
public class SyStoreClass {
    /**
     * 索引ID
     */
    private Integer scId;

    /**
     * 分类名称
     */
    private String scName;

    /**
     * 父ID
     */
    private Integer scParentId;

    /**
     * 排序
     */
    private Byte scSort;

    /**
     * 索引ID
     * @return sc_id 索引ID
     */
    public Integer getScId() {
        return scId;
    }

    /**
     * 索引ID
     * @param scId 索引ID
     */
    public void setScId(Integer scId) {
        this.scId = scId;
    }

    /**
     * 分类名称
     * @return sc_name 分类名称
     */
    public String getScName() {
        return scName;
    }

    /**
     * 分类名称
     * @param scName 分类名称
     */
    public void setScName(String scName) {
        this.scName = scName == null ? null : scName.trim();
    }

    /**
     * 父ID
     * @return sc_parent_id 父ID
     */
    public Integer getScParentId() {
        return scParentId;
    }

    /**
     * 父ID
     * @param scParentId 父ID
     */
    public void setScParentId(Integer scParentId) {
        this.scParentId = scParentId;
    }

    /**
     * 排序
     * @return sc_sort 排序
     */
    public Byte getScSort() {
        return scSort;
    }

    /**
     * 排序
     * @param scSort 排序
     */
    public void setScSort(Byte scSort) {
        this.scSort = scSort;
    }
}