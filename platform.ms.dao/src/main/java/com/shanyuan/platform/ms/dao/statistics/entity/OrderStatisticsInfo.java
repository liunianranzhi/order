package com.shanyuan.platform.ms.dao.statistics.entity;

import java.math.BigDecimal;

/**
 * 描述:order_statistics_base_data表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2018-01-08
 */
public class OrderStatisticsInfo {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 完成时间
     */
    private Integer finishedTime;

    /**
     * 订单总金额
     */
    private BigDecimal orderAmount;

    /**
     * 商品总金额
     */
    private BigDecimal goodsAmount;

    /**
     * 预存款支付金额
     */
    private BigDecimal pdAmount;

    /**
     * 订单来源1 WEB 2 mobile
     */
    private String orderFrom;

    /**
     * 买家部门id
     */
    private Integer circleIdDeep1;

    /**
     * 
     */
    private Integer circleIdDeep2;

    /**
     * 
     */
    private Integer circleIdDeep3;

    /**
     * 
     */
    private Integer circleIdDeep4;

    /**
     * 
     */
    private Integer circleIdDeep5;

    /**
     * 
     */
    private Integer circleIdDeep6;

    /**
     * 
     */
    private Integer circleIdDeep7;

    /**
     * 买家部门名称，拼接方式为circle1,circle2,circle3...
     */
    private String circleName;

    /**
     * 卖家联盟id
     */
    private Integer sUnionId;

    /**
     * 卖家联盟名称
     */
    private String sUnionName;

    /**
     * 卖家联盟
     */
    private String sChannel;

    /**
     * 卖家部门id
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
     * 卖家部门名称，拼接方式为circle1,circle2,circle3...
     */
    private String sCircleName;

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
     * 乡镇id
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
     * 产地省id
     */
    private Long pProvinceId;

    /**
     * 产地省名称
     */
    private String pProvinceName;

    /**
     * 产地市id
     */
    private Long pCityId;

    /**
     * 产地市名称
     */
    private String pCityName;

    /**
     * 产地县id
     */
    private Long pCountryId;

    /**
     * 产地县名称
     */
    private String pCountryName;

    /**
     * 产地乡id
     */
    private Long pTownshipId;

    /**
     * 
     */
    private String pTownshipName;

    /**
     * 产地村id
     */
    private Long pVillageId;

    /**
     * 产地村名称
     */
    private String pVillageName;

    /**
     * 帮扶金额
     */
    private BigDecimal helpPrice;

    /**
     * 卖家id
     */
    private Integer sellerId;

    /**
     * 卖家名称
     */
    private String sellerName;

    /**
     * 卖家类型 1：贫困户 2：助理人 3：线上集采 4：线下集采 5：善源商场 6：大爱超市
     */
    private Integer sellerType;

    /**
     * 店铺id
     */
    private Integer storeId;

    /**
     * 买家id
     */
    private Integer buyerId;

    /**
     * 买家名称
     */
    private String buyerName;

    /**
     * 商品num
     */
    private Integer goodsNum;

    /**
     * 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)
     */
    private Integer goodsProjectType;

    /**
     * 该订单获取到的公益币
     */
    private Long syPoints;

    /**
     * 买家联盟id
     */
    private Integer unionId;

    /**
     * 买家联盟名称
     */
    private String unionName;

    /**
     * 渠道标识
     */
    private String channel;

    /**
     * 购物劵支付金额单位分
     */
    private BigDecimal couponPay;

    /**
     * 实际支付金额单位分
     */
    private BigDecimal moneyPay;

    /**
     * 助理人id
     */
    private Integer assistId;

    /**
     * app渠道标识,默认空
     */
    private String appVariant;

    /**
     * 定点扶贫县的id
     */
    private Long supportCountyId;

    /**
     * 满减总金额单位分
     */
    private BigDecimal discountAmount;

