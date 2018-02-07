package com.shanyuan.platform.ms.core.cart.impl.exceptype;

import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;

public interface CartServiceExcepType extends CoreServiceExcepType{
	
	CoreServiceExcepType CLEAR_CART_FAIL = new ExcepType("clear_cart_fail");//参数丢失
	CoreServiceExcepType INSERT_CART_FAIL = new ExcepType("insert_cart_fail");
	CoreServiceExcepType DELETE_CART_FAIL = new ExcepType("delete_cart_fail");
	CoreServiceExcepType UPDATE_CART_FAIL = new ExcepType("update_cart_fail");
	CoreServiceExcepType ACTION_ERROR = new ExcepType("action_error");
	CoreServiceExcepType CHECKED_ERROR = new ExcepType("checked_error");
	CoreServiceExcepType NO_STORE = new ExcepType("no_store");
}
