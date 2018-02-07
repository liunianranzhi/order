package com.shanyuan.platform.ms.core.goods.bo;

import java.util.List;

public class SpecialGoodsBo {
	
	private String touchUrlMore;
	
	private String text;
	
	private List<GoodsCommonInfo> goodsList;

	public String getTouchUrlMore() {
		return touchUrlMore;
	}

	public void setTouchUrlMore(String touchUrlMore) {
		this.touchUrlMore = touchUrlMore;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<GoodsCommonInfo> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<GoodsCommonInfo> goodsList) {
		this.goodsList = goodsList;
	}
	
	
	

}
