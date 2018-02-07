package com.shanyuan.platform.ms.dao.statistics.entity;

import java.math.BigDecimal;

/**
 * 描述:union_sale_statistics表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2018-01-16
 */
public class UnionSaleStatistics {
    /**
     * 
     */
    private Integer id;

    /**
     * 助理人订单量
     */
    private Integer assistOrderNum;

    /**
     * 助理人销售量
     */
    private Integer assistSaleNum;

    /**
     * 助理人销售额
     */
    private BigDecimal assistSaleAmount;

    /**
     * 助理人帮扶金
     */
    private BigDecimal assistHelpPrice;

    /**
     * 助理人自帮扶
     */
    private BigDecimal assistSelfHelpPrice;

    /**
     * 贫困户订单量
     */
    private Integer poorOrderNum;

    /**
     * 贫困户销售量
     */
    private Integer poorSaleNum;

    /**
     * 贫困户销售额
     */
    private BigDecimal poorSaleAmount;

    /**
     * 贫困户自帮扶
     */
    private BigDecimal poorSelfHelpPrice;

    /**
     * 善源甄选线上订单量
     */
    private Integer syzxOnlineOrderNum;

    /**
     * 善源甄选线上销售量
     */
    private Integer syzxOnlineSaleNum;

    /**
     * 善源甄选线上销售额
     */
    private BigDecimal syzxOnlineSaleAmount;

    /**
     * 善源甄选线上帮扶金
     */
    private BigDecimal syzxOnlineHelpPrice;

    /**
     * 善源甄选线上自帮扶
     */
    private BigDecimal syzxOnlineSelfHelpPrice;

    /**
     * 善源甄选线下订单量
     */
    private Integer syzxOfflineOrderNum;

    /**
     * 善源甄选线下销售量
     */
    private Integer syzxOfflineSaleNum;

    /**
     * 善源甄选线下销售额
     */
    private BigDecimal syzxOfflineSaleAmount;

    /**
     * 善源甄选线下帮扶金
     */
    private BigDecimal syzxOfflineHelpPrice;

    /**
     * 善源甄选线下自帮扶
     */
    private BigDecimal syzxOfflineSelfHelpPrice;

    /**
     * 订单时间
     */
    private Integer cTime;

    /**
     * 卖家联盟id
     */
    private Integer unionId;

    /**
     * 卖家联盟名称
     */
    private String unionName;

    /**
     * 卖家地区id
     */
    private Long areaId;

    /**
     * 卖家地区名称
     */
    private String areaName;

    /**
     * 卖家渠道
     */
    private String channel;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 助理人订单量
     * @return assist_order_num 助理人订单量
     */
    public Integer getAssistOrderNum() {
        return assistOrderNum;
    }

    /**
     * 助理人订单量
     * @param assistOrderNum 助理人订单量
     */
    public void setAssistOrderNum(Integer assistOrderNum) {
        this.assistOrderNum = assistOrderNum;
    }

    /**
     * 助理人销售量
     * @return assist_sale_num 助理人销售量
     */
    public Integer getAssistSaleNum() {
        return assistSaleNum;
    }

    /**
     * 助理人销售量
     * @param assistSaleNum 助理人销售量
     */
    public void setAssistSaleNum(Integer assistSaleNum) {
        this.assistSaleNum = assistSaleNum;
    }

    /**
     * 助理人销售额
     * @return assist_sale_amount 助理人销售额
     */
    public BigDecimal getAssistSaleAmount() {
        return assistSaleAmount;
    }

    /**
     * 助理人销售额
     * @param assistSaleAmount 助理人销售额
     */
    public void setAssistSaleAmount(BigDecimal assistSaleAmount) {
        this.assistSaleAmount = assistSaleAmount;
    }

    /**
     * 助理人帮扶金
     * @return assist_help_price 助理人帮扶金
     */
    public BigDecimal getAssistHelpPrice() {
        return assistHelpPrice;
    }

    /**
     * 助理人帮扶金
     * @param assistHelpPrice 助理人帮扶金
     */
    public void setAssistHelpPrice(BigDecimal assistHelpPrice) {
        this.assistHelpPrice = assistHelpPrice;
    }

    /**
     * 助理人自帮扶
     * @return assist_self_help_price 助理人自帮扶
     */
    public BigDecimal getAssistSelfHelpPrice() {
        return assistSelfHelpPrice;
    }

