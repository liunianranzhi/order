package com.shanyuan.platform.ms.portal.order.controller;


import com.shanyuan.platform.ms.base.common.vo.CommonVO;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.user.bo.AddressBo;
import com.shanyuan.platform.ms.core.user.impl.exceptype.UserCorrelationException;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.facade.address.AddressFacade;
import com.shanyuan.platform.ms.facade.common.CommonFacade;
import com.shanyuan.platform.ms.facade.goods.GoodsFilterFacade;
import com.shanyuan.platform.ms.facade.goods.domain.AreaInfo;
import com.shanyuan.platform.ms.facade.user.UserFacade;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 
 * @author zy
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
@RequestMapping(value="/address")
public class AddressController {
	
	private final static Logger logger = LoggerFactory.getLogger(AddressController.class);
	@Autowired
	private AddressExceptionResolver addressExcepRes;
	@Autowired
	private GoodsFilterFacade goodsFilterFacade;
	@Autowired
	private AddressFacade addressFacade;
	@Autowired
	private UserFacade userFacade;
	@Autowired
	private CommonFacade commonFacade;
	/**
	 * @author zy
	 * @param token
	 * @return
	 */
	@ApiOperation(value = "会员收货地址列表", httpMethod = "GET" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="token",value="用户登录后得到的token",required=true,dataType="String",paramType="query"),
			@ApiImplicitParam(name="did",value="登录标识",required=false,dataType="String",paramType="query"),
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping(value="/receiver-address-list")
	public CommonVO getAddressList(
			@RequestParam(value="token",required=true) String  token,
			@RequestParam(value="did",required=false) String did
	){
		
		CommonVO commonVO=new CommonVO();
		Map<String,Object> data= new HashMap<String,Object>();
		int code=200;
		String message="收货地址查询成功";
		try {

			/*if(!commonFacade.checkLogin(token,did)){
				throw new CoreServiceException(UserCorrelationException.OTHER_LOGINING,"已在其他设备上登录~");
			}*/
			SyMember syMember=userFacade.getMemberByToken(token);
			// 判断是否为没登录或者没有值
			if (ObjectUtils.isEmpty(syMember)) {
				logger.info("收货地址查询失败 token={}",token);
				throw new CoreServiceException(UserCorrelationException.USER_NOT_EXIST,"没有该用户信息");
			} else {
			Integer memberId = syMember.getMemberId();
			List<AddressBo> addressList = addressFacade.getAddressList(memberId);
			data.put("addressList", addressList);
			commonVO.setCode(code);
			commonVO.setData(data);
			commonVO.setMessage(message);
			}
			
		} catch (CoreServiceException e) {
			commonVO = addressExcepRes.parseException(e);
			logger.error("收货地址查询失败 token={}",token, e);
		}
		return commonVO; 
	}
	/**
	 * @author zy
	 * @param paysn
	 * @return
	 */
	@ApiOperation(value = "添加或编辑地址", httpMethod = "POST" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="token",value="用户登录后得到的token",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name="addressId",value="编辑的时候必传",required=false,dataType="Integer",paramType="query"),
		@ApiImplicitParam(name="did",value="登录标识",required=false,dataType="String",paramType="query"),
		@ApiImplicitParam(name="areaId",value="县id",required=true,dataType="Long",paramType="query"),
		@ApiImplicitParam(name="trueName",value="收货人姓名",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name="telPhone",value="收货人电话",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name="address",value="收货人详细地址",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name="isDefault",value="是否设置为默认",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name="type",value="add :表示添加 ;edit：表示编辑;",required=true,dataType="String",paramType="query"),
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@PostMapping(value="/add-edit-address")
	public CommonVO addOrEditAddress(
			@RequestParam(value="token",required=true) String  token,
			@RequestParam(value="did",required=false) String did,
			@RequestParam(value="addressId",required=false) Integer  addressId,
			@RequestParam(value="areaId",required=true) Long  areaId,
			@RequestParam(value="trueName",required=true) String  trueName,
			@RequestParam(value="telPhone",required=true) String  telPhone,
			@RequestParam(value="address",required=true) String  address,
			@RequestParam(value="isDefault",required=true) String  isDefault,
			@RequestParam(value="type",required=true) String  type
			){
		
		CommonVO commonVO=new CommonVO();
		int code=200;
		String message="收货地址添加或编辑成功";
		try {

			/*if(!commonFacade.checkLogin(token,did)){
				throw new CoreServiceException(UserCorrelationException.OTHER_LOGINING,"已在其他设备上登录~");
			}*/
			SyMember syMember=userFacade.getMemberByToken(token);
			// 判断是否为没登录或者没有值
			if (ObjectUtils.isEmpty(syMember)) {
				logger.info("没有该用户信息 token={}",token);
				throw new CoreServiceException(UserCorrelationException.USER_NOT_EXIST,"没有该用户信息");
			} else {
			Integer memberId = syMember.getMemberId();
			Map<String, Object> editAddress = addressFacade.editAddress(memberId, addressId,areaId, trueName, address, telPhone, type,isDefault);
			commonVO.setCode(code);
			commonVO.setData(editAddress);
			commonVO.setMessage(message);
			}
			
		} catch (CoreServiceException e) {
			commonVO = addressExcepRes.parseException(e);
			logger.error("收货地址添加或编辑失败！ token={},addressId = {}",token,addressId,e);
		}
		return commonVO; 
	}
	
