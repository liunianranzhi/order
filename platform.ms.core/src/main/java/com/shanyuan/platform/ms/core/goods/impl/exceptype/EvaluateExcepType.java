package com.shanyuan.platform.ms.core.goods.impl.exceptype;

import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;

public interface EvaluateExcepType extends CoreServiceExcepType {
	 CoreServiceExcepType INSERT_EVALUATE = new ExcepType("INSERT_EVALUATE");  //订单创建失败
	 CoreServiceExcepType INSERT_EVALUATE_STORE = new ExcepType("INSERT_EVALUATE_STORE");  //店铺评价
	 CoreServiceExcepType UPDATE_EVALUATE = new ExcepType("UPDATE_EVALUATE");  //相关参数为空
	 CoreServiceExcepType DEL_EVALUATE = new ExcepType("DEL_EVALUATE");  //增加销量失败
	 CoreServiceExcepType UPDATE_OREDER_GOODS = new ExcepType("UPDATE_OREDER_GOODS");  //增加销量失败
	 CoreServiceExcepType SCORES_OR_CONTENT_EMPT = new ExcepType("SCORES_OR_CONTENT_EMPT");
	 CoreServiceExcepType CONTENT_ONT_ENOUGHT = new ExcepType("CONTENT_ONT_ENOUGHT"); //评价字数不够 
	 CoreServiceExcepType SCORES_ERROR = new ExcepType("SCORES_ERROR");  
	 CoreServiceExcepType PARAM_ERROR = new ExcepType("PARAM_ERROR");  //参数格式不对
	 CoreServiceExcepType PARAM_EMPTY = new ExcepType("PARAM_EMPTY");  //参数不能为空
	 CoreServiceExcepType EVALUATE_EMPTY = new ExcepType("EVALUATE_EMPTY");  //评论列表为空
	 CoreServiceExcepType QUERY_ERROR = new ExcepType("QUERY_ERROR");  //查询异常
	 

}
