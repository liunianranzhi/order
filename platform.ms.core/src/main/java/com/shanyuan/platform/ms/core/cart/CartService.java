package com.shanyuan.platform.ms.core.cart;

import java.util.List;
import java.util.Map;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.cart.bo.CartGoodsBo;
import com.shanyuan.platform.ms.core.cart.bo.SyCartBO;
import com.shanyuan.platform.ms.core.cart.bo.SyGoodsCartBO;
import com.shanyuan.platform.ms.dao.cart.entity.SyCart;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;

/**
 * @author 曹勇军
 *
 */
public interface CartService {
	/**
	 * 添加购物车
	 * @author zy
	 * @param memberId
	 * @param goodsId
	 * @param goodsNum
	 * @param userstoreId
	 * @return
	 * @throws CoreServiceException
	 */
	Integer addCartInfo(Integer memberId,Integer goodsId,Integer goodsNum,List<Integer> userstoreId) throws CoreServiceException;
	/**
	 * 获得商品，并校验相关信息
	 * @author zy
	 * @param memberId
	 * @param goodsId
	 * @param goodNum
	 * @param userstoreId
	 * @return
	 * @throws CoreServiceException
	 */
	CartGoodsBo checkGoods(Integer memberId,Integer goodsId,Integer goodNum,List<Integer> userstoreId) throws CoreServiceException;
	/**
	 * 钟颖
	 * @param memberId
	 * @param type  预留
	 * @return
	 * @throws CoreServiceException
	 */
	Map<String , Object> cartListByMid(Integer memberId,Integer pagesize,Integer currentpage,String orderBy) throws CoreServiceException;
	/**
	 * @author zy
	 * @param syCart
	 * @return
	 * @throws CoreServiceException
	 */
	Integer addCart(SyCart syCart)throws CoreServiceException;
	/**
	 * 编辑购物车，编辑数量或更改选中状态
	 * @author zy
	 * @param cartId
	 * @param memberId
	 * @param goodsNum
	 * @param ischeck
	 * @return
	 * @throws CoreServiceException
	 */
	SyCartBO  updateNewCart(Integer cartId,Integer memberId,Integer goodsNum,String ischeck )throws CoreServiceException;
	/**
	 * @author zhongying
	 * @param syGoods
	 * @param goodsCommon
	 * @param memberId
	 * @param goodsNum
	 * @return
	 * @throws CoreServiceException
	 */
	CartGoodsBo getCartGoodsBo(SyGoods syGoods ,SyGoodsCommon goodsCommon,Integer memberId,Integer goodsNum) throws CoreServiceException;
	/**
	 *更新购物车
	 * @param record
	 * @return
	 * @throws CoreServiceException
	 */
	SyCartBO  editCart(SyCart record)throws CoreServiceException;
	/**
	 * 获得购物车总金额
	 * @param record
	 * @return
	 * @throws CoreServiceException
	 */
	SyCartBO  getNumCart(SyCart record )throws CoreServiceException;
	/**
	 * 更新选中状态
	 * @param goodsid
	 * @param buyerid
	 * @param checked
	 * @throws CoreServiceException
	 */
	void updateChecked(Integer goodsid,Integer buyerid,byte checked)throws CoreServiceException ;
	/**
	 * 查询购物车条数
	 * @param buyerId
	 * @param checked
	 * @return
	 * @throws CoreServiceException
	 */
	Integer selectCartNum(Integer  buyerId,Byte checked) throws CoreServiceException;
	
	/**
	 * @author 曹勇军
	 * @param goodsId=商品id
	 * @param quantity=数量
	 * @return
	 */
	SyGoodsCartBO getGoodsOnlineInfo(Integer goodsId,Short quantity);
	
	/**
	 * @author 曹勇军
	 * @param cartId=购物车id
	 * @param buyerId=用户id
	 * @return 总数 和 总金额
	 */
	SyCartBO deleteCartById(Integer cartId,Integer buyerId) throws CoreServiceException;
	
	/**
	 * @author 曹勇军
	 */
	//GoodsCartBO cartList(Integer memberId,String channel,Integer goodsProjectType)throws CoreServiceException;
	
/*	*//**
	 * @author 曹勇军
	 *//*
	SyCartBO updateCart(Integer cartId, Short quantity,Integer buyerId,BigDecimal goodsPrice)throws CoreServiceException;*/

	/**
	 * 查询购物车中用户所选中的商品数量
	 * @param memberId 用户id
	 * @param checked	选中状态 1选中  0未选中 
	 * @return
	 * @author zhangwd
	 */
	Map<Integer, Integer> getGoodsNumByMember(Integer memberId, Byte checked);

	List<SyCart> cartListByMemberId(Integer memberId,Byte checke);
	
	void deleteCartByCartIdList(List<Integer> cartIdList,Integer buyerId) throws CoreServiceException;
}
