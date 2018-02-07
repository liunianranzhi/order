package com.shanyuan.platform.ms.core.syshop;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.user.entity.SyShopAccount;

/**
 * 
 * @author yangjian
 * @Date 2017/12/08
 *
 */
public interface SyShopAccountService {

	/**
	 * @author yangjian
	 * 获取商场列表
	 * @return
	 */
	public List<SyShopAccount> getShopAccountList();
	/**
	 * @author zhongying
	 * @param mids
	 * @return
	 * @throws CoreServiceException
	 */
	Map<Integer,SyShopAccount> getSyshopInfo(List<Integer> mids) throws CoreServiceException;
	
}
