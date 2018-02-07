package com.shanyuan.platform.ms.facade.auth.domain;

public class CircleInfo {
	
	private Integer CircleId;
	private String circleName;
	private String totalPeople;
	public Integer getCircleId() {
		return CircleId;
	}
	public void setCircleId(Integer circleId) {
		CircleId = circleId;
	}
	public String getCircleName() {
		return circleName;
	}
	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}
	public String getTotalPeople() {
		return totalPeople;
	}
	public void setTotalPeople(String totalPeople) {
		this.totalPeople = totalPeople;
	}
	
}
