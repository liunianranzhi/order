package com.shanyuan.platform.ms.facade.auth.domain;

public class SelectCircleDomain {
	
	private String circleName;
	private Integer circleId;
	private SelectCircleDomain childCircle;
	public String getCircleName() {
		return circleName;
	}
	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}
	public Integer getCircleId() {
		return circleId;
	}
	public void setCircleId(Integer circleId) {
		this.circleId = circleId;
	}
	public SelectCircleDomain getChildCircle() {
		return childCircle;
	}
	public void setChildCircle(SelectCircleDomain childCircle) {
		this.childCircle = childCircle;
	}
	
}