    /**
     * 助理人自帮扶
     * @param assistSelfHelpPrice 助理人自帮扶
     */
    public void setAssistSelfHelpPrice(BigDecimal assistSelfHelpPrice) {
        this.assistSelfHelpPrice = assistSelfHelpPrice;
    }

    /**
     * 贫困户订单量
     * @return poor_order_num 贫困户订单量
     */
    public Integer getPoorOrderNum() {
        return poorOrderNum;
    }

    /**
     * 贫困户订单量
     * @param poorOrderNum 贫困户订单量
     */
    public void setPoorOrderNum(Integer poorOrderNum) {
        this.poorOrderNum = poorOrderNum;
    }

    /**
     * 贫困户销售量
     * @return poor_sale_num 贫困户销售量
     */
    public Integer getPoorSaleNum() {
        return poorSaleNum;
    }

    /**
     * 贫困户销售量
     * @param poorSaleNum 贫困户销售量
     */
    public void setPoorSaleNum(Integer poorSaleNum) {
        this.poorSaleNum = poorSaleNum;
    }

    /**
     * 贫困户销售额
     * @return poor_sale_amount 贫困户销售额
     */
    public BigDecimal getPoorSaleAmount() {
        return poorSaleAmount;
    }

    /**
     * 贫困户销售额
     * @param poorSaleAmount 贫困户销售额
     */
    public void setPoorSaleAmount(BigDecimal poorSaleAmount) {
        this.poorSaleAmount = poorSaleAmount;
    }

    /**
     * 贫困户自帮扶
     * @return poor_self_help_price 贫困户自帮扶
     */
    public BigDecimal getPoorSelfHelpPrice() {
        return poorSelfHelpPrice;
    }

    /**
     * 贫困户自帮扶
     * @param poorSelfHelpPrice 贫困户自帮扶
     */
    public void setPoorSelfHelpPrice(BigDecimal poorSelfHelpPrice) {
        this.poorSelfHelpPrice = poorSelfHelpPrice;
    }

    /**
     * 善源甄选线上订单量
     * @return syzx_online_order_num 善源甄选线上订单量
     */
    public Integer getSyzxOnlineOrderNum() {
        return syzxOnlineOrderNum;
    }

    /**
     * 善源甄选线上订单量
     * @param syzxOnlineOrderNum 善源甄选线上订单量
     */
    public void setSyzxOnlineOrderNum(Integer syzxOnlineOrderNum) {
        this.syzxOnlineOrderNum = syzxOnlineOrderNum;
    }

    /**
     * 善源甄选线上销售量
     * @return syzx_online_sale_num 善源甄选线上销售量
     */
    public Integer getSyzxOnlineSaleNum() {
        return syzxOnlineSaleNum;
    }

    /**
     * 善源甄选线上销售量
     * @param syzxOnlineSaleNum 善源甄选线上销售量
     */
    public void setSyzxOnlineSaleNum(Integer syzxOnlineSaleNum) {
        this.syzxOnlineSaleNum = syzxOnlineSaleNum;
    }

    /**
     * 善源甄选线上销售额
     * @return syzx_online_sale_amount 善源甄选线上销售额
     */
    public BigDecimal getSyzxOnlineSaleAmount() {
        return syzxOnlineSaleAmount;
    }

    /**
     * 善源甄选线上销售额
     * @param syzxOnlineSaleAmount 善源甄选线上销售额
     */
    public void setSyzxOnlineSaleAmount(BigDecimal syzxOnlineSaleAmount) {
        this.syzxOnlineSaleAmount = syzxOnlineSaleAmount;
    }

    /**
     * 善源甄选线上帮扶金
     * @return syzx_online_help_price 善源甄选线上帮扶金
     */
    public BigDecimal getSyzxOnlineHelpPrice() {
        return syzxOnlineHelpPrice;
    }

    /**
     * 善源甄选线上帮扶金
     * @param syzxOnlineHelpPrice 善源甄选线上帮扶金
     */
    public void setSyzxOnlineHelpPrice(BigDecimal syzxOnlineHelpPrice) {
        this.syzxOnlineHelpPrice = syzxOnlineHelpPrice;
    }

    /**
     * 善源甄选线上自帮扶
     * @return syzx_online_self_help_price 善源甄选线上自帮扶
     */
    public BigDecimal getSyzxOnlineSelfHelpPrice() {
        return syzxOnlineSelfHelpPrice;
    }

