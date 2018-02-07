package com.shanyuan.platform.ms.core.store.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.constant.LoginConstant;
import com.shanyuan.platform.ms.core.constant.UnionConstant;
import com.shanyuan.platform.ms.core.store.CircleMemberService;
import com.shanyuan.platform.ms.core.store.InviteCircleMemberService;
import com.shanyuan.platform.ms.core.store.InviteLogService;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMapply;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMapplyExample;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMember;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMemberExample;
import com.shanyuan.platform.ms.dao.store.mapper.SyBocOrgMapper;
import com.shanyuan.platform.ms.dao.store.mapper.SyCircleMapplyMapper;
import com.shanyuan.platform.ms.dao.store.mapper.SyCircleMemberMapper;
import com.shanyuan.platform.ms.dao.user.entity.SyCircle;
import com.shanyuan.platform.ms.dao.user.entity.SyCircleExample;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleLog;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleMember;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleMemberExample;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.mapper.SyCircleMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyInviteCircleMemberMapper;

/**
 * 
 * @author yangjian
 * @date 2017/10/19
 *
 */
@Component
public class CircleMemberServiceImpl implements CircleMemberService {
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private SyCircleMemberMapper circleMemberMapper;
	
	@Autowired
	private SyCircleMapper syCircleMapper;
	
	@Autowired
	private SyBocOrgMapper bocOrgMapper;
	
	@Autowired
	private SyCircleMapplyMapper circleMapplyMapper;
	
	@Autowired
	private InviteCircleMemberService inviteCircleMemberService;
	
	@Autowired
	private InviteLogService inviteLogService;
	
	@Autowired
	private ConstantReload constantReload;
	
	@Autowired
	private SyInviteCircleMemberMapper syInviteCircleMemberMapper;
	
	@Override
	public SyCircleMember getCircleInfoOnlyBocOrg(Integer memberId) {
		List<String> orgCodes = bocOrgMapper.selectDistinctOrgCode();
		SyCircleMemberExample nscme = new SyCircleMemberExample();
		nscme.createCriteria().andMemberIdEqualTo(memberId).andCodeIn(orgCodes);
		List<SyCircleMember> cms = this.circleMemberMapper.selectByExample(nscme);
		return CollectionUtils.isEmpty(cms) ? null : cms.get(0) ;
	}

	@Override
	public boolean mapplyJoinCircle(SyMember syMember, Integer circleId) {
		SyCircle circle = this.syCircleMapper.selectByPrimaryKey(circleId);
		if(!ObjectUtils.isEmpty(circle)) {
			SyCircleMemberExample nscme = new SyCircleMemberExample();
			nscme.createCriteria().andMemberIdEqualTo(syMember.getMemberId()).andCircleIdEqualTo(circleId);
			List<SyCircleMember> list = this.circleMemberMapper.selectByExample(nscme);
			if(list.isEmpty()) {
				SyCircleMapplyExample ncmme = new SyCircleMapplyExample();
				ncmme.createCriteria().andMemberIdEqualTo(syMember.getMemberId()).andCircleIdEqualTo(circleId);
				List<SyCircleMapply> mapplies = this.circleMapplyMapper.selectByExample(ncmme);
				SyCircleMember nscm =new SyCircleMember();
				nscm.setMemberId(syMember.getMemberId());
				nscm.setCircleId(circleId);
				nscm.setCircleName(circle.getCircleName());
				nscm.setMemberName(syMember.getMemberTruename());
				nscm.setIsIdentity(syMember.getMemberType());
				int ntime = (int) (System.currentTimeMillis()/1000);
				nscm.setCmApplytime(ntime+"");
				if(!mapplies.isEmpty()&&!StringUtils.isEmpty(mapplies.get(0).getMapplyTime())) {
					nscm.setCmApplytime(mapplies.get(0).getMapplyTime());
				}
				nscm.setCmJointime(ntime+"");
				nscm.setCmState(LoginConstant.CircleMemberState.CIRCLE_MEMBER_STATE_ENABLED);
				return this.circleMemberMapper.insertSelective(nscm) == 1 ? true : false;
				
			}else {
				SyCircleMember nscm =new SyCircleMember();
				nscm.setCmState(LoginConstant.CircleMemberState.CIRCLE_MEMBER_STATE_ENABLED);
				nscm.setIsIdentity(syMember.getMemberType());
				return this.circleMemberMapper.updateByExampleSelective(nscm, nscme) == 1 ? true : false;
			}
//			SyCircleMapplyExample ncmme = new SyCircleMapplyExample();
//			ncmme.createCriteria().andMemberIdEqualTo(syMember.getMemberId()).andCircleIdEqualTo(circleId);
		}
		return false;
	}

