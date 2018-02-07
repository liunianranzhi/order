package com.shanyuan.platform.ms.core.order;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.dao.user.entity.SyAddress;

public interface DealOrderService {
	
	Integer addPayOrderLog(Integer orderId,String logRole,String msg,String state);
	Integer updatePayInfo(Long paySn, Integer memberId) throws CoreServiceException;
	
	Integer updateOrderPay(DisOrderGoodsInfo ds, Integer memberId) throws CoreServiceException;
	
	void updateRedisInfo(BigDecimal orderamount, Integer orderid) throws CoreServiceException;
	
	void sendMessageForOrder(Integer publisherid,Integer orderid, String ownertype) ;
	void sendSMS(String companyName,String goodsname,String phone,Integer goodsNum);
	
	/**
	 * 拆分成订单
	 * @param goodsInfoList 商品信息list
	 * @return
	 */
	public Map<String,DisOrderGoodsInfo> splitToOrder(List<GoodsInfo> goodsInfoList);
	/**
	 * 创建订单支付
	 * @param paySn 支付编号
	 * @param memberId 买家id
	 * @return
	 * @throws CoreServiceException
	 */
	public	Integer addOrderPay(Long paySn,Integer memberId) throws CoreServiceException;
	/***
	 * 生成支付单号
	 * @param memberId 买家id
	 * @return
	 */
	public Long getPaySn(Integer memberId) ;
	
	void delOrder(Integer orderId)throws CoreServiceException;

	/***
	 * 
	 * @param disOrderGoods 订单商品信息
	 * @param paysn 支付比编号
	 * @param orderPayId 订单支付id
	 * @param memberId 买家id
	 * @param memberName 买家姓名
	 * @param memberTruename 买家真实名
	 * @param buyerChannel 买家channel
	 * @param appVariant 渠道
	 * @param areaInfo 地区内容
	 * @param address 地址
	 * @param sharedMid 分享者id
	 * @param sharedGoodsCommonId 分享的商品id
	 * @param storeDisCount 店铺优惠 
	 * @param platformDiscount 平台优惠
	 * @throws CoreServiceException
	 */
	public Integer addOrder(DisOrderGoodsInfo  ds,Long paySn,String orderStatus,String buyerChannel,
			String appVariant,Integer orderPayId,Integer memberId,String memberTruename) throws CoreServiceException;
		
	
	/**
	 * 添加订单商品记录表
	 * @param GoodsInfo 商品信息
	 * @param appVariant 渠道标识
	 * @param orderId 订单id
	 * @param buyerId 买家id
	 * @param sharedMid 分享者id
	 * @param sharedGoodsCommonId  分享的商品commonid
	 * @return
	 */
	public	Integer addOrderGoods(GoodsInfo goodsInfo, String appVariant, Integer orderId, Integer buyerId,
			Integer sharedMid, Integer sharedGoodsCommonId)throws CoreServiceException ;
	/**
	 * 
	 * @param storeId店铺id
	 * @param remark 
	 * @param orderMessage买家留言
	 * @param weight
	 * @param transport_type
	 * @param goodsInfo
	 * @param recAddressInfo地址信息
	 * @return
	 * @throws CoreServiceException
	 */
	public	Integer addOrderCommon(Integer orderId,Integer storeId,String remark ,String orderMessage,BigDecimal weight,Byte transport_type,GoodsInfo goodsInfo, SyAddress recAddressInfo)  throws CoreServiceException ;
	/**	 
	 * 添加订单日志
	 * @param orderId 订单id
	 * @return
	 */
	public Integer addOrderLog(Integer orderId);
	
	/**
	 * 处理订单信息(整合下单数据)
	 * @param disOrderGoods   处理前的订单信息
	 * @param userWords  	每单的卖家留言
	 * @param addressId
	 * @param memberId
	 * @return 订单信息store_cart_map  map，优惠商品map voucher_goods_amount_map ,优惠券承担方式 cost_mode
	 * @author zhangwd
	 */
	Map<String, Object> dealOrder(Map<String, DisOrderGoodsInfo> disOrderGoods, Map<String, String> userWords, Long cityId,  Integer memberId,Integer voucherId)throws CoreServiceException ;
/**
 * 处理订单数据
 * @param disOrderGoods
 * @param userWords
 * @param cityId
 * @param memberId
 * @return
 * @throws CoreServiceException
 */
	Map<String, Object> calOrder(Map<String, DisOrderGoodsInfo> disOrderGoods, Map<String, String> userWords, Long cityId,  Integer memberId,Integer voucherId) throws CoreServiceException ;
}
