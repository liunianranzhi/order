package com.shanyuan.platform.ms.core.order.impl;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.common.util.SerializeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import com.alibaba.fastjson.JSON;
import com.shanyuan.platform.ms.base.common.util.ImageUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.core.order.QueryOrderService;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.core.order.bo.OrderGoods;
import com.shanyuan.platform.ms.core.order.bo.OrderInfo;
import com.shanyuan.platform.ms.core.order.bo.OrderListInfo;
import com.shanyuan.platform.ms.core.order.bo.OrderRecordInfo;
import com.shanyuan.platform.ms.core.order.bo.OrderShowInfo;
import com.shanyuan.platform.ms.core.order.impl.exceptype.OrderServiceExcepType;
import com.shanyuan.platform.ms.dao.order.entity.SyComplain;
import com.shanyuan.platform.ms.dao.order.entity.SyComplainExample;
import com.shanyuan.platform.ms.dao.order.entity.SyOrder;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderCommon;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderCommonExample;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderExample;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderGoods;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderLog;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderLogExample;
import com.shanyuan.platform.ms.dao.order.entity.SyRefundReturn;
import com.shanyuan.platform.ms.dao.order.mapper.SyComplainMapper;
import com.shanyuan.platform.ms.dao.order.mapper.SyOrderCommonMapper;
import com.shanyuan.platform.ms.dao.order.mapper.SyOrderGoodsMapper;
import com.shanyuan.platform.ms.dao.order.mapper.SyOrderLogMapper;
import com.shanyuan.platform.ms.dao.order.mapper.SyOrderMapper;
import com.shanyuan.platform.ms.dao.order.mapper.SyRefundReturnMapper;


@Component
public class QueryOrderServiceImpl implements QueryOrderService {
	
	private static final Logger logger = LoggerFactory.getLogger(QueryOrderServiceImpl.class);
	
	@Autowired
	private SyOrderMapper orderMapper;
	
	@Autowired
	private SyOrderCommonMapper orderCommonMapper;
	
	@Autowired
	private SyComplainMapper complainMapper;
	@Autowired
	private SyRefundReturnMapper refundReturnMapper;
	
