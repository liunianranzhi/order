package com.shanyuan.platform.ms.core.goods;

import java.util.List;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoods;

public interface SyGoodsService {
	
	/**
	 * 商品详细信息  by sunyue
	 * @param goodsIds
	 * @param type 预留字段
	 * @return
	 * @throws CoreServiceException
	 */
	public List<SyGoods> getGoodsInfo(List<Integer> goodsIds,String orderByClause) throws CoreServiceException;
	
	/** 
	 * 增加销量   和 减库存数量
	 * @author caoyongjun
	 * @param goodsId
	 * @param count
	 * @throws CoreServiceException
	 */
	void updateSaleCountAndStockCount(Integer goodsId,Integer count)throws CoreServiceException;

	/**
	 * 增加销量 活动销量
	 * @auther zy
	 * @param goodsId
	 * @param count
	 * @throws CoreServiceException
	 */
	void updateTopicSaleNum(Integer goodsId,Integer count)throws CoreServiceException;

	SyGoods getGoodsByCommonId(Integer goodsCommonid)throws CoreServiceException;
	
	/**
	 * @author caoyongjun
	 * 查询redis缓存
	 * @param goodsIds
	 * @param OrderByClause
	 * @return
	 * @throws CoreServiceException
	 */
	List<SyGoods> selectGoodsInfo(List<Integer> goodsIds,String orderByClause) throws Exception;
	/**
	 * 获得商品list
	 * @author 钟颖
	 * @param goodsIds
	 * @param orderByClause
	 * @param type
	 * @return
	 * @throws CoreServiceException
	 */
	List<SyGoods> getGoodsList(List<Integer> goodsIds,String orderByClause,String type) throws CoreServiceException;

	/**
	 * 根据goodsId 查询商品信息
	 * @param goodsId
	 * @return
	 * @auther zhangwd
	 */
	SyGoods selectGoodsInfo(Integer goodsId);
}
