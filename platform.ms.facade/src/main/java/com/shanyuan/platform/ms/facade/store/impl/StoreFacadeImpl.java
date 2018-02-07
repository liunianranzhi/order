/**
 * 
 */
package com.shanyuan.platform.ms.facade.store.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.goods.SearchGoodsService;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
import com.shanyuan.platform.ms.facade.goods.SearchGoodsFacade;
import com.shanyuan.platform.ms.facade.store.StoreFacade;

/**
 * @author 曹勇军
 *
 */
@Component
public class StoreFacadeImpl implements StoreFacade {
	
	@Autowired
	private SearchGoodsService searchGoodsService;
	
	@Autowired
	private SearchGoodsFacade searchGoodsFacade;
	
	@SuppressWarnings("unchecked")
	
	@Cacheable(cacheNames="ms_store_goods"  ,key="'ms_store_goods_hot_sell_' + #p0 ")
	@Override
	public List<Map<String,Object>> storeHotSellGoodslist(Integer publisherId)throws CoreServiceException{
		
	    List<Map<String,Object>> resultList=new ArrayList<Map<String,Object>>();
	    //4.查询商品列表
  		Map<String, Object> goodsMap = searchGoodsService.searchSyGoodsList(null, "sale_num desc",null, null,5, publisherId);
  		if (!ObjectUtils.isEmpty(goodsMap) && !ObjectUtils.isEmpty(goodsMap.get("goodsList"))) {
			List<SyGoodsCommon> goodsCommonList = (List<SyGoodsCommon>) goodsMap.get("goodsList");
  			Map<String, Object> resultMap = new HashMap<String, Object>();
  			for (SyGoodsCommon syGoodsCommon : goodsCommonList) {
  				resultList.add(searchGoodsFacade.setDataMap(resultMap, syGoodsCommon));
  			}
  		}
		return resultList;
	}

	@SuppressWarnings("unchecked")
	@Cacheable(cacheNames="ms_store_goods"  ,key="'ms_store_goods_list_' + #p0 ")
	@Override
	public Map<String,Object> storeGoodslist(Integer publisherId,Integer pageNo)throws CoreServiceException{
		
		Map<String,Object> resultData=new HashMap<String,Object>();
	    List<Map<String,Object>> resultList=new ArrayList<Map<String,Object>>();
	    //4.查询商品列表
  		Map<String, Object> goodsMap = searchGoodsService.searchSyGoodsList(null, null ,null, pageNo,null, publisherId);
  		if (!ObjectUtils.isEmpty(goodsMap) && !ObjectUtils.isEmpty(goodsMap.get("goodsList"))) {
			List<SyGoodsCommon> goodsCommonList = (List<SyGoodsCommon>) goodsMap.get("goodsList");
  			Map<String, Object> resultMap = new HashMap<String, Object>();
			resultData.put("hasNext", goodsMap.get("hasNext"));
  			for (SyGoodsCommon syGoodsCommon : goodsCommonList) {
  				resultList.add(searchGoodsFacade.setDataMap(resultMap, syGoodsCommon));
  			}
  			resultData.put("goodsList", resultList);
  		}
		return resultData;
	}
}
