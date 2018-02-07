package com.shanyuan.platform.ms.facade.syshop.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.common.util.ImageUtil;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.constant.ImageModuleConstant;
import com.shanyuan.platform.ms.core.goods.SyGoodsCommonService;
import com.shanyuan.platform.ms.core.syshop.SyShopAccountService;
import com.shanyuan.platform.ms.core.syshop.SyShopAreaService;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommonCountInfo;
import com.shanyuan.platform.ms.dao.syshop.entity.SyCompanyInfo;
import com.shanyuan.platform.ms.dao.syshop.entity.SyshopArea;
import com.shanyuan.platform.ms.dao.user.entity.SyShopAccount;
import com.shanyuan.platform.ms.facade.syshop.SyShopFacade;
import com.shanyuan.platform.ms.facade.syshop.domain.SyShopDomain;

/**
 * 
 * @author yangjian
 * @date 2017/11/02
 *
 */
@Component
public class SyShopFacadeImpl implements SyShopFacade {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private SyGoodsCommonService syGoodsCommonService;
	
	@Autowired
	private SyShopAreaService syShopAreaService;
	
	@Autowired
	private SyShopAccountService syShopAccountService;
	
	@Autowired
	private ConstantReload constantReload;

	/**
	 * 善源商场一起善源列表
	 * @param cols 显示条数
	 * @param rows 展区个数
	 * @return
	 */
//	@Override
//	public Map<String, Object> getAreaInfo(Integer cols, Integer rows) {
//		//如果为填参数，则设置默认值
//		if(ObjectUtils.isEmpty(cols)){
//			cols = 3;
//		}
//		if(ObjectUtils.isEmpty(rows)){
//			rows = 5;
//		}
//		//获取有效展馆列表
//		List<SyCompanyInfo> syCompanyInfos = this.syShopService.getSyCompanyInfo();
//		
//		//定义分馆id列表
//		List<Integer> areaList = new ArrayList<Integer>();
//		
//
//		Map<Integer, Integer> memberArea = new HashMap<Integer, Integer>();
//		
//		//为展馆信息设置值
//		for (SyCompanyInfo syCompanyInfo : syCompanyInfos) {
//			syCompanyInfo.setCompanyLogoUrl(ImageUtil.getUserHeadImgUrl(syCompanyInfo.getCompanyLogo(), (byte) 1, "240"));
//			syCompanyInfo.setGoodsUrl("/bocm/index.php?act=goods&op=syshop_store&member_id=" + syCompanyInfo.getMemberId());
//			syCompanyInfo.setGoodsStoreUrl("/bocm/index.php?act=goods&op=syshop_store&member_id=" + syCompanyInfo.getMemberId());
//			if(!areaList.contains(syCompanyInfo.getAreaId())){
//				areaList.add(syCompanyInfo.getAreaId());
//			}
//			memberArea.put(syCompanyInfo.getMemberId(), syCompanyInfo.getAreaId());
//		}
//		
//		//获取已审核商家列表
//		List<SyShopAccount> shopAccountList = this.syShopService.getShopAccountList();
//		Map<Integer, Integer> syShopMemberArea = new HashMap<Integer, Integer>();
//		for (SyShopAccount syShopAccount : shopAccountList) {
//			syShopMemberArea.put(syShopAccount.getMemberId(), syShopAccount.getAreaId());
//		}
//
//		Set<Integer> members = new HashSet<Integer>(memberArea.keySet());
//		
//		Set<Integer> members2 = new HashSet<Integer>(syShopMemberArea.keySet());
//		
//		members.retainAll(members2);
//		
//		List<Integer> memberList = new ArrayList<Integer>(members);
//		
////		List<Integer> newMemberList = new ArrayList<Integer>();
////
////		//获取有效会员店铺信息
////		List<SyGoodsCommonCountInfo> goodsCountList = this.syGoodsCommonService.getGoodsCountList(memberList);
////		for (SyGoodsCommonCountInfo syGoodsCommonCountInfo : goodsCountList) {
////			if(memberList.contains(syGoodsCommonCountInfo.getPublisherId())){
////				newMemberList.add(syGoodsCommonCountInfo.getPublisherId());
////			}
////		}
//		
//		//设置有效区域
//		for (Integer memberId : memberList) {
//			if(!ObjectUtils.isEmpty(memberArea.get(memberId)) && !areaList.contains(memberArea.get(memberId))){
//				areaList.remove(memberArea.get(memberId));
//			}
//		}
//		Map<String, List<SyCompanyInfo>> areaMap = new HashMap<String, List<SyCompanyInfo>>();
//		for (Integer areaId : areaList) {
//			List<SyCompanyInfo> eList = new ArrayList<SyCompanyInfo>();
//			for (SyCompanyInfo syCompanyInfo : syCompanyInfos) {
//				if(syCompanyInfo.getAreaId() == areaId){
//					eList.add(syCompanyInfo);
//				}
//			}
//			if(CollectionUtils.isEmpty(eList)){
//				logger.info("该馆区没有商品, areaId:{}", areaId);
//				continue;
//			}
//			
//			areaMap.put(areaId.toString(), eList);
//		}
//		List<SyShopDomain> resultList = new ArrayList<SyShopDomain>();
//		for (Integer areaId : areaList) {
//			for (SyCompanyInfo syCompanyInfo : syCompanyInfos) {
//				SyShopDomain syShopDomain = new SyShopDomain();
//				if(areaId == syCompanyInfo.getAreaId()){
//					BeanUtils.copyProperties(syCompanyInfo, syShopDomain);
//					if(areaMap.get(syCompanyInfo.getAreaId().toString()).size() >= cols){
//						syShopDomain.seteList(areaMap.get(syCompanyInfo.getAreaId().toString()).subList(0, cols));
//					}else{
//						syShopDomain.seteList(areaMap.get(syCompanyInfo.getAreaId().toString()));
//					}
//					syShopDomain.seteNum(areaMap.get(syCompanyInfo.getAreaId().toString()).size());
//					syShopDomain.setAreaImgUrl(syCompanyInfo.getAreaLogo());
//					syShopDomain.setAreaListMoreUrl("/bocm/index.php?act=syshop&op=sycompany");
//					resultList.add(syShopDomain);
//					break;
//				}
//			}
//		}
//		Map<String, Object> resultMap = new HashMap<String, Object>();
//		resultMap.put("title", "一起善源");
//		resultMap.put("desc", "分行推荐入驻善品，联合善企回馈爱心");
//		resultMap.put("areaList", resultList.size() >= rows ? resultList.subList(0, rows) : resultList);
//		resultMap.put("areaListMoreUrl", "/bocm/index.php?act=syshop&op=sycompany");
//		return resultMap;
//	}

