package com.shanyuan.platform.ms.facade.address;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.user.bo.AddressBo;

public interface AddressFacade {
	/**
	  * 获得地址信息
	  * @param memberId
	  * @return
	  * @throws CoreServiceException
	  */
	 List<AddressBo> getAddressList(Integer memberId)throws CoreServiceException ;
	 /**
	  * 增删改地址
	  * @param memberId
	  * @param addressId
	  * @param proviceInfo
	  * @param cityInfo
	  * @param areaInfos
	  * @param trueName
	  * @param address
	  * @param telPhone
	  * @param type 
	  * @return
	  * @throws CoreServiceException
	  */
	 Map<String,Object> editAddress(Integer memberId,Integer addressId ,Long areaId,String trueName,String address,String telPhone,String type,String isDefault)throws CoreServiceException;
	/**
	 * 删除或者设置默认值
	 * @param memberId
	 * @param addressId
	 * @param type
	 * @return
	 * @throws CoreServiceException
	 */
	 void delAddress(Integer memberId,Integer addressId ,String type)throws CoreServiceException;
	/***
	 * 获得单个的地址信息
	 * @param memberId
	 * @param addressId
	 * @return
	 * @throws CoreServiceException
	 */
	 Map<String,Object>  getAddressByIdAndUserId(Integer memberId,Integer addressId)throws CoreServiceException; 
}
