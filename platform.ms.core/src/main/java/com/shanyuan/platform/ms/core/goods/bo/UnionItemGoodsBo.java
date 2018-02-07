package com.shanyuan.platform.ms.core.goods.bo;

import java.util.List;

import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.union.entity.SyUnionItemGoodsList;

public class UnionItemGoodsBo {

	/**
	 * 子联盟的id
	 */
	private Integer unionItemId;
	/**
	 * 子联盟的名称
	 */
	private String unionItemName;
	/**
	 * 标题文案
	 */
	private String indexTag;
	
	
	private String touchUrlMore;

	private List<SyUnionItemGoodsList> goodsList;

	public Integer getUnionItemId() {
		return unionItemId;
	}

	public void setUnionItemId(Integer unionItemId) {
		this.unionItemId = unionItemId;
	}

	public String getUnionItemName() {
		return unionItemName;
	}

	public void setUnionItemName(String unionItemName) {
		this.unionItemName = unionItemName;
	}

	public String getIndexTag() {
		return indexTag;
	}

	public void setIndexTag(String indexTag) {
		this.indexTag = indexTag;
	}

	public List<SyUnionItemGoodsList> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<SyUnionItemGoodsList> goodsList) {
		this.goodsList = goodsList;
	}

	public String getTouchUrlMore() {
		return touchUrlMore;
	}

	public void setTouchUrlMore(String touchUrlMore) {
		this.touchUrlMore = touchUrlMore;
	}
	
	
	



	

	

}
