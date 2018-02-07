package com.shanyuan.platform.ms.core.user.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.user.AddressManagerService;
import com.shanyuan.platform.ms.core.user.bo.AddressBo;
import com.shanyuan.platform.ms.core.user.impl.exceptype.AddressExcepType;
import com.shanyuan.platform.ms.dao.user.entity.SyAddress;
import com.shanyuan.platform.ms.dao.user.entity.SyAddressExample;
import com.shanyuan.platform.ms.dao.user.mapper.SyAddressMapper;
/**
 * 地址管理相关接口实现
 * @author zhangwd
 *
 */
@Component
public class AddressManagerServiceImpl  implements AddressManagerService {

	private static final Logger logger = LoggerFactory.getLogger(AddressManagerServiceImpl.class);
	
	@Autowired
	private SyAddressMapper syAddressMapper;
	
	public AddressBo editAddress(Integer addressId, Integer memberId, Long xianId,Long shiId,String  type,
			String areaInfo,String address,String telPhone, String trueName, Long lastId,String isDefault) throws CoreServiceException  {
		AddressBo bo=new AddressBo();
		SyAddress syaddress =new SyAddress();
		if(ObjectUtils.isEmpty(type)||(!"add".equals(type.trim())&&!"edit".equals(type.trim()))) {
			logger.info("type不正确！");
			throw new CoreServiceException(AddressExcepType.missing_parameter,"type不正确！");
		}
		if(!"add".equals(type)&&ObjectUtils.isEmpty(addressId)) {
			logger.info("addressId为空！");
			throw new CoreServiceException(AddressExcepType.missing_parameter,"addressId为空！");
		}
		if("edit".equals(type)) {
			SyAddress adds = this.getAddressByIdAndUserId(addressId, memberId, null, null);
			if(ObjectUtils.isEmpty(adds)) {
				logger.info("该地址错误，失败 ！addressId " + addressId +"memberId ="+memberId);
				throw new CoreServiceException(AddressExcepType.addressId_error,"该地址错误，编辑失败！");
			}
			List<SyAddress>  checkHasKey = this.checkHasKey(address, memberId, lastId);
			if(!ObjectUtils.isEmpty(checkHasKey)) {
				SyAddress syAddress2 = checkHasKey.get(0);
				Integer addressId2 = syAddress2.getAddressId();
				if(!addressId2.equals(addressId)) {
					logger.info("address_existed！ memberId:"+memberId+"areaInfo"+areaInfo);
					throw new CoreServiceException(AddressExcepType.address_existed,"已存在相同的收货地址！");
				}
			}
			String isDefault2 = adds.getIsDefault();
			List<AddressBo> otherAddress = this.getOtherAddress(memberId, addressId, new Byte("0"), null);
			isDefault = ObjectUtils.isEmpty(otherAddress)?"1":isDefault;
			Integer addressId2 =0;
			if("1".equals(isDefault2)&&"0".equals(isDefault)) {
				if(!ObjectUtils.isEmpty(otherAddress)) {
					//修改一条变为默认
					AddressBo addressBo = otherAddress.get(0);
					addressId2 = addressBo.getAddressId();
				}
				
			}
			syaddress = this.updateAddress(addressId, memberId, xianId, shiId, 
					areaInfo, address, trueName,telPhone , isDefault,isDefault2, new Byte("0"), lastId,addressId2);
			
			if(ObjectUtils.isEmpty(syaddress)) {
				logger.error("update_address_fail:addressId = "+addressId);
				throw new CoreServiceException(AddressExcepType.update_address_fail,"更新失败");
			}
			BeanUtils.copyProperties(syaddress, bo);
		}else if("add".equals(type)) {
			List<SyAddress>  checkHasKey = this.checkHasKey(address, memberId, lastId);
			 if(!ObjectUtils.isEmpty(checkHasKey)) {
					logger.info("address_existed！ memberId:"+memberId+"areaInfo"+areaInfo);
					throw new CoreServiceException(AddressExcepType.address_existed,"该会员的收货地址已存在！");
				}
			 
			Integer count = this.getCountByMid(memberId,null, new Byte("0"));
			isDefault =(count >0)?(ObjectUtils.isEmpty(isDefault)?"0":isDefault):"1";
			syaddress = this.addAddress(memberId, xianId, shiId, areaInfo, address, telPhone, trueName, 
					telPhone, isDefault, new Byte("0"), lastId);
			if(ObjectUtils.isEmpty(syaddress)) {
				logger.error("insert_address_fail:memberId = "+memberId+"address = "+address);
				throw new CoreServiceException(AddressExcepType.insert_address_fail,"增加失败");
			}
			BeanUtils.copyProperties(syaddress, bo);
		}
		return bo;
	}
	public Boolean delAddress(Integer addressId, Integer memberId,String  type) throws CoreServiceException {
		boolean result=true;
		if(ObjectUtils.isEmpty(type)||(!"del".equals(type))) {
			logger.info("type不正确！");
			throw new CoreServiceException(AddressExcepType.missing_parameter,"type不正确！");
		}
		if("del".equals(type)) {
			SyAddress adds = this.getAddressByIdAndUserId(addressId, memberId, null, null);
			if(ObjectUtils.isEmpty(adds)) {
				logger.info("该地址错误，失败 ！addressId " + addressId +"memberId ="+memberId);
				throw new CoreServiceException(AddressExcepType.addressId_error,"该地址错误，删除失败！");
			}
			String isdefault = adds.getIsDefault();
			Integer addressId2=0;
			if("1".equals(isdefault)) {
				//查出一条
				List<AddressBo> addresslist = this.getOtherAddress(memberId, addressId, new Byte("0"), null);
				if(!ObjectUtils.isEmpty(addresslist)) {
					//修改一条变为默认
					AddressBo addressBo = addresslist.get(0);
					addressId2 = addressBo.getAddressId();
				}
				
			}
			result = this.deleteAddress(addressId,memberId,addressId2,isdefault);
		}
		if(!result) {
			throw new CoreServiceException(AddressExcepType.del_address_fail,"删除失败！");
		}
		return result;
	}
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	public boolean updateDefaultAddress( Integer addressId,Integer memberId,  Byte addressType) throws CoreServiceException   {
			int i=0;
		SyAddress newRecord= new SyAddress();
			try {
				newRecord.setIsDefault("1");
				newRecord.setAddressId(addressId);
				//将这条置为默认
				i=syAddressMapper.updateByPrimaryKeySelective(newRecord);
				
			} catch (Exception e) {
			logger.error("set_defult_address:memberId = "+memberId,e);
			throw new CoreServiceException(AddressExcepType.set_default_fail,e.getMessage(),e);
		    }
			return i>0?true:false;
}
	/**
	 * 将其他的置为非默认
	 * @param addressId
	 * @param memberId
	 * @param addressType
	 */
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	public void updateNotDefault(Integer memberId,  Byte addressType) throws CoreServiceException {
		try {
		SyAddress record= new SyAddress();
		record.setIsDefault("0");
		SyAddressExample example= new SyAddressExample();
		example.createCriteria().andMemberIdEqualTo(memberId).andIsDefaultEqualTo("1").andAddressTypeEqualTo(addressType);
		syAddressMapper.updateByExampleSelective(record, example);
		} catch (Exception e) {
			logger.error("set_not_defult_address:memberId = "+memberId,e);
			throw new CoreServiceException(AddressExcepType.set_not_default_fail,e.getMessage(),e);
		}
	}
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	public SyAddress updateAddress(Integer addressId, Integer memberId, Long areaId, Long cityId, String areaInfo,
			String address, String trueName, String momPhone, String isDefault,String oldisDefault, Byte addressType
			, Long lastId,Integer addressId2) throws CoreServiceException   {
		isDefault = ObjectUtils.isEmpty(isDefault)?"0":isDefault;
		SyAddress SyAddress=null;
		try{
	//如果现在的是默认，以前的是非默认，将其他置为非默认
				if("1".equals(isDefault)&&"0".equals(oldisDefault)) {
					this.updateNotDefault(memberId,addressType);
				}

		 SyAddress = this.updatByPrimaryKeySlelctive(addressId, memberId, areaId, cityId, areaInfo, address, trueName, momPhone, isDefault, addressType, lastId);

		 if("1".equals(oldisDefault)&&"0".equals(isDefault)&&0!=addressId2) {
			 this.updateDefaultAddress(addressId2, memberId, new Byte("0"));
		 }

		 return SyAddress;
		} catch (CoreServiceException e) {
			logger.error(e.getMessage(),e);
			throw new CoreServiceException(AddressExcepType.update_address_fail,e.getMessage(),e);
		}

	}
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	@Override
	public SyAddress updatByPrimaryKeySlelctive(Integer addressId, Integer memberId, Long areaId, Long cityId, String areaInfo,
										String address, String trueName, String momPhone, String isDefault, Byte addressType, Long lastId) throws CoreServiceException   {
	SyAddress syAddress = new SyAddress();
		try {
			
			syAddress.setAreaId(areaId);
			syAddress.setCityId(cityId);
			syAddress.setAreaInfo(areaInfo);
			syAddress.setAddress(address);
			syAddress.setTrueName(trueName);
			syAddress.setMobPhone(momPhone);
			syAddress.setTelPhone(momPhone);
			syAddress.setIsDefault(isDefault);
			syAddress.setAddressType(addressType);
			syAddress.setLastId(lastId);
			syAddress.setAddressId(addressId);
			syAddress.setMemberId(memberId);
			 syAddressMapper.updateByPrimaryKeySelective(syAddress);
		} catch (Exception e) {
			logger.error("update_address_fail:addressId = "+addressId,e);
			throw new CoreServiceException(AddressExcepType.update_address_fail,e.getMessage(),e);
		}
		
		return syAddress;
	}
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	@Override
	public SyAddress addAddress( Integer memberId, Long areaId, Long cityId, String areaInfo, String address,
			String telPhone, String trueName, String momPhone, String isDefault, Byte addressType, Long lastId)throws CoreServiceException {
		if("1".equals(isDefault)) {
			this.updateNotDefault( memberId, addressType);
		}
		SyAddress sy = this.insertAddress(memberId, areaId, cityId, areaInfo, address, telPhone, trueName, momPhone, isDefault, addressType, lastId);
		return sy;
	}
	
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	@Override
	public SyAddress insertAddress( Integer memberId, Long areaId, Long cityId, String areaInfo, String address,
								String telPhone, String trueName, String momPhone, String isDefault, Byte addressType, Long lastId)throws CoreServiceException   {
		SyAddress syAddress = new SyAddress();
		try {
			
			syAddress.setMemberId(memberId);
			syAddress.setAreaId(areaId);
			syAddress.setCityId(cityId);
			syAddress.setAreaInfo(areaInfo);
			syAddress.setAddress(address);
			syAddress.setTelPhone(telPhone);
			syAddress.setTrueName(trueName);
			syAddress.setMobPhone(momPhone);
			syAddress.setIsDefault(isDefault);
			syAddress.setAddressType(addressType);
			syAddress.setLastId(lastId);
			syAddressMapper.insertSelective(syAddress);
		} catch (Exception e) {
			logger.error("insert_address_fail:memberId "+memberId,e);
			throw new CoreServiceException(AddressExcepType.insert_address_fail,e.getMessage(),e);
		}
		return syAddress;
	}
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	@Override
	public Boolean deleteAddress(Integer addressId,Integer memberId,Integer addressId2,String isDefault) throws CoreServiceException {
		int i=0;
		try {	
			i = syAddressMapper.deleteByPrimaryKey(addressId);
			//如果删除的这条是默认地址,并且有其他的地址,设置一条默认的
			if("1".equals(isDefault)&&0!=addressId2) {
				this.updateDefaultAddress(addressId2, memberId, new Byte("0"));
			}
			 
		} catch (Exception e) {
			logger.error("del_address_fail :  addressId ="+addressId,e);
			throw new CoreServiceException(AddressExcepType.del_address_fail,e.getMessage(),e);
		}
		return  i > 0 ? true : false;
	}
	
