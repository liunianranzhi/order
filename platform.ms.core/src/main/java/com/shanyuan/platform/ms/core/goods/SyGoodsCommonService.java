package com.shanyuan.platform.ms.core.goods;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.goods.bo.AreaBo;
import com.shanyuan.platform.ms.core.goods.bo.GoodsCommonInfo;
import com.shanyuan.platform.ms.core.goods.bo.SpecialGoodsBo;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommonCountInfo;
import com.shanyuan.platform.ms.dao.union.entity.SyUnionItemGoodsList;

public interface SyGoodsCommonService {
	
	Integer updateSaleNum(Integer goodscommonid)throws CoreServiceException;

	//public List<SyGoodsCommonBo> list(SyGoodsCommonExample goodsCommon);
	
	public SyGoodsCommon getById(Integer goodsCommonId);
	/**
	 * 校验善源商场的购买数量
	 * by zy
	 * @param goodsInfo
	 * @param buyerId
	 * @throws CoreServiceException
	 */
	public  void checkBuyNum(GoodsInfo goodsInfo,Integer buyerId) throws CoreServiceException;
	/**
	 * @author zhongying
	 * @param goodsInfo
	 * @param buyerId
	 * @return
	 * @throws CoreServiceException
	 */
	Integer getHaveBuyNum(GoodsInfo goodsInfo,Integer buyerId) throws CoreServiceException;
	/**
	 * 购买数量冲正
	 * by zy
	 * @param goodsId
	 * @param buyerId
	 * @param goodsNum
	 * @throws CoreServiceException
	 */
	public void rebackBuyNum(Integer buyerId, Integer goodsId, Integer goodsNum)throws CoreServiceException;
	/**
	 * 校验购买数量是否大于库存数量
	 * by zy
	 * @param goodsInfo
	 * @param goodsNum 购买数量
	 * @throws CoreServiceException
	 */
	public  void checkStore(GoodsInfo goodsInfo) throws CoreServiceException;
	/**
	 * 校验善源商场的购买数量
	 * @param buyerId
	 * @param goodsId
	 * @param goodsNum  购买数量
	 * @throws CoreServiceException
	 */
	public void updateSyshopBuyNum(Integer buyerId,Integer goodsId,Integer goodsNum) throws CoreServiceException;


	/**
	 * 商品列表 by sunyue
	 * @param goodsList
	 * @return
	 * @throws CoreServiceException
	 */
	public List<SyGoodsCommon> getGoodsCommonInfo(List<Integer> goodsCommonids) throws CoreServiceException;
	
	/**
	 * 大家帮 
	 * @param supportCountryIds  定点扶贫县的id
	 * @return
	 * @throws CoreServiceException
	 */
	public List<GoodsCommonInfo> getHelpGoodsList(List<Long> supportcountryIds, Integer unionItemId) throws CoreServiceException;
	
	/**
	 * 特产馆      by sunyue
	 * @param channel   渠道
	 * @param areaid3   县的id
	 * @param str     区域
	 * @param proviceid   省的id
	 * @param cityid	市的id
	 * @param text    特产名称
	 * @return
	 * @throws CoreServiceException
	 */
	public SpecialGoodsBo  getSpecialList(AreaBo ab,String channel) throws CoreServiceException;
	
	/**
	 * 子联盟商品
	 * @param publisherIds
	 * @return
	 * @throws CoreServiceException
	 */
	List<SyUnionItemGoodsList> getUnionItemGoodsList(Integer unionItemId) throws CoreServiceException;
	
	

	/**
	 * 查询发布者的商品
	 * @param publisherId
	 * @return
	 * @throws CoreServiceException
	 */
	public List<SyGoodsCommon> getGoodsByPublisher(Integer publisherId) throws CoreServiceException;
	
	/**
	 * 根据发布者查询商品条数
	 * @param publisherId
	 * @return
	 */
	public List<SyGoodsCommonCountInfo> getGoodsCountList(List<Integer> publisherId) throws CoreServiceException;
	
	/**
	 * @param token 
	 * @Author wang chunru
	 * @Description 查询商品详情
	 * @param goodsCommonId 商品ID
	 * @return Map<String,Object>
	 * @throws
	 */
	Map<String, Object> getGoodsDetail(Integer goodsCommonId) throws CoreServiceException; 
	
	/**
	 * 查询购物车的商品信息
	 * @param goodsId
	 * @return
	 */
	SyGoodsCommon  selectCartGoodsInfoByGoodsId(Integer goodsId);
	
	void insertGoodsInfoToRedis(List<SyGoods> goodsList) throws Exception;
	
	void updataRedisGoodsStorageAndSellNum(Integer goodsId,Integer goodsNum)throws Exception;

	/**
	 * 更新活动的库存
	 * @param goodsId
	 * @param goodsNum
	 * @throws Exception
	 */
	void updataRedisSellNum(Integer goodsId,Integer goodsNum)throws Exception;
	
	/**
	 * 通过商品分类三级分类下的商品
	 * @param gcId
	 * @param 商品所属  大爱，善缘，集采
	 * @return
	 * @author zhangwd
	 */
	List<Integer> getGoodsCommonIdListByGcId(Integer gcId, String gcType) throws CoreServiceException;
	
	Integer[] getFullBizGoodsClass(Integer gcId) throws CoreServiceException;
	
	List<Integer> getFullBizClass(Integer gcId) throws CoreServiceException;
	
	/**
	 * 获取有商品的会员id列表
	 * @return
	 * @throws CoreServiceException
	 */
	List<Integer> memberHasGoods() throws CoreServiceException;
	
	/**
	 * 获取商品总数
	 * @author yangjian
	 * @param countryId
	 * @return
	 * @throws CoreServiceException
	 */
	Integer getGoodsNum(Long countryId, String ownerType) throws CoreServiceException;
}
