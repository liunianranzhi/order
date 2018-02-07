package com.shanyuan.platform.ms.dao.user.entity;

/**
 * 描述:sy_voucher_area表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-16
 */
public class SyVoucherArea {
    /**
     * šłĽťĒģID
     */
    private Integer recId;

    /**
     * śīĽŚä®ID
     */
    private Integer activityId;

    /**
     * ŚēÜŚďĀśČÄŚú®ŚéŅID
     */
    private Long areaId;

    /**
     * šłĽťĒģID
     * @return rec_id šłĽťĒģID
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * šłĽťĒģID
     * @param recId šłĽťĒģID
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    /**
     * śīĽŚä®ID
     * @return activity_id śīĽŚä®ID
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * śīĽŚä®ID
     * @param activityId śīĽŚä®ID
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * ŚēÜŚďĀśČÄŚú®ŚéŅID
     * @return area_id ŚēÜŚďĀśČÄŚú®ŚéŅID
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * ŚēÜŚďĀśČÄŚú®ŚéŅID
     * @param areaId ŚēÜŚďĀśČÄŚú®ŚéŅID
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }
}