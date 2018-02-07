package com.shanyuan.platform.ms.facade.goods.domain;

import java.util.List;

/**
 * @author 曹勇军
 *
 */
public class SyTopGoodsDomain {
	
	private String topType;
	
	private String topTypeDesc;
	
	private int row;//行
	private int column;//列
	
	private int count;//总数
	
	private int style;//1:左滑，2:方，3：长*1

	private List<Object> goodsList;
	
	private String moreUrl;

	public String getTopType() {
		return topType;
	}

	public void setTopType(String topType) {
		this.topType = topType;
	}

	public String getTopTypeDesc() {
		return topTypeDesc;
	}

	public void setTopTypeDesc(String topTypeDesc) {
		this.topTypeDesc = topTypeDesc;
	}

	public List<Object> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<Object> goodsList) {
		this.goodsList = goodsList;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getStyle() {
		return style;
	}

	public void setStyle(int style) {
		this.style = style;
	}

	public String getMoreUrl() {
		return moreUrl;
	}

	public void setMoreUrl(String moreUrl) {
		this.moreUrl = moreUrl;
	}

	
}
