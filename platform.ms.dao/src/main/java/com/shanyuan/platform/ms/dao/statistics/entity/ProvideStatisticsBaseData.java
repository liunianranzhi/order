package com.shanyuan.platform.ms.dao.statistics.entity;

import java.math.BigDecimal;

/**
 * 描述:provide_statistics_base_data表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2018-01-09
 */
public class ProvideStatisticsBaseData {
    /**
     * 主键
     */
    private Integer recId;

    /**
     * 统计日期
     */
    private Integer cTime;

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
     * 村名称
     */
    private Long villageId;

    /**
     * 村名称
     */
    private String villageName;

    /**
     * 助理人销售总额（大爱）
     */
    private BigDecimal assistSellDa;

    /**
     * 助理人销售总额（甄选）
     */
    private BigDecimal assistSellZx;

    /**
     * 助理人帮扶总额（大爱）
     */
    private BigDecimal assistBuyDa;

    /**
     * 助理人帮扶总额（甄选）
     */
    private BigDecimal assistBuyZx;

    /**
     * 助理人总数
     */
    private Integer assistTotalNum;

    /**
     * 自营贫困户在线户数
     */
    private Integer selfEmpPoorTotalFamily;

    /**
     * 贫困户户数
     */
    private Integer poorTotalFamily;

    /**
     * 贫困户人数
     */
    private Integer poorTotalNum;

    /**
     * 助理人总产品
     */
    private Long assistGoodsTotalNum;

    /**
     * 贫困户自营总产品
     */
    private Long poorGoodsTotalNum;

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
     * 统计日期
     * @return c_time 统计日期
     */
    public Integer getcTime() {
        return cTime;
    }

