package com.shanyuan.platform.ms.dao.statistics.entity;

import java.math.BigDecimal;

/**
 * 描述:platform_statistics_seller_data表的实体类
 * @version
 * @author:  win10
 * @创建时间: 2018-01-16
 */
public class PlatformStatisticsSellerData {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 
     */
    private Integer assistOrderNum;

    /**
     * 
     */
    private Integer assistGoodsNum;

    /**
     * 
     */
    private BigDecimal assistOrderAmount;

    /**
     * 
     */
    private BigDecimal assitHelpPrice;

    /**
     * 
     */
    private Integer poorOrderNum;

    /**
     * 
     */
    private Integer poorGoodsNum;

    /**
     * 
     */
    private BigDecimal poorOrderAmount;

    /**
     * 
     */
    private Integer onlineOrderNum;

    /**
     * 
     */
    private Integer onlineGoodsNum;

    /**
     * 
     */
    private BigDecimal onlineOrderAmount;

    /**
     * 
     */
    private BigDecimal onlineHelpPrice;

    /**
     * 
     */
    private Integer offlineOrderNum;

    /**
     * 
     */
    private Integer offlineGoodsNum;

    /**
     * 
     */
    private BigDecimal offlineOrderAmount;

    /**
     * 
     */
    private BigDecimal offlineHelpPrice;

    /**
     * 
     */
    private Integer syOrderNum;

    /**
     * 
     */
    private Integer syGoodsNum;

    /**
     * 
     */
    private BigDecimal syOrderAmount;

    /**
     * 
     */
    private BigDecimal syDonationAmount;

    /**
     * 创建时间
     */
    private Integer cTime;

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
     * 
     * @return assist_order_num 
     */
    public Integer getAssistOrderNum() {
        return assistOrderNum;
    }

    /**
     * 
     * @param assistOrderNum 
     */
    public void setAssistOrderNum(Integer assistOrderNum) {
        this.assistOrderNum = assistOrderNum;
    }

    /**
     * 
     * @return assist_goods_num 
     */
    public Integer getAssistGoodsNum() {
        return assistGoodsNum;
    }

    /**
     * 
     * @param assistGoodsNum 
     */
    public void setAssistGoodsNum(Integer assistGoodsNum) {
        this.assistGoodsNum = assistGoodsNum;
    }

    /**
     * 
     * @return assist_order_amount 
     */
    public BigDecimal getAssistOrderAmount() {
        return assistOrderAmount;
    }

    /**
     * 
     * @param assistOrderAmount 
     */
    public void setAssistOrderAmount(BigDecimal assistOrderAmount) {
        this.assistOrderAmount = assistOrderAmount;
    }

    /**
     * 
     * @return assit_help_price 
     */
    public BigDecimal getAssitHelpPrice() {
        return assitHelpPrice;
    }

    /**
     * 
     * @param assitHelpPrice 
     */
    public void setAssitHelpPrice(BigDecimal assitHelpPrice) {
        this.assitHelpPrice = assitHelpPrice;
    }

    /**
     * 
     * @return poor_order_num 
     */
    public Integer getPoorOrderNum() {
        return poorOrderNum;
    }

    /**
     * 
     * @param poorOrderNum 
     */
    public void setPoorOrderNum(Integer poorOrderNum) {
        this.poorOrderNum = poorOrderNum;
    }

    /**
     * 
     * @return poor_goods_num 
     */
    public Integer getPoorGoodsNum() {
        return poorGoodsNum;
    }

    /**
     * 
     * @param poorGoodsNum 
     */
    public void setPoorGoodsNum(Integer poorGoodsNum) {
        this.poorGoodsNum = poorGoodsNum;
    }

    /**
     * 
     * @return poor_order_amount 
     */
    public BigDecimal getPoorOrderAmount() {
        return poorOrderAmount;
    }

    /**
     * 
     * @param poorOrderAmount 
     */
    public void setPoorOrderAmount(BigDecimal poorOrderAmount) {
        this.poorOrderAmount = poorOrderAmount;
    }

