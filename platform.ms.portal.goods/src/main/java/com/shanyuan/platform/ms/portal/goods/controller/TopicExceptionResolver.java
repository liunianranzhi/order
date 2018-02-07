package com.shanyuan.platform.ms.portal.goods.controller;


import com.shanyuan.platform.ms.base.common.vo.CommonVO;
import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType.ExcepType;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.topic.impl.exceptype.SyTopicServiceExcepType;
import com.shanyuan.platform.ms.core.user.impl.exceptype.UserCorrelationException;
import com.shanyuan.platform.ms.facade.order.OrderParseException;
import org.springframework.stereotype.Component;

@Component
public class TopicExceptionResolver implements OrderParseException{
   @Override
	public CommonVO parseException(CoreServiceException e) {
		CommonVO commonvo= new CommonVO();
		Integer code=500;
		if(e.getExcepType()!=null) {
			ExcepType et =  (ExcepType) e.getExcepType();
			if(et.equals(UserCorrelationException.USER_NOT_EXIST)
					) {
				code= 403;
			}else if( et.equals(SyTopicServiceExcepType.topic_info_error)
					   || et.equals(SyTopicServiceExcepType.topic_floor_error)) {
				code= 510;
			}else if(et.equals(SyTopicServiceExcepType.params_error)) {
				code= 301;
			}else{
				code = 500;
			}
		}
		commonvo.setCode(code);
		commonvo.setMessage(e.getMessage());
		return commonvo;
	}

}
