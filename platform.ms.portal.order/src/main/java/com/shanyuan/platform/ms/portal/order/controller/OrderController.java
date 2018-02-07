package com.shanyuan.platform.ms.portal.order.controller;

import java.util.HashMap;
import java.util.Map;

import com.shanyuan.platform.ms.facade.common.CommonFacade;
import com.shanyuan.platform.ms.facade.order.domain.PayedOrderDomain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.shanyuan.platform.ms.base.common.vo.CommonVO;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.order.bo.OrderListInfo;
import com.shanyuan.platform.ms.core.user.impl.exceptype.UserCorrelationException;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.facade.order.OrderFacade;
import com.shanyuan.platform.ms.facade.order.domain.OrderDetailDomain;
import com.shanyuan.platform.ms.facade.user.UserFacade;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


/**
 * 
 * @author 曹勇军
 *
 */
@ApiResponses(value = {
	@ApiResponse(code = 401, message = "Unauthorized"),
	@ApiResponse(code = 403, message = "Forbidden"),
	@ApiResponse(code = 404, message = "Not Found"),
	@ApiResponse(code = 500, message = "Failure") 
})
@RestController
@CrossOrigin
@RequestMapping(value="/order")
public class OrderController {

	private final static Logger logger = LoggerFactory.getLogger(OrderController.class);
	@Autowired
	private OrderExceptionResolver orderExcepRes;

	@Autowired
	private OrderFacade orderFacade;
	
	@Autowired
	private UserFacade userFacade;
	@Autowired
	private CommonFacade commonFacade;

