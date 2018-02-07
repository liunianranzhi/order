package com.shanyuan.platform.ms.portal.goods.controller;


import org.springframework.stereotype.Component;

import com.shanyuan.platform.ms.base.common.vo.CommonVO;
import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;
import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType.ExcepType;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.goods.impl.exceptype.EvaluateExcepType;
import com.shanyuan.platform.ms.core.user.impl.exceptype.UserCorrelationException;
import com.shanyuan.platform.ms.facade.order.OrderParseException;

import java.util.HashMap;

@Component
public class EvaluateExceptionResolver  implements OrderParseException{
   @Override
	public CommonVO parseException(CoreServiceException e) {
		CommonVO commonvo= new CommonVO();
		Integer code=500;
		if(e.getExcepType()!=null) {
			CoreServiceExcepType.ExcepType et =  (ExcepType) e.getExcepType();
			if(et.equals(UserCorrelationException.USER_NOT_EXIST)
					) {
				code= 403;
			}else if( et.equals(EvaluateExcepType.SCORES_OR_CONTENT_EMPT)
					   || et.equals(EvaluateExcepType.PARAM_EMPTY)) {
				code= 510;
			}else if(et.equals(EvaluateExcepType.SCORES_ERROR) ||
					et.equals(EvaluateExcepType.PARAM_ERROR)) {
				code= 301;
            }else if (et.equals(EvaluateExcepType.CONTENT_ONT_ENOUGHT)) {
				code = 501;
			}else{
				code = 500;
			}
		}
		commonvo.setCode(code);
		commonvo.setMessage(e.getMessage());
		return commonvo;
	}

}