	/**
	 * @author zy
	 * @param paysn
	 * @return
	 */
	@ApiOperation(value = "删除地址", httpMethod = "POST" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="token",value="用户登录后得到的token",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name="addressId",value="地址id",required=true,dataType="Integer",paramType="query"),
		@ApiImplicitParam(name="did",value="登录标识",required=false,dataType="String",paramType="query"),
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@PostMapping(value="/del-address")
	public CommonVO delAddress(
			@RequestParam(value="token",required=true) String  token,
			@RequestParam(value="did",required=false) String did,
			@RequestParam(value="addressId",required=true) Integer  addressId
			){
		
		CommonVO commonVO=new CommonVO();
		int code=200;
		String message="删除收货地址成功！";
		try {
			/*if(!commonFacade.checkLogin(token,did)){
				throw new CoreServiceException(UserCorrelationException.OTHER_LOGINING,"已在其他设备上登录~");
			}*/
			SyMember syMember=userFacade.getMemberByToken(token);
			// 判断是否为没登录或者没有值
			if (ObjectUtils.isEmpty(syMember)) {
				logger.info("没有该用户信息 token={}",token);
				throw new CoreServiceException(UserCorrelationException.USER_NOT_EXIST,"没有该用户信息");
			} else {
			Integer memberId = syMember.getMemberId();
		    addressFacade.delAddress(memberId, addressId, "del");
			commonVO.setCode(code);
			commonVO.setMessage(message);
			}
			
		} catch (CoreServiceException e) {
			commonVO = addressExcepRes.parseException(e);
			logger.error("删除地址失败！ token={},addressId = {}",token,addressId,e);
		}
		return commonVO; 
	}
	/**
	 * @author zy
	 * @param paysn
	 * @return
	 */
	@ApiOperation(value = "选择单个地址", httpMethod = "GET" )
	@ApiImplicitParams({
		@ApiImplicitParam(name="token",value="用户登录后得到的token",required=true,dataType="String",paramType="query"),
			@ApiImplicitParam(name="did",value="登录标识",required=false,dataType="String",paramType="query"),
			@ApiImplicitParam(name="addressId",value="地址id",required=false,dataType="Integer",paramType="query")
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping(value="/select-one-address")
	public CommonVO getOneAddress(
			@RequestParam(value="token",required=true) String  token,
			@RequestParam(value="did",required=false) String did,
			@RequestParam(value="addressId",required=false) Integer  addressId
			){
		
		CommonVO commonVO=new CommonVO();
		Map<String,Object> data= new HashMap<String,Object>();
		int code=200;
		String message="查询买家地址成功";
		try {
			/*if(!commonFacade.checkLogin(token,did)){
				throw new CoreServiceException(UserCorrelationException.OTHER_LOGINING,"已在其他设备上登录~");
			}*/
			SyMember syMember=userFacade.getMemberByToken(token);
			// 判断是否为没登录或者没有值
			if (ObjectUtils.isEmpty(syMember)) {
				logger.info("选择省市区查询失败 token={}",token);
				throw new CoreServiceException(UserCorrelationException.USER_NOT_EXIST,"没有该用户信息");
			} else {
			Integer memberId = syMember.getMemberId();
			 data = addressFacade.getAddressByIdAndUserId(memberId, addressId);
			commonVO.setCode(code);
			commonVO.setData(data);
			commonVO.setMessage(message);
			}
			
		} catch (CoreServiceException e) {
			commonVO = addressExcepRes.parseException(e);
			logger.error("查询买家地址失败token={}",token,e);
		}
		return commonVO; 
	}
	/**
	 * @author zy
	 * @param paysn
	 * @return
	 */
	@ApiOperation(value = "选择省市区", httpMethod = "GET" ) 
	@ApiImplicitParams({
		@ApiImplicitParam(name="token",value="用户登录后得到的token",required=true,dataType="String",paramType="query"),
		@ApiImplicitParam(name="parentid",value="省市区的父节点",required=true,dataType="Long",paramType="query"),
			@ApiImplicitParam(name="did",value="登录标识",required=false,dataType="String",paramType="query"),
	})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success" , response=CommonVO.class)
	})
	@CrossOrigin
	@GetMapping(value="/select-area-tree")
	public CommonVO selectAreaTree(
			@RequestParam(value="token",required=true) String  token,
			@RequestParam(value="did",required=false) String did,
			@RequestParam(value="parentid",required=true) Long  parentid){
		
		CommonVO commonVO=new CommonVO();
		Map<String,Object> data= new HashMap<String,Object>();
		int code=200;
		String message="选择省市区";
		try {
			/*if(!commonFacade.checkLogin(token,did)){
				throw new CoreServiceException(UserCorrelationException.OTHER_LOGINING,"已在其他设备上登录~");
			}*/
			SyMember syMember=userFacade.getMemberByToken(token);
			// 判断是否为没登录或者没有值
			if (ObjectUtils.isEmpty(syMember)) {
				logger.info("选择省市区查询失败 token={}",token);
				throw new CoreServiceException(UserCorrelationException.USER_NOT_EXIST,"没有该用户信息");
			} else {
				List<AreaInfo> areaByPid = goodsFilterFacade.getAreaByPid(parentid);
				data.put("areaList",areaByPid);
				commonVO.setCode(code);
				commonVO.setData(data);
				commonVO.setMessage(message);
			}
			
		} catch (CoreServiceException e) {
			commonVO = addressExcepRes.parseException(e);
			logger.error("选择省市区查询失败token={}",token,e);
		}
		return commonVO; 
	}
}