	@Autowired
	private SyOrderGoodsMapper orderGoodsMapper;
	@Autowired
	private SyOrderLogMapper orderLogMapper;
	/**
	 * 获得商品日志
	 */
	public List<SyOrderLog> getOrderLogs ( Integer orderId,String type) throws CoreServiceException{
		SyOrderLogExample example = new SyOrderLogExample();
		if("order".equals(type)) {
			if(ObjectUtils.isEmpty(orderId)) {
				return null;
			}
			example.createCriteria().andOrderIdEqualTo(orderId);
			return  orderLogMapper.selectByExample(example);
		}
		return null;
	}
	/**
	 * 获得申请退款
	 */
	@Override
	public Map<Integer,Integer> getComplainIds ( List<Integer> orderIds) throws CoreServiceException {
		SyComplainExample example = new SyComplainExample();
		example.createCriteria().andOrderIdIn(orderIds);
		List<SyComplain> selectByExample = complainMapper.selectByExample(example);
		Map<Integer,Integer> complain=new HashMap<Integer,Integer>();
		if(ObjectUtils.isEmpty(selectByExample)) {
			return complain;
		}
		for(SyComplain sy:selectByExample) {
			Integer orderId = sy.getOrderId();
			Integer complainId = sy.getComplainId();
			if(!ObjectUtils.isEmpty(orderId)&&!ObjectUtils.isEmpty(complainId)&&orderIds.contains(orderId)) {
				complain.put(orderId, complainId);
			}
			
		}
		return complain;
				
	}
	/**
	 * 获得被卖家拒绝次数
	 */
	@Override
	public Map<Integer,Integer> getRefundReturnIds( List<Integer> orderIds) throws CoreServiceException {
		List<SyRefundReturn> refundNumByOids = refundReturnMapper.selectRefundNumByOids(orderIds);
		Map<Integer,Integer> refunds=new HashMap<Integer,Integer>();
		if(ObjectUtils.isEmpty(refundNumByOids)) {
			return refunds;
		}
		for(SyRefundReturn sy:refundNumByOids) {
			Integer orderId = sy.getOrderId();	
			Integer num = sy.getNum();
			num=ObjectUtils.isEmpty(num)?0:num;
			if(!ObjectUtils.isEmpty(orderId)&&orderIds.contains(orderId)) {
				refunds.put(orderId,num );
			}
		}
		return refunds;
				
	}
	public  Map<Integer, OrderRecordInfo>   getOrderGoodsMapByOrderIds(List<Integer> orderIds) throws CoreServiceException{
		Map<Integer, OrderRecordInfo> datamap=	new HashMap<Integer, OrderRecordInfo>();
		List<OrderGoods> orderGoods = this.getOrderGoodsInfoByOrderIds(orderIds);
		if(logger.isDebugEnabled()) {
			logger.info("order goods by orderids :"+JSON.toJSONString(orderGoods) );
		}
	
		if(!ObjectUtils.isEmpty(orderGoods)) {
			for(Integer orderId:orderIds) {
				OrderRecordInfo orderRecordInfo = new OrderRecordInfo();
				List<OrderGoods> orderglist =new ArrayList<OrderGoods>();
				Integer goodsNum=0;
				BigDecimal total= BigDecimal.ZERO;
				for(OrderGoods image :orderGoods) {
					Integer orderId2 = image.getOrderId();
					if(!ObjectUtils.isEmpty(orderId2)&&orderId.equals(orderId2)) {
						Integer goodsNum2 = image.getGoodsNum();
						BigDecimal bocPointsPrice = image.getBocPointsPrice();
						goodsNum2 = ObjectUtils.isEmpty(goodsNum2)?0:goodsNum2;
						bocPointsPrice = ObjectUtils.isEmpty(bocPointsPrice)?BigDecimal.ZERO:bocPointsPrice;
						goodsNum += goodsNum2;
						total = total.add(bocPointsPrice);
						String goodsImage = image.getGoodsImage();
						Integer storeId = image.getStoreId();
						String goodsImgFullUrl = ImageUtil.getGoodsImgFullUrl(goodsImage, storeId, "240", image.getGoodsProjectType());
						image.setGoodsImage(goodsImgFullUrl);
						orderglist.add(image);
					}
				}
				orderRecordInfo.setOrderGoodsList(orderglist);
				orderRecordInfo.setGoodsNum(goodsNum);
				orderRecordInfo.setTotalPoints(total.intValue());
				datamap.put(orderId, orderRecordInfo);
			}
			
		}
		return datamap;
	}
	/**
	 * 处理未支付列表
	 * @return
	 * @throws CoreServiceException
	 */
	public List<OrderRecordInfo> doUnPayOrder(Integer memberId,Byte deleted,String orderStatus )throws CoreServiceException{
		//全部过来的和待支付的
		List<OrderRecordInfo>  orderInfoList = new ArrayList<OrderRecordInfo>();
		//以paySn为维度
		List<SyOrder> orderPaySnList = this.getOrderPaySnList(memberId, orderStatus,deleted);
		// 获得所有的图片列表
		List<OrderGoods> orderGoodsImages = this.getOrderGoodsImages(memberId, orderStatus,deleted);
		//取出待支付的所有的图片信息
		for(SyOrder op:orderPaySnList) {
			OrderRecordInfo orderrecordinfo =new OrderRecordInfo(op);
				Long paySn = op.getPaySn();
				Integer goodsNum=0;
				BigDecimal total=BigDecimal.ZERO;
				String orderState2 = op.getOrderState();
				List<OrderGoods> orderglist =new ArrayList<OrderGoods>();
				if(!ObjectUtils.isEmpty(paySn)) {
					for(OrderGoods imageinfo:orderGoodsImages) {
						Long paySn2 =Long.parseLong(imageinfo.getPaySn()) ;
						if(!ObjectUtils.isEmpty(paySn2)&&paySn.equals(paySn2)&&OrderConstant.OrderState.ORDER_STATE_NEW.equals(orderState2)) {
							Integer goodsNum2 = imageinfo.getGoodsNum();
							BigDecimal bocPointsPrice = imageinfo.getBocPointsPrice();
							goodsNum2 = ObjectUtils.isEmpty(goodsNum2)?0:goodsNum2;
							bocPointsPrice = ObjectUtils.isEmpty(bocPointsPrice)?BigDecimal.ZERO:bocPointsPrice;
							goodsNum += goodsNum2;
							String goodsImage = imageinfo.getGoodsImage();
							Integer storeId = imageinfo.getStoreId();
							String goodsImgFullUrl = ImageUtil.getGoodsImgFullUrl(goodsImage, storeId, "240", imageinfo.getGoodsProjectType());
							imageinfo.setGoodsImage(goodsImgFullUrl);
							orderglist.add(imageinfo);
							total = total.add(bocPointsPrice);
						}
					}
						
						orderrecordinfo.setGoodsNum(goodsNum);
						orderrecordinfo.setTotalPoints(total.intValue());
				}
				orderrecordinfo.setOrderGoodsList(orderglist);
				orderInfoList.add(orderrecordinfo);
		}
		
		return orderInfoList;
	}
	