	@Override
	public Map<String, Object> getAreaInfo(Integer cols, Integer rows) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("title", "一起善源");
		resultMap.put("desc", "分行推荐入驻善品，联合善企回馈爱心");
		resultMap.put("areaListMoreUrl", "/bocm/index.php?act=syshop&op=sycompany");
		if(ObjectUtils.isEmpty(cols)){
			cols = 3;
		}
		if(ObjectUtils.isEmpty(rows)){
			rows = 5;
		}
		List<SyshopArea> areaList = this.syShopAreaService.getShopAreaList();
		if(CollectionUtils.isEmpty(areaList)){
			logger.info("展区没有合适的企业");
			return resultMap;
		}
		Set<Integer> areaIds = new HashSet<Integer>();
		for (SyshopArea syshopArea : areaList) {
			areaIds.add(syshopArea.getAreaId());
		}
		List<SyShopAccount> syShopList = this.syShopAccountService.getShopAccountList();
		if(CollectionUtils.isEmpty(syShopList)){
			logger.info("展区没有合适的商家");
			return resultMap;
		}
		
		Map<Integer, Integer> syShopMemberIdAreaId = new HashMap<Integer, Integer>(); 
		
		Set<Integer> syShopAreaIds = new HashSet<Integer>();
		for (SyShopAccount syShopAccount : syShopList) {
			syShopAreaIds.add(syShopAccount.getAreaId());
			syShopMemberIdAreaId.put(syShopAccount.getMemberId(), syShopAccount.getAreaId());
		}
		
