package com.shanyuan.platform.ms.portal.order.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shanyuan.platform.ms.base.common.vo.CommonVO;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.facade.cart.CartFacade;
import com.shanyuan.platform.ms.facade.user.UserFacade;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
@RequestMapping(value="/cart")
public class CartController {
	private final static Logger logger = LoggerFactory.getLogger(CartController.class);
	@Autowired
	private CartFacade cartFacade;
	@Autowired
	private UserFacade userFacade;
	
	@ApiOperation(value = "购物车列表", httpMethod = "GET" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="token",value="用户登录令牌",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name = "pagesize", value = "每页显示数", required = false, dataType = "Integer", paramType = "query"),
		@ApiImplicitParam(name = "currentpage", value = "当前页数", required = false, dataType = "Integer", paramType = "query")
		})
			
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@GetMapping(value="/cart-list")
	public CommonVO cartList(
			@RequestParam(value = "token",required = true) String token,
			@RequestParam(value="pagesize",required=false) Integer pagesize,
			@RequestParam(value="currentpage",required=false) Integer currentpage) {
		
		CommonVO dataDomain=new CommonVO();
		int code=200;
		String message="购物车查询成功";
		try {
			SyMember syMember=userFacade.getMemberByToken(token);
			// 判断是否为没登录或者没有值
			if (ObjectUtils.isEmpty(syMember)) {
				dataDomain.setMessage("没有该用户信息");
				dataDomain.setCode(404);
			} else {
				Integer memberId = syMember.getMemberId();
				Map<String, Object> cartList = cartFacade.cartListByMid(memberId,pagesize,currentpage);
				if(ObjectUtils.isEmpty(cartList.get("cartListInfo"))) {
					message="购物车为空！";
				}
				dataDomain.setData(cartList);
				dataDomain.setCode(code);
				dataDomain.setMessage(message);
			}
		} catch (CoreServiceException e) {
			logger.error("购物车查询失败 token={}",token,e);
			dataDomain.setCode(500);
			dataDomain.setMessage("购物车查询失败");
		}
		return dataDomain;
	}
	
	@ApiOperation(value = "添加购物车", httpMethod = "POST" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="token",value="用户登录令牌",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name = "goodsid", value = "商品id", required = true, dataType = "Integer", paramType = "query"),
		@ApiImplicitParam(name = "goodsnum", value = "商品数量", required = true, dataType = "Integer", paramType = "query")
		})
			
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@PostMapping(value="/add-cart")
	public CommonVO addCart(
			@RequestParam(value = "token",required = true) String token,
			@RequestParam(value="goodsid",required=true) Integer goodsid,
			@RequestParam(value="goodsnum",required=true) Integer goodsnum) {
		
		CommonVO dataDomain=new CommonVO();
		int code=200;
		String message="加入心愿单成功！";
		try {
			SyMember syMember=userFacade.getMemberByToken(token);
			// 判断是否为没登录或者没有值
			if (ObjectUtils.isEmpty(syMember)) {
				dataDomain.setMessage("没有该用户信息");
				dataDomain.setCode(404);
			} else {
				Integer memberId = syMember.getMemberId();
				Map<String, Object> addNewCart = cartFacade.addNewCart(memberId, goodsid, goodsnum);
				dataDomain.setData(addNewCart);
				dataDomain.setCode(code);
				dataDomain.setMessage(message);
			}
		} catch (CoreServiceException e) {
			logger.info("购物车查询失败 token={}",token,e);
			dataDomain.setCode(500);
			dataDomain.setMessage(e.getMessage());
		}
		return dataDomain;
	}
	
	@ApiOperation(value = "删除购物车", httpMethod = "POST" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="token",value="用户登录令牌",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name = "cartid", value = "购物车id", required = true, dataType = "Integer", paramType = "query")
		})
			
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@PostMapping(value="/del-cart")
	public CommonVO delCart(
			@RequestParam(value = "token",required = true) String token,
			@RequestParam(value="cartid",required=true) Integer cartid){
		
		CommonVO dataDomain=new CommonVO();
		int code=200;
		String message="删除购物车成功！";
		try {
			SyMember syMember=userFacade.getMemberByToken(token);
			// 判断是否为没登录或者没有值
			if (ObjectUtils.isEmpty(syMember)) {
				dataDomain.setMessage("没有该用户信息");
				dataDomain.setCode(404);
			} else {
				Integer memberId = syMember.getMemberId();
				Map<String, Object> delCart = cartFacade.delCart(memberId, cartid);
				dataDomain.setData(delCart);
				dataDomain.setCode(code);
				dataDomain.setMessage(message);
			}
		} catch (CoreServiceException e) {
			logger.info("删除购物车记录失败 token={}",token,e);
			dataDomain.setCode(500);
			dataDomain.setMessage(e.getMessage());
		}
		return dataDomain;
	}
	@ApiOperation(value = "删除购物车", httpMethod = "POST" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="token",value="用户登录令牌",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name = "cartid", value = "购物车id", required = true, dataType = "Integer", paramType = "query"),
		@ApiImplicitParam(name = "goodsnum", value = "商品数量", required = true, dataType = "Integer", paramType = "query"),
		@ApiImplicitParam(name = "ischeck", value = "是否选中，是：1，否：0", required = true, dataType = "String", paramType = "query")
		})
			
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@PostMapping(value="/edit-cart")
	public CommonVO editCart(
			@RequestParam(value = "token",required = true) String token,
			@RequestParam(value="cartid",required=true) Integer cartid,
			@RequestParam(value="goodsnum",required=true) Integer goodsnum,
			@RequestParam(value="ischeck",required=true) String ischeck
			) {
		
		CommonVO dataDomain=new CommonVO();
		int code=200;
		String message="更新购物车成功！";
		try {
			SyMember syMember=userFacade.getMemberByToken(token);
			// 判断是否为没登录或者没有值
			if (ObjectUtils.isEmpty(syMember)) {
				dataDomain.setMessage("没有该用户信息");
				dataDomain.setCode(404);
			} else {
				Integer memberId = syMember.getMemberId();
				Map<String, Object> updateCart = cartFacade.updateCart(memberId, cartid, goodsnum, ischeck);
				dataDomain.setData(updateCart);
				dataDomain.setCode(code);
				dataDomain.setMessage(message);
			}
		} catch (CoreServiceException e) {
			logger.error(e.getMessage(),e);
			dataDomain.setCode(500);
			dataDomain.setMessage(e.getMessage());
			logger.info("更新购物车失败 token={}",token);
		
		}
		return dataDomain;
	}
	
}
