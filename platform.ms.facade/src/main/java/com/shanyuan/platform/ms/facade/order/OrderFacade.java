package com.shanyuan.platform.ms.facade.order;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.order.bo.*;
import com.shanyuan.platform.ms.dao.order.entity.SyOrder;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderLog;
import com.shanyuan.platform.ms.dao.store.entity.SyStore;
import com.shanyuan.platform.ms.dao.user.entity.SyAddress;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.entity.SyShopAccount;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucher;
import com.shanyuan.platform.ms.facade.order.domain.OrderDetailDomain;
import com.shanyuan.platform.ms.facade.order.domain.PayedOrderDomain;

/**
 * @author 曹勇军
 */
public interface OrderFacade {

	void payOrder(Map<String,DisOrderGoodsInfo> newDisOrderGoodsInfoMap, Integer memberId,
				  Long paySn, String orderStatus, Map<Integer, SyShopAccount> syshopInfo, Map<Integer, SyMember> memberMap)throws CoreServiceException;
	/**
	 * @author caoyongjun
	 * @param addressId=地址
	 * @param ifcart=1:来源购物车
	 * @param memberId=用户id
	 * @param goodsId=来源不是购物车时有值，商品的id
	 * @param goodsNum=来源不是购物车时有值，商品的数量
	 * @param memberName=用户名
	 * @param memberTruename=用户真实姓名
	 * @param bocPoints=中元积分
	 * @param bocPointsUsed=已使用积分
	 * @param sharedMid=分享人id
	 * @param sharedGoodsGommonid=分享人分享的商品id
	 * @param buyerChannel=用户channel
	 * @param userWords=Map  用户对订单的留言
	 * @return
	 * @throws CoreServiceException
	 * 
	 */
	Map<String,Object> submitOrder(Integer addressId,Integer ifcart,Integer memberId,
			Integer goodsId,Integer goodsNum,
			String memberName,String memberTruename,
			Integer bocPoints,Integer bocPointsUsed,
			Integer sharedMid,Integer sharedGoodsCommonid,Integer voucherId,Map<String,String> userWords) throws CoreServiceException;
  /***
   *   @author zhongying
	 * @param ifcart=1:来源购物车
	 * @param memberId=用户id
	 * @param goodsId=来源不是购物车时有值，商品的id
	 * @param goodsNum=来源不是购物车时有值，商品的数量
	 * @param bocPoints=中元积分
	 * @param bocPointsUsed=已使用积分
	 * @return 
	 * @throws CoreServiceException
   */
	OrderListInfo getOrderPreSubmit(Integer addressId,Integer ifcart,Integer memberId,
			Integer goodsId,Integer goodsNum,
			Integer bocPoints,Integer bocPointsUsed
			) throws CoreServiceException;
	/**
	 * 个人购买记录
	 * @author zhongying
	 * @param memberId
	 * @param orderState
	 * @param pageSize
	 * @param currentpage
	 * @return
	 * @throws CoreServiceException
	 */
	Map<String, Object>  getOrderRecoderList(Integer memberId,  String  orderState,Integer pageSize,Integer currentpage) throws CoreServiceException;
	/**
	 * 未支付订单详情
	 * @author zhongying
	 * @param memberId
	 * @param orderState
	 * @param pageSize
	 * @param currentpage
	 * @return
	 * @throws CoreServiceException
	 */
	OrderDetailDomain getUnPayOrderDetail(Long paySn)throws CoreServiceException;
	/**
	 * 已支付订单详情
	 * @param orderid
	 * @param memberid
	 * @return
	 * @throws CoreServiceException
	 */
	PayedOrderDomain getPayedOrderDetail(Integer orderid,Integer memberid)throws CoreServiceException;

	/**
	 *
	 * @param orderid
	 * @param order
	 * @return
	 * @throws CoreServiceException
	 */
	PayedOrderDomain  getOrderGoods( List<OrderInfo> orderslist, SyOrder order, List<SyOrderLog> log, Map<String, Object> addressInfo,SyMember member,SyStore store) throws CoreServiceException;
	/**
	 * 获得帮扶明细
	 * @param memberId
	 * @return
	 * @throws CoreServiceException
	 */
	Map<String ,Object> getDonationDetailList(Integer memberId,Integer pageSize,Integer currentpage)throws CoreServiceException;
	 
	 /**
	  * @author caoyongjun
	  * 消费者处理提交订单的方法
	  */
	 void dealOrder(Long paySn,SyVoucher voucherInfo,Map<String,DisOrderGoodsInfo> newDisOrderGoodsInfoMap,Integer memberId,String memberName,String memberTruename
				,SyAddress syAddress,String resultKey,Map<Integer,BigDecimal> vourchGoods,Integer sharedMid,Integer sharedGoodsCommonid,Integer needPoints,String orderStatus,List<GoodsInfo> goodsInfoList,Map<Integer,Integer> goodsIdMap)throws CoreServiceException;

