package com.shanyuan.platform.ms.dao.goods.entity;

/**
 * 描述:sy_support_area表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-11-02
 */
public class SySupportArea {
    /**
     * 主键
     */
    private Integer recId;

    /**
     * 一级地址id
     */
    private Long areaid1;

    /**
     * 二级地址id
     */
    private Long areaid2;

    /**
     * 三级地址id
     */
    private Long areaid3;

    /**
     * 一级地址名称
     */
    private String areaname1;

    /**
     * 二级地址名称
     */
    private String areaname2;

    /**
     * 三级地址名称
     */
    private String areaname3;

    /**
     * 添加时间
     */
    private Integer addTime;

    /**
     * 主键
     * @return rec_id 主键
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 主键
     * @param recId 主键
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    /**
     * 一级地址id
     * @return areaid_1 一级地址id
     */
    public Long getAreaid1() {
        return areaid1;
    }

    /**
     * 一级地址id
     * @param areaid1 一级地址id
     */
    public void setAreaid1(Long areaid1) {
        this.areaid1 = areaid1;
    }

    /**
     * 二级地址id
     * @return areaid_2 二级地址id
     */
    public Long getAreaid2() {
        return areaid2;
    }

    /**
     * 二级地址id
     * @param areaid2 二级地址id
     */
    public void setAreaid2(Long areaid2) {
        this.areaid2 = areaid2;
    }

    /**
     * 三级地址id
     * @return areaid_3 三级地址id
     */
    public Long getAreaid3() {
        return areaid3;
    }

    /**
     * 三级地址id
     * @param areaid3 三级地址id
     */
    public void setAreaid3(Long areaid3) {
        this.areaid3 = areaid3;
    }

    /**
     * 一级地址名称
     * @return areaname_1 一级地址名称
     */
    public String getAreaname1() {
        return areaname1;
    }

    /**
     * 一级地址名称
     * @param areaname1 一级地址名称
     */
    public void setAreaname1(String areaname1) {
        this.areaname1 = areaname1 == null ? null : areaname1.trim();
    }

    /**
     * 二级地址名称
     * @return areaname_2 二级地址名称
     */
    public String getAreaname2() {
        return areaname2;
    }

    /**
     * 二级地址名称
     * @param areaname2 二级地址名称
     */
    public void setAreaname2(String areaname2) {
        this.areaname2 = areaname2 == null ? null : areaname2.trim();
    }

    /**
     * 三级地址名称
     * @return areaname_3 三级地址名称
     */
    public String getAreaname3() {
        return areaname3;
    }

    /**
     * 三级地址名称
     * @param areaname3 三级地址名称
     */
    public void setAreaname3(String areaname3) {
        this.areaname3 = areaname3 == null ? null : areaname3.trim();
    }

    /**
     * 添加时间
     * @return add_time 添加时间
     */
    public Integer getAddTime() {
        return addTime;
    }

    /**
     * 添加时间
     * @param addTime 添加时间
     */
    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }
}