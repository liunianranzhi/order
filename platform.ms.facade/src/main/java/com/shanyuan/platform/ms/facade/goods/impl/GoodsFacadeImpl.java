package com.shanyuan.platform.ms.facade.goods.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.shanyuan.platform.ms.base.common.CommonRedisKey;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.goods.SyGoodsClassService;
import com.shanyuan.platform.ms.core.goods.SyGoodsCommonService;
import com.shanyuan.platform.ms.core.goods.bo.SyGoodsClassBo;
import com.shanyuan.platform.ms.core.store.AgentService;
import com.shanyuan.platform.ms.facade.goods.GoodsFacade;

/**
 * 商品
 * @author yangjian
 * @date 2017/10/31
 *
 */
@Component
public class GoodsFacadeImpl implements GoodsFacade {
	
	@Autowired
	private SyGoodsClassService syGoodsClassService;
	
	@Autowired
	private SyGoodsCommonService syGoodsCommonService;
	
	@Autowired
	private AgentService agentService;
	/**
	 * @Author wang chunru
	 * @Description 获取模块显示商品类型列表
	 * @param module 类型所属模块值
	 * @return List<SyGoodsClassBo>
	 * @throws
	 */
	@Override
	@Cacheable(value=CommonRedisKey.GoodsClass.GOODS_CLASS_LIST ,
		key="'"+CommonRedisKey.GoodsClass.GOODS_CLASS_LIST+"_'+#module")
	public List<SyGoodsClassBo> getGoodsClassListByModule(Integer module) throws CoreServiceException {
		return syGoodsClassService.getGoodsClassListByModule(module);
		
	}
	
	/**
	 * @Author wang chunru
	 * @Description 获取指定模块商品所有类型
	 * @param moduleClassId 所属模块类型ID
	 * @return List<SyGoodsClassBo>
	 * @throws
	 */
	@Override
	@Cacheable(value=CommonRedisKey.GoodsClass.GOODS_CLASS_LIST ,
			key="'"+CommonRedisKey.GoodsClass.GOODS_CLASS_LIST+"_'+#moduleClassId")
	public SyGoodsClassBo getGoodsClassList(Integer moduleClassId) throws CoreServiceException {
		return syGoodsClassService.getGoodsClassList(moduleClassId);
	}
	
	/**
	 * @Author wang chunru
	 * @Description 查询商品详情
	 * @param goodsCommonId 商品ID
	 * @return Map<String,Object>
	 * @throws
	 */
	@Override
	public Map<String, Object> getGoodsDetail(Integer goodsCommonId)
			throws CoreServiceException {
		return syGoodsCommonService.getGoodsDetail(goodsCommonId);
	}
	/**
	 * agentStats信息统计的定时任务
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return void
	 * @throws
	 */
	@Override
	public void agentStatsTask() {
		agentService.agentStatsTask();
	}
	
}