	@SuppressWarnings("unchecked")
	@ApiOperation(value = "提交订单接口", httpMethod = "POST" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="addressId",value="地址主键",required=true,dataType="Integer",paramType="query"),
		@ApiImplicitParam(name="token",value="用户登录后得到的token",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name="did",value="登录标识",required=false,dataType="String",paramType="query"),
		@ApiImplicitParam(name="ifcart",value="如果提交来源是购物车就为1,否则其他",required=false,dataType="Integer",paramType="query",defaultValue = ""),
		@ApiImplicitParam(name="goodsId",value="如果来源是直接购买,此值就有值为商品主键",required=false,dataType="Integer",paramType="query",defaultValue = ""),
		@ApiImplicitParam(name="goodsNum",value="如果来源是直接购买,此值就有值为要购买的商品数量",required=false,dataType="Integer",paramType="query",defaultValue = ""),
		@ApiImplicitParam(name="sharedMid",value="分享人id",required=false,dataType="Integer",paramType="query",defaultValue = ""),
		@ApiImplicitParam(name="voucherId",value="优惠券id",required=false,dataType="Integer",paramType="query",defaultValue = ""),
		@ApiImplicitParam(name="sharedGoodsCommonid",value="分享人分享的商品id",required=false,dataType="Integer",paramType="query",defaultValue = ""),
		@ApiImplicitParam(name="userWords",value="map结构的json用户下订单时的留言,key为一些规则匹配后的值",required=false,dataType="String",paramType="query",defaultValue = "")
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@PostMapping(value="/submit-order")
	public CommonVO submitOrder(@RequestParam(value="addressId",required=true) Integer addressId,
			@RequestParam(value="token",required=true) String token,
			@RequestParam(value="did",required=false) String did,
			@RequestParam(value="ifcart",required=false) Integer ifcart,
			@RequestParam(value="goodsId",required=false) Integer goodsId,
			@RequestParam(value="goodsNum",required=false) Integer goodsNum,
			@RequestParam(value="sharedMid",required=false) Integer sharedMid,
			@RequestParam(value="voucherId",required=false) Integer voucherId,
			@RequestParam(value="sharedGoodsCommonid",required=false) Integer sharedGoodsCommonid,
			@RequestParam(value="userWords",required=false) String userWords){
		
		CommonVO orderDomain=new CommonVO();
		int code=200;
		String message="提交订单成功";
		try {
			Map<String,String> userWordsMap=null;
			if(!ObjectUtils.isEmpty(userWords)){
				userWordsMap=(Map<String, String>) JSON.parse(userWords);
			}
			if(logger.isDebugEnabled()) {
				logger.info("submit-order:"+did);
			}
			
			/*if(!commonFacade.checkLogin(token,did)){
				throw new CoreServiceException(UserCorrelationException.OTHER_LOGINING,"已在其他设备上登录~");
			}*/
			//获取user信息    获取用户数据  并填充
			SyMember syMember=userFacade.getMemberByToken(token);
			// 判断是否为没登录或者没有值
			if (ObjectUtils.isEmpty(syMember)) {
				throw new CoreServiceException(UserCorrelationException.USER_NOT_EXIST,"没有该用户信息");
			} else {
				Integer memberId = syMember.getMemberId();
				String memberName = syMember.getMemberName();
				String memberTruename = syMember.getMemberTruename();
				Integer bocPoints = syMember.getBocPoints().intValue();
				Long bocPointsUsed2 = syMember.getBocPointsUsed();
				Integer bocPointsUsed = ObjectUtils.isEmpty(bocPointsUsed2)?0:bocPointsUsed2.intValue();
				Map<String, Object> data = orderFacade.submitOrder(addressId, ifcart, memberId, goodsId,
						goodsNum, memberName, memberTruename, bocPoints, bocPointsUsed, sharedMid, sharedGoodsCommonid,voucherId, userWordsMap);
				orderDomain.setCode(code);
				orderDomain.setData(data);
				orderDomain.setMessage(message);
			}
		} catch (CoreServiceException e) {
			orderDomain = orderExcepRes.parseException(e);
			logger.error("提交订单失败  addressId={},ifcart={},token={},goodsId={},goodsNum={},sharedMid={},sharedGoodsGommonid={},userWords={}",addressId,ifcart,token,goodsId,goodsNum,sharedMid,sharedGoodsCommonid,userWords,e);
		}

		return orderDomain; 
	}
	@ApiOperation(value = "去结算 订单列表接口", httpMethod = "GET" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="token",value="用户登录后得到的token",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name="did",value="登录标识",required=false,dataType="String",paramType="query"),
		@ApiImplicitParam(name="ifcart",value="如果提交来源是购物车就为1,否则其他",required=false,dataType="Integer",paramType="query",defaultValue = ""),
		@ApiImplicitParam(name="addressid",value="地址",required=false,dataType="Integer",paramType="query",defaultValue = ""),
		@ApiImplicitParam(name="goodsid",value="如果来源是直接购买,此值就有值为商品主键",required=false,dataType="Integer",paramType="query",defaultValue = ""),
		@ApiImplicitParam(name="goodsnum",value="如果来源是直接购买,此值就有值为要购买的商品数量",required=false,dataType="Integer",paramType="query",defaultValue = ""),
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	///user-info
	@CrossOrigin
	@GetMapping(value="/order-pre-submit")
	public CommonVO getOrderPreSubmit(
			@RequestParam(value="token",required=true) String token,
			@RequestParam(value="did",required=false) String did,
			@RequestParam(value="ifcart",required=false) Integer ifcart,
			@RequestParam(value="addressid",required=false) Integer addressid,
			@RequestParam(value="goodsid",required=false) Integer goodsid,
			@RequestParam(value="goodsnum",required=false) Integer goodsnum
		){
		
		CommonVO commonVO=new CommonVO();
		int code=200;
		String message="预提交查询成功";
		HashMap<String, Object> dataMap = new HashMap<String,Object>();
		try {
			
			if(logger.isDebugEnabled()) {
				logger.info("order-pre-submit:"+did);
			}
			/*if(!commonFacade.checkLogin(token,did)){
				throw new CoreServiceException(UserCorrelationException.OTHER_LOGINING,"已在其他设备上登录~");
			}*/
			//获取user信息    获取用户数据  并填充
			SyMember syMember=userFacade.getMemberByToken(token);
			// 判断是否为没登录或者没有值
			if (ObjectUtils.isEmpty(syMember)) {
				logger.info("没有该用户信息  ifcart={},token={}",ifcart,token);
				throw new CoreServiceException(UserCorrelationException.USER_NOT_EXIST,"没有该用户信息");
				
			} else {
				Integer memberId = syMember.getMemberId();
				Integer bocPoints = syMember.getBocPoints().intValue();
				Long bocPointsUsed2 = syMember.getBocPointsUsed();
				Integer bocPointsUsed = ObjectUtils.isEmpty(bocPointsUsed2)?0:bocPointsUsed2.intValue();
				OrderListInfo orderPreSubmit = orderFacade.getOrderPreSubmit(addressid,ifcart, memberId, goodsid, goodsnum, bocPoints, bocPointsUsed);
				dataMap.put("orderInfo", orderPreSubmit);
				commonVO.setCode(code);
				commonVO.setMessage(message);
				commonVO.setData(dataMap);
			}
		} catch (CoreServiceException e) {
			commonVO = orderExcepRes.parseException(e);
			logger.error("预提交订单查询失败  ifcart={},token={},goodsId={},goodsNum={}",ifcart,token,goodsid,goodsnum,e);
		}
		return commonVO; 
	}
	@ApiOperation(value = "个人购买记录接口", httpMethod = "GET" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="token",value="用户登录后得到的token",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name="orderstate",value="订单状态：为空的时候表示全部 ；1 待支付；15 待发货；30 待收货 ；40 已完成",required=false,dataType="String",paramType="query",defaultValue = ""),
		@ApiImplicitParam(name="pagesize",value="每页显示数，默认 20",required=false,dataType="Integer",paramType="query",defaultValue = ""),
		@ApiImplicitParam(name="currentpage",value="当前页数 ，默认 1",required=false,dataType="Integer",paramType="query",defaultValue = ""),
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping(value="/my-order-recoders")
	public CommonVO getOrderRecoderList(
			@RequestParam(value="token",required=true) String token,
			@RequestParam(value="orderstate",required=false) String orderstate,
			@RequestParam(value="pagesize",required=false) Integer pagesize,
			@RequestParam(value="currentpage",required=false) Integer currentpage
		){
		
		CommonVO commonVO=new CommonVO();
		int code=200;
		String message="个人购买记录查询成功";
		try {
			//获取user信息    获取用户数据  并填充
			SyMember syMember=userFacade.getMemberByToken(token);
			// 判断是否为没登录或者没有值
			if (ObjectUtils.isEmpty(syMember)) {
				logger.info("没有该用户信息 token={}",token);
				throw new CoreServiceException(UserCorrelationException.USER_NOT_EXIST,"没有该用户信息");
			} else {
				Integer memberId = syMember.getMemberId();
			    Map<String, Object> dataInfo = orderFacade.getOrderRecoderList(memberId,orderstate,pagesize,currentpage);
			    commonVO.setData(dataInfo); 
				commonVO.setCode(code);
				commonVO.setMessage(message);
			}
		} catch (CoreServiceException e) {
			commonVO = orderExcepRes.parseException(e);
			logger.error("购买记录查询失败  token={},orderState={}",token,orderstate,e);
		}

		return commonVO; 
	}
	/**
	 * @author zy
	 * @param paysn
	 * @return
	 */
	@ApiOperation(value = "未支付购买记录详情接口", httpMethod = "GET" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="paysn",value="支付编号",required=true,dataType="Long",paramType="query"),
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping(value="/un-pay-order-detail")
	public CommonVO getUnPayOrderDetail(
			@RequestParam(value="paysn",required=true) Long paysn){
		
		CommonVO commonVO=new CommonVO();
		Map<String,Object> data= new HashMap<String,Object>();
		int code=200;
		String message="订单详情查询成功";
		try {
			OrderDetailDomain unPayOrderDetail = orderFacade.getUnPayOrderDetail(paysn);
			data.put("orderDetail", unPayOrderDetail);
			commonVO.setCode(code);
			commonVO.setData(data);
			commonVO.setMessage(message);
		} catch (CoreServiceException e) {
			commonVO = orderExcepRes.parseException(e);
			logger.error("未支付购买记录详情查询失败！  paysn={}",paysn,e);
		}

		return commonVO; 
	}

