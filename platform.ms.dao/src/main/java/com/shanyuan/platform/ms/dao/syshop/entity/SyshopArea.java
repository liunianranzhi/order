package com.shanyuan.platform.ms.dao.syshop.entity;

/**
 * 描述:sy_syshop_area表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-11-02
 */
public class SyshopArea {
    /**
     * 主键
     */
    private Integer areaId;

    /**
     * 分馆名
     */
    private String areaName;

    /**
     * 添加时间
     */
    private Integer addtime;

    /**
     * 状态：1开启，2关闭
     */
    private Byte areaState;

    /**
     * 馆区logo
     */
    private String areaLogo;

    /**
     * 馆区简介
     */
    private String areaDes;

    /**
     * 馆区排序，0前台不展示该馆区
     */
    private Integer areaSort;

    /**
     * 主键
     * @return area_id 主键
     */
    public Integer getAreaId() {
        return areaId;
    }

    /**
     * 主键
     * @param areaId 主键
     */
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    /**
     * 分馆名
     * @return area_name 分馆名
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 分馆名
     * @param areaName 分馆名
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * 添加时间
     * @return addtime 添加时间
     */
    public Integer getAddtime() {
        return addtime;
    }

    /**
     * 添加时间
     * @param addtime 添加时间
     */
    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    /**
     * 状态：1开启，2关闭
     * @return area_state 状态：1开启，2关闭
     */
    public Byte getAreaState() {
        return areaState;
    }

    /**
     * 状态：1开启，2关闭
     * @param areaState 状态：1开启，2关闭
     */
    public void setAreaState(Byte areaState) {
        this.areaState = areaState;
    }

    /**
     * 馆区logo
     * @return area_logo 馆区logo
     */
    public String getAreaLogo() {
        return areaLogo;
    }

    /**
     * 馆区logo
     * @param areaLogo 馆区logo
     */
    public void setAreaLogo(String areaLogo) {
        this.areaLogo = areaLogo == null ? null : areaLogo.trim();
    }

    /**
     * 馆区简介
     * @return area_des 馆区简介
     */
    public String getAreaDes() {
        return areaDes;
    }

    /**
     * 馆区简介
     * @param areaDes 馆区简介
     */
    public void setAreaDes(String areaDes) {
        this.areaDes = areaDes == null ? null : areaDes.trim();
    }

    /**
     * 馆区排序，0前台不展示该馆区
     * @return area_sort 馆区排序，0前台不展示该馆区
     */
    public Integer getAreaSort() {
        return areaSort;
    }

    /**
     * 馆区排序，0前台不展示该馆区
     * @param areaSort 馆区排序，0前台不展示该馆区
     */
    public void setAreaSort(Integer areaSort) {
        this.areaSort = areaSort;
    }
}