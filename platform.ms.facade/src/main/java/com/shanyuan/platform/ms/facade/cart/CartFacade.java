package com.shanyuan.platform.ms.facade.cart;

import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;

/**
 * @author 曹勇军
 *
 */
public interface CartFacade {
	/**
	 * @author zhongying
	 * 查询购物车
	 * @param memberId
	 * @return
	 * @throws CoreServiceException
	 */
	Map<String , Object> cartListByMid(Integer memberId,Integer pagesize,Integer currentpage) throws CoreServiceException;
	/**
	 * 添加购物车
	 * @author zhongying
	 * @param memberId
	 * @param goodsId
	 * @param goodsNum
	 * @return
	 * @throws CoreServiceException
	 */
	 Map<String , Object> addNewCart(Integer memberId,Integer goodsId,Integer goodsNum)throws CoreServiceException;
	 /**
	  * 删除购物车
	  * @author zhongying
	  * @param memberId
	  * @param cartId
	  * @return
	  * @throws CoreServiceException
	  */
	 Map<String , Object> delCart(Integer memberId,Integer cartId)throws CoreServiceException;
	 /**
	  * 更新购物车数量或者选中状态
	  * @param memberId
	  * @param cartId
	  * @param goodsNum
	  * @param ischeck
	  * @return
	  * @throws CoreServiceException
	  */
	 Map<String , Object> updateCart(Integer memberId,Integer cartId,Integer goodsNum,String ischeck)throws CoreServiceException;
}
