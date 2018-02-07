package com.shanyuan.platform.ms.core.goods;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.core.topic.bo.TopicGoodsInfo;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.user.entity.SyAddress;

public interface GoodsListService {
	/***
	 * 综合goods和goodcommon 列表
	 * @param idsNum goodsid-goodsNum
	 * @param buyerId 买家id
	 * @return List<GoodsInfo>
	 */
	List<GoodsInfo> getGoodsInfoList(Map<Integer, Integer> idsNum,List<Integer> goodsIdList,Integer buyerId,SyAddress syAddress)throws CoreServiceException  ;
	/**
	 * 判断是否符合购买地区
	 * @param goodscommon
	 * @param syAddress
	 * @return
	 */
	String checkBuyAreaStr(SyGoodsCommon goodscommon,SyAddress syAddress)throws CoreServiceException;

	/**
	 * 包含活动价的goods
	 * @param goodsNumMap
	 * @param goodsIdList
	 * @param buyerId
	 * @param syAddress
	 * @return
	 * @throws CoreServiceException
	 */
	List<GoodsInfo> getGoodsList(Map<Integer, Integer> goodsNumMap,List<Integer> goodsIdList, Integer buyerId,SyAddress syAddress)throws CoreServiceException;

	/**
	 * 活动价的计算
	 * @param goodsNumMap
	 * @param goodsIdList
	 * @param buyerId
	 * @param syAddress
	 * @return
	 * @throws CoreServiceException
	 */
	List<GoodsInfo> getTopicGoodsList(Map<Integer, Integer> goodsNumMap,Map<Integer, TopicGoodsInfo> topicGoodsMap, Integer buyerId,SyAddress syAddress)throws CoreServiceException;

	/**
	 *区分活动和非活动
	 * @param goodsIdList
	 * @return
	 * @throws CoreServiceException
	 */
	public Map<String,Object> getGoodsDiff(List<Integer> goodsIdList)throws CoreServiceException;

	/**
	 *
	 * @param goodsProjectType
	 * @param assistId
	 * @param ownerType
	 * @return
	 * @throws CoreServiceException
	 */
	String getGoodsOwnerType(Integer goodsProjectType,Integer assistId ,String ownerType)throws CoreServiceException;
}