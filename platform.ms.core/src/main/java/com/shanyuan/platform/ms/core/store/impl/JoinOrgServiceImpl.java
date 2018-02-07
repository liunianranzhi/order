package com.shanyuan.platform.ms.core.store.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.StoreConstant;
import com.shanyuan.platform.ms.core.store.JoinOrgService;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMapply;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMapplyExample;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMember;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMemberExample;
import com.shanyuan.platform.ms.dao.store.mapper.SyCircleMapplyMapper;
import com.shanyuan.platform.ms.dao.store.mapper.SyCircleMemberMapper;
import com.shanyuan.platform.ms.dao.user.entity.SyCircle;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.mapper.SyCircleMapper;


/**
 * 加入组织
 * @author sunyue
 *
 */
@Component
public class JoinOrgServiceImpl implements JoinOrgService{
	
	@Autowired
	private SyCircleMapper circleMapper ;
	
	@Autowired
	private SyCircleMemberMapper circleMemberMapper;
	
	@Autowired
	private SyCircleMapplyMapper circleMapplyMapper;
	
	/**
	 * 加入组织
	 * @param member
	 * @param orgId
	 * @throws CoreServiceException
	 */
	@Deprecated
	public void joinOrg(SyMember member, Integer orgId) throws CoreServiceException {
		SyCircle circle = this.circleMapper.selectByPrimaryKey(orgId);
		if(circle!=null) {
			SyCircleMemberExample nscme = new SyCircleMemberExample();
			nscme.createCriteria().andMemberIdEqualTo(member.getMemberId()).andCircleIdEqualTo(orgId);
			List<SyCircleMember> list = this.circleMemberMapper.selectByExample(nscme);
			if(list.isEmpty()) {
				SyCircleMapplyExample ncmme = new SyCircleMapplyExample();
				ncmme.createCriteria().andMemberIdEqualTo(member.getMemberId()).andCircleIdEqualTo(orgId);
				List<SyCircleMapply> mapplies = this.circleMapplyMapper.selectByExample(ncmme);
				SyCircleMember nscm =new SyCircleMember();
				nscm.setMemberId(member.getMemberId());
				nscm.setCircleId(orgId);
				nscm.setCircleName(circle.getCircleName());
				nscm.setMemberName(member.getMemberTruename());
				nscm.setIsIdentity(member.getMemberType());
				int ntime = (int) (System.currentTimeMillis()/1000);
				nscm.setCmApplytime(ntime+"");
				if(!mapplies.isEmpty()&&!StringUtils.isEmpty(mapplies.get(0).getMapplyTime())) {
					nscm.setCmApplytime(mapplies.get(0).getMapplyTime());
				}
				nscm.setCmJointime(ntime+"");
				nscm.setCmState(StoreConstant.CircleMemberState.CIRCLE_MEMBER_STATE_ENABLED);
				this.circleMemberMapper.insertSelective(nscm);
				
			}else {
				SyCircleMember nscm =new SyCircleMember();
				nscm.setCmState(StoreConstant.CircleMemberState.CIRCLE_MEMBER_STATE_ENABLED);
				nscm.setIsIdentity(member.getMemberType());
				this.circleMemberMapper.updateByExampleSelective(nscm, nscme);
			}
			SyCircleMapplyExample ncmme = new SyCircleMapplyExample();
			ncmme.createCriteria().andMemberIdEqualTo(member.getMemberId()).andCircleIdEqualTo(orgId);
			this.circleMapplyMapper.deleteByExample(ncmme);
		
		}
	}
	
	

}