    /**
     * @author zy
     * @param orderid
     * @return
     */
    @ApiOperation(value = "已支付购买记录详情接口", httpMethod = "GET" )
    @ApiImplicitParams({
            @ApiImplicitParam(name="token",value="登录令牌",required=true,dataType="String",paramType="query"),
            @ApiImplicitParam(name="orderid",value="订单编号",required=true,dataType="Integer",paramType="query"),
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
    })
    @CrossOrigin
    @GetMapping(value="/payed-order-detail")
    public CommonVO getPayedOrderDetail(
            @RequestParam(value="token",required=true) String token,
            @RequestParam(value="orderid",required=true) Integer orderid
    ){

        CommonVO commonVO=new CommonVO();
        Map<String,Object> data= new HashMap<String,Object>();
        int code=200;
        String message="订单详情查询成功";
        try {
            SyMember syMember=userFacade.getMemberByToken(token);
            if (ObjectUtils.isEmpty(syMember)) {
                logger.info("没有该用户信息 token={}",token);
                throw new CoreServiceException(UserCorrelationException.USER_NOT_EXIST,"没有该用户信息");
            } else {
                Integer memberId = syMember.getMemberId();
                PayedOrderDomain  payOrderDetail=orderFacade.getPayedOrderDetail(orderid,memberId);
            data.put("orderDetail", payOrderDetail);
            commonVO.setCode(code);
            commonVO.setData(data);
            commonVO.setMessage(message);
            }
        } catch (CoreServiceException e) {
            commonVO = orderExcepRes.parseException(e);
            logger.error("支付购买记录详情查询失败！  orderid={}",orderid,e);
        }

        return commonVO;
    }

}
