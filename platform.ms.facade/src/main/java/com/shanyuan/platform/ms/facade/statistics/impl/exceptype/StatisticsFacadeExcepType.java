package com.shanyuan.platform.ms.facade.statistics.impl.exceptype;

import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;

/**
 * 统计系统异常
 * @author yangjian
 * @date 2018/01/17
 *
 */
public interface StatisticsFacadeExcepType extends CoreServiceExcepType  {
	
	CoreServiceExcepType GET_DATA_ERROR = new ExcepType("get_data_error");
	
	CoreServiceExcepType PARAM_ERROR = new ExcepType("error_param");
	
}
