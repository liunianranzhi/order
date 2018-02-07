package com.shanyuan.platform.ms.core.order;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
import com.shanyuan.platform.ms.core.order.bo.OrderGoods;
import com.shanyuan.platform.ms.core.order.bo.OrderInfo;
import com.shanyuan.platform.ms.core.order.bo.OrderListInfo;
import com.shanyuan.platform.ms.core.order.bo.OrderRecordInfo;
import com.shanyuan.platform.ms.dao.order.entity.SyOrder;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderCommon;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderGoods;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderLog;
/**
 * 
 * @author zy
 *
 */
public interface QueryOrderService {
	
	public List<SyOrderLog> getOrderLogs ( Integer orderId,String type) throws CoreServiceException;
	/**
	 * 评价id 获得相关ordergoods
	 * @param gevalIds
	 * @return
	 * @throws CoreServiceException
	 */
	public Map<Integer ,SyOrderGoods> getOrderGoodsMapByEids(List<Integer> gevalIds) throws CoreServiceException;
	/**
	 * 根据orderids 获得以orderid 为key的order
	 * @param orderids
	 * @return
	 * @throws CoreServiceException
	 */
	public Map<Integer,SyOrder> getOrderMapByIds(List<Integer> orderids) throws CoreServiceException;
	
/**
 * 获得基金费率
 * @param orderIds
 * @param goodsProjectType
 * @return
 * @throws CoreServiceException
 */
	public List<SyOrder> getFundFeeByOrderId(List<Integer> orderIds,Integer goodsProjectType) throws CoreServiceException;
	/**
	 * 获得未支付订单相关的金额的详细列表
	 * @param paySn 支付编号
	 * @return
	 * @throws CoreServiceException
	 */
	public List<OrderInfo>  getUnPayOrderListDetail(Long paySn) throws CoreServiceException ;
	/**
	 * 相关费用
	 * @param orderlist
	 * @param orderIds
	 * @return
	 * @throws CoreServiceException
	 */
	public List<OrderInfo>  getMoneyInfo(List<SyOrder>orderlist,List<Integer>  orderIds) throws CoreServiceException ;
	/**
	 * 获得ordercommon信息
	 * @param orderId
	 * @return
	 * @throws CoreServiceException
	 */
	public SyOrderCommon getOrderCommonInfo(Integer orderId) throws CoreServiceException;
	/**
	 * 根据paysn 获得订单相关金额
	 * @author zy
	 * @param paySn 支付编号
	 * @param deleted 是否删除
	 * @return
	 * @throws CoreServiceException
	 */
	public SyOrder getOrderMoneyByPaySn(Long paySn ,Byte deleted) throws CoreServiceException;
	/**
	 * 获得申请退款id
	 * @param orderIds
	 * @return
	 * @throws CoreServiceException
	 */
	Map<Integer,Integer> getComplainIds ( List<Integer> orderIds) throws CoreServiceException;
	/**
	 * 获得卖家拒绝的次数
	 * @param orderIds
	 * @return
	 * @throws CoreServiceException
	 */
	Map<Integer,Integer> getRefundReturnIds ( List<Integer> orderIds) throws CoreServiceException;
	/**
	获得不为某种状态的订单列表 
	 * 默认为已支付的状态 即 不为 1
	 * @param buyerId 买家id
	 * @param orderState 订单状态
	 * @param delete 订单是否删除
	 * @param orderBy 排序
	 * @param pageSize 页面显示条数
	 * @param fromType 来源类型  donation 表示是帮扶明细
	 * @param currentpage 当前页
	 * @return
	 * @throws CoreServiceException
	 */
	public List<SyOrder> getPayedInfo(Integer buyerId,String orderState,Byte delete,String orderBy,Integer pageSize,Integer currentpage,String fromType ) throws CoreServiceException;
	/**
	 * 根据状态获得图片信息
	 * @param buyerId
	 * @param orderState
	 * @return
	 * @throws CoreServiceException
	 */
	public  List<OrderGoods> getOrderGoodsImages(Integer buyerId,String orderState,Byte delete) throws CoreServiceException; 
	/**
	 * 通过orderids 获得gooodsinfo
	 * @param list
	 * @throws CoreServiceException
	 */
	public List<OrderGoods> getOrderGoodsInfoByOrderIds(List<Integer> list) throws CoreServiceException;
	/**
	 * 根据goods_id获取ordergoods
	 * @param list
	 * @return
	 * @throws CoreServiceException
	 */
	public Map<Integer,SyOrderGoods>   getOrderGoodsByGids(Integer orderid ,List<Integer> list) throws CoreServiceException ;
	/**
	 * 获得单条记录
	 * @param orderId 订单id
	 * @return
	 * @throws CoreServiceException
	 */
	public SyOrder selectByPrimaryKey(Integer orderId) throws CoreServiceException;
	/**
	 * 
	 * @param type 1、paySn 2、orderState
	 * @param buyerId 买家id
	 * @param orderState 订单状态
	 * @param paySn 支付编号
	 * @return
	 * @throws CoreServiceException
	 */
	public List<SyOrder> getOrderListByParam(String type,Integer buyerId,String orderState,Long paySn) throws CoreServiceException ;
	
	
	/**
	 * 获得支付信息列表
	 * @param buyerId 买家id
	 * @param orderState 订单状态
	 * @return
	 * @throws CoreServiceException
	 */
	public List<SyOrder> getOrderPaySnList(Integer buyerId,String orderState,Byte deleted) throws CoreServiceException ;
	/**
	 * zy
	 * @param disOrderGoods 订单列表
	 * @return  canGetPoints voucherMoney couponMoney poorSupportMoney needAllPoints syAddress disOrderGoods
	 */
	public OrderListInfo getOrderListInfo(Map<String, DisOrderGoodsInfo> disOrderGoods);
	/**
	 * 获得已支付的总条数
	 * @param buyerId
	 * @param orderState
	 * @param delete
	 * @return
	 * @throws CoreServiceException
	 */
	public Integer getPayedInfoCount(Integer buyerId,String orderState,Byte delete) throws CoreServiceException;

	List<OrderRecordInfo> doUnPayOrder(Integer memberId,Byte deleted,String orderStatus )throws CoreServiceException;

	/**
	 * 转成每一单的数据
	 * @param orderIds
	 * @return
	 * @throws CoreServiceException
	 */
	Map<Integer, OrderRecordInfo>   getOrderGoodsMapByOrderIds(List<Integer> orderIds) throws CoreServiceException;
	/**
	 * @author zy
	 * @param syorder
	 * @return
	 * @throws CoreServiceException
	 */
	Map<Integer,SyOrderGoods> selectOrderGoodsMap (SyOrder syorder)throws CoreServiceException;
	/**
	 * 获得相关的ordergoods
	 * @author zhongying
	 * @param syorder
	 * @return
	 * @throws CoreServiceException
	 */
	List<SyOrderGoods>selectOrderGoodsInfo (SyOrder syorder)throws CoreServiceException;
}
