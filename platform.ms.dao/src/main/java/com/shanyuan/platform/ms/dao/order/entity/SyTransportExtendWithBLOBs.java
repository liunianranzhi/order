package com.shanyuan.platform.ms.dao.order.entity;

public class SyTransportExtendWithBLOBs extends SyTransportExtend {
    /**
     * 市级地区ID组成的串，以，隔开，两端也有，
     */
    private String areaId;

    /**
     * 省级地区ID组成的串，以，隔开，两端也有，
     */
    private String topAreaId;

    /**
     * 地区name组成的串，以，隔开
     */
    private String areaName;

    /**
     * 市级地区ID组成的串，以，隔开，两端也有，
     * @return area_id 市级地区ID组成的串，以，隔开，两端也有，
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * 市级地区ID组成的串，以，隔开，两端也有，
     * @param areaId 市级地区ID组成的串，以，隔开，两端也有，
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    /**
     * 省级地区ID组成的串，以，隔开，两端也有，
     * @return top_area_id 省级地区ID组成的串，以，隔开，两端也有，
     */
    public String getTopAreaId() {
        return topAreaId;
    }

    /**
     * 省级地区ID组成的串，以，隔开，两端也有，
     * @param topAreaId 省级地区ID组成的串，以，隔开，两端也有，
     */
    public void setTopAreaId(String topAreaId) {
        this.topAreaId = topAreaId == null ? null : topAreaId.trim();
    }

    /**
     * 地区name组成的串，以，隔开
     * @return area_name 地区name组成的串，以，隔开
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 地区name组成的串，以，隔开
     * @param areaName 地区name组成的串，以，隔开
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }
}