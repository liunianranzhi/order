package com.shanyuan.platform.ms.facade.goods.domain;

import java.util.ArrayList;
import java.util.List;

public class SupportAreaInfo {

	private Long supportAreaId;
	private String supportAreaName;
	private List<SupportAreaInfo> childrenList = new ArrayList<SupportAreaInfo>();

	public Long getSupportAreaId() {
		return supportAreaId;
	}
	public void setSupportAreaId(Long supportAreaId) {
		this.supportAreaId = supportAreaId;
	}
	public String getSupportAreaName() {
		return supportAreaName;
	}
	public void setSupportAreaName(String supportAreaName) {
		this.supportAreaName = supportAreaName;
	}
	public List<SupportAreaInfo> getChildrenList() {
		return childrenList;
	}
	public void setChildrenList(List<SupportAreaInfo> childrenList) {
		this.childrenList = childrenList;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((childrenList == null) ? 0 : childrenList.hashCode());
		result = prime * result + ((supportAreaId == null) ? 0 : supportAreaId.hashCode());
		result = prime * result + ((supportAreaName == null) ? 0 : supportAreaName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SupportAreaInfo other = (SupportAreaInfo) obj;
		if (childrenList == null) {
			if (other.childrenList != null)
				return false;
		} else if (!childrenList.equals(other.childrenList))
			return false;
		if (supportAreaId == null) {
			if (other.supportAreaId != null)
				return false;
		} else if (!supportAreaId.equals(other.supportAreaId))
			return false;
		if (supportAreaName == null) {
			if (other.supportAreaName != null)
				return false;
		} else if (!supportAreaName.equals(other.supportAreaName))
			return false;
		return true;
	}
	
	
	
}
