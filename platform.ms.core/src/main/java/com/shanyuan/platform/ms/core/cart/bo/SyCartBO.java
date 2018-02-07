/**
 * 
 */
package com.shanyuan.platform.ms.core.cart.bo;

import java.math.BigDecimal;

/**
 * @author 曹勇军
 *
 */
public class SyCartBO {
	private Integer goodsNum;
	private Integer cartNum;
	private BigDecimal moneyAmount;
	public Integer getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}
	public Integer getCartNum() {
		return cartNum;
	}
	public void setCartNum(Integer cartNum) {
		this.cartNum = cartNum;
	}
	public BigDecimal getMoneyAmount() {
		return moneyAmount;
	}
	public void setMoneyAmount(BigDecimal moneyAmount) {
		this.moneyAmount = moneyAmount;
	}
	
	

}
