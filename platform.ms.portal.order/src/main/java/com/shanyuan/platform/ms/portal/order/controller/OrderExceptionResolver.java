package com.shanyuan.platform.ms.portal.order.controller;


import org.springframework.stereotype.Component;

import com.shanyuan.platform.ms.base.common.vo.CommonVO;
import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;
import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType.ExcepType;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.cart.impl.exceptype.CartServiceExcepType;
import com.shanyuan.platform.ms.core.order.impl.exceptype.OrderServiceExcepType;
import com.shanyuan.platform.ms.core.user.impl.exceptype.UserCorrelationException;
import com.shanyuan.platform.ms.facade.order.OrderParseException;
@Component
public class OrderExceptionResolver  implements OrderParseException{
   @Override
	public CommonVO parseException(CoreServiceException e) {
		CommonVO commonvo= new CommonVO();
		Integer code=500;
		if(e.getExcepType()!=null) {
			CoreServiceExcepType.ExcepType et =  (ExcepType) e.getExcepType();
			if(et.equals(UserCorrelationException.USER_NOT_EXIST)
					) {
				code= 403;
			}else if( et.equals(UserCorrelationException.OTHER_LOGINING)){
				code= 401;
			}else if( et.equals(OrderServiceExcepType.NO_ONLINE_GOODS)
					   || et.equals(OrderServiceExcepType.GOODS_MISSING)
					   || et.equals(OrderServiceExcepType.GOODS_COMMON_MISSING)
					   || et.equals(OrderServiceExcepType.SYSHOP_MAX_BUYNUM_FAIL)
					   || et.equals(OrderServiceExcepType.STOCK_COUNT_NOT_ENOUGH_FAIL)
					   || et.equals(OrderServiceExcepType.BOC_POINTS_NOT_ENOUGH_FAIL)) {
				code= 501;
			}else if(et.equals(OrderServiceExcepType.NOT_SUPPORTED)) {
				code= 303;
			}else if(et.equals(OrderServiceExcepType.CART_EMPTY)) {
				code= 301;
			}else if(et.equals(OrderServiceExcepType.ADDRESS_EMPTY)) {
				code= 302;
            }else if (et.equals(OrderServiceExcepType.MISSING_PARAMETER)) {
				code = 510;
			}else if ( et.equals(OrderServiceExcepType.OrderUpError.ORDER_ADD_POINTS)
            		 || et.equals(OrderServiceExcepType.OrderUpError.ORDER_UP_POINTS)
            		 || et.equals(OrderServiceExcepType.OrderUpError.ORDER_UP_POOR_CODE)
            		 || et.equals(OrderServiceExcepType.OrderUpError.ORDER_ADD_VOURCHER_CODE)
            		 || et.equals(OrderServiceExcepType.OrderUpError.ORDER_UP_VOURCHER_CODE)
            		 || et.equals(OrderServiceExcepType.OrderUpError.ORDER_UP_STORE_COUNT)
            		 || et.equals(CartServiceExcepType.CLEAR_CART_FAIL)) {
				code = 500;
			}
		}
		commonvo.setCode(code);
		commonvo.setMessage(e.getMessage());
		return commonvo;
	}

}
