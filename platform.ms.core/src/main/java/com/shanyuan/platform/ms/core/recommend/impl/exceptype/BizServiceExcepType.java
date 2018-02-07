package com.shanyuan.platform.ms.core.recommend.impl.exceptype;

import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;

public interface BizServiceExcepType extends CoreServiceExcepType{
	
	CoreServiceExcepType REC_ID_IS_NULL = new ExcepType("rec_id_is_null"); //推荐系统模块recId
	CoreServiceExcepType GC_ID_IS_NULL = new ExcepType("gc_id_is_null"); //商品分类id
}
