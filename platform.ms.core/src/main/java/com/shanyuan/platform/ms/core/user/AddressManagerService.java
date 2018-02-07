package com.shanyuan.platform.ms.core.user;


import java.util.List;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.user.bo.AddressBo;
import com.shanyuan.platform.ms.dao.user.entity.SyAddress;

/**
 * 地址管理 接口
 * @author zhangwd
 *
 */
public interface AddressManagerService {
	/**
	 * 
	 * 编辑和设置默认地址
	 * @param addressId
	 * @param memberId
	 * @param xianId
	 * @param shiId
	 * @param type
	 * @param areaInfo
	 * @param address
	 * @param telPhone
	 * @param trueName
	 * @param lastId
	 * @return
	 * @throws CoreServiceException
	 */
	AddressBo editAddress(Integer addressId, Integer memberId, Long xianId,Long shiId,String  type,
			String areaInfo,String address,String telPhone, String trueName, Long lastId,String isDefault) throws CoreServiceException;
	/**
	 * 删除和设置
	 * @param addressId
	 * @param memberId
	 * @param type
	 * @return
	 * @throws CoreServiceException
	 */
	Boolean delAddress(Integer addressId, Integer memberId,String  type) throws CoreServiceException ;
	/**
	 * 修改地址
	 * @param addressId  地址id
	 * @param memberId	会员id
	 * @param areaId	地区id
	 * @param cityId	市级id
	 * @param areaInfo	地区内容
	 * @param address	地址
	 * @param momPhone	手机电话 
	 * @param trueName	会员姓名 
	 * @param isDefault	默认收货地址      1为默认
	 * @param addressType	地址类型  0 为收货地址/家庭
	 * @param lastId	最后一级地区的ID 
	 * @return boolean
	 */
	SyAddress updatByPrimaryKeySlelctive(	Integer addressId, Integer memberId, Long areaId, Long cityId, String areaInfo, String address,
									String momPhone, String trueName, String isDefault, Byte addressType,Long lastId)throws CoreServiceException  ;
	/**
	 * 编辑地址
	 * @param addressId
	 * @param memberId
	 * @param areaId
	 * @param cityId
	 * @param areaInfo
	 * @param address
	 * @param momPhone
	 * @param trueName
	 * @param isDefault
	 * @param addressType
	 * @param lastId
	 * @return
	 * @throws CoreServiceException
	 */
	SyAddress updateAddress(	Integer addressId, Integer memberId, Long areaId, Long cityId, String areaInfo, String address,
			String momPhone, String trueName, String isDefault,String oldisDefault, Byte addressType,
			Long lastId,Integer addressId2)throws CoreServiceException  ;
	
	
	 boolean updateDefaultAddress( Integer addressId,Integer memberId,  Byte addressType) throws CoreServiceException ;
	/**
	 * 将其他的设置为非默认地址
	 * @param addressId
	 * @param memberId
	 * @param addressType
	 * @throws CoreServiceException
	 */
	 void  updateNotDefault( Integer memberId,  Byte addressType) throws CoreServiceException ;
	/**
	 * 
	 * 新增地址
	* @param addressId  地址id
	 * @param memberId	会员id
	 * @param areaId	地区id
	 * @param cityId	市级id
	 * @param areaInfo	地区内容
	 * @param address	地址
	 * @param momPhone	手机电话 
	 * @param trueName	会员姓名 
	 * @param isDefault	默认收货地址      1为默认
	 * @param addressType	地址类型  0 为收货地址/家庭
	 * @param lastId	最后一级地区的ID 
	 * @return  boolean
	 */
	SyAddress insertAddress( Integer memberId, Long areaId, Long cityId, String areaInfo, String address,
					 String telPhone, String trueName, String momPhone, String isDefault, Byte addressType, Long lastId)throws CoreServiceException  ;
	/**
	 * 判断修改其他为非默认，本条为默认
	 * @param memberId
	 * @param areaId
	 * @param cityId
	 * @param areaInfo
	 * @param address
	 * @param telPhone
	 * @param trueName
	 * @param momPhone
	 * @param isDefault
	 * @param addressType
	 * @param lastId
	 * @return
	 * @throws CoreServiceException
	 */
	SyAddress addAddress( Integer memberId, Long areaId, Long cityId, String areaInfo, String address,
			String telPhone, String trueName, String momPhone, String isDefault, Byte addressType, Long lastId)throws CoreServiceException  ;
	
	/**
	 * 删除地址
	 * @param addressId 地址id
	 */
	Boolean deleteAddress(Integer addressId,Integer memberId,Integer addressId2,String isDefault );
	
	/**
	 * 根据用户id查询地址
	 * @param memberId 用户id
	 */
	 List<AddressBo> getAddress(Integer  memberId,Byte addressType,String orderBy)throws CoreServiceException  ;
	 /**
	  * 不包含某一个地址的list
	  * @param memberId
	  * @param addressId
	  * @param addressType
	  * @param orderBy
	  * @return
	  * @throws CoreServiceException
	  */
	 List<AddressBo> getOtherAddress(Integer memberId,Integer addressId,Byte addressType,String orderBy) throws CoreServiceException;
	 /***
	  * 数据库的唯一值
	  * @param address
	  * @param memberId
	  * @param lastId
	  * @return
	  * @throws CoreServiceException
	  */
	 List<SyAddress> checkHasKey(String address,Integer memberId,Long lastId)throws CoreServiceException ;
	/**
	 * 通过地址id查询地址 
	 * @param addressId 地址id
	 * @return
	 */
	SyAddress getAddressByIdAndUserId(Integer addressId,Integer memberId,String isDefault,Byte addressType)throws CoreServiceException  ;
	/***
	 * 获得这个人的地址数
	 * @param memberId
	 * @param isDefault
	 * @param addressType
	 * @return
	 * @throws CoreServiceException
	 */
	Integer getCountByMid(Integer memberId,String isDefault,Byte addressType)throws CoreServiceException ;
}
