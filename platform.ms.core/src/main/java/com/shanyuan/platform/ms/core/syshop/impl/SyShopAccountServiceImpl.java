package com.shanyuan.platform.ms.core.syshop.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.SyShopConstant;
import com.shanyuan.platform.ms.core.syshop.SyShopAccountService;
import com.shanyuan.platform.ms.dao.user.entity.SyShopAccount;
import com.shanyuan.platform.ms.dao.user.entity.SyShopAccountExample;
import com.shanyuan.platform.ms.dao.user.mapper.SyShopAccountMapper;

/**
 * 
 * @author yangjian
 * @date 2017/12/08
 *
 */
@Component
public class SyShopAccountServiceImpl implements SyShopAccountService {

	@Autowired
	private SyShopAccountMapper syShopAccountMapper;
	
	@Override
	public List<SyShopAccount> getShopAccountList() {
		SyShopAccountExample syShopAccountExample = new SyShopAccountExample();
		syShopAccountExample.createCriteria().andStatusEqualTo(SyShopConstant.ShopVerifyState.SYSHOP_COMPANY_STATUS_VERIFID);
		syShopAccountExample.setOrderByClause("rec_id desc");
		List<SyShopAccount> syShopAccounts = this.syShopAccountMapper.selectByExample(syShopAccountExample);
		return syShopAccounts;
	}
	/**
	 * 
	 * @param mids
	 * @return
	 * @throws CoreServiceException
	 */
	public Map<Integer,SyShopAccount> getSyshopInfo(List<Integer> mids) throws CoreServiceException{
		Map<Integer,SyShopAccount> map=new HashMap<Integer,SyShopAccount>();
		if(ObjectUtils.isEmpty(mids)) {
			return map;
		}
		SyShopAccountExample syShopAccountExample = new SyShopAccountExample();
		syShopAccountExample.createCriteria().andMemberIdIn(mids);
		List<SyShopAccount> syShopAccounts = this.syShopAccountMapper.selectByExample(syShopAccountExample);
		if(!ObjectUtils.isEmpty(syShopAccounts)) {
			Iterator<SyShopAccount> iterator = syShopAccounts.iterator();
			while(iterator.hasNext()) {
				SyShopAccount next = iterator.next();
				Integer memberId = next.getMemberId();
				map.put(memberId, next);
			}
		}
		return map;
	}
}
