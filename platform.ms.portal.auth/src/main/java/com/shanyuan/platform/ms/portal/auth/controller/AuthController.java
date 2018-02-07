package com.shanyuan.platform.ms.portal.auth.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shanyuan.platform.ms.base.common.BaseController;
import com.shanyuan.platform.ms.base.common.vo.CommonVO;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.AuthConstant;
import com.shanyuan.platform.ms.core.constant.LoginConstant;
import com.shanyuan.platform.ms.core.user.bo.LoginInfo;
import com.shanyuan.platform.ms.facade.auth.AuthFacade;
import com.shanyuan.platform.ms.facade.auth.domain.CircleInfoDomain;
import com.shanyuan.platform.ms.facade.auth.domain.SelectCircleDomain;
import com.shanyuan.platform.ms.facade.auth.domain.UnionDomain;
import com.shanyuan.platform.ms.portal.auth.service.ImageValidCodeService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Controller
@CrossOrigin
@RequestMapping(value="")
public class AuthController extends BaseController {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private AuthServiceExceptionResolver authExcepRes;
	
	@Autowired
	private AuthFacade authFacade;
	
	@Autowired
	private ImageValidCodeService imageValidService;
	
	@ApiOperation("发送短信验证码")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "mobile", value = "手机号码", required = true, dataType = "String", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "range", value = "发送范围", required = false, dataType = "String", paramType = "query", defaultValue = "")
	})
	
	@CrossOrigin
	@RequestMapping(value= "/getmcode", method=RequestMethod.GET)
	@ResponseBody
	public CommonVO getLoginMcode(
			@RequestParam(value="mobile", required=true ) String mobile, 
			@RequestParam(value = "range", required = false, defaultValue = AuthConstant.SmsRange.ALL) String range,
			@RequestParam(value = "vcode", required = false) String vcode,
    HttpServletRequest request) {
		try {
			boolean need = imageValidService.needVaidCode(mobile, vcode);
			if(need && StringUtils.isEmpty(vcode)){
				return buildResp("获取次数过多，请明日再试！", CODE_IMAGE_VCODE_ERROR);
			}
			if(need && !imageValidService.checkValidCode(mobile, vcode)){
				return buildResp("1", CODE_IMAGE_VCODE_ERROR);
			}
			Map<String, Object> result = this.authFacade.sendValidSmsCodeByRange(mobile, range);
			return buildSuccessResp(result);
		} catch (CoreServiceException e) {
            String realIP = this.getIp(request);
			logger.error("get sms code error type={} mobile={} ip={}",e.getExcepType().getName(),mobile ,realIP);
			Map<String, Object> excecpMap = authExcepRes.parseException(e);
			Integer code = (Integer) excecpMap.get("status");
			String message = (String) excecpMap.get("msg");
			return buildResp(null, code, message);
		}
	}
	
	@ApiOperation("登录操作")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "mobile", value = "手机号码", required = true, dataType = "String", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "mcode", value = "验证码或密码", required = true, dataType = "String", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "loginType", value = "登录类型，pwd_login或code_login", required = true, dataType = "String", paramType = "query", defaultValue = "code_login"),
		@ApiImplicitParam(name = "wxOpenid", value = "微信openId", required = false, dataType = "String", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "client", value = "客户端", required = false, dataType = "String", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "inviteCode", value = "邀请码", required = false, dataType = "String", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "channel", value = "渠道", required = false, dataType = "String", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "corpUid", value = "第三方id", required = false, dataType = "String", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "circleId", value = "圈子id", required = false, dataType = "Integer", paramType = "query", defaultValue = "")
	})
	@CrossOrigin
	@RequestMapping(value = "/login", method = {RequestMethod.POST})
	@ResponseBody
	public CommonVO doLogin(
			@RequestParam(value = "mobile", required = true) String mobile,
			@RequestParam(value = "mcode", required = true) String mcode,
			@RequestParam(value = "loginType", required = true) String loginType,
			@RequestParam(value = "wxOpenid", required = false) String wxOpenid,
			@RequestParam(value = "client", required = false) String client,
			@RequestParam(value = "inviteCode", required = false) String inviteCode,
			@RequestParam(value = "channel", required = false) String channel,
			@RequestParam(value = "corpUid", required = false) String corpUid,
			@RequestParam(value = "circleId", required = false) Integer circleId,
			@RequestParam(value = "did", required = false) String did, 
			HttpServletRequest request){
		String realIP = this.getIp(request);
		LoginInfo loginInfo = new LoginInfo(realIP, loginType, mobile, mcode, corpUid, wxOpenid, inviteCode, client, channel, circleId, did);
		try{
			Map<String, Object> resultMap = authFacade.doLogin(loginInfo);
			if((boolean) resultMap.get("status")){
				return buildSuccessResp(resultMap);
			}else{
				return buildErrorResp(resultMap);
			}
		}catch (CoreServiceException e){
			Map<String, Object> excepMap = authExcepRes.parseException(e);
			logger.error("", excepMap);
			return buildErrorResp(excepMap);
		}
	}
	
	@ApiOperation("微信登录")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "wxOpenid", value = "微信openId", required = false, dataType = "String", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "client", value = "客户端", required = false, dataType = "String", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "inviteCode", value = "邀请码", required = false, dataType = "String", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "channel", value = "渠道", required = false, dataType = "String", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "circleId", value = "圈子id", required = false, dataType = "Integer", paramType = "query", defaultValue = "")
	})
	@CrossOrigin
	@RequestMapping(value = "/wxauth", method = RequestMethod.POST)
	@ResponseBody
	public CommonVO wxLogin(
			@RequestParam(value = "wxOpenid", required = true) String wxOpenid,
			@RequestParam(value = "client", required = false) String client,
			@RequestParam(value = "inviteCode", required = false) String inviteCode,
			@RequestParam(value = "channel", required = false) String channel,
			@RequestParam(value = "circleId", required = false) Integer circleId,
			HttpServletRequest request){
		String realIP = this.getIp(request);
		LoginInfo loginInfo = new LoginInfo(realIP, LoginConstant.LoginType.WX_LOGIN, null, null, null, wxOpenid, inviteCode, client, channel, circleId, null);
		try{
			Map<String, Object> resultMap = authFacade.doLogin(loginInfo);
			return buildSuccessResp(resultMap);
		}catch (CoreServiceException e) {
			Map<String, Object> excepMap = authExcepRes.parseException(e);
			logger.error("", excepMap);
			return buildErrorResp(excepMap);
		}
	}
	
	@ApiOperation("完善用户信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "memberId", value = "用户id", required = true, dataType = "Integer", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "memberAvatar", value = "用户头像地址", required = false, dataType = "String", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "memberName", value = "用户名", required = false, dataType = "String", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "memberSex", value = "用户性别 0：保密，1：男，2：女", required = false, dataType = "Byte", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "inviteCode", value = "邀请码", required = false, dataType = "String", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "circleId", value = "圈子id", required = false, dataType = "Integer", paramType = "query", defaultValue = "")
	})
	@CrossOrigin
	@PostMapping("/improve-info")
	@ResponseBody
	public CommonVO improveInfo(
			@RequestParam(value = "memberId", required = true) Integer memberId,
			@RequestParam(value = "memberAvatar", required = false) String memberAvatar,
			@RequestParam(value = "memberName", required = false) String memberName,
			@RequestParam(value = "memberSex", required = false) Byte memberSex,
			@RequestParam(value = "inviteCode", required = false) String inviteCode,
			@RequestParam(value = "circleId", required = false) Integer circleId){
		try {
			Map<String, Object> improveInfo = authFacade.improveInfo(memberId, memberName, memberAvatar, memberSex, inviteCode, circleId);
			return buildSuccessResp(improveInfo);
		} catch (CoreServiceException e) {
			Map<String, Object> excepMap = authExcepRes.parseException(e);
			logger.error("", excepMap);
			return buildErrorResp(excepMap);
		}
	}
	
	@ApiOperation("获取所有联盟")
	@GetMapping("/get-all-union")
	@ResponseBody
	@CrossOrigin
	public CommonVO getAllUnion(){
		try {
			UnionDomain allUnion = authFacade.getAllUnion();
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("unions", allUnion);
			return buildSuccessResp(map);
		} catch (CoreServiceException e) {
			Map<String, Object> excepMap = authExcepRes.parseException(e);
			logger.error("", excepMap);
			return buildErrorResp(excepMap);
		}
	}
	
	@ApiOperation("获取联盟下所有圈子信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "circleId", value = "获取所有自联盟信息", required = true, dataType = "String", paramType = "query", defaultValue = ""),
	})
	@GetMapping("/get-child-circle")
	@ResponseBody
	@CrossOrigin
	public CommonVO getChildCircle(@RequestParam(value = "circleId", required = true)Integer circleId){
		try {
			CircleInfoDomain subCircleInfo = authFacade.getSubCircleInfo(circleId);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("subCircleInfo", subCircleInfo.getChildCircle());
			return buildSuccessResp(map);
		} catch (CoreServiceException e) {
			Map<String, Object> excepMap = authExcepRes.parseException(e);
			logger.error("", excepMap);
			return buildErrorResp(excepMap);
		}
	}
	
	@ApiOperation("查询部门信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "circleName", value = "要查询的名称", required = true, dataType = "String", paramType = "query", defaultValue = ""),
		@ApiImplicitParam(name = "code", value = "所属联盟code", required = true, dataType = "String", paramType = "query", defaultValue = "")
	})
	@GetMapping("/select-circle")
	@ResponseBody
	@CrossOrigin
	public CommonVO selectCircle(@RequestParam(value = "circleName", required = true)String circleName, 
			@RequestParam(value = "code", required = true)String code){
		try{
			List<SelectCircleDomain> selectCircleInfo = authFacade.selectCircleInfo(circleName, code);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("circles", selectCircleInfo);
			return buildSuccessResp(map);
		}catch (CoreServiceException e){
			Map<String, Object> excepMap = authExcepRes.parseException(e);
			logger.error("", excepMap);
			return buildErrorResp(excepMap);
		}
	}
	@GetMapping("/get-vcode")
	@ResponseBody
	public String getVcode(@RequestParam(value = "mobile", required = true) String mobile){
		String result = "";
		try{
			result = imageValidService.getValidCode(mobile);
		}catch (IOException e) {
			logger.info("请求图形验证码失败");
			logger.info(e.getMessage(), e);
		}
		return result;
	}
	
	@GetMapping("/get-vcode-ios")
	@ResponseBody
	public CommonVO getVcodeMap(@RequestParam(value = "mobile", required = true) String mobile){
		String result = "";
		try{
			result = imageValidService.getValidCode(mobile);
			Map<String, Object> resultMap = new HashMap<String, Object>();
			resultMap.put("imgBase64", result);
			return buildSuccessResp(resultMap);
		}catch (IOException e) {
			logger.info("请求图形验证码失败");
			logger.info(e.getMessage(), e);
			return buildErrorResp();
		}
	}
	
	/**
	 * 获取请求IP地址
	 * @param request
	 * @return
	 */
	private String getIp(HttpServletRequest request) {
		String remoteAddr = request.getRemoteAddr();
        String forwarded = request.getHeader("X-Forwarded-For");
        String realIp = request.getHeader("X-Real-IP");
        String ip = null;
        if (realIp == null) {
            if (forwarded == null) {
                ip = remoteAddr;
            } else {
                ip = forwarded.split(",")[0];
            }
        } else {
            if (realIp.equals(forwarded)) {
                ip = realIp;
            } else {
                if(forwarded != null){
                    forwarded = forwarded.split(",")[0];
                }
                ip = realIp + "/" + forwarded;
            }
        }
        if(ip.length() > 15){
        	ip = ip.substring(0, 15);
        }
        return ip;
	}
	
}
