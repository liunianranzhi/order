package com.shanyuan.platform.ms.core.order;

import java.math.BigDecimal;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;

public interface OrderService {

	//运费计算  
	Map<String,BigDecimal> goodsFreight(Map<String,DisOrderGoodsInfo> disOrderGoods,Long cityId)throws CoreServiceException;
	
	/**
	 * 
	 * @param memberId 用户id
	 * @param orderStateSuccess 订单状态
	 * @return 
	 * @author zhangwd
	 */
	Integer getMemberBuyNum(Integer memberId, String orderStateSuccess); 
}
