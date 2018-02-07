package com.shanyuan.platform.ms.dao.statistics.entity;

import java.math.BigDecimal;

/**
 * 描述:order_statistics_offline_biz_order_goods表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2018-01-04
 */
public class OrderStatisticsOfflineBizOrderGoods {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 集采订单id
     */
    private Integer mainOrderId;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 商品数量
     */
    private Integer goodsNum;

    /**
     * 
     */
    private BigDecimal goodsPrice;

    /**
     * 助理人id
     */
    private Integer assistId;

    /**
     * 集采监管人id
     */
    private Integer pubisherId;

    /**
     * 助理人部门id
     */
    private Integer sCircleIdDeep1;

    /**
     * 
     */
    private Integer sCircleIdDeep2;

    /**
     * 
     */
    private Integer sCircleIdDeep3;

    /**
     * 
     */
    private Integer sCircleIdDeep4;

    /**
     * 
     */
    private Integer sCircleIdDeep5;

    /**
     * 
     */
    private Integer sCircleIdDeep6;

    /**
     * 
     */
    private Integer sCircleIdDeep7;

    /**
     * 卖家部门名称 拼接方式circle1,circle2,circle3...
     */
    private String sCircleName;

    /**
     * 省id
     */
    private Long provinceId;

    /**
     * 省名称
     */
    private String privinceName;

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
     * 
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
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 集采订单id
     * @return main_order_id 集采订单id
     */
    public Integer getMainOrderId() {
        return mainOrderId;
    }

    /**
     * 集采订单id
     * @param mainOrderId 集采订单id
     */
    public void setMainOrderId(Integer mainOrderId) {
        this.mainOrderId = mainOrderId;
    }

    /**
     * 商品id
     * @return goods_id 商品id
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 商品id
     * @param goodsId 商品id
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 商品数量
     * @return goods_num 商品数量
     */
    public Integer getGoodsNum() {
        return goodsNum;
    }

    /**
     * 商品数量
     * @param goodsNum 商品数量
     */
    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    /**
     * 
     * @return goods_price 
     */
    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    /**
     * 
     * @param goodsPrice 
     */
    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /**
     * 助理人id
     * @return assist_id 助理人id
     */
    public Integer getAssistId() {
        return assistId;
    }

    /**
     * 助理人id
     * @param assistId 助理人id
     */
    public void setAssistId(Integer assistId) {
        this.assistId = assistId;
    }

    /**
     * 集采监管人id
     * @return pubisher_id 集采监管人id
     */
    public Integer getPubisherId() {
        return pubisherId;
    }

    /**
     * 集采监管人id
     * @param pubisherId 集采监管人id
     */
    public void setPubisherId(Integer pubisherId) {
        this.pubisherId = pubisherId;
    }

    /**
     * 助理人部门id
     * @return s_circle_id_deep_1 助理人部门id
     */
    public Integer getsCircleIdDeep1() {
        return sCircleIdDeep1;
    }

    /**
     * 助理人部门id
     * @param sCircleIdDeep1 助理人部门id
     */
    public void setsCircleIdDeep1(Integer sCircleIdDeep1) {
        this.sCircleIdDeep1 = sCircleIdDeep1;
    }

    /**
     * 
     * @return s_circle_id_deep_2 
     */
    public Integer getsCircleIdDeep2() {
        return sCircleIdDeep2;
    }

    /**
     * 
     * @param sCircleIdDeep2 
     */
    public void setsCircleIdDeep2(Integer sCircleIdDeep2) {
        this.sCircleIdDeep2 = sCircleIdDeep2;
    }

    /**
     * 
     * @return s_circle_id_deep_3 
     */
    public Integer getsCircleIdDeep3() {
        return sCircleIdDeep3;
    }

    /**
     * 
     * @param sCircleIdDeep3 
     */
    public void setsCircleIdDeep3(Integer sCircleIdDeep3) {
        this.sCircleIdDeep3 = sCircleIdDeep3;
    }

    /**
     * 
     * @return s_circle_id_deep_4 
     */
    public Integer getsCircleIdDeep4() {
        return sCircleIdDeep4;
    }

    /**
     * 
     * @param sCircleIdDeep4 
     */
    public void setsCircleIdDeep4(Integer sCircleIdDeep4) {
        this.sCircleIdDeep4 = sCircleIdDeep4;
    }

    /**
     * 
     * @return s_circle_id_deep_5 
     */
    public Integer getsCircleIdDeep5() {
        return sCircleIdDeep5;
    }

    /**
     * 
     * @param sCircleIdDeep5 
     */
    public void setsCircleIdDeep5(Integer sCircleIdDeep5) {
        this.sCircleIdDeep5 = sCircleIdDeep5;
    }

    /**
     * 
     * @return s_circle_id_deep_6 
     */
    public Integer getsCircleIdDeep6() {
        return sCircleIdDeep6;
    }

    /**
     * 
     * @param sCircleIdDeep6 
     */
    public void setsCircleIdDeep6(Integer sCircleIdDeep6) {
        this.sCircleIdDeep6 = sCircleIdDeep6;
    }

    /**
     * 
     * @return s_circle_id_deep_7 
     */
    public Integer getsCircleIdDeep7() {
        return sCircleIdDeep7;
    }

    /**
     * 
     * @param sCircleIdDeep7 
     */
    public void setsCircleIdDeep7(Integer sCircleIdDeep7) {
        this.sCircleIdDeep7 = sCircleIdDeep7;
    }

    /**
     * 卖家部门名称 拼接方式circle1,circle2,circle3...
     * @return s_circle_name 卖家部门名称 拼接方式circle1,circle2,circle3...
     */
    public String getsCircleName() {
        return sCircleName;
    }

    /**
     * 卖家部门名称 拼接方式circle1,circle2,circle3...
     * @param sCircleName 卖家部门名称 拼接方式circle1,circle2,circle3...
     */
    public void setsCircleName(String sCircleName) {
        this.sCircleName = sCircleName == null ? null : sCircleName.trim();
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
     * @return privince_name 省名称
     */
    public String getPrivinceName() {
        return privinceName;
    }

    /**
     * 省名称
     * @param privinceName 省名称
     */
    public void setPrivinceName(String privinceName) {
        this.privinceName = privinceName == null ? null : privinceName.trim();
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
     * 
     * @return township_id 
     */
    public Long getTownshipId() {
        return townshipId;
    }

    /**
     * 
     * @param townshipId 
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
}