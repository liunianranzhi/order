package com.shanyuan.platform.ms.core.store.impl.execptype;

import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;


public interface StoreExcepType extends CoreServiceExcepType {
	
	 CoreServiceExcepType CREATE_STORE_ERROR = new ExcepType("create_store_error");  //订单创建失败
	 
	 CoreServiceExcepType STORE_PARAM_ERROR = new ExcepType("store_param_error");   //订单参数
	 
	 

}
