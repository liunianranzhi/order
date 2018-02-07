package com.shanyuan.platform.ms.core.store.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.shanyuan.platform.ms.base.common.CommonRedisKey;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.StoreConstant;
import com.shanyuan.platform.ms.core.store.SyStoreJoininService;
import com.shanyuan.platform.ms.core.store.SyStoreService;
import com.shanyuan.platform.ms.core.store.bo.StoreBo;
import com.shanyuan.platform.ms.core.store.impl.execptype.StoreExcepType;
import com.shanyuan.platform.ms.dao.stats.entity.AgentStatsBo;
import com.shanyuan.platform.ms.dao.stats.mapper.SyAgentStatsMapper;
import com.shanyuan.platform.ms.dao.store.entity.SyAlbumClass;
import com.shanyuan.platform.ms.dao.store.entity.SySeller;
import com.shanyuan.platform.ms.dao.store.entity.SySellerExample;
import com.shanyuan.platform.ms.dao.store.entity.SyStore;
import com.shanyuan.platform.ms.dao.store.entity.SyStoreExample;
import com.shanyuan.platform.ms.dao.store.entity.SyStoreExtend;
import com.shanyuan.platform.ms.dao.store.entity.SyStoreJoinin;
import com.shanyuan.platform.ms.dao.store.entity.SyStoreJoininExample;
import com.shanyuan.platform.ms.dao.store.entity.SyStoreWithBLOBs;
import com.shanyuan.platform.ms.dao.store.mapper.SyAlbumClassMapper;
import com.shanyuan.platform.ms.dao.store.mapper.SySellerMapper;
import com.shanyuan.platform.ms.dao.store.mapper.SyStoreExtendMapper;
import com.shanyuan.platform.ms.dao.store.mapper.SyStoreJoininMapper;
import com.shanyuan.platform.ms.dao.store.mapper.SyStoreMapper;
import com.shanyuan.platform.ms.dao.user.entity.SyMemberWithBLOBs;
import com.shanyuan.platform.ms.dao.user.mapper.SyMemberMapper;

@Component
public class SyStoreServiceImpl implements SyStoreService {
	
	@Autowired
	private SyStoreMapper syStoreMapper;
	
	@Autowired
	private SyAlbumClassMapper  syAlbumClassMapper;
	
	@Autowired
	private SyStoreExtendMapper syStoreExtendMapper;
	
	@Autowired
	private SyStoreJoininMapper syStoreJoininMapper;
	
	@Autowired
	private SySellerMapper sySellerMapper;
	
	@Autowired
	private SyMemberMapper syMemberMapper;
	
	@Autowired
	private SyStoreJoininService syStoreJoininService;
	
	@Autowired
	private SyAgentStatsMapper syAgentStatsMapper;
	

	private static final Logger logger = LoggerFactory.getLogger(SyStoreServiceImpl.class);

	
	/**
	 * 创建相册  by sunyue
	 */
	public void createAlbum(Integer storeId) throws CoreServiceException {
		SyAlbumClass nsc = new SyAlbumClass();
		nsc.setAclassName("默认相冊");
		nsc.setStoreId(storeId);
		nsc.setAclassDes("");
		nsc.setAclassSort(255);
		nsc.setAclassCover("");
		int ntime = (int) (System.currentTimeMillis()/1000);
		nsc.setUploadTime(ntime);
		nsc.setIsDefault((byte)1);
		this.syAlbumClassMapper.insertSelective(nsc);
	}
	/**
	 * 创建店铺   by sunyue
	 * 
	 */
	
