package com.shanyuan.platform.ms.core.user;

import java.util.List;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.dao.user.entity.SyWXAcount;

public interface BindThirdPlatformIDService {

	
	/**
	 * 绑定微信
	 * @param member_id 会员ID
	 * @param openid 	微信openid
	 * @return Boolean
	 * 
	 */
	Boolean bindWxOpenidV1(Integer memberId, String openId) throws CoreServiceException;
	
	/**
	 * 绑定第三方平台
	 * @param chnl_id  渠道id  
	 * @param member_id 会员id 
	 * @param corp_uid 第三方用户标识符
	 * @return Boolean
	 */
	
	Boolean bindCorpUid(String chnlId, Integer memberId, String corpUid) throws CoreServiceException;
	
	/**
	 * 返回用户已绑定微信
	 * @param memberId
	 * @return
	 */
	List<SyWXAcount> wxAccounts(Integer memberId);

}
