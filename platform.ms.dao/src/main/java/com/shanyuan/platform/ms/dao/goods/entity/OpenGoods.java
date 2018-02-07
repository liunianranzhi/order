package com.shanyuan.platform.ms.dao.goods.entity;

import java.math.BigDecimal;
import java.util.List;

public class OpenGoods {
	private Integer goodsCommonid;
	private Integer tId;
	private Integer trId;
	private String showState;
	private Long areaid1;
	private Long areaid2;
	private Long areaid3;
	private BigDecimal sprice;
	private BigDecimal bocPointsPrice;
	private List<String> goodsCertTypes;

	public Integer getTrId() {
		return trId;
	}

	public void setTrId(Integer trId) {
		this.trId = trId;
	}

	private List<SyGoods> syGoodsList;

	public Integer getGoodsCommonid() {
		return goodsCommonid;
	}

	public void setGoodsCommonid(Integer goodsCommonid) {
		this.goodsCommonid = goodsCommonid;
	}

	public Long getAreaid1() {
		return areaid1;
	}

	public void setAreaid1(Long areaid1) {
		this.areaid1 = areaid1;
	}

	public Long getAreaid2() {
		return areaid2;
	}

	public void setAreaid2(Long areaid2) {
		this.areaid2 = areaid2;
	}

	public Long getAreaid3() {
		return areaid3;
	}

	public void setAreaid3(Long areaid3) {
		this.areaid3 = areaid3;
	}

	public List<String> getGoodsCertTypes() {
		return goodsCertTypes;
	}

	public void setGoodsCertTypes(List<String> goodsCertTypes) {
		this.goodsCertTypes = goodsCertTypes;
	}

	public List<SyGoods> getSyGoodsList() {
		return syGoodsList;
	}

	public void setSyGoodsList(List<SyGoods> syGoodsList) {
		this.syGoodsList = syGoodsList;
	}

	public BigDecimal getSprice() {
		return sprice;
	}

	public void setSprice(BigDecimal sprice) {
		this.sprice = sprice;
	}

	public String getShowState() {
		return showState;
	}

	public void setShowState(String showState) {
		this.showState = showState;
	}

	public Integer gettId() {
		return tId;
	}

	public void settId(Integer tId) {
		this.tId = tId;
	}

	public BigDecimal getBocPointsPrice() {
		return bocPointsPrice;
	}

	public void setBocPointsPrice(BigDecimal bocPointsPrice) {
		this.bocPointsPrice = bocPointsPrice;
	}

	

	
	

}
