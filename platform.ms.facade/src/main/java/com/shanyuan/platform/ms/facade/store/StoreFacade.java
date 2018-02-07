/**
 * 
 */
package com.shanyuan.platform.ms.facade.store;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;

/**
 * @author 曹勇军
 *
 */
public interface StoreFacade {
	List<Map<String,Object>> storeHotSellGoodslist(Integer publisherId) throws CoreServiceException;

	Map<String, Object> storeGoodslist(Integer publisherId, Integer pageNo) throws CoreServiceException;
}
