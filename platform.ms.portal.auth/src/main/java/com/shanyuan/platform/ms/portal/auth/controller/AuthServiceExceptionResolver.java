package com.shanyuan.platform.ms.portal.auth.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;
import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType.ExcepType;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.auth.impl.exceptype.AuthServiceExcepType;
import com.shanyuan.platform.ms.core.user.impl.exceptype.BindThirdPlatformIDException;
import com.shanyuan.platform.ms.facade.ServiceExceptionResolver;
import com.shanyuan.platform.ms.facade.auth.impl.exceptype.AuthFacadeExcepType;
@Component
public class AuthServiceExceptionResolver  implements ServiceExceptionResolver {

	@Override
	public Map<String, Object> parseException(CoreServiceException e) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", 500);
		map.put("msg", "business error");
		if(e.getExcepType()!=null) {
			CoreServiceExcepType.ExcepType et =  (ExcepType) e.getExcepType();
			if(et.equals(AuthServiceExcepType.SEND_CODE_ERROR)) {
				map.put("msg", "send sms error");
			}else if(et.equals(AuthServiceExcepType.NOT_IN_WHITELIST)) {
			    map.put("msg", "用户不在白名单列表");
			}else if(et.equals(AuthServiceExcepType.VALID_CODE_ERROR)) {
                map.put("msg", "验证码错误");
            }else if(et.equals(BindThirdPlatformIDException.BIND_WX_FAILED)){
            	map.put("msg", "微信绑定失败");
            }else if(et.equals(BindThirdPlatformIDException.BIND_THIRD_FAILED)){
            	map.put("msg", "第三方平台绑定失败");
            }else if(et.equals(AuthFacadeExcepType.UPDATE_WEAL_UNION_ERROR)){
            	map.put("msg", "更新联盟失败");
            }else if(et.equals(AuthFacadeExcepType.JOIN_CIRCIE_ERROR)){
            	map.put("msg", "加入圈子失败");
            }else if(et.equals(AuthFacadeExcepType.INVALID_MOBILE)){
            	map.put("msg", "请输入正确的手机号");
            }else if(et.equals(AuthFacadeExcepType.SEND_ERROR)){
            	map.put("msg", "短信发送失败");
            }else if(et.equals(AuthFacadeExcepType.HAS_BIND)){
            	map.put("status", 302);
            	map.put("msg", "用户已绑定微信！");
            }else if(et.equals(AuthFacadeExcepType.NOT_REGISTER)){
            	map.put("status", 301);
            	map.put("msg", "用户未注册！");
            }else if(et.equals(AuthServiceExcepType.INTERVAL_TOO_BRIEF)){
            	map.put("status", 501);
            	map.put("msg", "发送短信间隔最少为1分钟！");
            }else if(et.equals(AuthServiceExcepType.TOO_MANY_TIMES)){
            	map.put("status", 502);
            	map.put("msg", "半小时内最多只能发送三次短信");
            }else if(et.equals(AuthServiceExcepType.REDIS_ERROR)){
            	map.put("msg", "redis写入错误");
            }else if(et.equals(AuthFacadeExcepType.UN_BIND)){
            	map.put("status", 303);
            	map.put("msg", "该微信号未绑定用户");
            }else if(et.equals(AuthFacadeExcepType.MISS_USERINFO)){
            	map.put("msg", "缺少必要参数，请检查");
            }else if(et.equals(AuthFacadeExcepType.UPDATE_INFO_ERROR)){
            	map.put("msg", "用户信息更新失败");
            }else if(et.equals(AuthFacadeExcepType.UPDATE_WEAL_UNION_ERROR)){
            	map.put("msg", "更新公益联盟失败");
            }else if(et.equals(AuthFacadeExcepType.JOIN_CIRCIE_ERROR)){
            	map.put("msg", "用户加入圈子失败");
            }else if(et.equals(AuthFacadeExcepType.MISS_PARAMETER)){
            	map.put("msg", "缺少必要参数");
            }
			
		}
		return map;
	}

}
