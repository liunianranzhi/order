package com.shanyuan.platform.ms.core.syshop.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.SyShopConstant;
import com.shanyuan.platform.ms.core.syshop.SyShopService;
import com.shanyuan.platform.ms.dao.syshop.entity.SyCompanyInfo;
import com.shanyuan.platform.ms.dao.syshop.entity.SyshopArea;
import com.shanyuan.platform.ms.dao.syshop.entity.SyshopAreaExample;
import com.shanyuan.platform.ms.dao.syshop.mapper.SyshopAreaMapper;
import com.shanyuan.platform.ms.dao.user.entity.SyShopAccount;
import com.shanyuan.platform.ms.dao.user.entity.SyShopAccountExample;
import com.shanyuan.platform.ms.dao.user.mapper.SyShopAccountMapper;

@Component
public class SyShopServiceImpl implements SyShopService {

	@Autowired
	private SyshopAreaMapper syShopAreaMapper;
	
	@Autowired
	private SyShopAccountMapper syShopAccountMapper;
	
	@Override
	public List<SyshopArea> getShopAreaList() {
		SyshopAreaExample SyshopAreaExample = new SyshopAreaExample();
		SyshopAreaExample.createCriteria().andAreaStateEqualTo((byte) 1).andAreaSortGreaterThan(0);
		SyshopAreaExample.setOrderByClause("area_sort, area_id asc");
		List<SyshopArea> syshopAreas = this.syShopAreaMapper.selectByExample(SyshopAreaExample);
		if(!CollectionUtils.isEmpty(syshopAreas)){
			return syshopAreas;
		}
		return null;
	}

	@Override
	public List<SyShopAccount> getShopAccountList() throws CoreServiceException {
		SyShopAccountExample syShopAccountExample = new SyShopAccountExample();
		syShopAccountExample.createCriteria().andStatusEqualTo(SyShopConstant.ShopVerifyState.SYSHOP_COMPANY_STATUS_VERIFID);
		syShopAccountExample.setOrderByClause("rec_id desc");
		List<SyShopAccount> syShopAccounts = this.syShopAccountMapper.selectByExample(syShopAccountExample);
		if(!CollectionUtils.isEmpty(syShopAccounts)){
			return syShopAccounts;
		}
		return null;
	}
	
	public List<SyShopAccount> getShop(List<Integer> publisherids) throws CoreServiceException {
		if(ObjectUtils.isEmpty(publisherids)) {
			
		}
		SyShopAccountExample syShopAccountExample = new SyShopAccountExample();
		syShopAccountExample.createCriteria().andMemberIdIn(publisherids);
		List<SyShopAccount> syShopAccounts = this.syShopAccountMapper.selectByExample(syShopAccountExample);
		if(!CollectionUtils.isEmpty(syShopAccounts)){
			return syShopAccounts;
		}
		return null;
	}

	@Override
	public List<SyCompanyInfo> getSyCompanyInfo() throws CoreServiceException {
		List<SyCompanyInfo> resultList = this.syShopAreaMapper.selectSyCompanyInfo();
		if(!CollectionUtils.isEmpty(resultList)){
			return resultList;
		}
		return null;
	}

}
