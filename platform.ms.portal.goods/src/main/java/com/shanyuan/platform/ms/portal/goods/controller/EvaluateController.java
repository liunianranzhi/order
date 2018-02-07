package com.shanyuan.platform.ms.portal.goods.controller;

import io.swagger.annotations.ApiImplicitParam;

import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.Map;

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

import com.shanyuan.platform.ms.base.common.vo.CommonVO;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.user.impl.exceptype.UserCorrelationException;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.facade.evaluate.EvaluateFacade;
import com.shanyuan.platform.ms.facade.user.UserFacade;
/**
 * @author 钟颖
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
@RequestMapping(value="/evaluate")
public class EvaluateController {
	private final static Logger logger = LoggerFactory.getLogger(EvaluateController.class);
	@Autowired
	private EvaluateFacade evaluateFacade;

	@Autowired
	private EvaluateExceptionResolver exceptionResolver;
	@Autowired
	private UserFacade userFacade;
	
	@ApiOperation(value = "订单记录的评价列表", httpMethod = "GET" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="token",value="用户登录令牌",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name = "orderid", value = "订单id", required = true, dataType = "Integer", paramType = "query"),
		@ApiImplicitParam(name = "pagesize", value = "每页显示数", required = false, dataType = "Integer", paramType = "query"),
		@ApiImplicitParam(name = "currentpage", value = "当前页数", required = false, dataType = "Integer", paramType = "query")
		})
			
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping(value="/evaluate-order-list")
	public CommonVO getEvaluateOrder(
			@RequestParam(value = "token",required = true) String token,
			@RequestParam(value = "orderid",required = true) Integer orderid,
			@RequestParam(value="pagesize",required=false) Integer pagesize,
			@RequestParam(value="currentpage",required=false) Integer currentpage) {
		
		CommonVO dataDomain=new CommonVO();
		int code=200;
		String message="查询成功";
		try {
			SyMember syMember=userFacade.getMemberByToken(token);
			// 判断是否为没登录或者没有值
			if (ObjectUtils.isEmpty(syMember)) {
				logger.info("没有该用户信息 token={}",token);
				throw new CoreServiceException(UserCorrelationException.USER_NOT_EXIST,"没有该用户信息");
			} else {
				Integer memberId = syMember.getMemberId();
				 Map<String, Object> evaluateGoods = evaluateFacade.getEvaluateGoodsManagerList(orderid,null, memberId, pagesize, currentpage,"order");
				 dataDomain.setData(evaluateGoods);
				 dataDomain.setCode(code);
				dataDomain.setMessage(message);
			}
		} catch (CoreServiceException e) {
			logger.error(e.getMessage(),e);
			dataDomain = exceptionResolver.parseException(e);
		}
		return dataDomain;
	}
	
	@ApiOperation(value = "商品详情页评价列表", httpMethod = "GET" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="token",value="用户登录令牌",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name = "goodscommonid", value = "goodscommonid", required = true, dataType = "Integer", paramType = "query"),
		@ApiImplicitParam(name = "evaltype", value = "查询类型 goods 详情页，all 全部，well好评，middle 中评，negative：差评 picture：晒图", required = true, dataType = "String", paramType = "query"),
		@ApiImplicitParam(name = "pagesize", value = "每页显示数", required = false, dataType = "Integer", paramType = "query"),
		@ApiImplicitParam(name = "currentpage", value = "当前页数", required = false, dataType = "Integer", paramType = "query")
		})
			
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping(value="/evaluate-goods-list")
	public CommonVO getEvaluateGoods(
			@RequestParam(value = "token",required = true) String token,
			@RequestParam(value = "goodscommonid",required = true) Integer goodscommonid,
			@RequestParam(value = "evaltype",required = true) String evaltype,
			@RequestParam(value="pagesize",required=false) Integer pagesize,
			@RequestParam(value="currentpage",required=false) Integer currentpage) {
		
		CommonVO dataDomain=new CommonVO();
		try {
			Map<String, Object> evaluateGoods = evaluateFacade.getEvaluateGoodsManagerList(null,goodscommonid, null, pagesize, currentpage,evaltype);
			dataDomain.setData(evaluateGoods);
			dataDomain.setCode(200);
			dataDomain.setMessage("查询成功！");
		} catch (CoreServiceException e) {
			logger.error(e.getMessage(),e);
			dataDomain = exceptionResolver.parseException(e);
			logger.error("商品评价--信息查询失败", e);
		}
		return dataDomain;
	}
	/**
	 * @author zy
	 * 目前好像只能添加评价
	 * @param paysn
	 * @return
	 */
	@ApiOperation(value = "添加评论", httpMethod = "POST" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="token",value="用户登录后得到的token",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name="orderid",value="订单id",required=true,dataType="Integer",paramType="query"),
		@ApiImplicitParam(name="goodsmap",value="商品的评价信息",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name="servicescores",value="店铺服务评分",required=true,dataType="Integer",paramType="query"),
		@ApiImplicitParam(name="deliveryscores",value="店铺物流评分",required=true,dataType="Integer",paramType="query"),
		@ApiImplicitParam(name="isanonymous",value="是否匿名显示 是：1，否：0",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name="dotype",value="操作类型 add：添加，edit：编辑",required=true,dataType="String",paramType="query"),
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@PostMapping(value="/add-edit-evaluate")
	public CommonVO addOrEditEvaluate(
			@RequestParam(value="token",required=true) String  token,
			@RequestParam(value="orderid",required=false) Integer  orderid,
			@RequestParam(value="goodsmap",required=true) String  goodsmap,
			@RequestParam(value="servicescores",required=true) Integer  servicescores,
			@RequestParam(value="deliveryscores",required=true) Integer  deliveryscores,
			@RequestParam(value="isanonymous",required=true) String  isanonymous,
			@RequestParam(value="dotype",required=true) String  dotype
			){
		
		CommonVO commonVO=new CommonVO();
		int code=200;
		String message="添加或编辑评论成功！";
		try {
			SyMember syMember=userFacade.getMemberByToken(token);
			// 判断是否为没登录或者没有值
			if (ObjectUtils.isEmpty(syMember)) {
				logger.info("没有该用户信息 token={}",token);
				throw new CoreServiceException(UserCorrelationException.USER_NOT_EXIST,"没有该用户信息");
			} else {
			Integer memberId = syMember.getMemberId();
			String memberName = syMember.getMemberName();
			evaluateFacade.addEvaluate(goodsmap, memberId, orderid, servicescores, deliveryscores, memberName, isanonymous,dotype);
			commonVO.setCode(code);
			commonVO.setMessage(message);
			}
			
		} catch (CoreServiceException e) {
			logger.error(e.getMessage(),e);
			commonVO = exceptionResolver.parseException(e);
			logger.info("添加或编辑评论失败！ token={},orderid = {}",token,orderid);
		}
		return commonVO; 
	}
	/**
	 * @author zy
	 * 目前好像只能添加评价
	 * @param paysn
	 * @return
	 */
	@ApiOperation(value = "一键好评", httpMethod = "POST" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="token",value="用户登录后得到的token",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name="orderid",value="订单id",required=true,dataType="Integer",paramType="query")
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@PostMapping(value="/one-praise")
	public CommonVO onePraise(
			@RequestParam(value="token",required=true) String  token,
			@RequestParam(value="orderid",required=false) Integer  orderid
			){
		
		CommonVO commonVO=new CommonVO();
		int code=200;
		String message="一键好评成功！";
		try {
			SyMember syMember=userFacade.getMemberByToken(token);
			// 判断是否为没登录或者没有值
			if (ObjectUtils.isEmpty(syMember)) {
				logger.info("没有该用户信息 token={}",token);
				throw new CoreServiceException(UserCorrelationException.USER_NOT_EXIST,"没有该用户信息");
			} else {
				Integer memberId = syMember.getMemberId();
				String memberName = syMember.getMemberName();
				evaluateFacade.onePraise(orderid, memberId, memberName);
				commonVO.setCode(code);
				commonVO.setMessage(message);
			}
		} catch (CoreServiceException e) {
			logger.error(e.getMessage(),e);
			commonVO = exceptionResolver.parseException(e);
			logger.info("一键好评失败！ token={},orderid = {}",token,orderid);
		}
		return commonVO; 
	}
}