    /**
     * 集采运营中心id
     */
    private Integer bizOperationMid;

    /**
     * 满减总金额单位分(平台承担)
     */
    private BigDecimal platformPay;

    /**
     * 总汇率，实际比例为该值除以1000
     */
    private Short serviceFeeRate;

    /**
     * 平台管理费
     */
    private BigDecimal serviceFee;

    /**
     * 代理人代理费
     */
    private BigDecimal agentFee;

    /**
     * 基金会费用的比例，实际比例为该值除以1000
     */
    private Short fundFeeRate;

    /**
     * 基金会收取的费用
     */
    private BigDecimal fundFee;

    /**
     * 创建时间
     */
    private Integer cTime;

    private String tableName;
    
    private String sUnionChannel;
    
    
    public String getsUnionChannel() {
		return sUnionChannel;
    }

	public Integer getSCircleIdDeep1() {
		return sCircleIdDeep1;
	}

	public void setsUnionChannel(String sUnionChannel) {
		this.sUnionChannel = sUnionChannel;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

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
     * 订单id
     * @return order_id 订单id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 订单id
     * @param orderId 订单id
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 完成时间
     * @return finished_time 完成时间
     */
    public Integer getFinishedTime() {
        return finishedTime;
    }

    /**
     * 完成时间
     * @param finishedTime 完成时间
     */
    public void setFinishedTime(Integer finishedTime) {
        this.finishedTime = finishedTime;
    }

    /**
     * 订单总金额
     * @return order_amount 订单总金额
     */
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    /**
     * 订单总金额
     * @param orderAmount 订单总金额
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * 商品总金额
     * @return goods_amount 商品总金额
     */
    public BigDecimal getGoodsAmount() {
        return goodsAmount;
    }

    /**
     * 商品总金额
     * @param goodsAmount 商品总金额
     */
    public void setGoodsAmount(BigDecimal goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    /**
     * 预存款支付金额
     * @return pd_amount 预存款支付金额
     */
    public BigDecimal getPdAmount() {
        return pdAmount;
    }

    /**
     * 预存款支付金额
     * @param pdAmount 预存款支付金额
     */
    public void setPdAmount(BigDecimal pdAmount) {
        this.pdAmount = pdAmount;
    }

    /**
     * 订单来源1 WEB 2 mobile
     * @return order_from 订单来源1 WEB 2 mobile
     */
    public String getOrderFrom() {
        return orderFrom;
    }

    /**
     * 订单来源1 WEB 2 mobile
     * @param orderFrom 订单来源1 WEB 2 mobile
     */
    public void setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom == null ? null : orderFrom.trim();
    }

    /**
     * 买家部门id
     * @return circle_id_deep_1 买家部门id
     */
    public Integer getCircleIdDeep1() {
        return circleIdDeep1;
    }

    /**
     * 买家部门id
     * @param circleIdDeep1 买家部门id
     */
    public void setCircleIdDeep1(Integer circleIdDeep1) {
        this.circleIdDeep1 = circleIdDeep1;
    }

    /**
     * 
     * @return circle_id_deep_2 
     */
    public Integer getCircleIdDeep2() {
        return circleIdDeep2;
    }

    /**
     * 
     * @param circleIdDeep2 
     */
    public void setCircleIdDeep2(Integer circleIdDeep2) {
        this.circleIdDeep2 = circleIdDeep2;
    }

    /**
     * 
     * @return circle_id_deep_3 
     */
    public Integer getCircleIdDeep3() {
        return circleIdDeep3;
    }

    /**
     * 
     * @param circleIdDeep3 
     */
    public void setCircleIdDeep3(Integer circleIdDeep3) {
        this.circleIdDeep3 = circleIdDeep3;
    }

    /**
     * 
     * @return circle_id_deep_4 
     */
    public Integer getCircleIdDeep4() {
        return circleIdDeep4;
    }

    /**
     * 
     * @param circleIdDeep4 
     */
    public void setCircleIdDeep4(Integer circleIdDeep4) {
        this.circleIdDeep4 = circleIdDeep4;
    }

    /**
     * 
     * @return circle_id_deep_5 
     */
    public Integer getCircleIdDeep5() {
        return circleIdDeep5;
    }

    /**
     * 
     * @param circleIdDeep5 
     */
    public void setCircleIdDeep5(Integer circleIdDeep5) {
        this.circleIdDeep5 = circleIdDeep5;
    }

    /**
     * 
     * @return circle_id_deep_6 
     */
    public Integer getCircleIdDeep6() {
        return circleIdDeep6;
    }

    /**
     * 
     * @param circleIdDeep6 
     */
    public void setCircleIdDeep6(Integer circleIdDeep6) {
        this.circleIdDeep6 = circleIdDeep6;
    }

    /**
     * 
     * @return circle_id_deep_7 
     */
    public Integer getCircleIdDeep7() {
        return circleIdDeep7;
    }

    /**
     * 
     * @param circleIdDeep7 
     */
    public void setCircleIdDeep7(Integer circleIdDeep7) {
        this.circleIdDeep7 = circleIdDeep7;
    }

    /**
     * 买家部门名称，拼接方式为circle1,circle2,circle3...
     * @return circle_name 买家部门名称，拼接方式为circle1,circle2,circle3...
     */
    public String getCircleName() {
        return circleName;
    }

    /**
     * 买家部门名称，拼接方式为circle1,circle2,circle3...
     * @param circleName 买家部门名称，拼接方式为circle1,circle2,circle3...
     */
    public void setCircleName(String circleName) {
        this.circleName = circleName == null ? null : circleName.trim();
    }

    /**
     * 卖家联盟id
     * @return s_union_id 卖家联盟id
     */
    public Integer getsUnionId() {
        return sUnionId;
    }

    /**
    public Integer getUnionId() {
		return unionId;
	}


	public void setUnionId(Integer unionId) {
		this.unionId = unionId;
	}

	/**
     * 卖家联盟id
     * @param sUnionId 卖家联盟id
     */
    public void setsUnionId(Integer sUnionId) {
        this.sUnionId = sUnionId;
    }

    /**
     * 卖家联盟名称
     * @return s_union_name 卖家联盟名称
     */
    public String getsUnionName() {
        return sUnionName;
    }

    /**
     * 卖家联盟名称
     * @param sUnionName 卖家联盟名称
     */
    public void setsUnionName(String sUnionName) {
        this.sUnionName = sUnionName == null ? null : sUnionName.trim();
    }

    /**
     * 卖家联盟
     * @return s_channel 卖家联盟
     */
    public String getsChannel() {
        return sChannel;
    }

    /**
     * 卖家联盟
     * @param sChannel 卖家联盟
     */
    public void setsChannel(String sChannel) {
        this.sChannel = sChannel == null ? null : sChannel.trim();
    }

    /**
     * 卖家部门id
     * @return s_circle_id_deep_1 卖家部门id
     */
    public Integer getsCircleIdDeep1() {
        return sCircleIdDeep1;
    }

    /**
     * 卖家部门id
     * @param sCircleIdDeep1 卖家部门id
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
     * 卖家部门名称，拼接方式为circle1,circle2,circle3...
     * @return s_circle_name 卖家部门名称，拼接方式为circle1,circle2,circle3...
     */
    public String getsCircleName() {
        return sCircleName;
    }

    /**
     * 卖家部门名称，拼接方式为circle1,circle2,circle3...
     * @param sCircleName 卖家部门名称，拼接方式为circle1,circle2,circle3...
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
     * 乡镇id
     * @return township_id 乡镇id
     */
    public Long getTownshipId() {
        return townshipId;
    }

    /**
     * 乡镇id
     * @param townshipId 乡镇id
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
     * 产地省id
     * @return p_province_id 产地省id
     */
    public Long getpProvinceId() {
        return pProvinceId;
    }

    /**
     * 产地省id
     * @param pProvinceId 产地省id
     */
    public void setpProvinceId(Long pProvinceId) {
        this.pProvinceId = pProvinceId;
    }

    /**
     * 产地省名称
     * @return p_province_name 产地省名称
     */
    public String getpProvinceName() {
        return pProvinceName;
    }

    /**
     * 产地省名称
     * @param pProvinceName 产地省名称
     */
    public void setpProvinceName(String pProvinceName) {
        this.pProvinceName = pProvinceName == null ? null : pProvinceName.trim();
    }

    /**
     * 产地市id
     * @return p_city_id 产地市id
     */
    public Long getpCityId() {
        return pCityId;
    }

    /**
     * 产地市id
     * @param pCityId 产地市id
     */
    public void setpCityId(Long pCityId) {
        this.pCityId = pCityId;
    }

    /**
     * 产地市名称
     * @return p_city_name 产地市名称
     */
    public String getpCityName() {
        return pCityName;
    }

    /**
     * 产地市名称
     * @param pCityName 产地市名称
     */
    public void setpCityName(String pCityName) {
        this.pCityName = pCityName == null ? null : pCityName.trim();
    }

    /**
     * 产地县id
     * @return p_country_id 产地县id
     */
    public Long getpCountryId() {
        return pCountryId;
    }

    /**
     * 产地县id
     * @param pCountryId 产地县id
     */
    public void setpCountryId(Long pCountryId) {
        this.pCountryId = pCountryId;
    }

    /**
     * 产地县名称
     * @return p_country_name 产地县名称
     */
    public String getpCountryName() {
        return pCountryName;
    }

    /**
     * 产地县名称
     * @param pCountryName 产地县名称
     */
    public void setpCountryName(String pCountryName) {
        this.pCountryName = pCountryName == null ? null : pCountryName.trim();
    }

    /**
     * 产地乡id
     * @return p_township_id 产地乡id
     */
    public Long getpTownshipId() {
        return pTownshipId;
    }

    /**
     * 产地乡id
     * @param pTownshipId 产地乡id
     */
    public void setpTownshipId(Long pTownshipId) {
        this.pTownshipId = pTownshipId;
    }

    /**
     * 
     * @return p_township_name 
     */
    public String getpTownshipName() {
        return pTownshipName;
    }

    /**
     * 
     * @param pTownshipName 
     */
    public void setpTownshipName(String pTownshipName) {
        this.pTownshipName = pTownshipName == null ? null : pTownshipName.trim();
    }

    /**
     * 产地村id
     * @return p_village_id 产地村id
     */
    public Long getpVillageId() {
        return pVillageId;
    }

    /**
     * 产地村id
     * @param pVillageId 产地村id
     */
    public void setpVillageId(Long pVillageId) {
        this.pVillageId = pVillageId;
    }

    /**
     * 产地村名称
     * @return p_village_name 产地村名称
     */
    public String getpVillageName() {
        return pVillageName;
    }

    /**
     * 产地村名称
     * @param pVillageName 产地村名称
     */
    public void setpVillageName(String pVillageName) {
        this.pVillageName = pVillageName == null ? null : pVillageName.trim();
    }

    /**
     * 帮扶金额
     * @return help_price 帮扶金额
     */
    public BigDecimal getHelpPrice() {
        return helpPrice;
    }

    /**
     * 帮扶金额
     * @param helpPrice 帮扶金额
     */
    public void setHelpPrice(BigDecimal helpPrice) {
        this.helpPrice = helpPrice;
    }

    /**
     * 卖家id
     * @return seller_id 卖家id
     */
    public Integer getSellerId() {
        return sellerId;
    }

    /**
     * 卖家id
     * @param sellerId 卖家id
     */
    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * 卖家名称
     * @return seller_name 卖家名称
     */
    public String getSellerName() {
        return sellerName;
    }

    /**
     * 卖家名称
     * @param sellerName 卖家名称
     */
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    /**
     * 卖家类型 1：贫困户 2：助理人 3：线上集采 4：线下集采 5：善源商场 6：大爱超市
     * @return seller_type 卖家类型 1：贫困户 2：助理人 3：线上集采 4：线下集采 5：善源商场 6：大爱超市
     */
    public Integer getSellerType() {
        return sellerType;
    }

    /**
     * 卖家类型 1：贫困户 2：助理人 3：线上集采 4：线下集采 5：善源商场 6：大爱超市
     * @param sellerType 卖家类型 1：贫困户 2：助理人 3：线上集采 4：线下集采 5：善源商场 6：大爱超市
     */
    public void setSellerType(Integer sellerType) {
        this.sellerType = sellerType;
    }

    /**
     * 店铺id
     * @return store_id 店铺id
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * 店铺id
     * @param storeId 店铺id
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * 买家id
     * @return buyer_id 买家id
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * 买家id
     * @param buyerId 买家id
     */
    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * 买家名称
     * @return buyer_name 买家名称
     */
    public String getBuyerName() {
        return buyerName;
    }

    /**
     * 买家名称
     * @param buyerName 买家名称
     */
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    /**
     * 商品num
     * @return goods_num 商品num
     */
    public Integer getGoodsNum() {
        return goodsNum;
    }

    /**
     * 商品num
     * @param goodsNum 商品num
     */
    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    /**
     * 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)
     * @return goods_project_type 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)
     */
    public Integer getGoodsProjectType() {
        return goodsProjectType;
    }

    /**
     * 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)
     * @param goodsProjectType 项目类型(1基金会捐物/2基金会捐款/3基金会活动/4个人实物/5个人时间/6个人技能/7个人空间)
     */
    public void setGoodsProjectType(Integer goodsProjectType) {
        this.goodsProjectType = goodsProjectType;
    }

    /**
     * 该订单获取到的公益币
     * @return sy_points 该订单获取到的公益币
     */
    public Long getSyPoints() {
        return syPoints;
    }

    /**
     * 该订单获取到的公益币
     * @param syPoints 该订单获取到的公益币
     */
    public void setSyPoints(Long syPoints) {
        this.syPoints = syPoints;
    }

    /**
     * 买家联盟id
     * @return union_id 买家联盟id
     */
    public Integer getUnionId() {
        return unionId;
    }

    /**
     * 买家联盟id
     * @param unionId 买家联盟id
     */
    public void setUnionId(Integer unionId) {
        this.unionId = unionId;
    }

    /**
     * 买家联盟名称
     * @return union_name 买家联盟名称
     */
    public String getUnionName() {
        return unionName;
    }

    /**
     * 买家联盟名称
     * @param unionName 买家联盟名称
     */
    public void setUnionName(String unionName) {
        this.unionName = unionName == null ? null : unionName.trim();
    }

    /**
     * 渠道标识
     * @return channel 渠道标识
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 渠道标识
     * @param channel 渠道标识
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * 购物劵支付金额单位分
     * @return coupon_pay 购物劵支付金额单位分
     */
    public BigDecimal getCouponPay() {
        return couponPay;
    }

    /**
     * 购物劵支付金额单位分
     * @param couponPay 购物劵支付金额单位分
     */
    public void setCouponPay(BigDecimal couponPay) {
        this.couponPay = couponPay;
    }

    /**
     * 实际支付金额单位分
     * @return money_pay 实际支付金额单位分
     */
    public BigDecimal getMoneyPay() {
        return moneyPay;
    }

    /**
     * 实际支付金额单位分
     * @param moneyPay 实际支付金额单位分
     */
    public void setMoneyPay(BigDecimal moneyPay) {
        this.moneyPay = moneyPay;
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
     * app渠道标识,默认空
     * @return app_variant app渠道标识,默认空
     */
    public String getAppVariant() {
        return appVariant;
    }

    /**
     * app渠道标识,默认空
     * @param appVariant app渠道标识,默认空
     */
    public void setAppVariant(String appVariant) {
        this.appVariant = appVariant == null ? null : appVariant.trim();
    }

    /**
     * 定点扶贫县的id
     * @return support_county_id 定点扶贫县的id
     */
    public Long getSupportCountyId() {
        return supportCountyId;
    }

    /**
     * 定点扶贫县的id
     * @param supportCountyId 定点扶贫县的id
     */
    public void setSupportCountyId(Long supportCountyId) {
        this.supportCountyId = supportCountyId;
    }

    /**
     * 满减总金额单位分
     * @return discount_amount 满减总金额单位分
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * 满减总金额单位分
     * @param discountAmount 满减总金额单位分
     */
    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * 集采运营中心id
     * @return biz_operation_mid 集采运营中心id
     */
    public Integer getBizOperationMid() {
        return bizOperationMid;
    }

    /**
     * 集采运营中心id
     * @param bizOperationMid 集采运营中心id
     */
    public void setBizOperationMid(Integer bizOperationMid) {
        this.bizOperationMid = bizOperationMid;
    }

    /**
     * 满减总金额单位分(平台承担)
     * @return platform_pay 满减总金额单位分(平台承担)
     */
    public BigDecimal getPlatformPay() {
        return platformPay;
    }

    /**
     * 满减总金额单位分(平台承担)
     * @param platformPay 满减总金额单位分(平台承担)
     */
    public void setPlatformPay(BigDecimal platformPay) {
        this.platformPay = platformPay;
    }

    /**
     * 总汇率，实际比例为该值除以1000
     * @return service_fee_rate 总汇率，实际比例为该值除以1000
     */
    public Short getServiceFeeRate() {
        return serviceFeeRate;
    }

    /**
     * 总汇率，实际比例为该值除以1000
     * @param serviceFeeRate 总汇率，实际比例为该值除以1000
     */
    public void setServiceFeeRate(Short serviceFeeRate) {
        this.serviceFeeRate = serviceFeeRate;
    }

    /**
     * 平台管理费
     * @return service_fee 平台管理费
     */
    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    /**
     * 平台管理费
     * @param serviceFee 平台管理费
     */
    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    /**
     * 代理人代理费
     * @return agent_fee 代理人代理费
     */
    public BigDecimal getAgentFee() {
        return agentFee;
    }

    /**
     * 代理人代理费
     * @param agentFee 代理人代理费
     */
    public void setAgentFee(BigDecimal agentFee) {
        this.agentFee = agentFee;
    }

    /**
     * 基金会费用的比例，实际比例为该值除以1000
     * @return fund_fee_rate 基金会费用的比例，实际比例为该值除以1000
     */
    public Short getFundFeeRate() {
        return fundFeeRate;
    }

    /**
     * 基金会费用的比例，实际比例为该值除以1000
     * @param fundFeeRate 基金会费用的比例，实际比例为该值除以1000
     */
    public void setFundFeeRate(Short fundFeeRate) {
        this.fundFeeRate = fundFeeRate;
    }

    /**
     * 基金会收取的费用
     * @return fund_fee 基金会收取的费用
     */
    public BigDecimal getFundFee() {
        return fundFee;
    }

    /**
     * 基金会收取的费用
     * @param fundFee 基金会收取的费用
     */
    public void setFundFee(BigDecimal fundFee) {
        this.fundFee = fundFee;
    }

    /**
     * 创建时间
     * @return c_time 创建时间
     */
    public Integer getcTime() {
        return cTime;
    }

    /**
     * 创建时间
     * @param cTime 创建时间
     */
    public void setcTime(Integer cTime) {
        this.cTime = cTime;
    }
}