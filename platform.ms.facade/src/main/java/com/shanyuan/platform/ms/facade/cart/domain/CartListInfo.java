package com.shanyuan.platform.ms.facade.cart.domain;

import java.io.Serializable;
import java.util.List;

import com.shanyuan.platform.ms.core.cart.bo.CartGoodsBo;

public class CartListInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String trueName;
	private String splitKey;
	private String ownerType;
	private List<CartGoodsBo> cartlist;
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public String getSplitKey() {
		return splitKey;
	}
	public void setSplitKey(String splitKey) {
		this.splitKey = splitKey;
	}
	public List<CartGoodsBo> getCartlist() {
		return cartlist;
	}
	public void setCartlist(List<CartGoodsBo> cartlist) {
		this.cartlist = cartlist;
	}
	public String getOwnerType() {
		return ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}
	
	
}