	@Override
	public List<AddressBo> getAddress(Integer memberId,Byte addressType,String orderBy) {
		addressType =  ObjectUtils.isEmpty(addressType)?new Byte("0"):addressType;
		orderBy =  ObjectUtils.isEmpty(orderBy)?"is_default DESC,address_id DESC":orderBy;
		SyAddressExample addressExample = new SyAddressExample();
		addressExample.createCriteria().andMemberIdEqualTo(memberId)
		.andAddressTypeEqualTo(addressType);
		addressExample.setOrderByClause(orderBy);
		List<SyAddress> addressList = syAddressMapper.selectByExample(addressExample);
		List<AddressBo> list = new ArrayList<AddressBo>();
		if(CollectionUtils.isEmpty(addressList)) {
			return list;
		}else {
			for(SyAddress so:addressList) {
				AddressBo bo=new AddressBo();
				BeanUtils.copyProperties(so, bo);
				list.add(bo);
			}
		}
		return  list;
	
	}
	/**
	 * 
	 */
	public List<AddressBo> getOtherAddress(Integer memberId,Integer addressId,Byte addressType,String orderBy) {
		addressType =  ObjectUtils.isEmpty(addressType)?new Byte("0"):addressType;
		orderBy =  ObjectUtils.isEmpty(orderBy)?"is_default DESC,address_id DESC":orderBy;
		SyAddressExample addressExample = new SyAddressExample();
		addressExample.createCriteria().andMemberIdEqualTo(memberId).andAddressIdNotEqualTo(addressId)
		.andAddressTypeEqualTo(addressType);
		addressExample.setOrderByClause(orderBy);
		List<SyAddress> addressList = syAddressMapper.selectByExample(addressExample);
		List<AddressBo> list = new ArrayList<AddressBo>();
		if(CollectionUtils.isEmpty(addressList)) {
			return list;
		}else {
			for(SyAddress so:addressList) {
				AddressBo bo=new AddressBo();
				BeanUtils.copyProperties(so, bo);
				list.add(bo);
			}
		}
		return  list;
	
	}
	@Override
	public List<SyAddress> checkHasKey(String address,Integer memberId,Long lastId)throws CoreServiceException  {
		SyAddressExample addressExample = new SyAddressExample();
		addressExample.createCriteria().andMemberIdEqualTo(memberId).andAddressEqualTo(address).andLastIdEqualTo(lastId);
		List<SyAddress> list=syAddressMapper.selectByExample(addressExample);
		return list;
	}
	
