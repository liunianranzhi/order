package com.shanyuan.platform.ms.core.goods;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.goods.entity.SySupportArea;

/**
 * 
 * @author yangjian
 * @date 2017/11/02
 *
 */
public interface SySupportAreaService {
	
	List<SySupportArea> getProvince(String channel) throws CoreServiceException;
	
	List<SySupportArea> getSupportAreaInfo(Map<String, Object> map) throws CoreServiceException;
	
	/**
	 * 获取所有帮扶县
	 * @return
	 * @throws CoreServiceException
	 */
	List<SySupportArea> getAllSupportArea() throws CoreServiceException;
	
	/**
	 * 根据县id 获取信息
	 * @param CountryId
	 * @return
	 */
	SySupportArea getSupportAreaByCountryId(Long CountryId);

}
