package com.shanyuan.platform.ms.facade.goods;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.goods.bo.SyGoodsClassBo;

/**
 * 商品
 * @author yangjian
 * @date 2017/10/31
 *
 */
public interface GoodsFacade {
	/**
	 * @Author wang chunru
	 * @Description 获取模块显示商品类型列表
	 * @param module 类型所属模块值
	 * @return List<SyGoodsClassBo>
	 * @throws
	 */
	List<SyGoodsClassBo> getGoodsClassListByModule(Integer module) throws CoreServiceException;
	
	/**
	 * @Author wang chunru
	 * @Description 获取指定模块商品所有类型
	 * @param moduleClassId 所属模块类型ID
	 * @return SyGoodsClassBo
	 * @throws
	 */
	SyGoodsClassBo getGoodsClassList(Integer moduleClassId) throws CoreServiceException;
	
	/**
	 * @Author wang chunru
	 * @Description 查询商品详情
	 * @param goodsCommonId 商品ID
	 * @return Map<String,Object>
	 * @throws
	 */
	Map<String,Object> getGoodsDetail(Integer goodsCommonId) throws CoreServiceException;
	/**
	 * agentStats信息统计的定时任务
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return void
	 * @throws
	 */
	void agentStatsTask();
}
