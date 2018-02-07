package com.shanyuan.platform.ms.dao.user.entity;

import io.swagger.annotations.ApiModel;

/** 
 * @author  wang chunru 
 * @date    2017年12月6日 上午11:20:27 
 * @Description   
 */
@ApiModel
public class PointLogParam {
	/**
	 * 当前页码
	 */
	private Integer pageNo;
	/**
	 * 一页记录条数
	 */
	private Integer pageSize;
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
}