	@Override
	public SyCircleMember getCircleMemberInfoByMemberId(Integer memberId) {
		SyCircleMemberExample syCircleMemberExample = new SyCircleMemberExample();
		syCircleMemberExample.createCriteria().andMemberIdEqualTo(memberId);
		List<SyCircleMember> circleMembers = circleMemberMapper.selectByExample(syCircleMemberExample);
		if(!CollectionUtils.isEmpty(circleMembers)) {
			return circleMembers.get(0);
		}
		return null;
	}

	@Override
	public boolean joinCircle(SyMember member, Integer circleId) throws CoreServiceException {
		boolean result = false;
		SyCircle circle = this.syCircleMapper.selectByPrimaryKey(circleId);
		Integer memberId = member.getMemberId();
		if(ObjectUtils.isEmpty(circle)){
			logger.info("invalid circleId:{}", circleId);
			return result;
		}
		SyCircleMemberExample syCircleMemberExample = new SyCircleMemberExample();
		syCircleMemberExample.createCriteria().andMemberIdEqualTo(memberId);
		List<SyCircleMember> syCircleMembers = this.circleMemberMapper.selectByExample(syCircleMemberExample);
		SyCircleMember syCircleMember = null;
		if(!ObjectUtils.isEmpty(syCircleMembers)){
			syCircleMember = syCircleMembers.get(0);
			if(syCircleMember.getCircleId() == circleId){
				logger.info("the member has joined the circle, memberId:{}, circleId:{}", memberId, circleId);
				return result;
			}
			result = this.circleMemberMapper.deleteByPrimaryKey(syCircleMember) == 1 ? true : false;
			if(!result){
				logger.info("delete the record failed, memberId:{}, circleId:{}", memberId, circleId);
				return result;
			}
			syCircleMember = this.initCircleMember(circle, syCircleMember, member);
			result = this.circleMemberMapper.insertSelective(syCircleMember) == 1 ? true : false;
			if(!result){
				logger.info("insert the record failed, memberId:{}, circleId:{}", memberId, circleId);
				return result;
			}
		}else{
			syCircleMember = new SyCircleMember();
			syCircleMember = this.initCircleMember(circle, syCircleMember, member);
			result = circleMemberMapper.insertSelective(syCircleMember) == 1 ? true : false;
		}
		return result;
	}

	/**
	 * 初始化要添加的用户圈子信息
	 * @param circle
	 * @param circleMember
	 * @param memberId
	 * @return
	 */
	private SyCircleMember initCircleMember(SyCircle circle, SyCircleMember circleMember, SyMember member){
		String ntime = DateUtil.getNowLong() + "";
		SyCircle baseCircle = new SyCircle();
		BeanUtils.copyProperties(circle, baseCircle);
		while(circle.getDeptLevel() == 0 && circle.getParentCircleId() != 0){
			circle = this.syCircleMapper.selectByPrimaryKey(circle.getParentCircleId());
		}
		if(circle.getDeptLevel() == 1){
			circleMember.setDeptTag1(circle.getCircleName());
		}else if(circle.getDeptLevel() == 2){
			SyCircle pcircle = this.syCircleMapper.selectByPrimaryKey(circle.getParentCircleId());
			circleMember.setDeptTag1(pcircle.getCircleName());
			circleMember.setDeptTag2(circle.getCircleName());
		}else if(circle.getDeptLevel() == 3){
			SyCircle pcircle = this.syCircleMapper.selectByPrimaryKey(circle.getParentCircleId());
			SyCircle gpcircle = this.syCircleMapper.selectByPrimaryKey(pcircle.getParentCircleId());
			circleMember.setDeptTag1(gpcircle.getCircleName());
			circleMember.setDeptTag2(pcircle.getCircleName());
			circleMember.setDeptTag3(circle.getCircleName());
		}
		circleMember.setMemberId(member.getMemberId());
		circleMember.setMemberName(member.getMemberName());
		circleMember.setCircleId(circle.getCircleId());
		circleMember.setDeptId(baseCircle.getCircleId());
		circleMember.setCircleName(circle.getCircleName());
		circleMember.setCmJointime(ntime);
		circleMember.setCode(circle.getCode());
		circleMember.setCmApplytime(ntime);
		circleMember.setIsIdentity((byte)3);
		return circleMember;
	}