	/**
	 *
	 * @param goodsInfoList
	 * @param goodsIdMap
	 * @throws CoreServiceException
	 */
	void  updateNewSaleNum(List<GoodsInfo> goodsInfoList,Map<Integer,Integer> goodsIdMap)throws CoreServiceException;

	/***
	 * 获得已支付的数据
	 * @param orderInfoList
	 * @param payedOrderInfo
	 * @param publisherIds
	 * @param porderIds
	 * @return
	 * @throws CoreServiceException
	 */
	List<OrderRecordInfo> getHavePayedList(List<OrderRecordInfo> orderInfoList,
										   List<SyOrder> payedOrderInfo, List<Integer> publisherIds,List<Integer> syshopIds, List<Integer> porderIds)throws CoreServiceException;

	/**
	 *
	 *处理订单记录
	 * @auther zhongying
	 * @param orderInfoList
	 * @param payedOrderInfo
	 * @param storeInfos
	 * @param memberInfoByIds
	 * @param orderEvaluateIds
	 * @param refundReturnIds
	 * @param complainIds
	 * @param orderGoodsMap
	 * @return
	 * @throws CoreServiceException
	 */
	List<OrderRecordInfo>  dealOrderRecordInfo(List<OrderRecordInfo> orderInfoList, List<SyOrder> payedOrderInfo
			, List<SyStore> storeInfos	, Map<Integer, SyMember> memberInfoByIds, Map<Integer, SyShopAccount> syshopInfo ,List<Integer> orderEvaluateIds, Map<Integer,Integer> refundReturnIds
			, Map<Integer,Integer> complainIds, Map<Integer,OrderRecordInfo> orderGoodsMap) throws CoreServiceException;

	/**
	 * 获得发布信息
	 * @param orderinfo
	 * @param goodsProjectType
	 * @throws CoreServiceException
	 */
	void  getPublisherInfo(OrderInfo orderinfo, Integer goodsProjectType) throws CoreServiceException;

	/**
	 * 获得善企基金信息
	 * @param syOrderIds
	 * @return
	 * @throws CoreServiceException
	 */
	List<Map<String,Object>> getSyShopList(List<Integer> syOrderIds) throws CoreServiceException;

	/**
	 * 获得地址信息
	 * @auther zhongying
	 * @param orderId
	 * @return
	 * @throws CoreServiceException
	 */
	Map<String ,Object> getAddressInfo(Integer orderId) throws CoreServiceException;
	/**
	 * 处理订单事务
	 * @author zhongying
	 * @param paySn
	 * @param voucherInfo
	 * @param newDisOrderGoodsInfoMap
	 * @param memberId
	 * @param memberName
	 * @param memberTruename
	 * @param syAddress
	 * @param resultKey
	 * @param vourchGoods
	 * @param sharedMid
	 * @param sharedGoodsCommonid
	 * @param needPoints
	 * @param orderStatus
	 * @param goodsInfoList
	 * @param goodsIdMap
	 * @throws CoreServiceException
	 */
	void submitOrderTransaction(Long paySn,SyVoucher voucherInfo,Map<String,DisOrderGoodsInfo> newDisOrderGoodsInfoMap,Integer memberId,String memberName,String memberTruename
			,SyAddress syAddress,String resultKey,Map<Integer,BigDecimal> vourchGoods,Integer sharedMid,Integer sharedGoodsCommonid,Integer needPoints,String orderStatus,List<GoodsInfo> goodsInfoList
			,Map<Integer,Integer> goodsIdMap) throws CoreServiceException ;
	/**
	 * 同步异步开关
	 * @author zhongying
	 * @param paySn
	 * @param voucherInfo
	 * @param newDisOrderGoodsInfoMap
	 * @param memberId
	 * @param memberName
	 * @param memberTruename
	 * @param syAddress
	 * @param resultKey
	 * @param vourchGoods
	 * @param sharedMid
	 * @param sharedGoodsCommonid
	 * @param needPoints
	 * @param orderStatus
	 * @param goodsInfoList
	 * @param goodsIdMap
	 */
	void switchDealOrder(Long paySn,SyVoucher voucherInfo,Map<String,DisOrderGoodsInfo> newDisOrderGoodsInfoMap,Integer memberId,String memberName,String memberTruename
			,SyAddress syAddress,String resultKey,Map<Integer,BigDecimal> vourchGoods,Integer sharedMid,Integer sharedGoodsCommonid,Integer needPoints,String orderStatus,List<GoodsInfo> goodsInfoList,Map<Integer,Integer> goodsIdMap);
}