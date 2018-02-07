package com.shanyuan.platform.ms.facade.address.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.common.util.ValidUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.order.impl.exceptype.OrderServiceExcepType;
import com.shanyuan.platform.ms.core.store.SyAreaFullService;
import com.shanyuan.platform.ms.core.user.AddressManagerService;
import com.shanyuan.platform.ms.core.user.bo.AddressBo;
import com.shanyuan.platform.ms.core.user.impl.exceptype.AddressExcepType;
import com.shanyuan.platform.ms.dao.store.entity.SyAreaFull;
import com.shanyuan.platform.ms.dao.user.entity.SyAddress;
import com.shanyuan.platform.ms.facade.address.AddressFacade;
/**
 * zhongying
 * 
 */
@Component
public class AddressFacadeImpl implements AddressFacade {
	static final Logger logger = LoggerFactory.getLogger(AddressFacadeImpl.class);
	@Autowired
	private AddressManagerService addressManagerService;
	@Autowired
	private SyAreaFullService syAreaFullService;
	
	/**
	 * huo
	 * @param addressId
	 * @return
	 * @throws CoreServiceException
	 */
	public List<AddressBo> getAddressList(Integer memberId)throws CoreServiceException {
		if(ObjectUtils.isEmpty(memberId)) {
			logger.info("address memberId 为空");
			throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"会员id为空！");
		}
		
		List<AddressBo> address = addressManagerService.getAddress(memberId, new Byte("0"), null);
		return address;
	}
	/**
	 * 删除地址
	 */
	public void delAddress(Integer memberId,Integer addressId ,String type)throws CoreServiceException {
		if(ObjectUtils.isEmpty(memberId)||ObjectUtils.isEmpty(addressId)||ObjectUtils.isEmpty(type)) {
			logger.info("memberId "+memberId+";addressId:"+memberId+";type:"+type+"为空");
			throw new CoreServiceException(AddressExcepType.missing_parameter,"相关参数为空！");
		}
		addressManagerService.delAddress(addressId, memberId, type);
	}
	/**
	 * 添加或编辑地址
	 */
	@Transactional(timeout=36000,rollbackFor=Throwable.class)
	public Map<String,Object> editAddress(Integer memberId,Integer addressId ,
			Long areaId,String trueName,String address,String telPhone,String type,String isDefault)throws CoreServiceException {
		if(ObjectUtils.isEmpty(memberId)||ObjectUtils.isEmpty(areaId)||ObjectUtils.isEmpty(trueName)||ObjectUtils.isEmpty(telPhone)||ObjectUtils.isEmpty(type)||ObjectUtils.isEmpty(address)) {
			throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"相关参数为空！");
		}
		address = address.trim();
		if(address.length()>200) {
			logger.info("address :"+address);
			throw new CoreServiceException(AddressExcepType.params_too_long,"地址太长，不能超过200个字哦~");
		}
		trueName = trueName.trim();
		if(trueName.length()>45) {
			logger.info("trueName :" + trueName);
			throw new CoreServiceException(AddressExcepType.params_too_long, "收货人姓名太长，不能超过50字哦~");
		}
		if(!ValidUtil.validPhone(telPhone)) {
			throw new CoreServiceException(AddressExcepType.telphone_error,"手机号格式不正确！");
		}
		Map<String,Object>  data= new HashMap<String,Object>();
		SyAreaFull xian= this.syAreaFullService.getSyAreaFullById(areaId);
		if(ObjectUtils.isEmpty(xian)) {
			logger.info("县id 错误 ！areaId ={} ", areaId);
			throw new CoreServiceException(AddressExcepType.areaid_error,"没有此县~");
		}
		Long shiId = xian.getAreaParentId();
		if(ObjectUtils.isEmpty(shiId)) {
			logger.info("县id 错误 ！areaId ={} ", areaId);
			throw new CoreServiceException(AddressExcepType.areaid_error,"没有此县~");
		}
		SyAreaFull shi = this.syAreaFullService.getSyAreaFullById(shiId);
		if(ObjectUtils.isEmpty(shi)) {
			logger.info("县id 错误 ！areaId ={} ", areaId);
			throw new CoreServiceException(AddressExcepType.areaid_error,"没有此县~");
		}
		Long shengId = shi.getAreaParentId();
		SyAreaFull sheng = this.syAreaFullService.getSyAreaFullById(shi.getAreaParentId());
		if(ObjectUtils.isEmpty(sheng)) {
			logger.info("县id 错误 ！areaId ={} ", areaId);
			throw new CoreServiceException(AddressExcepType.areaid_error,"没有此县~");
		}
		String shengName = sheng.getAreaName();
		String shiName = shi.getAreaName();
		String xianName = xian.getAreaName();
		String areaInfo= shengName +" "+shiName +" "+xianName;
		Long lastId=areaId;
		AddressBo editAddress=null;
		try {
			 editAddress = addressManagerService.editAddress(addressId, memberId, areaId, shiId, type, areaInfo, address, telPhone, trueName, lastId,isDefault);
		} catch (CoreServiceException e) {
			logger.error(e.getMessage(),e);
			throw new CoreServiceException(AddressExcepType.update_address_fail,"编辑收货地址失败!",e);
		}

	    
	    if(!ObjectUtils.isEmpty(editAddress)) {
	    	editAddress.setProvinceId(shengId);
		}
	    data.put("addressInfo", editAddress);
		return data;
	}
	
	public Map<String,Object>  getAddressByIdAndUserId(Integer memberId,Integer addressId)throws CoreServiceException {
		if(ObjectUtils.isEmpty(memberId)) {
			logger.info("memberId为空！memberId={} ", memberId,addressId);
			throw new CoreServiceException(OrderServiceExcepType.MISSING_PARAMETER,"相关参数为空！");
		}
		String isDefault=null;
		Byte addressType=null;
		if(ObjectUtils.isEmpty(addressId)){
			//获取默认地址收货地址
			isDefault="1";
			addressType =new Byte("0");
		}
		Map<String,Object>  data= new HashMap<String,Object>();
		SyAddress arddress = addressManagerService.getAddressByIdAndUserId(addressId, memberId, isDefault, addressType);
		
		AddressBo bo=new AddressBo();
		if(arddress !=null) {
			Long cityId = arddress.getCityId();
			SyAreaFull sparea = syAreaFullService.getSyAreaFullById(cityId);
			Long areaParentId = sparea.getAreaParentId();
			BeanUtils.copyProperties(arddress, bo);
			bo.setProvinceId(areaParentId);
			data.put("addressInfo", bo);
		}else {
			logger.info("ADDRESS_EMPTY 为空！ ");
			throw new CoreServiceException(OrderServiceExcepType.ADDRESS_EMPTY,"地址为空！");
		}
		
	  return  data;
	}

}