		syShopAreaIds.retainAll(areaIds);
		
		if(CollectionUtils.isEmpty(syShopAreaIds)){
			logger.info("馆区没有企业入驻");
			return resultMap;
		}
		Set<Integer> keySet = syShopMemberIdAreaId.keySet();
		
		Map<Integer, Set<Integer>> areaListShop = new HashMap<Integer, Set<Integer>>();
		
		Set<Integer> memberList = new HashSet<Integer>();
		for (Integer areaId : syShopAreaIds) {
			Set<Integer> theAreaShop = new HashSet<Integer>();
			for (Integer key : keySet) {
				if(syShopMemberIdAreaId.get(key).equals(areaId)){
					theAreaShop.add(key);
				}
			}
			areaListShop.put(areaId, theAreaShop);
			memberList.addAll(theAreaShop);
		}
		List<SyGoodsCommonCountInfo> goodsCountList = this.syGoodsCommonService.getGoodsCountList(new ArrayList<Integer>(memberList));
		Set<Integer> publisherIds = new HashSet<Integer>();
		for (SyGoodsCommonCountInfo syGoodsCommonCountInfo : goodsCountList) {
			publisherIds.add(syGoodsCommonCountInfo.getPublisherId());
		}
		
		Map<Integer, SyCompanyInfo> syShopListNew = new HashMap<Integer, SyCompanyInfo>();
		for (SyShopAccount syShopAccount : syShopList) {
			SyCompanyInfo syCompanyInfo = new SyCompanyInfo();
			BeanUtils.copyProperties(syShopAccount, syCompanyInfo);
			syShopListNew.put(syCompanyInfo.getMemberId(), syCompanyInfo);
		}
		List<SyShopDomain> resultList = new ArrayList<SyShopDomain>();
		Set<Integer> areaListShopKeys = areaListShop.keySet();
		for (SyshopArea syshopArea : areaList) {
			for (Integer key : areaListShopKeys) {
				if(syshopArea.getAreaId().equals(key)){
					Set<Integer> memberLists = areaListShop.get(key);
					Set<Integer> eList = memberLists.retainAll(publisherIds) ? memberLists : memberLists;
					SyShopDomain syShopDomain = new SyShopDomain();
					BeanUtils.copyProperties(syshopArea, syShopDomain);
					syShopDomain.setAreaImgUrl(ImageUtil.getImageFullUrlForOss(this.constantReload.getCdnHost(), ImageModuleConstant.OSS_DIRK_SYSHOP_AREA_LOGO, syshopArea.getAreaLogo()));
					List<SyCompanyInfo> coms = new ArrayList<SyCompanyInfo>();
					if(CollectionUtils.isEmpty(eList)){
						continue;
					}
					for (Integer members : eList) {
						coms.add(syShopListNew.get(members));
					}
					for (SyCompanyInfo syCompanyInfo : coms) {
						syCompanyInfo.setCompanyLogoUrl(ImageUtil.getUserHeadImgUrl(syCompanyInfo.getCompanyLogo(), (byte) 1, "240"));
						syCompanyInfo.setGoodsUrl("/bocm/index.php?act=goods&op=syshop_store&member_id=" + syCompanyInfo.getMemberId());
						syCompanyInfo.setGoodsStoreUrl("/bocm/index.php?act=goods&op=syshop_store&member_id=" + syCompanyInfo.getMemberId());
					}
					Collections.sort(coms);
					syShopDomain.seteNum(coms.size());
					syShopDomain.seteList(coms.size() > cols ? coms.subList(0, cols) : coms);
					syShopDomain.setAreaListMoreUrl("/bocm/index.php?act=syshop&op=sycompany");
					resultList.add(syShopDomain);
				}
			}
		}
		resultMap.put("areaList", resultList.size() >= rows ? resultList.subList(0, rows) : resultList);
		return resultMap;
	}

}
