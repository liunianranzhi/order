package com.shanyuan.platform.ms.portal.order.controller;


import com.shanyuan.platform.ms.base.common.vo.CommonVO;
import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType.ExcepType;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.user.impl.exceptype.AddressExcepType;
import com.shanyuan.platform.ms.core.user.impl.exceptype.UserCorrelationException;
import com.shanyuan.platform.ms.facade.order.OrderParseException;
import org.springframework.stereotype.Component;

@Component
public class AddressExceptionResolver implements OrderParseException{
   @Override
	public CommonVO parseException(CoreServiceException e) {
		CommonVO commonvo= new CommonVO();
		Integer code=500;
		if(e.getExcepType()!=null) {
			ExcepType et =  (ExcepType) e.getExcepType();
			if(et.equals(UserCorrelationException.USER_NOT_EXIST)
					) {
				code= 403;
			}else if( et.equals(UserCorrelationException.OTHER_LOGINING)){
				code= 401;
			}else if( et.equals(AddressExcepType.telphone_error)
					   || et.equals(AddressExcepType.areaid_error)
					   || et.equals(AddressExcepType.addressId_error)
					   || et.equals(AddressExcepType.missing_parameter)
					   || et.equals(AddressExcepType.address_existed)
					   || et.equals(AddressExcepType.params_too_long)) {
				code= 501;
			}else if ( et.equals(AddressExcepType.insert_address_fail)
            		 || et.equals(AddressExcepType.update_address_fail)
            		 || et.equals(AddressExcepType.set_not_default_fail)
            		 || et.equals(AddressExcepType.del_address_fail)
            		) {
				code = 500;
			}
		}
		commonvo.setCode(code);
		commonvo.setMessage(e.getMessage());
		return commonvo;
	}

}
