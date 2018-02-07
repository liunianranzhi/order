package com.shanyuan.platform.ms.facade.auth.domain;

public class UnionInfo {

	private String unionName;
	private String unionChannel;
	private Integer unionId;
	private String unionImage;
	private String unionDisImage;
	private byte unionType;
	private byte unionSort;
	private String totalPeople;
	private Integer circleId;
	
	public String getUnionName() {
		return unionName;
	}
	public void setUnionName(String unionName) {
		this.unionName = unionName;
	}
	public String getUnionChannel() {
		return unionChannel;
	}
	public void setUnionChannel(String unionChannel) {
		this.unionChannel = unionChannel;
	}
	public Integer getUnionId() {
		return unionId;
	}
	public void setUnionId(Integer unionId) {
		this.unionId = unionId;
	}
	public String getUnionImage() {
		return unionImage;
	}
	public void setUnionImage(String unionImage) {
		this.unionImage = unionImage;
	}
	public String getUnionDisImage() {
		return unionDisImage;
	}
	public void setUnionDisImage(String unionDisImage) {
		this.unionDisImage = unionDisImage;
	}
	public byte getUnionType() {
		return unionType;
	}
	public void setUnionType(byte unionType) {
		this.unionType = unionType;
	}
	public byte getUnionSort() {
		return unionSort;
	}
	public void setUnionSort(byte unionSort) {
		this.unionSort = unionSort;
	}
	public String getTotalPeople() {
		return totalPeople;
	}
	public void setTotalPeople(String totalPeople) {
		this.totalPeople = totalPeople;
	}
	public Integer getCircleId() {
		return circleId;
	}
	public void setCircleId(Integer circleId) {
		this.circleId = circleId;
	}
	
}