	/**
	 * 获得已支付的订单
	 * 以order 为维度
	 */
	@Override
	public List<SyOrder> getPayedInfo(Integer buyerId,String orderState,Byte delete,String orderBy,Integer pageSize,Integer currentpage,String fromType) throws CoreServiceException {
		SyOrderExample orderexample=new SyOrderExample();
		orderState = ObjectUtils.isEmpty(orderState)?"1":orderState;
		delete = ObjectUtils.isEmpty(delete)?new Byte("0"):delete;
		pageSize = ObjectUtils.isEmpty(pageSize)?20:pageSize;
		currentpage = ObjectUtils.isEmpty(currentpage)?1:currentpage;
		Integer sizeStart= (currentpage-1)*pageSize;
		orderBy = ObjectUtils.isEmpty(orderBy)?" order_id DESC LIMIT "+sizeStart+" , "+pageSize:orderBy+" LIMIT "+sizeStart+" , "+pageSize;
		if("1".equals(orderState)) {
			//查询全部
			orderexample.createCriteria().andBuyerIdEqualTo(buyerId).
			andDeletedEqualTo(delete).andOrderStateNotEqualTo(orderState).andPublisherIdNotEqualTo(0);
		}else {
			if("donation".equals(fromType)) {
				//帮扶明细
				orderexample.createCriteria().andBuyerIdEqualTo(buyerId).
				andDeletedEqualTo(delete).andOrderStateEqualTo(orderState).andPublisherIdNotEqualTo(0).
				andGoodsProjectTypeEqualTo(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP);
				orderBy ="order_id DESC";
			}else if("record".equals(fromType)){
				if(ObjectUtils.isEmpty(orderState)) {
					orderexample.createCriteria().andBuyerIdEqualTo(buyerId).
					andDeletedEqualTo(delete).andOrderStateNotEqualTo("1").andPublisherIdNotEqualTo(0);
				}else {
					orderexample.createCriteria().andBuyerIdEqualTo(buyerId).
					andDeletedEqualTo(delete).andOrderStateEqualTo(orderState).andPublisherIdNotEqualTo(0);
				}
				
				
			}
			
		}
		orderexample.setOrderByClause(orderBy);
		
		List<SyOrder> orders = orderMapper.selectByExample(orderexample);
		return orders;
	}
	@Override
	public Integer getPayedInfoCount(Integer buyerId,String orderState,Byte delete) throws CoreServiceException {
		SyOrderExample orderexample=new SyOrderExample();
		orderState = ObjectUtils.isEmpty(orderState)?"1":orderState;
		if("1".equals(orderState)) {
			//查询全部
			orderexample.createCriteria().andBuyerIdEqualTo(buyerId).
			andDeletedEqualTo(new Byte("0")).andOrderStateNotEqualTo(orderState).andPublisherIdNotEqualTo(0);
		}else if(ObjectUtils.isEmpty(orderState)){
			orderexample.createCriteria().andBuyerIdEqualTo(buyerId).
			andDeletedEqualTo(new Byte("0")).andOrderStateEqualTo("1").andPublisherIdNotEqualTo(0);
		}else {
			orderexample.createCriteria().andBuyerIdEqualTo(buyerId).
			andDeletedEqualTo(new Byte("0")).andOrderStateNotEqualTo(orderState).andPublisherIdNotEqualTo(0);
		}
		
		 Integer num = orderMapper.selectCountByExample(orderexample);
		return num;
	}
	@Override
	public SyOrderCommon getOrderCommonInfo(Integer orderId) throws CoreServiceException {
		SyOrderCommonExample example =new SyOrderCommonExample();
		example.createCriteria().andOrderIdEqualTo(orderId);
		List<SyOrderCommon> selectByExample = orderCommonMapper.selectByExample(example);
		if(!ObjectUtils.isEmpty(selectByExample)) {
			return selectByExample.get(0);
		}else {
			return null;
		}
		
	}
	/**
	 * 获得图片信息
	 */
	@Override
	public  List<OrderGoods>  getOrderGoodsImages(Integer buyerId,String orderState,Byte delete) throws CoreServiceException {
		SyOrder sy=	new SyOrder();
		sy.setBuyerId(buyerId);
		delete = ObjectUtils.isEmpty(delete)?new Byte("0"):delete;
		sy.setOrderState(orderState);
		sy.setDeleted(delete);
		sy.setPublisherId(0);//publisherId 不为空
		 List<SyOrderGoods> orderGoodsInfo = orderGoodsMapper.selectOrderGoodsInfo(sy);
		 List<OrderGoods> oGoodsList=new ArrayList<OrderGoods>();
		 if(ObjectUtils.isEmpty(orderGoodsInfo)) {
			 return null;
		 }
		 for(SyOrderGoods so:orderGoodsInfo) {
				OrderGoods bo=new OrderGoods();
				bo.setPaySn(so.getPaySn().toString());
				BeanUtils.copyProperties(so, bo);
				oGoodsList.add(bo);
			}
		return oGoodsList;
	}
	/**
	 * 获得goodsinfo
	 * by zy
	 */
	@Override
	public  List<OrderGoods>  getOrderGoodsInfoByOrderIds(List<Integer> list) throws CoreServiceException {
		 if(ObjectUtils.isEmpty(list)) {
			 return null;
		 }
		List<SyOrderGoods> orderGoodsInfo = orderGoodsMapper.selectOrderGoodsByOrderIds(list);
		List<OrderGoods> oGoodsList=new ArrayList<OrderGoods>();
		for(SyOrderGoods so:orderGoodsInfo) {
			OrderGoods bo=new OrderGoods();
			bo.setPaySn(so.getPaySn().toString());
			BeanUtils.copyProperties(so, bo);
			oGoodsList.add(bo);
		}
		return oGoodsList;
	}
	/**
	 * by zy
	 * 根据goodsid 获得ordergoods
	 */
	public  Map<Integer,SyOrderGoods>  getOrderGoodsByGids(Integer orderid,List<Integer> list) throws CoreServiceException {
		 Map<Integer,SyOrderGoods> map =new HashMap<Integer,SyOrderGoods>();
		 if(ObjectUtils.isEmpty(list)) {
			 return map;
		 }
		List<SyOrderGoods> orderGoodsInfo = orderGoodsMapper.selectOrderGoodsByGIds(orderid,list);
		
		if(!CollectionUtils.isEmpty(orderGoodsInfo)){
			for(SyOrderGoods sy:orderGoodsInfo) {
				Integer goodsId = sy.getGoodsId();
				map.put(goodsId, sy);
			}
		}
		return map;
	}
	/**
	 * 获得一个order
	 */
	@Override
	public SyOrder selectByPrimaryKey(Integer orderId) throws CoreServiceException {
		SyOrder order = orderMapper.selectByPrimaryKey(orderId);
		return order;
	}
	/**
	 * 获得支付信息列表
	 */
	@Override
	public List<SyOrder> getOrderPaySnList(Integer buyerId,String orderState,Byte deleted) throws CoreServiceException {
		SyOrder record=new SyOrder();
		if(!ObjectUtils.isEmpty(orderState)) {
			record.setOrderState(orderState);
		}
		record.setBuyerId(buyerId);
		record.setDeleted(deleted);
		List<SyOrder> orderPaySnList = orderMapper.selectOrderPaySnList(record);
		return orderPaySnList;
	}
	
