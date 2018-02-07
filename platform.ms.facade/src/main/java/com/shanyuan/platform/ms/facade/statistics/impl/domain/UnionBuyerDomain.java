package com.shanyuan.platform.ms.facade.statistics.impl.domain;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.alibaba.fastjson.JSONObject;

public class UnionBuyerDomain {

	private Integer orderNums;
	private Integer goodsNums;
	private BigDecimal totalAmount;
	private BigDecimal helpPrice;
	private Integer type;
	
	public Integer getOrderNums() {
		return orderNums;
	}
	public void setOrderNums(Integer orderNums) {
		this.orderNums = orderNums;
	}
	public Integer getGoodsNums() {
		return goodsNums;
	}
	public void setGoodsNums(Integer goodsNums) {
		this.goodsNums = goodsNums;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public BigDecimal getHelpPrice() {
		return helpPrice;
	}
	public void setHelpPrice(BigDecimal helpPrice) {
		this.helpPrice = helpPrice;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
	public UnionBuyerDomain(Integer orderNums, Integer goodsNums, BigDecimal totalAmount, BigDecimal helpPrice,
			Integer type) {
		super();
		this.orderNums = orderNums;
		this.goodsNums = goodsNums;
		this.totalAmount = totalAmount;
		this.helpPrice = helpPrice;
		this.type = type;
	}
	
	public UnionBuyerDomain() {
		super();
	}
	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("union", new UnionBuyerDomain());
		jsonObject.put("dacs", new UnionBuyerDomain());
		jsonObject.put("syzx", new UnionBuyerDomain());
		jsonObject.put("sysc", new UnionBuyerDomain());
		jsonObject.put("details", new ArrayList<UnionBuyerDomainDetails>());
	//	new UnionBuyerDomainDetails(cTime, unionName, dacsOrderNums, dacsGoodsNums, dacsTotalAmount, dacsHelpPrice, syscOrderNums, syscGoodsNums, syscTotalAmount, syscHelpPrice, syzxOrderNums, syzxGoodsNums, syzxTotalAmount, syzxHelpPrice);
	}
	
	
}
