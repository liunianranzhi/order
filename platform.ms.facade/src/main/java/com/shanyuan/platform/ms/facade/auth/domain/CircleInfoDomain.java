package com.shanyuan.platform.ms.facade.auth.domain;

import java.util.ArrayList;
import java.util.List;

public class CircleInfoDomain {

	private CircleInfo circleInfo;
	private Boolean hasChild;
	private List<CircleInfoDomain> childCircle = new ArrayList<CircleInfoDomain>();
	
	public CircleInfo getCircleInfo() {
		return circleInfo;
	}
	public void setCircleInfo(CircleInfo circleInfo) {
		this.circleInfo = circleInfo;
	}
	public Boolean getHasChild() {
		return hasChild;
	}
	public void setHasChild(Boolean hasChild) {
		this.hasChild = hasChild;
	}
	public List<CircleInfoDomain> getChildCircle() {
		return childCircle;
	}
	public void setChildCircle(List<CircleInfoDomain> childCircle) {
		this.childCircle = childCircle;
	}
	
}
