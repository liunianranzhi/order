package com.shanyuan.platform.ms.core.goods.impl;


import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.shanyuan.platform.ms.base.common.CommonRedisKey;
import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.GoodsConstant;
import com.shanyuan.platform.ms.core.goods.SyGoodsCommonService;
import com.shanyuan.platform.ms.core.goods.SyGoodsService;
import com.shanyuan.platform.ms.core.order.impl.exceptype.OrderServiceExcepType;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsExample;
import com.shanyuan.platform.ms.dao.goods.mapper.SyGoodsMapper;



/**
 * 商品详细信息
 * @author sunyue
 *
 */
@Component
public class SyGoodsServiceImpl implements SyGoodsService{
	
	private static final Logger logger = LoggerFactory.getLogger(SyGoodsServiceImpl.class);
	
	@Autowired
	private SyGoodsMapper syGoodsMapper;
	
	@Autowired
	private SyGoodsCommonService syGoodsCommonService;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	/**
	 * @author caoyongjun
	 * @param goodsIds
	 * @param 熔断机制   redis有问题时直接拒绝访问然后调用fallbackMethod
	*/
	@HystrixCommand(fallbackMethod = "getGoodsInfo")
	@Override
	public List<SyGoods> selectGoodsInfo(List<Integer> goodsIds,String orderByClause) throws Exception {
		
		List<SyGoods> resultList=new ArrayList<SyGoods>();
		
		if(!ObjectUtils.isEmpty(goodsIds)){
			//1.从redis中取出来数据
			HashOperations<String, String,String> ops = stringRedisTemplate.opsForHash();
			List<Integer> notFindGoodsIds=new ArrayList<Integer>();
			
			List<String> hashKeys=new ArrayList<String>();
			hashKeys.add("price");
			hashKeys.add("sellNum");
			hashKeys.add("collectNum");
			hashKeys.add("storage");
			hashKeys.add("purchasePrice");
			hashKeys.add("bocPointsPrice");
			hashKeys.add("goodsId");
			hashKeys.add("status");
			hashKeys.add("verify");
			hashKeys.add("maxBuyNum");
			hashKeys.add("goodsCommonid");
			hashKeys.add("goodsCode");
//			hashKeys.add("helpNum");
  		    hashKeys.add("goodsSpec");
			
			for(Integer goodsId:goodsIds){
				
				String key=CommonRedisKey.GoodsInfoRedisKey.GOODS_INFO_PRE+goodsId;
				
				List<String> redisData=ops.multiGet(key,hashKeys);
				
				if(ObjectUtils.isEmpty(redisData) || ObjectUtils.isEmpty(redisData.get(6))){
					//代表redis没有值，就要去mysql查找
					notFindGoodsIds.add(goodsId);
				}else{
					//如果库存小于等于0就直接删除缓存的数据
					if(Integer.valueOf(redisData.get(3))<=0){
						notFindGoodsIds.add(goodsId);
						ops.delete(CommonRedisKey.GoodsInfoRedisKey.GOODS_INFO_PRE+goodsId, "storage");
					}else{
						SyGoods syGoods=new SyGoods();
						 
						String price=redisData.get(0);
						String sellNum=redisData.get(1);
						String collectNum=redisData.get(2);
						String storage=redisData.get(3);
						String purchasePrice=redisData.get(4);
						String bocPointsPrice=redisData.get(5);
						String status=redisData.get(7);
						String verify=redisData.get(8);
						String maxBuyNum=redisData.get(9);
						String goodsCommonid=redisData.get(10);
						String goodsCode=redisData.get(11);
						String goodsSpec=redisData.get(12);

						
						if(StringUtils.isNotBlank(price)){
							syGoods.setGoodsPrice(new BigDecimal(price));
						}
						if(StringUtils.isNotBlank(sellNum)){
							syGoods.setGoodsSalenum(Integer.valueOf(sellNum));
						}
						if(StringUtils.isNotBlank(collectNum)){
							syGoods.setGoodsCollect(Integer.valueOf(collectNum));
						}
						if(StringUtils.isNotBlank(purchasePrice)){
							syGoods.setPurchasePrice(new BigDecimal(purchasePrice));
						}
						if(StringUtils.isNotBlank(bocPointsPrice)){
							syGoods.setBocPointsPrice(new BigDecimal(bocPointsPrice));
						}
						if(StringUtils.isNotBlank(storage)){
							syGoods.setGoodsStorage(Long.valueOf(storage));
						}
						syGoods.setGoodsId(goodsId);
						
						if(StringUtils.isNotBlank(status)){
							syGoods.setGoodsState(Byte.valueOf(status));
						}
						if(!ObjectUtils.isEmpty(verify)){
							syGoods.setGoodsVerify(Byte.valueOf(verify));
						}
						if(StringUtils.isNotBlank(maxBuyNum)){
							syGoods.setMaxBuyNum(Integer.valueOf(maxBuyNum));
						}
						if(StringUtils.isNotBlank(goodsCommonid)){
							syGoods.setGoodsCommonid(Integer.valueOf(goodsCommonid));
						}
						if(StringUtils.isNotBlank(goodsCode)){
							syGoods.setGoodsCode(goodsCode);
						}
						if(!StringUtils.isNotBlank(goodsSpec)){
							goodsSpec ="";
						}
						syGoods.setGoodsSpec(goodsSpec);
						//暂时不存帮助数量
						resultList.add(syGoods);
					}
				}
			}
			
			if(!ObjectUtils.isEmpty(notFindGoodsIds)){
				resultList.addAll(getGoodsInfo(goodsIds, orderByClause));
			}
		}
		
		return resultList;
		
	}
	
	
	/**
	 * 商品在售的详细信息  by sunyue
	 * @param goodsIds
	 * @param OrderByClause  排序的字段
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
	public List<SyGoods> getGoodsInfo(List<Integer> goodsIds,String orderByClause) throws CoreServiceException {
		SyGoodsExample sge = new SyGoodsExample();
		sge.createCriteria().andGoodsIdIn(goodsIds).andGoodsVerifyEqualTo(GoodsConstant.GoodsVerify.GOODS_VERIFY1);
		//.andGoodsStorageGreaterThan(0L);
		sge.setOrderByClause(orderByClause);
		List<SyGoods> goodsList=this.syGoodsMapper.selectByExample(sge);
//		if(!ObjectUtils.isEmpty(goodsList)) {
//			// redis放入缓存中
//			try{
//				syGoodsCommonService.insertGoodsInfoToRedis(goodsList);
//			}catch(Exception e){
//				e.printStackTrace();
//			}
//		}
		
		logger.error(" fallback method(selectGoodsInfo) start： goodsIds={}",goodsIds);
		
		return goodsList;
	}
	/**
	 * 
	 */
	public List<SyGoods> getGoodsList(List<Integer> goodsIds,String orderByClause,String type) throws CoreServiceException {
		//type 预留
		SyGoodsExample sge = new SyGoodsExample();
		sge.createCriteria().andGoodsIdIn(goodsIds);
		sge.setOrderByClause(orderByClause);
		List<SyGoods> goodsList=this.syGoodsMapper.selectByExample(sge);
		return goodsList;
	}