    /**
     * 善源甄选线上自帮扶
     * @param syzxOnlineSelfHelpPrice 善源甄选线上自帮扶
     */
    public void setSyzxOnlineSelfHelpPrice(BigDecimal syzxOnlineSelfHelpPrice) {
        this.syzxOnlineSelfHelpPrice = syzxOnlineSelfHelpPrice;
    }

    /**
     * 善源甄选线下订单量
     * @return syzx_offline_order_num 善源甄选线下订单量
     */
    public Integer getSyzxOfflineOrderNum() {
        return syzxOfflineOrderNum;
    }

    /**
     * 善源甄选线下订单量
     * @param syzxOfflineOrderNum 善源甄选线下订单量
     */
    public void setSyzxOfflineOrderNum(Integer syzxOfflineOrderNum) {
        this.syzxOfflineOrderNum = syzxOfflineOrderNum;
    }

    /**
     * 善源甄选线下销售量
     * @return syzx_offline_sale_num 善源甄选线下销售量
     */
    public Integer getSyzxOfflineSaleNum() {
        return syzxOfflineSaleNum;
    }

    /**
     * 善源甄选线下销售量
     * @param syzxOfflineSaleNum 善源甄选线下销售量
     */
    public void setSyzxOfflineSaleNum(Integer syzxOfflineSaleNum) {
        this.syzxOfflineSaleNum = syzxOfflineSaleNum;
    }

    /**
     * 善源甄选线下销售额
     * @return syzx_offline_sale_amount 善源甄选线下销售额
     */
    public BigDecimal getSyzxOfflineSaleAmount() {
        return syzxOfflineSaleAmount;
    }

    /**
     * 善源甄选线下销售额
     * @param syzxOfflineSaleAmount 善源甄选线下销售额
     */
    public void setSyzxOfflineSaleAmount(BigDecimal syzxOfflineSaleAmount) {
        this.syzxOfflineSaleAmount = syzxOfflineSaleAmount;
    }

    /**
     * 善源甄选线下帮扶金
     * @return syzx_offline_help_price 善源甄选线下帮扶金
     */
    public BigDecimal getSyzxOfflineHelpPrice() {
        return syzxOfflineHelpPrice;
    }

    /**
     * 善源甄选线下帮扶金
     * @param syzxOfflineHelpPrice 善源甄选线下帮扶金
     */
    public void setSyzxOfflineHelpPrice(BigDecimal syzxOfflineHelpPrice) {
        this.syzxOfflineHelpPrice = syzxOfflineHelpPrice;
    }

    /**
     * 善源甄选线下自帮扶
     * @return syzx_offline_self_help_price 善源甄选线下自帮扶
     */
    public BigDecimal getSyzxOfflineSelfHelpPrice() {
        return syzxOfflineSelfHelpPrice;
    }

    /**
     * 善源甄选线下自帮扶
     * @param syzxOfflineSelfHelpPrice 善源甄选线下自帮扶
     */
    public void setSyzxOfflineSelfHelpPrice(BigDecimal syzxOfflineSelfHelpPrice) {
        this.syzxOfflineSelfHelpPrice = syzxOfflineSelfHelpPrice;
    }

    /**
     * 订单时间
     * @return c_time 订单时间
     */
    public Integer getcTime() {
        return cTime;
    }

    /**
     * 订单时间
     * @param cTime 订单时间
     */
    public void setcTime(Integer cTime) {
        this.cTime = cTime;
    }

    /**
     * 卖家联盟id
     * @return union_id 卖家联盟id
     */
    public Integer getUnionId() {
        return unionId;
    }

    /**
     * 卖家联盟id
     * @param unionId 卖家联盟id
     */
    public void setUnionId(Integer unionId) {
        this.unionId = unionId;
    }

    /**
     * 卖家联盟名称
     * @return union_name 卖家联盟名称
     */
    public String getUnionName() {
        return unionName;
    }

    /**
     * 卖家联盟名称
     * @param unionName 卖家联盟名称
     */
    public void setUnionName(String unionName) {
        this.unionName = unionName == null ? null : unionName.trim();
    }

    /**
     * 卖家地区id
     * @return area_id 卖家地区id
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * 卖家地区id
     * @param areaId 卖家地区id
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    /**
     * 卖家地区名称
     * @return area_name 卖家地区名称
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 卖家地区名称
     * @param areaName 卖家地区名称
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * 卖家渠道
     * @return channel 卖家渠道
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 卖家渠道
     * @param channel 卖家渠道
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }
}