package com.shanyuan.platform.ms.core.store;

import java.util.List;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.store.bo.StoreBo;
import com.shanyuan.platform.ms.dao.stats.entity.AgentStatsBo;
import com.shanyuan.platform.ms.dao.store.entity.SyStore;
import com.shanyuan.platform.ms.dao.store.entity.SyStoreJoinin;



public interface SyStoreService {

	/**
	 * 创建店铺 by sunyue
	 * @param record
	 */
	public void createStore(Integer memberId, String memberName, String memberTrueName) throws CoreServiceException;
	/**
	 * 创建相册  by sunyue
	 * @param storeId
	 * @throws CoreServiceException
	 */
	public void createAlbum(Integer storeId) throws CoreServiceException;
	
	/**
	 * 创建卖家  by sunyue
	 * @return
	 * @throws CoreServiceException
	 */
	public int createSeller(SyStoreJoinin  storeJoinin,SyStore store) throws CoreServiceException;
	/**
	 * 获得店铺信息  by sunyue
	 * @param store_id
	 * @return
	 * @throws CoreServiceException
	 */
	public  StoreBo getStoreInfo(Integer storeId) throws CoreServiceException;
	
	public SyStoreJoinin saveStoreInfo(Integer memberId, String memberName, String memberTrueName) throws CoreServiceException;
	/**
	 * 根据memberid 获得店铺信息
	 * @param memberId 会员id
	 * @return
	 * @throws CoreServiceException
	 */
	public List<SyStore> getStoreInfoByMid(List<Integer> memberId) throws CoreServiceException;
	/**
	 * @author zy
	 * @param memberId
	 * @return
	 * @throws CoreServiceException
	 */
	public List<Integer> getStoreIdByMid(Integer memberId) throws CoreServiceException;
	/**
	 * 根据storeIds 获得店铺信息
	 * @param storeId 会员id
	 * @return
	 * @throws CoreServiceException
	 */
	public List<SyStore> getMemberByStore(List<Integer> storeId) throws CoreServiceException;

	//SyShopAccount selectSyShopAccountByMemberId(Integer memberId);
	/**
	 * 获得积分
	 * @param memberIds
	 * @return
	 * @throws CoreServiceException
	 */
	List<AgentStatsBo> getScore(List<Integer> memberIds) throws CoreServiceException;

}