    /**
     * 
     * @return online_order_num 
     */
    public Integer getOnlineOrderNum() {
        return onlineOrderNum;
    }

    /**
     * 
     * @param onlineOrderNum 
     */
    public void setOnlineOrderNum(Integer onlineOrderNum) {
        this.onlineOrderNum = onlineOrderNum;
    }

    /**
     * 
     * @return online_goods_num 
     */
    public Integer getOnlineGoodsNum() {
        return onlineGoodsNum;
    }

    /**
     * 
     * @param onlineGoodsNum 
     */
    public void setOnlineGoodsNum(Integer onlineGoodsNum) {
        this.onlineGoodsNum = onlineGoodsNum;
    }

    /**
     * 
     * @return online_order_amount 
     */
    public BigDecimal getOnlineOrderAmount() {
        return onlineOrderAmount;
    }

    /**
     * 
     * @param onlineOrderAmount 
     */
    public void setOnlineOrderAmount(BigDecimal onlineOrderAmount) {
        this.onlineOrderAmount = onlineOrderAmount;
    }

    /**
     * 
     * @return online_help_price 
     */
    public BigDecimal getOnlineHelpPrice() {
        return onlineHelpPrice;
    }

    /**
     * 
     * @param onlineHelpPrice 
     */
    public void setOnlineHelpPrice(BigDecimal onlineHelpPrice) {
        this.onlineHelpPrice = onlineHelpPrice;
    }

    /**
     * 
     * @return offline_order_num 
     */
    public Integer getOfflineOrderNum() {
        return offlineOrderNum;
    }

    /**
     * 
     * @param offlineOrderNum 
     */
    public void setOfflineOrderNum(Integer offlineOrderNum) {
        this.offlineOrderNum = offlineOrderNum;
    }

    /**
     * 
     * @return offline_goods_num 
     */
    public Integer getOfflineGoodsNum() {
        return offlineGoodsNum;
    }

    /**
     * 
     * @param offlineGoodsNum 
     */
    public void setOfflineGoodsNum(Integer offlineGoodsNum) {
        this.offlineGoodsNum = offlineGoodsNum;
    }

    /**
     * 
     * @return offline_order_amount 
     */
    public BigDecimal getOfflineOrderAmount() {
        return offlineOrderAmount;
    }

    /**
     * 
     * @param offlineOrderAmount 
     */
    public void setOfflineOrderAmount(BigDecimal offlineOrderAmount) {
        this.offlineOrderAmount = offlineOrderAmount;
    }

    /**
     * 
     * @return offline_help_price 
     */
    public BigDecimal getOfflineHelpPrice() {
        return offlineHelpPrice;
    }

    /**
     * 
     * @param offlineHelpPrice 
     */
    public void setOfflineHelpPrice(BigDecimal offlineHelpPrice) {
        this.offlineHelpPrice = offlineHelpPrice;
    }

    /**
     * 
     * @return sy_order_num 
     */
    public Integer getSyOrderNum() {
        return syOrderNum;
    }

    /**
     * 
     * @param syOrderNum 
     */
    public void setSyOrderNum(Integer syOrderNum) {
        this.syOrderNum = syOrderNum;
    }

    /**
     * 
     * @return sy_goods_num 
     */
    public Integer getSyGoodsNum() {
        return syGoodsNum;
    }

    /**
     * 
     * @param syGoodsNum 
     */
    public void setSyGoodsNum(Integer syGoodsNum) {
        this.syGoodsNum = syGoodsNum;
    }

    /**
     * 
     * @return sy_order_amount 
     */
    public BigDecimal getSyOrderAmount() {
        return syOrderAmount;
    }

    /**
     * 
     * @param syOrderAmount 
     */
    public void setSyOrderAmount(BigDecimal syOrderAmount) {
        this.syOrderAmount = syOrderAmount;
    }

    /**
     * 
     * @return sy_donation_amount 
     */
    public BigDecimal getSyDonationAmount() {
        return syDonationAmount;
    }

    /**
     * 
     * @param syDonationAmount 
     */
    public void setSyDonationAmount(BigDecimal syDonationAmount) {
        this.syDonationAmount = syDonationAmount;
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