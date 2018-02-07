package com.shanyuan.platform.ms.core.biz;

import java.math.BigDecimal;

/**
 * 集采订单
 * @author yangjian
 *
 */
public interface BizOrderService {
	
	public Integer getSellNumForOrder(Integer mainOrderId);
	
	public BigDecimal getGoodsAmountForOrder(Integer mainOrderId);

}
