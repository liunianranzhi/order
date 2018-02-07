package com.shanyuan.platform.ms.core.user.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.user.BindThirdPlatformIDService;
import com.shanyuan.platform.ms.dao.user.entity.SyCropInfo;
import com.shanyuan.platform.ms.dao.user.entity.SyCropInfoExample;
import com.shanyuan.platform.ms.dao.user.entity.SyWXAcount;
import com.shanyuan.platform.ms.dao.user.entity.SyWXAcountExample;
import com.shanyuan.platform.ms.dao.user.entity.SyWXAcountExample.Criteria;
import com.shanyuan.platform.ms.dao.user.mapper.SyCropInfoMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyWXAcountMapper;


/**
 * 绑定第三方id
 * @author zhangwd
 *
 */
@Component
public class BindThirdPlatformIDServiceImpl  implements BindThirdPlatformIDService {

	private final Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private SyWXAcountMapper syWXAcountMapper;
	
	@Autowired
	private SyCropInfoMapper syCropInfoMapper;
	
	/**
	 * 绑定微信
	 * @param member_id 会员ID
	 * @param openId 	微信openid
	 * @return Boolean
	 */
	public Boolean bindWxOpenidV1(Integer memberId, String openId) throws CoreServiceException {
		
		if(memberId == null || openId == null) {
			return false;
		}
			
			try {
				SyWXAcountExample example = new SyWXAcountExample();
				Criteria createCriteria = example.createCriteria();
				createCriteria.andMemberIdEqualTo(memberId);
				//微信要求一对一绑定
//				createCriteria.andMemberWxopenidEqualTo(openId);
				
				List<SyWXAcount> selectByExample = syWXAcountMapper.selectByExample(example);
				
				if(CollectionUtils.isEmpty(selectByExample)) {
					
					SyWXAcount syWXAcount = new SyWXAcount();
					syWXAcount.setMemberId(memberId);
					syWXAcount.setMemberWxopenid(openId);
					syWXAcount.setAddTime(Integer.toString(DateUtil.getNowInt()));
					
					syWXAcountMapper.insert(syWXAcount);
				}
				
			} catch (CoreServiceException e) {
				
				logger.error("绑定微信失败", e);
				e.getMessage();
			}
		
		return true;
	}

	/**
	 * 绑定第三方平台
	 * @param chnl_id  渠道id  
	 * @param member_id 会员id 
	 * @param corp_uid 第三方用户标识符
	 * @return Boolean
	 */
	public Boolean bindCorpUid(String chnl_id, Integer member_id, String corp_uid) throws CoreServiceException {
		
		String logStr = "chnl_id=" + chnl_id + "member_id=" + member_id + "corp_uid" + corp_uid;
		
		if (StringUtils.isEmpty(chnl_id) || member_id == null || StringUtils.isEmpty(corp_uid)) {
			
			logger.info(" ERROR [invalid params]" + logStr );
			return false;
		}

		try {
			SyCropInfoExample ciExample = new SyCropInfoExample();
			ciExample.createCriteria().andChnlIdEqualTo(chnl_id).andMemberIdEqualTo(member_id).andCorpUidEqualTo(corp_uid);
			
			List<SyCropInfo> selectByExample = syCropInfoMapper.selectByExample(ciExample);
			
			
			if(CollectionUtils.isEmpty(selectByExample)) {
				// 新设备或用户更换了设备 -> 添加这个设备
				SyCropInfo syCropInfo = new SyCropInfo();
				syCropInfo.setChnlId(chnl_id);
				syCropInfo.setCorpUid(corp_uid);
				syCropInfo.setMemberId(member_id);
				syCropInfo.setLastBindTime(DateUtil.getNowInt());
				syCropInfo.setBindTime(DateUtil.getNowInt());
				syCropInfo.setLastUpdate(DateUtil.getNowInt());
				
				int i = syCropInfoMapper.insert(syCropInfo);
				
				if (i > 0) {
					
					logger.info(" INFO [bind corp uid ok]" + logStr );
				}else {
					
					logger.info("INFO [bind corp uid failed]" + logStr );
				}
				
			}else {
				// 用户退出登录后重新绑定
				SyCropInfo syCropInfo = new SyCropInfo();
				syCropInfo.setLastBindTime(DateUtil.getNowInt());
				//TODO使用主键
				syCropInfoMapper.updateByExampleSelective(syCropInfo, ciExample);
				
				logger.info("INFO [rebind corp uid ok]" + logStr );
			
			}
		} catch (CoreServiceException e) {
			
			logger.error( e.getMessage(), e);
		}
		
		return true;
	}

	@Override
	public List<SyWXAcount> wxAccounts(Integer memberId) {
		SyWXAcountExample example = new SyWXAcountExample();
		example.createCriteria().andMemberIdEqualTo(memberId);
		List<SyWXAcount> list = this.syWXAcountMapper.selectByExample(example);
		if(!CollectionUtils.isEmpty(list)){
			return list;
		}
		return null;
	}
}
