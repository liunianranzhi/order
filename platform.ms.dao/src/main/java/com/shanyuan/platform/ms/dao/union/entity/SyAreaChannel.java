package com.shanyuan.platform.ms.dao.union.entity;

/**
 * 描述:sy_area_channel表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2017-11-08
 */
public class SyAreaChannel {
    /**
     * 本表主键
     */
    private Integer acId;

    /**
     * 联盟id
     */
    private Integer unionId;

    /**
     * 渠道
     */
    private String unionChannel;

    /**
     * 地区id
     */
    private Long areaId;

    /**
     * 地区名称
     */
    private String areaName;

    /**
     * 添加时间
     */
    private Integer addTime;

    /**
     * 1供给侧,2帮扶侧
     */
    private Byte type;

    /**
     * 特产馆名称
     */
    private String specialtyStore;

    /**
     * 特产馆权重
     */
    private Short storeScore;

    /**
     * 本表主键
     * @return ac_id 本表主键
     */
    public Integer getAcId() {
        return acId;
    }

    /**
     * 本表主键
     * @param acId 本表主键
     */
    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    /**
     * 联盟id
     * @return union_id 联盟id
     */
    public Integer getUnionId() {
        return unionId;
    }

    /**
     * 联盟id
     * @param unionId 联盟id
     */
    public void setUnionId(Integer unionId) {
        this.unionId = unionId;
    }

    /**
     * 渠道
     * @return union_channel 渠道
     */
    public String getUnionChannel() {
        return unionChannel;
    }

    /**
     * 渠道
     * @param unionChannel 渠道
     */
    public void setUnionChannel(String unionChannel) {
        this.unionChannel = unionChannel == null ? null : unionChannel.trim();
    }

    /**
     * 地区id
     * @return area_id 地区id
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * 地区id
     * @param areaId 地区id
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    /**
     * 地区名称
     * @return area_name 地区名称
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 地区名称
     * @param areaName 地区名称
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
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

    /**
     * 1供给侧,2帮扶侧
     * @return type 1供给侧,2帮扶侧
     */
    public Byte getType() {
        return type;
    }

    /**
     * 1供给侧,2帮扶侧
     * @param type 1供给侧,2帮扶侧
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 特产馆名称
     * @return specialty_store 特产馆名称
     */
    public String getSpecialtyStore() {
        return specialtyStore;
    }

    /**
     * 特产馆名称
     * @param specialtyStore 特产馆名称
     */
    public void setSpecialtyStore(String specialtyStore) {
        this.specialtyStore = specialtyStore == null ? null : specialtyStore.trim();
    }

    /**
     * 特产馆权重
     * @return store_score 特产馆权重
     */
    public Short getStoreScore() {
        return storeScore;
    }

    /**
     * 特产馆权重
     * @param storeScore 特产馆权重
     */
    public void setStoreScore(Short storeScore) {
        this.storeScore = storeScore;
    }
}