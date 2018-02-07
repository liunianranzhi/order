package com.shanyuan.platform.ms.dao.statistics.entity;

import java.math.BigDecimal;

/**
 * 描述:poverty_alleviation_overview表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2018-01-06
 */
public class PovertyAlleviationOverview {
    /**
     * 
     */
    private Integer recId;

    /**
     * 统计时间
     */
    private Integer cTime;

    /**
     * 联盟id
     */
    private Integer unionId;

    /**
     * 联盟名称
     */
    private String unionName;

    /**
     * 联盟标识
     */
    private String channel;

    /**
     * 省id
     */
    private Long provinceId;

    /**
     * 省名称
     */
    private String provinceName;

    /**
     * 市id
     */
    private Long cityId;

    /**
     * 市名称
     */
    private String cityName;

    /**
     * 县id
     */
    private Long countryId;

    /**
     * 县名称
     */
    private String countryName;

    /**
     * 乡id
     */
    private Long townshipId;

    /**
     * 乡名称
     */
    private String townshipName;

    /**
     * 村id
     */
    private Long villageId;

    /**
     * 村名称
     */
    private String villageName;

    /**
     * 公益捐赠总额单位分
     */
    private BigDecimal donateAmount;

    /**
     * 帮扶总额单位分
     */
    private BigDecimal helpAmount;

    /**
     * 公益基金单位分
     */
    private BigDecimal fundAmount;

    /**
     * 
     * @return rec_id 
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 
     * @param recId 
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    /**
     * 统计时间
     * @return c_time 统计时间
     */
    public Integer getcTime() {
        return cTime;
    }

    /**
     * 统计时间
     * @param cTime 统计时间
     */
    public void setcTime(Integer cTime) {
        this.cTime = cTime;
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
     * 联盟名称
     * @return union_name 联盟名称
     */
    public String getUnionName() {
        return unionName;
    }

    /**
     * 联盟名称
     * @param unionName 联盟名称
     */
    public void setUnionName(String unionName) {
        this.unionName = unionName == null ? null : unionName.trim();
    }

    /**
     * 联盟标识
     * @return channel 联盟标识
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 联盟标识
     * @param channel 联盟标识
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * 省id
     * @return province_id 省id
     */
    public Long getProvinceId() {
        return provinceId;
    }

    /**
     * 省id
     * @param provinceId 省id
     */
    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * 省名称
     * @return province_name 省名称
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * 省名称
     * @param provinceName 省名称
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    /**
     * 市id
     * @return city_id 市id
     */
    public Long getCityId() {
        return cityId;
    }

    /**
     * 市id
     * @param cityId 市id
     */
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    /**
     * 市名称
     * @return city_name 市名称
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 市名称
     * @param cityName 市名称
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * 县id
     * @return country_id 县id
     */
    public Long getCountryId() {
        return countryId;
    }

    /**
     * 县id
     * @param countryId 县id
     */
    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    /**
     * 县名称
     * @return country_name 县名称
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 县名称
     * @param countryName 县名称
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName == null ? null : countryName.trim();
    }

    /**
     * 乡id
     * @return township_id 乡id
     */
    public Long getTownshipId() {
        return townshipId;
    }

    /**
     * 乡id
     * @param townshipId 乡id
     */
    public void setTownshipId(Long townshipId) {
        this.townshipId = townshipId;
    }

    /**
     * 乡名称
     * @return township_name 乡名称
     */
    public String getTownshipName() {
        return townshipName;
    }

    /**
     * 乡名称
     * @param townshipName 乡名称
     */
    public void setTownshipName(String townshipName) {
        this.townshipName = townshipName == null ? null : townshipName.trim();
    }

    /**
     * 村id
     * @return village_id 村id
     */
    public Long getVillageId() {
        return villageId;
    }

    /**
     * 村id
     * @param villageId 村id
     */
    public void setVillageId(Long villageId) {
        this.villageId = villageId;
    }

    /**
     * 村名称
     * @return village_name 村名称
     */
    public String getVillageName() {
        return villageName;
    }

    /**
     * 村名称
     * @param villageName 村名称
     */
    public void setVillageName(String villageName) {
        this.villageName = villageName == null ? null : villageName.trim();
    }

    /**
     * 公益捐赠总额单位分
     * @return donate_amount 公益捐赠总额单位分
     */
    public BigDecimal getDonateAmount() {
        return donateAmount;
    }

    /**
     * 公益捐赠总额单位分
     * @param donateAmount 公益捐赠总额单位分
     */
    public void setDonateAmount(BigDecimal donateAmount) {
        this.donateAmount = donateAmount;
    }

    /**
     * 帮扶总额单位分
     * @return help_amount 帮扶总额单位分
     */
    public BigDecimal getHelpAmount() {
        return helpAmount;
    }

    /**
     * 帮扶总额单位分
     * @param helpAmount 帮扶总额单位分
     */
    public void setHelpAmount(BigDecimal helpAmount) {
        this.helpAmount = helpAmount;
    }

    /**
     * 公益基金单位分
     * @return fund_amount 公益基金单位分
     */
    public BigDecimal getFundAmount() {
        return fundAmount;
    }

    /**
     * 公益基金单位分
     * @param fundAmount 公益基金单位分
     */
    public void setFundAmount(BigDecimal fundAmount) {
        this.fundAmount = fundAmount;
    }
}