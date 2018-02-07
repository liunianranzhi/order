package com.shanyuan.platform.ms.core.cart.bo;

/**
 * @author 曹勇军
 *
 */
public class GoodsCartBO {
	private String totalAmount;//总金额
	private Integer totalCount;//总数量
	private Object obj;
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}