	@Override
	public Map<Integer ,SyOrderGoods> getOrderGoodsMapByEids(List<Integer> gevalIds) throws CoreServiceException{
		Map<Integer ,SyOrderGoods> orderEval= new HashMap<Integer ,SyOrderGoods>();
		if(ObjectUtils.isEmpty(gevalIds)) {
			return orderEval;
		}
		List<SyOrderGoods> orderGoodsListByEids = orderGoodsMapper.selectOrderGoodsListByEids(gevalIds);
		
		if(ObjectUtils.isEmpty(orderGoodsListByEids)) {
			return orderEval;
		}
		for(SyOrderGoods go:orderGoodsListByEids) {
			Integer gevalId = go.getGevalId();
			if(!ObjectUtils.isEmpty(gevalId)) {
				orderEval.put(gevalId, go);
			}
			
		}
		return orderEval;
	}
	@Override
	public Map<Integer,SyOrder> getOrderMapByIds(List<Integer> orderids) throws CoreServiceException{
		Map<Integer,SyOrder> map=new HashMap<Integer,SyOrder>();
		if(ObjectUtils.isEmpty(orderids)) {
			return map;
		}
		List<SyOrder> orderListByIds = orderMapper.selectOrderListByIds(orderids);
		if(ObjectUtils.isEmpty(orderListByIds)) {
			return map;
		}
		for(SyOrder or:orderListByIds) {
			Integer orderId = or.getOrderId();
			if(!ObjectUtils.isEmpty(orderId)) {
				map.put(orderId, or);
			}
		}
		return map;
	}
	@Override
	public List<SyOrder> getOrderListByParam(String type,Integer buyerId,String orderState,Long paySn) throws CoreServiceException {
		SyOrder sy =new SyOrder();
		List<SyOrder> orderList = new ArrayList<SyOrder>();
		if("paySn".equals(type)) {
			sy.setPaySn(paySn);
			orderList = orderMapper.selectOrderListByPaySn(sy);
		}else if("orderState".equals(type)) {
			sy.setBuyerId(buyerId);
			sy.setOrderState(orderState);
			orderList = orderMapper.selectOrderListByState(sy);
		}
		return orderList;
	}
	/**
	 * 根据paysn获得相关金额
	 *  by zy
	 */
	@Override
	public SyOrder getOrderMoneyByPaySn(Long paySn ,Byte deleted) throws CoreServiceException {
		SyOrder record =new SyOrder();
		deleted = ObjectUtils.isEmpty(deleted)?new Byte("0"):deleted;
		record.setDeleted(deleted);
		record.setPaySn(paySn);
		SyOrder orderMoneyByPaySn = orderMapper.selectOrderMoneyByPaySn(record);
		return orderMoneyByPaySn ;
	}
	/**
	 * zy 
	 * 获得预提交订单列表
	 */
	@Override
	public OrderListInfo getOrderListInfo(Map<String, DisOrderGoodsInfo> disOrderGoods) {
		OrderListInfo  orderListInfo=new OrderListInfo();
		if(ObjectUtils.isEmpty(disOrderGoods)) {
			return  orderListInfo;
		}
		List<OrderShowInfo> orderShowList=	new ArrayList<OrderShowInfo>();
		//DisOrderGoodsInfo disOrderGoodsInfo=null;
		//订单总金额商品总价加总运费
		BigDecimal allOrderPrice=BigDecimal.ZERO;
		//可以获得的积分
		BigDecimal canGetPoints =BigDecimal.ZERO;
		//可以获得商品总金额
		BigDecimal allGoodsMoney=BigDecimal.ZERO;
		//实际支付额
		BigDecimal allPayPrice=BigDecimal.ZERO;
		//优惠的总金额
		BigDecimal voucherMoney=BigDecimal.ZERO;
		//扶贫码支付的金额
		BigDecimal couponMoney=BigDecimal.ZERO;
		//贫困户可获得的总金额
		BigDecimal poorSupportMoney=BigDecimal.ZERO;
		//
		BigDecimal allplatformDiscount=BigDecimal.ZERO;
		//
		BigDecimal allstoreDisCount=BigDecimal.ZERO;
		//公益捐赠的总和
	    BigDecimal fundTotalMoney=BigDecimal.ZERO;
	    //总运费
	    BigDecimal allshippfee=BigDecimal.ZERO;
		//需要支付的积分 总积分
		Integer needAllPoints=0;
		for(String orderKey:disOrderGoods.keySet()){
			DisOrderGoodsInfo	disOrderGoodsInfo=disOrderGoods.get(orderKey);
			
			//每单的善源商场需要的积分
			Integer  syPoints =disOrderGoodsInfo.getAllBocPointsUsed();
			needAllPoints +=syPoints;
			
			//这单商品的总金额
			BigDecimal allGoodsAmount = disOrderGoodsInfo.getAllGoodsAmount();
			allGoodsAmount =ObjectUtils.isEmpty(allGoodsAmount)?BigDecimal.ZERO:allGoodsAmount;
			allGoodsMoney =allGoodsMoney.add(allGoodsAmount);
			//这单订单的总金额  商品的总金额+运费
			BigDecimal orderAmount = disOrderGoodsInfo.getOrderAmount();
			orderAmount =ObjectUtils.isEmpty(orderAmount)?BigDecimal.ZERO:orderAmount;
			allOrderPrice = allOrderPrice.add(orderAmount);
			BigDecimal moneypay = disOrderGoodsInfo.getMoneyPay();
			moneypay =ObjectUtils.isEmpty(moneypay)?BigDecimal.ZERO:moneypay;
			allPayPrice = allPayPrice.add(moneypay);
			//这单商品的运费
			BigDecimal shipFee = disOrderGoodsInfo.getShipFee();
			
			shipFee =ObjectUtils.isEmpty(shipFee)?BigDecimal.ZERO:shipFee;
			allshippfee = allshippfee.add(shipFee);
			//这单商品的店铺优惠
			BigDecimal storeDisCount = disOrderGoodsInfo.getStoreDisCount();
			storeDisCount =ObjectUtils.isEmpty(storeDisCount)?BigDecimal.ZERO:storeDisCount;
			allstoreDisCount =allstoreDisCount.add(storeDisCount);
			//这单商品的平台优惠
			BigDecimal platformDiscount = disOrderGoodsInfo.getPlatformDiscount();
			platformDiscount =ObjectUtils.isEmpty(platformDiscount)?BigDecimal.ZERO:platformDiscount;
			allplatformDiscount = allplatformDiscount.add(allplatformDiscount);
			//优惠总金额
			voucherMoney = voucherMoney.add(storeDisCount).add(platformDiscount);
			//扶贫码支付
			BigDecimal couponPay = disOrderGoodsInfo.getCouponPay();
			couponPay =ObjectUtils.isEmpty(couponPay)?BigDecimal.ZERO:couponPay;
			couponMoney = couponMoney.add(couponPay);
			//1、可获得的积分只有善源商场是没有的
			BigDecimal buyerGetPoint = disOrderGoodsInfo.getBuyerGetPoint();
			canGetPoints =canGetPoints.add(buyerGetPoint);
			List<GoodsInfo> goodsInfoList = disOrderGoodsInfo.getGoodsInfoList();
			if(!ObjectUtils.isEmpty(goodsInfoList)) {
			 //处理图片
				for(GoodsInfo goods:goodsInfoList) {
					 //处理图片
					  String goodsImgFullUrl = ImageUtil.getGoodsImgFullUrl(goods.getGoodsImage(), goods.getStoreId(), "240",goods.getGoodsProjectType());
					  goods.setGoodsImage(goodsImgFullUrl);
					  goods.setTouchUrl("/bocm/index.php?act=project&op=project_detail&gc_id="+ goods.getGoodsCommonid()
						+"&goods_project_type="+goods.getGoodsProjectType()+"&publisher_id="+goods.getPublisherId());
				}
			}
			//贫困户可获的帮付金额 预设手续费是0.0006
			BigDecimal goodsSupportMoney = disOrderGoodsInfo.getHelpFee();
			goodsSupportMoney = ObjectUtils.isEmpty(goodsSupportMoney)?BigDecimal.ZERO:goodsSupportMoney;
			BigDecimal fundmoney = disOrderGoodsInfo.getFundFee();
			fundmoney = ObjectUtils.isEmpty(fundmoney)?BigDecimal.ZERO:fundmoney;
			fundTotalMoney = fundTotalMoney.add(fundmoney.setScale(2, BigDecimal.ROUND_UP));
			poorSupportMoney =poorSupportMoney.add(goodsSupportMoney);
			OrderShowInfo orderShowInfo = new OrderShowInfo(disOrderGoodsInfo);
			orderShowList.add(orderShowInfo);
			
		}
		//可获得总积分
	
		orderListInfo.setAllBocPointsUsed(needAllPoints);
		orderListInfo.setShipFee(allshippfee);
		orderListInfo.setOrderShowInfo(orderShowList);
		orderListInfo.setAllGoodsAmount(allGoodsMoney);
		orderListInfo.setOrderAmount(allOrderPrice);
		orderListInfo.setMoneyPay(allPayPrice);
		orderListInfo.setHelpFee(poorSupportMoney);
		Integer points=canGetPoints.intValue();
		orderListInfo.setBuyerGetPoint(points);
		orderListInfo.setCouponPay(couponMoney);
		orderListInfo.setFundFee(fundTotalMoney);
		orderListInfo.setPlatformDiscount(allplatformDiscount);
		orderListInfo.setStoreDisCount(allstoreDisCount);
		if(logger.isDebugEnabled()) {
			logger.info("resubmit order getOrderListInfo:"+JSON.toJSONString(orderListInfo));
		}
		return orderListInfo;
	}
	/**
	 * 获得未支付订单的详情
	 * @author zy
	 * @param paySn 支付编号
	 * @return
	 */
	@Override
	public List<OrderInfo>  getUnPayOrderListDetail(Long paySn) throws CoreServiceException {
		if(ObjectUtils.isEmpty(paySn)) {
			throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"支付编号为空！");	
		}
		List<SyOrder> orderList = this.getOrderListByParam("paySn", null, null, paySn);
		if(logger.isErrorEnabled()) {
			logger.info("unpayorder getOrderListByParam:"+JSON.toJSONString(orderList));
		}
		if(ObjectUtils.isEmpty(orderList)) {
			throw new CoreServiceException(OrderServiceExcepType.ORDER_EMPTY,"订单信息为空！");	
		}
		
		
		List<Integer>  orderIds=new ArrayList<Integer>();
		for(SyOrder order:orderList) {
			Integer orderId = order.getOrderId();
			if(!orderIds.contains(orderId)) {
				orderIds.add(orderId);
			}
		}
		if(ObjectUtils.isEmpty(orderIds)) {
			throw new CoreServiceException(OrderServiceExcepType.ORDER_EMPTY,"订单信息为空！");	 
		}
		List<OrderInfo> orderInfoList = this.getMoneyInfo(orderList, orderIds);
		if(logger.isErrorEnabled()) {
			logger.info("unpayorder getMoneyInfo:"+JSON.toJSONString(orderInfoList));
		}
		
