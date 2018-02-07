package com.shanyuan.platform.ms.core.syshop;

import java.util.List;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.syshop.entity.SyCompanyInfo;
import com.shanyuan.platform.ms.dao.syshop.entity.SyshopArea;
import com.shanyuan.platform.ms.dao.user.entity.SyShopAccount;

/**
 * 
 * @author yangjian
 * @date 2017/11/02
 *
 */
public interface SyShopService {
	
	/**
	 * 获取善源商场首页一起善源场馆列表
	 * @return
	 * @throws CoreServiceException
	 */
	List<SyshopArea> getShopAreaList() throws CoreServiceException;
	
	/**
	 * 获取善源商场首页一起善源商家列表
	 * @return
	 * @throws CoreServiceException
	 */
	List<SyShopAccount> getShopAccountList() throws CoreServiceException;
	
	List<SyCompanyInfo> getSyCompanyInfo() throws CoreServiceException;
	
	

}