	/**
	 * @author caoyongjun
	 * 
	 */
	
	@Override
	public SyAddress getAddressByIdAndUserId(Integer addressId,Integer memberId,String isDefault,Byte addressType) {
		
		SyAddressExample addressExample = new SyAddressExample();
		if(!ObjectUtils.isEmpty(isDefault)&&!ObjectUtils.isEmpty(addressType)) {
			addressExample.createCriteria().andMemberIdEqualTo(memberId).andIsDefaultEqualTo(isDefault).andAddressTypeEqualTo(addressType);
		}else {
			addressExample.createCriteria().andMemberIdEqualTo(memberId).andAddressIdEqualTo(addressId);
		}
		
		List<SyAddress> list=syAddressMapper.selectByExample(addressExample);
		if(!ObjectUtils.isEmpty(list)){
			return list.get(0);
		}else{
			return null;
		}
		
	}
	/**
	 * 
	 * @param memberId
	 * @param isDefault
	 * @param addressType
	 * @return
	 * @throws CoreServiceException
	 */
public Integer getCountByMid(Integer memberId,String isDefault,Byte addressType)throws CoreServiceException {
		
		SyAddressExample addressExample = new SyAddressExample();
		if(!ObjectUtils.isEmpty(isDefault)&&!ObjectUtils.isEmpty(addressType)) {
			addressExample.createCriteria().andMemberIdEqualTo(memberId).andIsDefaultEqualTo(isDefault).andAddressTypeEqualTo(addressType);
		}else {
			addressExample.createCriteria().andMemberIdEqualTo(memberId).andAddressTypeEqualTo(addressType);
		}
		
		int num = syAddressMapper.countByExample(addressExample);
		return num;
	}
}
