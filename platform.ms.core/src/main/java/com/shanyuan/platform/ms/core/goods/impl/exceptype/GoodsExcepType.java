package com.shanyuan.platform.ms.core.goods.impl.exceptype;

import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;

public interface GoodsExcepType extends CoreServiceExcepType {
	 CoreServiceExcepType UPDATE_BUNUM_ERROR = new ExcepType("UPDATE_BUNUM_ERROR");  //订单创建失败
	 CoreServiceExcepType EMPTY_PARAMS = new ExcepType("empty_params");  //相关参数为空
	 CoreServiceExcepType UPDATE_SALE_FAIL = new ExcepType("update_sale_fail");  //增加销量失败
	 CoreServiceExcepType STORE_MISSING = new ExcepType("store_missing");  
	 CoreServiceExcepType WRONG_AREAID = new ExcepType("wrong_areaid"); 
	 CoreServiceExcepType EMPTY_EVALUATTE = new ExcepType("empty_evaluatte");  
	 CoreServiceExcepType QUERY_ERROR = new ExcepType("query_error");  //相关参数为空
	 

}
