package com.shanyuan.platform.ms.facade.goods.domain;

import java.util.ArrayList;
import java.util.List;

import com.shanyuan.platform.ms.dao.store.entity.SyAreaFull;

public class AreaFullInfo {

	/**
	 * 父节点
	 */
	private SyAreaFull area;
	
	/**
	 * 子节点
	 */
	private List<AreaFullInfo> childrenArea = new ArrayList<>();


	public SyAreaFull getArea() {
		return area;
	}

	public void setArea(SyAreaFull area) {
		this.area = area;
	}

	public List<AreaFullInfo> getChildrenArea() {
		return childrenArea;
	}

	public void setChildrenArea(List<AreaFullInfo> childrenArea) {
		this.childrenArea = childrenArea;
	}
	
}
