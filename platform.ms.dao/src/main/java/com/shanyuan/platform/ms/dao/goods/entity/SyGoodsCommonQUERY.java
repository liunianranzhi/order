/**
 * 
 */
package com.shanyuan.platform.ms.dao.goods.entity;

import java.util.List;

import com.shanyuan.platform.ms.base.common.model.Page;

/**
 * @author 曹勇军
 *
 */
public class SyGoodsCommonQUERY {
	private List<String> goodsCertList;
	private Integer havingCount;
	private String sortOrder;
	private Integer assistId;
	private String hasAssistId;
	private List<Integer> goodsProjectTypeList;
	private Integer gcId;
	private Integer[] gcIds;
	private Long areaId1;
	private Long areaId2;
	private Long areaId3;
	private Long areaId4;
	private Long areaId5;
	private String ownerType;
	private List<String> goodsTypeList;
	private List<Long> supportCountyIdList;
	private String searchQuery;
	private Integer goodsProjectType;
	private Page page;
	private Integer publisherId;
	private Integer gtGoodsPrice;
	private Integer gtGoodsStorage;
	
	public List<String> getGoodsCertList() {
		return goodsCertList;
	}
	public void setGoodsCertList(List<String> goodsCertList) {
		this.goodsCertList = goodsCertList;
	}
	public Integer getHavingCount() {
		return havingCount;
	}
	public void setHavingCount(Integer havingCount) {
		this.havingCount = havingCount;
	}
	public String getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}
	public Integer getAssistId() {
		return assistId;
	}
	public void setAssistId(Integer assistId) {
		this.assistId = assistId;
	}
	
	public Integer[] getGcIds() {
		return gcIds;
	}
	public void setGcIds(Integer[] gcIds) {
		this.gcIds = gcIds;
	}
	public String getHasAssistId() {
		return hasAssistId;
	}
	public void setHasAssistId(String hasAssistId) {
		this.hasAssistId = hasAssistId;
	}
	public List<Integer> getGoodsProjectTypeList() {
		return goodsProjectTypeList;
	}
	public void setGoodsProjectTypeList(List<Integer> goodsProjectTypeList) {
		this.goodsProjectTypeList = goodsProjectTypeList;
	}
	public Integer getGcId() {
		return gcId;
	}
	public void setGcId(Integer gcId) {
		this.gcId = gcId;
	}
	public Long getAreaId1() {
		return areaId1;
	}
	public void setAreaId1(Long areaId1) {
		this.areaId1 = areaId1;
	}
	public Long getAreaId2() {
		return areaId2;
	}
	public void setAreaId2(Long areaId2) {
		this.areaId2 = areaId2;
	}
	public Long getAreaId3() {
		return areaId3;
	}
	public void setAreaId3(Long areaId3) {
		this.areaId3 = areaId3;
	}
	public Long getAreaId4() {
		return areaId4;
	}
	public void setAreaId4(Long areaId4) {
		this.areaId4 = areaId4;
	}
	public Long getAreaId5() {
		return areaId5;
	}
	public void setAreaId5(Long areaId5) {
		this.areaId5 = areaId5;
	}
	public String getOwnerType() {
		return ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}
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
	public String getSearchQuery() {
		return searchQuery;
	}
	public void setSearchQuery(String searchQuery) {
		this.searchQuery = searchQuery;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public Integer getGoodsProjectType() {
		return goodsProjectType;
	}
	public void setGoodsProjectType(Integer goodsProjectType) {
		this.goodsProjectType = goodsProjectType;
	}
	public Integer getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}
	public Integer getGtGoodsPrice() {
		return gtGoodsPrice;
	}
	public void setGtGoodsPrice(Integer gtGoodsPrice) {
		this.gtGoodsPrice = gtGoodsPrice;
	}
	public Integer getGtGoodsStorage() {
		return gtGoodsStorage;
	}
	public void setGtGoodsStorage(Integer gtGoodsStorage) {
		this.gtGoodsStorage = gtGoodsStorage;
	}
	
}
