package com.shanyuan.platform.ms.portal.goods.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;
import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType.ExcepType;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.goods.impl.exceptype.GoodsExcepType;
import com.shanyuan.platform.ms.core.recommend.impl.exceptype.BizServiceExcepType;
import com.shanyuan.platform.ms.facade.ServiceExceptionResolver;
@Component
public class GoodsServiceExceptionResolver  implements ServiceExceptionResolver {

	@Override
	public Map<String, Object> parseException(CoreServiceException e) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 500);
		map.put("msg", "business error");
		if(e.getExcepType()!=null) {
			CoreServiceExcepType.ExcepType et =  (ExcepType) e.getExcepType();
			if(et.equals(BizServiceExcepType.REC_ID_IS_NULL)) {
				map.put("msg", "推荐系统模块rec_id为空");
				map.put("code", 510);
			}else if(et.equals(BizServiceExcepType.GC_ID_IS_NULL)) {
			    map.put("msg", "商品分类gc_id为空");
			    map.put("code", 510);
			}else if(et.equals(GoodsExcepType.EMPTY_EVALUATTE)) {
				map.put("msg", "商品评论列表为空");
				map.put("code", 301);
			}
		}
		return map;
	}

}
