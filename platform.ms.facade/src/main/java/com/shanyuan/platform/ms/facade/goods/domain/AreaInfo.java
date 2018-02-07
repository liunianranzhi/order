package com.shanyuan.platform.ms.facade.goods.domain;

import java.io.Serializable;

public class AreaInfo  implements Serializable{
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 索引ID
     */
    private Long areaId;

    /**
     * 地区名称
     */
    private String areaName;

    /**
     * 地区父ID
     */
    private Long areaParentId;

    /**
     * 排序
     */
    private Byte areaSort;
    
    /**
     * 地区深度，从1开始
     */
    private Byte areaDeep;

	public Byte getAreaDeep() {
		return areaDeep;
	}

	public void setAreaDeep(Byte areaDeep) {
		this.areaDeep = areaDeep;
	}



	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}


	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public Long getAreaParentId() {
		return areaParentId;
	}

	public void setAreaParentId(Long areaParentId) {
		this.areaParentId = areaParentId;
	}

	public Byte getAreaSort() {
		return areaSort;
	}

	public void setAreaSort(Byte areaSort) {
		this.areaSort = areaSort;
	}
    
}
