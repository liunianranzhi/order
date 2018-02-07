package com.shanyuan.platform.ms.core.biz.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.shanyuan.platform.ms.core.biz.BizOrderService;
import com.shanyuan.platform.ms.dao.biz.entity.SyBizOrderGoods;
import com.shanyuan.platform.ms.dao.biz.entity.SyBizOrderGoodsExample;
import com.shanyuan.platform.ms.dao.biz.mapper.SyBizOrderGoodsMapper;

/**
 * 
 * @author yangjian
 * @date 2018/01/03
 *
 */
@Component
public class BizOrderServiceImpl implements BizOrderService {
	
	@Autowired
	private SyBizOrderGoodsMapper syBizOrderGoodsMapper;

	@Override
	public Integer getSellNumForOrder(Integer mainOrderId) {
		SyBizOrderGoodsExample bizOrderGoodsExample = new SyBizOrderGoodsExample();
		bizOrderGoodsExample.createCriteria().andMainOrderIdEqualTo(mainOrderId);
		List<SyBizOrderGoods> selectByExample = syBizOrderGoodsMapper.selectByExample(bizOrderGoodsExample);
		Integer sellNum = 0;
		if(!CollectionUtils.isEmpty(selectByExample)){
			for (SyBizOrderGoods syBizOrderGoods : selectByExample) {
				sellNum += syBizOrderGoods.getGoodsNum();
			}
			return sellNum;
		}
		return 0;
	}
	
	/**
	 * 一个订单对应的商品总金额
	 */
	public BigDecimal getGoodsAmountForOrder(Integer mainOrderId) {
		SyBizOrderGoodsExample bizOrderGoodsExample = new SyBizOrderGoodsExample();
		bizOrderGoodsExample.createCriteria().andMainOrderIdEqualTo(mainOrderId);
		List<SyBizOrderGoods> selectByExample = syBizOrderGoodsMapper.selectByExample(bizOrderGoodsExample);
		BigDecimal goodsAmount = new BigDecimal(0);
		if(!CollectionUtils.isEmpty(selectByExample)){
			for (SyBizOrderGoods syBizOrderGoods : selectByExample) {
				goodsAmount = goodsAmount.add(syBizOrderGoods.getGoodsPrice());
			}
			return goodsAmount;
		}
		return goodsAmount;
	}

}
