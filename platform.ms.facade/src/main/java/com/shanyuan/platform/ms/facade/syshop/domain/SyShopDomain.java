package com.shanyuan.platform.ms.facade.syshop.domain;

import java.util.List;

import com.shanyuan.platform.ms.dao.syshop.entity.SyCompanyInfo;

public class SyShopDomain {
	
	private Integer areaId;
	private String areaName;
	private String areaDes;
	private String areaImgUrl;
	private Integer eNum;
	private List<SyCompanyInfo> eList;
	private String areaListMoreUrl;
	
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getAreaDes() {
		return areaDes;
	}
	public void setAreaDes(String areaDes) {
		this.areaDes = areaDes;
	}
	public String getAreaImgUrl() {
		return areaImgUrl;
	}
	public void setAreaImgUrl(String areaImgUrl) {
		this.areaImgUrl = areaImgUrl;
	}
	public Integer geteNum() {
		return eNum;
	}
	public void seteNum(Integer eNum) {
		this.eNum = eNum;
	}
	public List<SyCompanyInfo> geteList() {
		return eList;
	}
	public void seteList(List<SyCompanyInfo> eList) {
		this.eList = eList;
	}
	public String getAreaListMoreUrl() {
		return areaListMoreUrl;
	}
	public void setAreaListMoreUrl(String areaListMoreUrl) {
		this.areaListMoreUrl = areaListMoreUrl;
	}
}