	@Override
	public SyGoods selectGoodsInfo(Integer goodsId) {



		return null;
	}

	/**
	 * @author 曹勇军
	 * 乐观锁，减库存如果结果为小于0就抛出异常
	 * 
	 * 由于Unsigned字段  不会出现负数所以会报出异常
	 */
	@Override
	public void updateSaleCountAndStockCount(Integer goodsId, Integer count) throws CoreServiceException {
		try {
			if(goodsId!=null && count!=null && count>0){
				SyGoods syGoods=new SyGoods();
				syGoods.setGoodsId(goodsId);
				syGoods.setGoodsSalenum(count);
				
				if(syGoodsMapper.updateSaleCountAndStockCount(syGoods)==0){
					
					logger.info("[OrderService][updateSaleCountAndStockCount] 商品编号为:{} 的商品库存不足，购买失败!", goodsId);
					
					throw new CoreServiceException(OrderServiceExcepType.STOCK_COUNT_NOT_ENOUGH_FAIL,MessageFormat.format("[OrderService][updateSaleCountAndStockCount] 商品编号为:{0} 的商品库存不足，购买失败!", goodsId));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			if(e instanceof DataIntegrityViolationException){
				throw new CoreServiceException(OrderServiceExcepType.STOCK_COUNT_NOT_ENOUGH_FAIL,MessageFormat.format("[OrderService][updateSaleCountAndStockCount] 商品编号为:{0} 的商品库存不足，购买失败!", goodsId));
			}else{
				throw new CoreServiceException(CoreServiceExcepType.DEFAULT_TYPE,e.getMessage(),e);
			}
		}
		try{
			//调用缓存中的数据更新数量
			syGoodsCommonService.updataRedisGoodsStorageAndSellNum(goodsId,count);
		}catch(Exception e){
			//失败就不管了
			logger.info(e.getMessage());
		}
	}

	/**
	 * @auther zy
	 * @param goodsId
	 * @param count
	 * @throws CoreServiceException
	 */
	@Override
	public void updateTopicSaleNum(Integer goodsId, Integer count) throws CoreServiceException {
		try {
			if(goodsId!=null && count!=null && count>0){
				SyGoods syGoods=new SyGoods();
				syGoods.setGoodsId(goodsId);
				syGoods.setGoodsSalenum(count);

				if(syGoodsMapper.updateSaleCount(syGoods)==0){

					logger.info("[OrderService][updateTopicSaleNum] 商品编号为:{} 更新失败，购买失败!", goodsId);

					throw new CoreServiceException(OrderServiceExcepType.STOCK_COUNT_NOT_ENOUGH_FAIL,MessageFormat.format("[OrderService][updateTopicSaleNum] 活动商品编号为:{0} 更新失败 ，购买失败!", goodsId));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			if(e instanceof DataIntegrityViolationException){
				throw new CoreServiceException(OrderServiceExcepType.STOCK_COUNT_NOT_ENOUGH_FAIL,MessageFormat.format("[OrderService][updateTopicSaleNum]  活动商品编号:{0} 更新失败，购买失败!", goodsId));
			}else{
				throw new CoreServiceException(CoreServiceExcepType.DEFAULT_TYPE,e.getMessage(),e);
			}
		}
		try{
			//调用缓存中的数据更新数量
			syGoodsCommonService.updataRedisSellNum(goodsId,count);
		}catch(Exception e){
			//失败就不管了
			logger.info(e.getMessage());
		}
	}

	@Override
	public SyGoods getGoodsByCommonId(Integer goodsCommonid) throws CoreServiceException {
		SyGoodsExample example=new SyGoodsExample();
		example.createCriteria().andGoodsCommonidEqualTo(goodsCommonid);
		List<SyGoods> list=syGoodsMapper.selectByExample(example);
		if(ObjectUtils.isEmpty(list)){
			return null;
		}else{
			return list.get(0);
		}
	}
	
	

}

