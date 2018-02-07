package com.shanyuan.platform.ms.core.goods.bo;

import java.math.BigDecimal;

public class GoodsBo {
	private Integer goodsId;;
	private BigDecimal goodsPrice;
	private String goodsName;
	private String goodsImage;
	private String goodsSpec;
	private Integer goodsNum;
	private Integer needPoint;
	
	
	
	public String getGoodsSpec() {
		return goodsSpec;
	}
	public void setGoodsSpec(String goodsSpec) {
		this.goodsSpec = goodsSpec;
	}
	public Integer getNeedPoint() {
		return needPoint;
	}
	public void setNeedPoint(Integer needPoint) {
		this.needPoint = needPoint;
	}
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
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
	public BigDecimal getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(BigDecimal goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public Integer getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
		
		
	}
	
}
