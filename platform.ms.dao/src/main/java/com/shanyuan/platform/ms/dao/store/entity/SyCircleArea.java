package com.shanyuan.platform.ms.dao.store.entity;

/**
 * 描述:sy_circle_area表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-11-02
 */
public class SyCircleArea {
    /**
     * 主键
     */
    private Integer recId;

    /**
     * 部门id
     */
    private Integer circleId;

    /**
     * 逗号分隔的区域id
     */
    private String areaIdStr;

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
     * 部门id
     * @return circle_id 部门id
     */
    public Integer getCircleId() {
        return circleId;
    }

    /**
     * 部门id
     * @param circleId 部门id
     */
    public void setCircleId(Integer circleId) {
        this.circleId = circleId;
    }

    /**
     * 逗号分隔的区域id
     * @return area_id_str 逗号分隔的区域id
     */
    public String getAreaIdStr() {
        return areaIdStr;
    }

    /**
     * 逗号分隔的区域id
     * @param areaIdStr 逗号分隔的区域id
     */
    public void setAreaIdStr(String areaIdStr) {
        this.areaIdStr = areaIdStr == null ? null : areaIdStr.trim();
    }
}