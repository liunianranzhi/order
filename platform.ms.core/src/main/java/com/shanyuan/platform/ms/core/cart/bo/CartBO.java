/**
 * 
 */
package com.shanyuan.platform.ms.core.cart.bo;

import java.math.BigDecimal;

/**
 * @author 曹勇军
 *
 */
public class CartBO {
	private Integer cartId;
	private Integer count;
	private String goodsImage;
	private BigDecimal amount;
	private String goodsName;
	private String goodsUrl;
	private String goodsStatusStr;//描述下架状态 已下架
	private Integer goodsStatus;//1:正常,0:下架
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getGoodsImage() {
		return goodsImage;
	}
	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsUrl() {
		return goodsUrl;
	}
	public void setGoodsUrl(String goodsUrl) {
		this.goodsUrl = goodsUrl;
	}
	public String getGoodsStatusStr() {
		return goodsStatusStr;
	}
	public void setGoodsStatusStr(String goodsStatusStr) {
		this.goodsStatusStr = goodsStatusStr;
	}
	public Integer getGoodsStatus() {
		return goodsStatus;
	}
	public void setGoodsStatus(Integer goodsStatus) {
		this.goodsStatus = goodsStatus;
	}
	
	
}
