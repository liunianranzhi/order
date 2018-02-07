package com.shanyuan.platform.ms.core.topic.bo;

import java.io.Serializable;
import java.math.BigDecimal;


public class TopicGoodsInfo implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String TopicName;
    private String dailyLimited;
    private String saleStartTime;
    private String goodsStatus;
    private String goodsType;
    
    private Integer topicId;
    private Integer goodsId;
    private Integer goodsCommonid;
    private Integer actSaleNum;
    private Integer actGoodsStorage;
    private Integer actStorage;//实际库存
   
	private Integer todaySale;
    private Integer todayNum;
    private Integer floorsSort;
    
	private Integer actBocPoints;
    private BigDecimal purchasePrice;
    private BigDecimal actGoodsPrice;
    private BigDecimal bocPointRate;
    private BigDecimal bocPointsPrice;
    
    public Integer getActStorage() {
		return actStorage;
	}
	public void setActStorage(Integer actStorage) {
		this.actStorage = actStorage;
	}
    public String getTopicName() {
		return TopicName;
	}
	public void setTopicName(String topicName) {
		TopicName = topicName;
	}
	public String getDailyLimited() {
		return dailyLimited;
	}
	public void setDailyLimited(String dailyLimited) {
		this.dailyLimited = dailyLimited;
	}
	public String getSaleStartTime() {
		return saleStartTime;
	}
	public void setSaleStartTime(String saleStartTime) {
		this.saleStartTime = saleStartTime;
	}
	public Integer getTopicId() {
		return topicId;
	}
	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public Integer getGoodsCommonid() {
		return goodsCommonid;
	}
	public void setGoodsCommonid(Integer goodsCommonid) {
		this.goodsCommonid = goodsCommonid;
	}
	public Integer getActSaleNum() {
		return actSaleNum;
	}
	public void setActSaleNum(Integer actSaleNum) {
		this.actSaleNum = actSaleNum;
	}
	public Integer getActGoodsStorage() {
		return actGoodsStorage;
	}
	public void setActGoodsStorage(Integer actGoodsStorage) {
		this.actGoodsStorage = actGoodsStorage;
	}
	public Integer getTodaySale() {
		return todaySale;
	}
	public void setTodaySale(Integer todaySale) {
		this.todaySale = todaySale;
	}
	public Integer getTodayNum() {
		return todayNum;
	}
	public void setTodayNum(Integer todayNum) {
		this.todayNum = todayNum;
	}
	public Integer getFloorsSort() {
		return floorsSort;
	}
	public void setFloorsSort(Integer floorsSort) {
		this.floorsSort = floorsSort;
	}
	public Integer getActBocPoints() {
		return actBocPoints;
	}
	public void setActBocPoints(Integer actBocPoints) {
		this.actBocPoints = actBocPoints;
	}
	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public BigDecimal getActGoodsPrice() {
		return actGoodsPrice;
	}
	public void setActGoodsPrice(BigDecimal actGoodsPrice) {
		this.actGoodsPrice = actGoodsPrice;
	}
	public BigDecimal getBocPointRate() {
		return bocPointRate;
	}
	public void setBocPointRate(BigDecimal bocPointRate) {
		this.bocPointRate = bocPointRate;
	}
	public BigDecimal getBocPointsPrice() {
		return bocPointsPrice;
	}
	public void setBocPointsPrice(BigDecimal bocPointsPrice) {
		this.bocPointsPrice = bocPointsPrice;
	}
	public String getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
	public String getGoodsStatus() {
		return goodsStatus;
	}
	public void setGoodsStatus(String goodsStatus) {
		this.goodsStatus = goodsStatus;
	}
	@Override
	public String toString() {
		return "TopicGoodsInfo [TopicName=" + TopicName + ", dailyLimited=" + dailyLimited + ", saleStartTime="
				+ saleStartTime + ", goodsStatus=" + goodsStatus + ", goodsType=" + goodsType + ", topicId=" + topicId
				+ ", goodsId=" + goodsId + ", goodsCommonid=" + goodsCommonid + ", actSaleNum=" + actSaleNum
				+ ", actGoodsStorage=" + actGoodsStorage + ", actStorage=" + actStorage + ", todaySale=" + todaySale
				+ ", todayNum=" + todayNum + ", floorsSort=" + floorsSort + ", actBocPoints=" + actBocPoints
				+ ", purchasePrice=" + purchasePrice + ", actGoodsPrice=" + actGoodsPrice + ", bocPointRate="
				+ bocPointRate + ", bocPointsPrice=" + bocPointsPrice + "]";
	}

    

}
