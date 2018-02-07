package com.shanyuan.platform.ms.core.order.bo;

import java.math.BigDecimal;

import org.springframework.util.ObjectUtils;

public class OrderGoods {
	private Short mFeeRate;
	private BigDecimal goodsPrice;
	private  String ownerType;
	private Byte  poorType;
	private  Integer bocPointRate;
	private  Integer  goodsId;
	private  Integer goodsNum;
	private  BigDecimal bocPointsPrice;
	private  BigDecimal goodsMoney;
	private  Integer  goodsProjectType;
	private  Integer orderId;
	private  Integer storeId;
	private  String goodsName;
	private  String goodsImage;
	private  String goodsSpec;
	private  String paySn;
	
	
	public BigDecimal getGoodsMoney() {
		BigDecimal num= ObjectUtils.isEmpty(this.goodsNum)?BigDecimal.ZERO:new BigDecimal(this.goodsNum);
		BigDecimal price= ObjectUtils.isEmpty(this.goodsPrice)?BigDecimal.ZERO:this.goodsPrice;
		return this.goodsMoney =price.multiply(num);
	}
	public void setGoodsMoney(BigDecimal goodsMoney) {
		this.goodsMoney = goodsMoney;
	}
	public String getGoodsSpec() {
		return goodsSpec;
	}
	public void setGoodsSpec(String goodsSpec) {
		this.goodsSpec = goodsSpec;
	}
	public String getPaySn() {
		return paySn;
	}
	public void setPaySn(String paySn) {
		this.paySn = paySn;
	}
	public Short getmFeeRate() {
		return mFeeRate;
	}
	public void setmFeeRate(Short mFeeRate) {
		this.mFeeRate = mFeeRate;
	}
	public BigDecimal getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(BigDecimal goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public String getOwnerType() {
		return ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}
	public Byte getPoorType() {
		return poorType;
	}
	public void setPoorType(Byte poorType) {
		this.poorType = poorType;
	}
	public Integer getBocPointRate() {
		return bocPointRate;
	}
	public void setBocPointRate(Integer bocPointRate) {
		this.bocPointRate = bocPointRate;
	}
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public Integer getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}
	public BigDecimal getBocPointsPrice() {
		return bocPointsPrice;
	}
	public void setBocPointsPrice(BigDecimal bocPointsPrice) {
		this.bocPointsPrice = bocPointsPrice;
	}
	public Integer getGoodsProjectType() {
		return goodsProjectType;
	}
	public void setGoodsProjectType(Integer goodsProjectType) {
		this.goodsProjectType = goodsProjectType;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getStoreId() {
		return storeId;
	}
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsImage() {
		return goodsImage;
	}
	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}
	


}