	@Override
	public boolean inviteJoinCircle(SyMember member,Integer circleId, Integer invMid, Integer invCid) {
		Integer memberId = member.getMemberId();
		String ntime = DateUtil.getNowLong() + "";
		boolean result =false;
		result = this.joinCircle(member, circleId);
		if(!result){
			logger.info("invite join circle failed, memberId:{}, circleId:{}", member.getMemberId(), circleId);
			return result;
		}
		SyInviteCircleMember invCircleMember = inviteCircleMemberService.getInviteCircleMemberByMemberId(memberId);
		if(!ObjectUtils.isEmpty(invCircleMember)){//圈子邀请表中有信息则更新
			invCircleMember.setCircleId(circleId);
			invCircleMember.setInviteCircleId(invMid);
			invCircleMember.setInviteCircleId(invCid);
			result = inviteCircleMemberService.updateByPrimaryKeySelective(invCircleMember);
			if(!result){
				logger.info("update inviteCircleMember failed, inviteMemberId:{}, circleId:{}, inviteCircleId:{}", invMid, circleId, invCid);
				return result;
			}
		}else{//无信息则插入
			invCircleMember = new SyInviteCircleMember();
			invCircleMember.setCircleId(circleId);
			invCircleMember.setInviteMemberId(invMid);
			invCircleMember.setInviteCircleId(invCid);
			invCircleMember.setAddTime(Integer.parseInt(ntime));
			invCircleMember.setMemberId(member.getMemberId());
			result = inviteCircleMemberService.insertSelective(invCircleMember);
			if(!result){
				logger.info("insert into inviteCircleMember failed, inviteMemberId:{}, circleId:{}, inviteCircleId:{}", invMid, circleId, invCid);
				return result;
			}
		}
		//添加邀请日志   如果圈子id == 益客俱乐部圈子id
		if(circleId == this.constantReload.getCIRCLE_ID_WEAL_CLUB()){
			SyInviteCircleLog log = inviteLogService.getLog(memberId, circleId);
			if(ObjectUtils.isEmpty(log)){//邀请圈子日志，没有则插入
				log = new SyInviteCircleLog();
				log.setInvMemberId(invMid);
				log.setMemberId(member.getMemberId());
				log.setCircleId(circleId);
				log.setAddTime(Integer.parseInt(ntime));
				result = inviteLogService.insertSelective(log);
				if(!result){
					logger.info("insert into inviteLog failed, inviteMemberId:{}, memberId:{}, circleId:{}", invMid, memberId, circleId);
					return result;
				}
			}else{//有则更新
				log.setAddTime(Integer.parseInt(ntime));
				result = inviteLogService.updateByPrimaryKeySelective(log);
				if(!result){
					logger.info("update inviteLog failed, inviteMemberId:{}, memberId:{}, circleId:{}", invMid, memberId, circleId);
					return result;
				}
			}
		}
		return result;
	}
	
	/**
	 * @author fzh
	 * 获取circle_parent_id
	 */
	
	public List<SyCircle> getAllCircleInfo() {
		
		SyCircleExample example = new SyCircleExample();
		List<SyCircle> syCircleList = syCircleMapper.selectByExample(example);
		return syCircleList;
	}

	@Override
	public Long countByChannel(String channel, Integer time) {
		SyCircleMemberExample example = new SyCircleMemberExample();
		example.createCriteria().andCodeEqualTo(channel).andCmJointimeLessThanOrEqualTo(time.toString());
		int countByExample = circleMemberMapper.countByExample(example);
		return (long) countByExample;
	}

	@Override
	public Long addNum(String channel, Integer startTime, Integer endTime) {
		SyCircleMemberExample example = new SyCircleMemberExample();
		example.createCriteria().andCodeEqualTo(channel)
		.andCmJointimeGreaterThanOrEqualTo(startTime.toString())
		.andCmJointimeLessThan(endTime.toString());
		return (long) circleMemberMapper.countByExample(example);
	}

	@Override
	public Long getNoInvYkCount(Integer time) {
		SyCircleMemberExample circleMemberExample = new SyCircleMemberExample();
		circleMemberExample.createCriteria().andCmJointimeLessThan(time + "").andCodeEqualTo(UnionConstant.OrgCode.CODE_YKJLB);
		int allInvYkNum = circleMemberMapper.countByExample(circleMemberExample);
		SyInviteCircleMemberExample example = new SyInviteCircleMemberExample();
		example.createCriteria().andAddTimeLessThan(time);
		int invYkNum = syInviteCircleMemberMapper.countByExample(example);
		
		return (long) allInvYkNum - invYkNum;
	}
	
	
	
}