package com.shanyuan.platform.ms.dao.store.entity;

import java.util.List;

public class SyOpenSearchParams {
	private String searchQuery;
	private Integer publisherId;
	private String owerType;
	private Integer gcId;
	private Integer showState;
	private Integer areaDeep;
	private Long areaId;
	private Integer assistId;
	private Integer goodsProjectType;
	private List<String> goodsTypeList;
	private List<Long> supportCountyIdList;
	private List<String> goodsCertList;
	private List<Integer> gcIds;
	private List<Integer> publisherIdList;
	
	public List<String> getGoodsTypeList() {
		return goodsTypeList;
	}
	public void setGoodsTypeList(List<String> goodsTypeList) {
		this.goodsTypeList = goodsTypeList;
	}
	public List<Long> getSupportCountyIdList() {
		return supportCountyIdList;
	}
	public void setSupportCountyIdList(List<Long> supportCountyIdList) {
		this.supportCountyIdList = supportCountyIdList;
	}
	public List<String> getGoodsCertList() {
		return goodsCertList;
	}
	public void setGoodsCertList(List<String> goodsCertList) {
		this.goodsCertList = goodsCertList;
	}
	public List<Integer> getGcIds() {
		return gcIds;
	}
	public void setGcIds(List<Integer> gcIds) {
		this.gcIds = gcIds;
	}
	public Integer getShowState() {
		return showState;
	}
	public void setShowState(Integer showState) {
		this.showState = showState;
	}
	public Integer getAreaDeep() {
		return areaDeep;
	}
	public void setAreaDeep(Integer areaDeep) {
		this.areaDeep = areaDeep;
	}
	public Long getAreaId() {
		return areaId;
	}
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	public Integer getAssistId() {
		return assistId;
	}
	public void setAssistId(Integer assistId) {
		this.assistId = assistId;
	}
	public Integer getGoodsProjectType() {
		return goodsProjectType;
	}
	public void setGoodsProjectType(Integer goodsProjectType) {
		this.goodsProjectType = goodsProjectType;
	}
	public Integer getGcId() {
		return gcId;
	}
	public void setGcId(Integer gcId) {
		this.gcId = gcId;
	}
	public String getSearchQuery() {
		return searchQuery;
	}
	public void setSearchQuery(String searchQuery) {
		this.searchQuery = searchQuery;
	}
	public Integer getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}
	public String getOwerType() {
		return owerType;
	}
	public void setOwerType(String owerType) {
		this.owerType = owerType;
	}
	public List<Integer> getPublisherIdList() {
		return publisherIdList;
	}
	public void setPublisherIdList(List<Integer> publisherIdList) {
		this.publisherIdList = publisherIdList;
	}
	
}
