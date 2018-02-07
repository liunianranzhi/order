package com.shanyuan.platform.ms.facade.goods;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsClassInfo;


public interface BizBuyFacade {

	/**
	 * 获取善缘甄选-集采推荐商品列表
	 * @return
	 * @author zhangwd
	 */
	Map<String, Object> getBizBuyRecomGoods() throws CoreServiceException;

	/**
	 * 集采分类接口
	 * @throws CoreServiceException
	 * @author zhangwd
	 * @return 
	 */
	List<SyGoodsClassInfo> getBizBuyGoodsClassList(String gcType) throws CoreServiceException;
	
	List<SyGoodsClassInfo> getBizGoodsClass()  throws CoreServiceException;
}