	public void createStore(Integer memberId, String memberName, String memberTrueName) throws CoreServiceException {
		if(memberId==null || StringUtils.isEmpty(memberName) || StringUtils.isEmpty(memberTrueName)) {
			throw new CoreServiceException(StoreExcepType.CREATE_STORE_ERROR,"invalid params");
		}
		SyStoreJoinin  storeJoinin  = this.saveStoreInfo(memberId, memberName, memberTrueName);
		//验证卖家用户名是否存在
		if(existSeller(storeJoinin.getSellerName())) {
			return;
		}
		try {
			SyStore store = getStoreInfo(storeJoinin);
			int n=0;
			int m=this.syStoreMapper.insertSelective((SyStoreWithBLOBs) store);
			if(m>0) {
				//创建卖家
				n=this.createSeller(storeJoinin, store);
			}
			if(n>0) {
				//更新 joinin_state 状态
				SyMemberWithBLOBs   member_info = syMemberMapper.selectByPrimaryKey(memberId);
				syStoreJoininService.updateStoreJoin(member_info,memberId);
				//插入店铺扩展表  
				SyStoreExtend sse = syStoreExtendMapper.selectByPrimaryKey(store.getStoreId());
				if(ObjectUtils.isEmpty(sse)) {
					SyStoreExtend  storeExtend = new SyStoreExtend();
					storeExtend.setStoreId(store.getStoreId());
					this.syStoreExtendMapper.insertSelective(storeExtend);
				}
				//创建相册
				this.createAlbum(store.getStoreId());
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new CoreServiceException(StoreExcepType.CREATE_STORE_ERROR,"create store fail");
		}
		
	}
	/**
	 * 保存个人开店信息  by sunyue
	 * @param memberId
	 * @param memberName
	 * @param memberTrueName
	 * @return
	 * @throws CoreServiceException
	 */
	public SyStoreJoinin saveStoreInfo(Integer memberId, String memberName, String memberTrueName) throws CoreServiceException {
		SyStoreJoininExample nssje = new SyStoreJoininExample();
		nssje.createCriteria().andMemberIdEqualTo(memberId);
		List<SyStoreJoinin> storeJoinins = this.syStoreJoininMapper.selectByExample(nssje);
		if(storeJoinins.isEmpty()) {
			SyStoreJoinin nsj = new SyStoreJoinin();
			nsj.setMemberId(memberId);
			nsj.setSellerName(memberId+"");
			nsj.setStoreName(memberTrueName);
			nsj.setMemberName(memberId+"");
			nsj.setSgId(3);
			nsj.setSgName("钻石店铺");
			nsj.setScId(0);
			nsj.setScName("默认");
			nsj.setCompanyAddress("默认");
			nsj.setCompanyAddressDetail("默认");
			nsj.setJoininState(StoreConstant.StoreStatus.STORE_JOIN_STATE_PAY+"");
			this.syStoreJoininMapper.insertSelective(nsj);
			return nsj;
		} 
		return storeJoinins.get(0);
		
	}
	/**
	 * 判断卖家是否存在  by sunyue
	 * @param sellerName
	 * @return
	 */
	public boolean existSeller(String sellerName) {
		SySellerExample nsse = new SySellerExample();
		nsse.createCriteria().andSellerNameEqualTo(sellerName);
		return !this.sySellerMapper.selectByExample(nsse).isEmpty() ;
	}
	/**
	 * 获得插入店铺的信息 by sunyue
	 * @param sji
	 * @return
	 */
	public  SyStore getStoreInfo(SyStoreJoinin sji) {
		SyStoreWithBLOBs  s = new SyStoreWithBLOBs() ;
		s.setMemberId(sji.getMemberId());
		s.setMemberName(sji.getMemberName());
		s.setSellerName(sji.getSellerName());
		s.setGradeId(sji.getSgId());
		s.setStoreOwnerCard("");
		s.setStoreName(sji.getStoreName());
		s.setScId(sji.getScId());
		s.setStoreCompanyName(sji.getCompanyName());
		s.setAreaId(0);
		s.setAreaInfo(sji.getCompanyAddress());
		s.setStoreAddress(sji.getCompanyAddressDetail());
		s.setStoreZip("");
		s.setStoreTel("");
		s.setStoreState((byte) 1);
		Long ntime = DateUtil.getNowLong();
		s.setStoreTime(ntime+"");
		return s;
	}
	
	/**
	 * 创建卖家  by sunyue
	 * @return
	 * @throws CoreServiceException
	 */
	public int createSeller(SyStoreJoinin  storeJoinin,SyStore store) throws CoreServiceException {
		SySeller seller = new SySeller();
		seller.setSellerName(storeJoinin.getSellerName());
		seller.setMemberId(storeJoinin.getMemberId());
		seller.setSellerGroupId(0);
		seller.setStoreId(store.getStoreId());
		seller.setIsAdmin((byte) 1);
		int n = this.sySellerMapper.insertSelective(seller);
		return n;
	}

	/**
	 * 获得店铺信息  by sunyue
	 * @param store_id
	 * @return
	 * @throws CoreServiceException
	 */
	public StoreBo getStoreInfo(Integer storeId) throws CoreServiceException {
		if(ObjectUtils.isEmpty(storeId)) {
			logger.info("店铺id为空");
			throw new CoreServiceException(StoreExcepType.STORE_PARAM_ERROR,"storeId is null");
		}
		SyStoreWithBLOBs store = this.syStoreMapper.selectByPrimaryKey(storeId);
		StoreBo bo = new StoreBo();
		if(!ObjectUtils.isEmpty(store)){
			BeanUtils.copyProperties(store, bo);
			return bo;
		}
		return null;
	}
	
	/**
	 * 获得店铺信息
	 *  by zy 2017-10-30
	 */
	@Override
	public List<SyStore> getStoreInfoByMid(List<Integer> memberIds) throws CoreServiceException {
		SyStoreExample example = new SyStoreExample();
	    example.createCriteria().andMemberIdIn(memberIds);
		List<SyStore> selectByExample = syStoreMapper.selectByExample(example);
		return selectByExample;
	}
	/**
	 * by zy
	 * 2017-11-22
	 */
	@Override
	public List<Integer> getStoreIdByMid(Integer memberId) throws CoreServiceException{
		List<Integer> list= new ArrayList<Integer>();
			list.add(memberId);
			if(!ObjectUtils.isEmpty(list)) {
				List<SyStore> storeInfoByMid = this.getStoreInfoByMid(list);
				List<Integer> sids= new ArrayList<Integer>();
				for(SyStore sy:storeInfoByMid) {
					sids.add(sy.getStoreId());
				}
				return sids;
			}else {
				return null;
			}
		
	}
	/**
	 * 获得店铺信息
	 *  by zy 2017-11-11
	 */
	@Override
	public List<SyStore> getMemberByStore(List<Integer> storeId) throws CoreServiceException {
		if(ObjectUtils.isEmpty(storeId)) {
			return null;
		}
		SyStoreExample example = new SyStoreExample();
		example.createCriteria().andStoreIdIn(storeId);
		List<SyStore> selectByExample = syStoreMapper.selectByExample(example);
		return selectByExample;
	}
	/**
	 * 获得评分
	 * @param memberIds
	 * @return
	 */
	@Override
	public  List<AgentStatsBo> getScore(List<Integer> memberIds) throws CoreServiceException {
		List<AgentStatsBo> scores = this.syAgentStatsMapper.scores(memberIds);
		//List<AgentStatsBo> scores = this.syAgentStatsMapper.scores(memberIds, 1505326073);
		return scores;
	}
	
}