		return orderInfoList;
	}
	//处理订单
	@Override 
	public  List<OrderInfo> getMoneyInfo(List<SyOrder>orderlist,List<Integer>  orderIds) {
		List<OrderInfo>  orderInfoList=new ArrayList<OrderInfo>();
		List<OrderGoods> orderGoods = this.getOrderGoodsInfoByOrderIds(orderIds);
		
		for(SyOrder order:orderlist) {
			Integer orderId = order.getOrderId();
			OrderInfo orderInfo = new OrderInfo(order);
			Integer goodsNum = 0;
			String ownerType="";
			BigDecimal needPoints=BigDecimal.ZERO;
			List<OrderGoods> orderGoodsList=new ArrayList<OrderGoods>();
			
			Short mFeeRate=0;
			Integer assistId =order.getAssistId();
			BigDecimal goodsAmount =BigDecimal.ZERO;
			//ordergoods
			for(OrderGoods og:orderGoods) {
				Integer gorderId = og.getOrderId();
				if(!ObjectUtils.isEmpty(orderId)&&orderId.equals(gorderId)) {
					//bocPointsPrice 只有善源商场的此金额才不为0 需要的积分
					BigDecimal bocPointsPrice = og.getBocPointsPrice();
					Integer goodsNum2 = og.getGoodsNum();
					goodsNum2 = ObjectUtils.isEmpty(goodsNum2)?0:goodsNum2;
					bocPointsPrice = ObjectUtils.isEmpty(bocPointsPrice)?BigDecimal.ZERO:bocPointsPrice;
					goodsNum += goodsNum2;
					needPoints = needPoints.add(bocPointsPrice);
					mFeeRate=og.getmFeeRate();
					og.setGoodsNum(goodsNum2);
					og.setBocPointsPrice(bocPointsPrice);
					Short zero=0;
					mFeeRate= ObjectUtils.isEmpty(mFeeRate)?zero:mFeeRate;
					ownerType =og.getOwnerType();
					BigDecimal goodsPrice = og.getGoodsPrice();//这是真实的价格没有*100
					goodsPrice = ObjectUtils.isEmpty(goodsPrice)?BigDecimal.ZERO:goodsPrice;
					goodsAmount = goodsAmount.add(goodsPrice.multiply(new BigDecimal(goodsNum2)));
					String goodsSpec2= SerializeUtil.getSpecUnSerialize(og.getGoodsSpec());
					og.setGoodsSpec(goodsSpec2);;
					//处理图片  暂时这样处理
					String goodsImage = og.getGoodsImage();
					Integer storeId = og.getStoreId();
					Integer goodsProjectType = og.getGoodsProjectType();
					String goodsImgFullUrl = ImageUtil.getGoodsImgFullUrl(goodsImage, storeId, "240", goodsProjectType);
					og.setGoodsImage(goodsImgFullUrl);
					orderGoodsList.add(og);
				}//if end 
				
			}//goods 循环end
			 //3.1 商品
			
			BigDecimal shippingFee = orderInfo.getShippingFee();
			shippingFee = ObjectUtils.isEmpty(shippingFee)?BigDecimal.ZERO:shippingFee;
			BigDecimal discountAmount = orderInfo.getDiscountAmount();
			Integer goodsProjectType = orderInfo.getGoodsProjectType();
			discountAmount = ObjectUtils.isEmpty(discountAmount)?BigDecimal.ZERO:discountAmount;
			BigDecimal fundFee = orderInfo.getFundFee();
			BigDecimal serviceFee = orderInfo.getServiceFee();
			BigDecimal platformPay = orderInfo.getPlatformPay();
			fundFee = ObjectUtils.isEmpty(fundFee)?BigDecimal.ZERO:fundFee;
			serviceFee = ObjectUtils.isEmpty(serviceFee)?BigDecimal.ZERO:serviceFee;
			platformPay = ObjectUtils.isEmpty(platformPay)?BigDecimal.ZERO:platformPay;
			//买家可获得积分
			BigDecimal buyerGetPoints = BigDecimal.ZERO;
			BigDecimal helpMoney = BigDecimal.ZERO;
			if(!OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP.equals(goodsProjectType)) {
				buyerGetPoints =(goodsAmount.add(shippingFee).subtract(discountAmount).subtract(platformPay)
						).setScale(2, BigDecimal.ROUND_UP).multiply(OrderConstant.FeeRate.BOC_POINT_RATE);//预先写死积分费率
			}
			//贫困户可金额
			if(OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP.equals(goodsProjectType)) {
			}else if(OrderConstant.ownerType.OWNER_TYPE_AGENT.equals(ownerType)) {
				helpMoney = (goodsAmount.subtract(discountAmount).subtract(serviceFee).subtract(fundFee)).multiply(OrderConstant.FeeRate.HELP_RATE).divide(new BigDecimal(1000),3, BigDecimal.ROUND_UP);
			}else if(assistId > 0) {
				helpMoney = (goodsAmount.subtract(discountAmount).subtract(serviceFee).subtract(fundFee)).multiply(OrderConstant.FeeRate.HELP_RATE).divide(new BigDecimal(1000),3, BigDecimal.ROUND_UP);
			}else {
				helpMoney = goodsAmount.subtract(serviceFee).subtract(fundFee);
				
			}
			
			
			orderInfo.setBuyerGetPoints(buyerGetPoints.intValue());
			orderInfo.setNeedPoints(needPoints.intValue());
			orderInfo.setOrderGoodsNum(goodsNum);
			orderInfo.setPoorSupportMoney(helpMoney);
			orderInfo.setOrderGoodsList(orderGoodsList);
			orderInfoList.add(orderInfo);
		}//order end
		return  orderInfoList;
	}
	/**
	 * @author zy
	 * @param orderIds
	 * @param goodsProjectType
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
	public List<SyOrder> getFundFeeByOrderId(List<Integer> orderIds,Integer goodsProjectType) throws CoreServiceException {
		if(ObjectUtils.isEmpty(orderIds)) {
			return null;
		}
		Map<String ,Object>	map=new HashMap<String ,Object>();
		goodsProjectType = ObjectUtils.isEmpty(goodsProjectType)?24:goodsProjectType;
		map.put("orderIds", orderIds);
		map.put("goodsProjectType", goodsProjectType);
		List<SyOrder> fundFeeList = orderMapper.selectFundFeeByOrderId(map);
		if(ObjectUtils.isEmpty(fundFeeList)) {
			return null;
		}else {
			return fundFeeList;
		}
	}
	/**
	 * by zy
	 * OrderGoodsMap
	 */
	public Map<Integer,SyOrderGoods> selectOrderGoodsMap (SyOrder syorder)throws CoreServiceException{
		List<SyOrderGoods> selectOrderGoodsInfo = this.selectOrderGoodsInfo(syorder);
		Map<Integer,SyOrderGoods> map=new HashMap<Integer,SyOrderGoods>();
		if(!ObjectUtils.isEmpty(selectOrderGoodsInfo)) {
			for(SyOrderGoods sy:selectOrderGoodsInfo) {
				Integer gid=sy.getGoodsId();
				map.put(gid, sy);
			}
		}
		return map;
	}
	
	/**
	 * 获得相关订单goods
	 * @param syorder
	 * @return
	 * @throws CoreServiceException
	 */
	public List<SyOrderGoods>selectOrderGoodsInfo (SyOrder syorder)throws CoreServiceException {
		 List<SyOrderGoods> orderGoodsInfo = orderGoodsMapper.selectOrderGoodsInfo(syorder);
		 return orderGoodsInfo;
	}
	
}