    /**
     * 统计日期
     * @param cTime 统计日期
     */
    public void setcTime(Integer cTime) {
        this.cTime = cTime;
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
     * 村名称
     * @return village_id 村名称
     */
    public Long getVillageId() {
        return villageId;
    }

    /**
     * 村名称
     * @param villageId 村名称
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
     * 助理人销售总额（大爱）
     * @return assist_sell_da 助理人销售总额（大爱）
     */
    public BigDecimal getAssistSellDa() {
        return assistSellDa;
    }

    /**
     * 助理人销售总额（大爱）
     * @param assistSellDa 助理人销售总额（大爱）
     */
    public void setAssistSellDa(BigDecimal assistSellDa) {
        this.assistSellDa = assistSellDa;
    }

    /**
     * 助理人销售总额（甄选）
     * @return assist_sell_zx 助理人销售总额（甄选）
     */
    public BigDecimal getAssistSellZx() {
        return assistSellZx;
    }

    /**
     * 助理人销售总额（甄选）
     * @param assistSellZx 助理人销售总额（甄选）
     */
    public void setAssistSellZx(BigDecimal assistSellZx) {
        this.assistSellZx = assistSellZx;
    }

    /**
     * 助理人帮扶总额（大爱）
     * @return assist_buy_da 助理人帮扶总额（大爱）
     */
    public BigDecimal getAssistBuyDa() {
        return assistBuyDa;
    }

    /**
     * 助理人帮扶总额（大爱）
     * @param assistBuyDa 助理人帮扶总额（大爱）
     */
    public void setAssistBuyDa(BigDecimal assistBuyDa) {
        this.assistBuyDa = assistBuyDa;
    }

    /**
     * 助理人帮扶总额（甄选）
     * @return assist_buy_zx 助理人帮扶总额（甄选）
     */
    public BigDecimal getAssistBuyZx() {
        return assistBuyZx;
    }

    /**
     * 助理人帮扶总额（甄选）
     * @param assistBuyZx 助理人帮扶总额（甄选）
     */
    public void setAssistBuyZx(BigDecimal assistBuyZx) {
        this.assistBuyZx = assistBuyZx;
    }

    /**
     * 助理人总数
     * @return assist_total_num 助理人总数
     */
    public Integer getAssistTotalNum() {
        return assistTotalNum;
    }

    /**
     * 助理人总数
     * @param assistTotalNum 助理人总数
     */
    public void setAssistTotalNum(Integer assistTotalNum) {
        this.assistTotalNum = assistTotalNum;
    }

    /**
     * 自营贫困户在线户数
     * @return self_emp_poor_total_family 自营贫困户在线户数
     */
    public Integer getSelfEmpPoorTotalFamily() {
        return selfEmpPoorTotalFamily;
    }

    /**
     * 自营贫困户在线户数
     * @param selfEmpPoorTotalFamily 自营贫困户在线户数
     */
    public void setSelfEmpPoorTotalFamily(Integer selfEmpPoorTotalFamily) {
        this.selfEmpPoorTotalFamily = selfEmpPoorTotalFamily;
    }

    /**
     * 贫困户户数
     * @return poor_total_family 贫困户户数
     */
    public Integer getPoorTotalFamily() {
        return poorTotalFamily;
    }

    /**
     * 贫困户户数
     * @param poorTotalFamily 贫困户户数
     */
    public void setPoorTotalFamily(Integer poorTotalFamily) {
        this.poorTotalFamily = poorTotalFamily;
    }

    /**
     * 贫困户人数
     * @return poor_total_num 贫困户人数
     */
    public Integer getPoorTotalNum() {
        return poorTotalNum;
    }

    /**
     * 贫困户人数
     * @param poorTotalNum 贫困户人数
     */
    public void setPoorTotalNum(Integer poorTotalNum) {
        this.poorTotalNum = poorTotalNum;
    }

    /**
     * 助理人总产品
     * @return assist_goods_total_num 助理人总产品
     */
    public Long getAssistGoodsTotalNum() {
        return assistGoodsTotalNum;
    }

    /**
     * 助理人总产品
     * @param assistGoodsTotalNum 助理人总产品
     */
    public void setAssistGoodsTotalNum(Long assistGoodsTotalNum) {
        this.assistGoodsTotalNum = assistGoodsTotalNum;
    }

    /**
     * 贫困户自营总产品
     * @return poor_goods_total_num 贫困户自营总产品
     */
    public Long getPoorGoodsTotalNum() {
        return poorGoodsTotalNum;
    }

    /**
     * 贫困户自营总产品
     * @param poorGoodsTotalNum 贫困户自营总产品
     */
    public void setPoorGoodsTotalNum(Long poorGoodsTotalNum) {
        this.poorGoodsTotalNum = poorGoodsTotalNum;
    }

	public ProvideStatisticsBaseData(Integer cTime, Long provinceId, String provinceName, Long cityId, String cityName,
			Long countryId, String countryName, Long townshipId, String townshipName, Long villageId,
			String villageName, BigDecimal assistSellDa, BigDecimal assistSellZx, BigDecimal assistBuyDa,
			BigDecimal assistBuyZx, Integer assistTotalNum, Integer selfEmpPoorTotalFamily, Integer poorTotalFamily,
			Integer poorTotalNum, Long assistGoodsTotalNum, Long poorGoodsTotalNum) {
		super();
		this.cTime = cTime;
		this.provinceId = provinceId;
		this.provinceName = provinceName;
		this.cityId = cityId;
		this.cityName = cityName;
		this.countryId = countryId;
		this.countryName = countryName;
		this.townshipId = townshipId;
		this.townshipName = townshipName;
		this.villageId = villageId;
		this.villageName = villageName;
		this.assistSellDa = assistSellDa;
		this.assistSellZx = assistSellZx;
		this.assistBuyDa = assistBuyDa;
		this.assistBuyZx = assistBuyZx;
		this.assistTotalNum = assistTotalNum;
		this.selfEmpPoorTotalFamily = selfEmpPoorTotalFamily;
		this.poorTotalFamily = poorTotalFamily;
		this.poorTotalNum = poorTotalNum;
		this.assistGoodsTotalNum = assistGoodsTotalNum;
		this.poorGoodsTotalNum = poorGoodsTotalNum;
	}

	public ProvideStatisticsBaseData() {
		super();
	}
    
    
}