package com.shanyuan.platform.ms.facade.goods.domain;

import java.util.List;

public class IndexGoodsCommon {
	
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 商品列表
	 */
	private List<Object> indexGoodsList;
	/**
	 * 模块描述
	 */
	private String desc;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Object> getIndexGoodsList() {
		return indexGoodsList;
	}
	public void setIndexGoodsList(List<Object> indexGoodsList) {
		this.indexGoodsList = indexGoodsList;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
	
	

}
