package com.shanyuan.platform.ms.dao.syshop.entity;

public class SyCompanyInfo implements Comparable<SyCompanyInfo> {

	private Integer areaId;
//	private String areaName;
//	private String areaDes;
//	private String areaLogo;
	private Integer recId;
	private Integer memberId;
	private String companyName;
	private String companyLogo;
	private String companyLogoUrl;
	private String goodsUrl;
	private String goodsStoreUrl;

	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
//	public String getAreaName() {
//		return areaName;
//	}
//	public void setAreaName(String areaName) {
//		this.areaName = areaName;
//	}
//	public String getAreaDes() {
//		return areaDes;
//	}
//	public void setAreaDes(String areaDes) {
//		this.areaDes = areaDes;
//	}
//	public String getAreaLogo() {
//		return areaLogo;
//	}
//	public void setAreaLogo(String areaLogo) {
//		this.areaLogo = areaLogo;
//	}
	public Integer getRecId() {
		return recId;
	}
	public void setRecId(Integer recId) {
		this.recId = recId;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyLogo() {
		return companyLogo;
	}
	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}
	public String getCompanyLogoUrl() {
		return companyLogoUrl;
	}
	public void setCompanyLogoUrl(String companyLogoUrl) {
		this.companyLogoUrl = companyLogoUrl;
	}
	public String getGoodsUrl() {
		return goodsUrl;
	}
	public void setGoodsUrl(String goodsUrl) {
		this.goodsUrl = goodsUrl;
	}
	public String getGoodsStoreUrl() {
		return goodsStoreUrl;
	}
	public void setGoodsStoreUrl(String goodsStoreUrl) {
		this.goodsStoreUrl = goodsStoreUrl;
	}
	@Override
	public int compareTo(SyCompanyInfo arg0) {
		return arg0.getRecId() - this.getRecId();
	}
	
}
