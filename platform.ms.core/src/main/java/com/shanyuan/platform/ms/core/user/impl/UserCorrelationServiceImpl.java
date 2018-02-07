package com.shanyuan.platform.ms.core.user.impl;

import java.math.BigDecimal;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.shanyuan.platform.ms.base.common.util.ImageUtil;
import com.shanyuan.platform.ms.base.common.util.MD5Util;
import com.shanyuan.platform.ms.base.common.util.ValidUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.AuthConstant;
import com.shanyuan.platform.ms.core.constant.ConstantReload;
import com.shanyuan.platform.ms.core.constant.LoginConstant;
import com.shanyuan.platform.ms.core.constant.UserConstant;
import com.shanyuan.platform.ms.core.user.UserCorrelationService;
import com.shanyuan.platform.ms.core.user.bo.MemberBo;
import com.shanyuan.platform.ms.core.user.bo.MemberRoleInfo;
import com.shanyuan.platform.ms.core.user.bo.UserBaseinfo;
import com.shanyuan.platform.ms.core.user.impl.exceptype.UserCorrelationException;
import com.shanyuan.platform.ms.dao.auth.entity.SyMbUserToken;
import com.shanyuan.platform.ms.dao.auth.entity.SyMbUserTokenExample;
import com.shanyuan.platform.ms.dao.auth.mapper.SyMbUserTokenMapper;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMember;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMemberExample;
import com.shanyuan.platform.ms.dao.store.mapper.SyBocOrgMapper;
import com.shanyuan.platform.ms.dao.store.mapper.SyCircleMemberMapper;
import com.shanyuan.platform.ms.dao.user.entity.SupportPoorBo;
import com.shanyuan.platform.ms.dao.user.entity.SyAdminBoc;
import com.shanyuan.platform.ms.dao.user.entity.SyAdminBocExample;
import com.shanyuan.platform.ms.dao.user.entity.SyCircle;
import com.shanyuan.platform.ms.dao.user.entity.SyGroupManager;
import com.shanyuan.platform.ms.dao.user.entity.SyGroupManagerExample;
import com.shanyuan.platform.ms.dao.user.entity.SyGuideShowState;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleLogExample;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleMember;
import com.shanyuan.platform.ms.dao.user.entity.SyInviteCircleMemberExample;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.entity.SyMemberExample;
import com.shanyuan.platform.ms.dao.user.entity.SyMemberWithBLOBs;
import com.shanyuan.platform.ms.dao.user.entity.SyPoor;
import com.shanyuan.platform.ms.dao.user.entity.SyPoorExample;
import com.shanyuan.platform.ms.dao.user.entity.SyRole;
import com.shanyuan.platform.ms.dao.user.entity.SyRoleExample;
import com.shanyuan.platform.ms.dao.user.entity.SyRoleExample.Criteria;
import com.shanyuan.platform.ms.dao.user.entity.SyShopAccount;
import com.shanyuan.platform.ms.dao.user.entity.SyWXAcount;
import com.shanyuan.platform.ms.dao.user.entity.SyWXAcountExample;
import com.shanyuan.platform.ms.dao.user.mapper.SyAdminBocMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyCircleMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyGroupManagerMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyGuideShowStateMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyInviteCircleLogMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyInviteCircleMemberMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyMemberMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyPoorMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyPoorSupporterMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyRoleMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyShopAccountMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyWXAcountMapper;


/**
 * 用户相关接口实现
 * @author zhangwd
 *
 */
@Component
public class UserCorrelationServiceImpl  implements UserCorrelationService {

	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private SyMemberMapper syMemberMapper;
	
	@Autowired
	private SyCircleMemberMapper syCircleMemberMapper;
	@Autowired
	private SyShopAccountMapper syShopAccountMapper;
	
	@Autowired
	private SyPoorMapper syPoorMapper;
	
	@Autowired
	private SyRoleMapper syRoleMapper;
	
	@Autowired
	private SyAdminBocMapper syAdminBocMapper;
	
	@Autowired
	private SyGroupManagerMapper syGroupManagerMapper;
	
	@Autowired
	private SyBocOrgMapper  syBocOrgMapper;
	
	@Autowired
	private ConstantReload constantReload;
	
	@Autowired
	private SyInviteCircleMemberMapper syInviteCircleMemberMapper;
	
	@Autowired
	private SyInviteCircleLogMapper syInviteCircleLogMapper;
	
	@Autowired
	private SyCircleMapper syCircleMapper;
	
	@Autowired
	private SyMbUserTokenMapper syMbUserTokenMapper;
	
	@Autowired
	private SyWXAcountMapper syWxAccountMapper;
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	private SyPoorSupporterMapper syPoorSupporterMapper;
	
	@Autowired
	private SyGuideShowStateMapper syGuideShowStateMapper;
	
	/**
	 * 获取用户信息
	 * @param memberId
	 * @return
	 * @throws Exception
	 */
	@Override
	public SyMember getMemberInfo(Integer  memberId) throws CoreServiceException{
		
		SyMemberExample memberExample = new SyMemberExample();
		memberExample.createCriteria().andMemberIdEqualTo(memberId);
		List<SyMember> selectByExample = syMemberMapper.selectByExample(memberExample);
		
		if (CollectionUtils.isEmpty(selectByExample)) {
			return null;
		}
		
		return selectByExample.get(0);
	}

    /**
     * 获得会员真实名字
     * @param memberIds
     * @return
     * @throws CoreServiceException
     */
    @Override
    public Map<Integer,String> getMemberTrueNames(List<Integer>  memberIds) throws CoreServiceException{
        Map<Integer,String>  datamap=new HashMap<Integer,String>();
        Map<Integer, SyMember> memberMap = this.getMemberMap(memberIds);
        if(!ObjectUtils.isEmpty(memberMap)){
            for(Integer key :memberMap.keySet()){
                SyMember syMember = memberMap.get(key);
                Integer memberId = syMember.getMemberId();
                String userTrueName = this.getUserTrueName(syMember);
                datamap.put(memberId,userTrueName);
            }
        }
        return datamap;
    }

    /**
     * 获得会员map
     * @param memberIds
     * @return
     * @throws CoreServiceException
     */
    public Map<Integer,SyMember> getMemberMap(List<Integer>  memberIds) throws CoreServiceException{
        Map<Integer,SyMember>  datamap=new HashMap<Integer,SyMember>();

        if (CollectionUtils.isEmpty(memberIds)) {
            return datamap;
        }
        SyMemberExample memberExample = new SyMemberExample();
        memberExample.createCriteria().andMemberIdIn(memberIds);
        List<SyMember> selectByExample = syMemberMapper.selectByExample(memberExample);

        if (CollectionUtils.isEmpty(selectByExample)) {
            return datamap;
        }
        Iterator<SyMember> iterator = selectByExample.iterator();
        while (iterator.hasNext()){
            SyMember next = iterator.next();
            Integer memberId = next.getMemberId();
            datamap.put(memberId,next);
        }
        return datamap;
    }
	/**
	 * 获得店主信息
	 * by zy
	 */
	public List<SyMember> selectMemberByStoreIds(List<Integer>  storeId) throws CoreServiceException{
		List<SyMember> list=new ArrayList<SyMember>();
		if(ObjectUtils.isEmpty(storeId)) {
			return list;
		}
		 list = syMemberMapper.selectMemberByStoreIds(storeId);
		return list;
	}
	/**
	 * 查询组织机构信息
	 * @param member_id
	 * @return
	 * @throws Exception
	 */
	@Override
	public SyCircleMember getCircleInfoOnlyBocOrg(Integer member_id) throws CoreServiceException {
//		try {
		    List<String> orgCode = syBocOrgMapper.selectDistinctOrgCode();
//		}catch(JedisConnectionException e) {
//		    
//		}
		
		
		SyCircleMemberExample scmExample = new SyCircleMemberExample();
		scmExample.createCriteria().andMemberIdEqualTo(member_id).andCodeIn(orgCode);
		
		List<SyCircleMember> selectByExample = syCircleMemberMapper.selectByExample(scmExample);
		
		if (!CollectionUtils.isEmpty(selectByExample)) {
			return selectByExample.get(0);
		}
		return null;
	}

	/**
	 * 查询贫困户信息
	 * @param memberId
	 * @return
	 * @throws Exception
	 */
	@Override
	public SyPoor getPoorInfo(Integer memberId) throws CoreServiceException {
		
		SyPoorExample poorExample = new SyPoorExample();
		poorExample.createCriteria().andMemberIdEqualTo(memberId);
		List<SyPoor> selectByExample = syPoorMapper.selectByExample(poorExample);
		
		if (CollectionUtils.isEmpty(selectByExample)) {
			return null;
		}
		
		return selectByExample.get(0);
	}

	/**
	 * 查询用户角色类型信息（代理人角色）
	 * @param member_id
	 * @return
	 * @throws CoreServiceException
	 */
	@Override
	public SyRole getRoleAgent(Integer member_id) throws CoreServiceException {

		SyRoleExample srExample = new SyRoleExample();
		
		Criteria createCriteria = srExample.createCriteria();
		createCriteria.andMemberIdEqualTo(member_id);
		createCriteria.andRoleTypeIn(Arrays.asList(	UserConstant.RoleType.ROLE_TYPE_COOP, UserConstant.RoleType.ROLE_TYPE_WS,
													UserConstant.RoleType.ROLE_TYPE_GOV,UserConstant.RoleType.ROLE_TYPE_INDUSTRY));
		
		List<SyRole> selectByExample = syRoleMapper.selectByExample(srExample);
		
		return selectByExample.isEmpty() ? null : selectByExample.get(0);
	}
	public SyShopAccount getVendor(Integer memberId) throws CoreServiceException {
		if(ObjectUtils.isEmpty(memberId)) {
			return null;
		}
		List<SyShopAccount> selectByMemberId = syShopAccountMapper.selectByMemberId(memberId);
		
		return ObjectUtils.isEmpty(selectByMemberId) ? null : selectByMemberId.get(0);
	}
	/**
	 * 获取用户 管理员
	 * @param member_id
	 * @return
	 * @throws Exception
	 */
	@Override
	public SyAdminBoc getAdminBoc(Integer member_id) throws CoreServiceException {

		SyAdminBocExample sabExample = new SyAdminBocExample();
		sabExample.createCriteria().andMemberIdEqualTo(member_id);
		List<SyAdminBoc> selectByExample = syAdminBocMapper.selectByExample(sabExample);
		
		if (!CollectionUtils.isEmpty(selectByExample)) {
			return selectByExample.get(0);
		}

		return null;
	}
	
	/**
	 * 查询是否团组织管理员
	 * @param member_id
	 * @return
	 * @throws Exception
	 */
	@Override
	public SyGroupManager getGroupManager(Integer member_id) throws CoreServiceException {

		SyGroupManagerExample sgmExample = new SyGroupManagerExample();
		sgmExample.createCriteria().andMemberIdEqualTo(member_id);
		
		List<SyGroupManager> selectByExample = this.syGroupManagerMapper.selectByExample(sgmExample);
		
		if (!CollectionUtils.isEmpty(selectByExample)) {
			return selectByExample.get(0);
		}
		
		return null;
	}
	
	
	/**
	 * 注册方法
	 * @param userName 用户名
	 * @param passwd 	用户密码
	 * @param mobile	用户手机号
	 * @param trueName	用户真实姓名
	 * @param idValue	证件号码 
	 * @param channel	渠道
	 * @param memberSex 性别
	 * @return
	 */
	public SyMember register(String userName ,String passwd,String mobile ,String trueName ,String idValue ,String channel, Byte memberSex ) throws CoreServiceException {
		//TODO 校验不完善，ValidUtil.validPhone(userName)传值 ；缺密码校验？
		if(StringUtils.isEmpty(trueName)&& ValidUtil.validPhone(userName)) {
			trueName = ValidUtil.getUserDispMobile(userName);
		}
		
		SyMemberWithBLOBs nm = null;
		try {
			SyMemberExample nsme = new SyMemberExample();
			nsme.createCriteria().andMemberNameEqualTo(userName);
			
			List<SyMember> members = this.syMemberMapper.selectByExample(nsme);
			
			if(!members.isEmpty()) {
				
				return null;
			}
			
			nm = new SyMemberWithBLOBs ();
			int ntime = (int) (System.currentTimeMillis()/1000);
			nm.setMemberMobile(mobile);
			nm.setMemberName(userName);
			nm.setMemberEmail("");
			nm.setMemberPasswd(MD5Util.getMD5LowerCase(passwd));
			nm.setMemberTruename(trueName);
			nm.setMemberType(LoginConstant.UserType.USER_C);
			nm.setMemberIdType((byte) 1);
			nm.setMemberIdValue(idValue);
			nm.setMemberSex(memberSex);
			nm.setMemberState((byte) 1);
			nm.setMemberTime(ntime+"");
			nm.setMemberLoginTime(ntime+"");
			nm.setMemberOldLoginTime(ntime+"");
			nm.setAvailablePredeposit(new BigDecimal(0));
			nm.setAvailableGiftdeposit(new BigDecimal(0));
			nm.setFreezePredeposit(new BigDecimal(0));
			nm.setInformAllow((byte) 1);
			nm.setIsBuy((byte) 1);
			nm.setIsAllowtalk((byte) 1);
			nm.setMemberCredit(0);
			nm.setMemberSnsvisitnum(0);
			nm.setMemberContributeSyNum(0);
			nm.setMemberUsedSyNum(0);
			nm.setMemberContributeMoney(new BigDecimal(0));
			nm.setShowGoodsDonationAgreement((byte) 1);
			nm.setMemberPoints(0);
			nm.setSyPoints(0l);
			nm.setSyPointsUsed(0l);
			nm.setBocPoints(0l);
			nm.setBocPointsUsed(0l);
			nm.setBocPointsRank(0);
			nm.setBocPointsDeptRank(0);
			nm.setBocLevelTime(ntime+"");
			nm.setMemberIdBackImage("");
			
			this.syMemberMapper.insertSelective(nm);
			
			//新用户插入显示协议字段
			SyGuideShowState syGuideShowState = new SyGuideShowState();
			syGuideShowState.setMemberId(nm.getMemberId());
			syGuideShowState.setUserAgreement((byte) 1);
			this.syGuideShowStateMapper.insertSelective(syGuideShowState);
			
		} catch (CoreServiceException e) {
			logger.info("/user/UserCorrelation.register  [failed: user_register]", new CoreServiceException(UserCorrelationException.USER_REGISTER_FAILED) );
			e.printStackTrace();
		}
		
		return nm ;
	}
	
	/**
	 * 查询用户身份标识
	 * @param memberId
	 * @return
	 */
	public MemberRoleInfo getMemberRoleInfo(Integer memberId) {
		
		MemberRoleInfo mri = new MemberRoleInfo();
		//是否是员工
		SyCircleMember circle = this.getCircleInfoOnlyBocOrg(memberId);
		SyAdminBoc admin = this.getAdminBoc(memberId);
		SyGroupManager group = this.getGroupManager(memberId);
		SyRole agent = this.getRoleAgent(memberId);
		SyPoor poor =this.getPoorInfo(memberId);
		
		if(group!=null) {
			mri.setIsOrgAdmin(true);
		}
		
		if(admin!=null) {
			mri.setIsAdmin(true);
		}
		
		if(agent!=null) {
			mri.setRoleName("公益中国");
			mri.setCode(LoginConstant.UserRole.USER_ROLE_AGENT_USER);
		}else if(poor !=null) {
			mri.setRoleName("公益中国");
			mri.setCode(LoginConstant.UserRole.USER_ROLE_POOR_USER);
		}else if(circle!=null && circle.getCircleId()!=this.constantReload.CIRCLE_ID_WEAL_CLUB) {
			mri.setRoleName(circle.getCircleName());
			mri.setCode(LoginConstant.UserRole.USER_ROLE_EMPLOYEE_USER);
		}else if(circle!=null && circle.getCircleId()==this.constantReload.CIRCLE_ID_WEAL_CLUB) {
			
			SyInviteCircleMemberExample nsicme = new SyInviteCircleMemberExample();
			nsicme.createCriteria().andMemberIdEqualTo(memberId);
			List<SyInviteCircleMember> invites = this.syInviteCircleMemberMapper.selectByExample(nsicme);
			
			if(invites.isEmpty()) {
				mri.setRoleName("中国银行 益客");
				mri.setCode(LoginConstant.UserRole.USER_ROLE_NOCODE_YIKE_USER);
			}else {
				SyInviteCircleMember invite = invites.get(0);
				mri.setCode(LoginConstant.UserRole.USER_ROLE_NOCODE_YIKE_USER);
				if(invite.getInviteMemberId()==null) {
					mri.setRoleName("中国银行 益客");
				}else {
					SyCircle inviteCircle = this.syCircleMapper.selectByPrimaryKey(invite.getInviteCircleId());
					mri.setRoleName(inviteCircle.getCircleName()+" 益客");
				}
			}
		}else {
			
			mri.setRoleName("普通用户");
			mri.setCode(LoginConstant.UserRole.USER_ROLE_COMMON_USER);
		}
		return mri;
	}


	@Override
	public SyCircleMember getCircleInfoByMemberId(Integer memberId) {
		
		SyCircleMemberExample cmExample = new SyCircleMemberExample();
		cmExample.createCriteria().andMemberIdEqualTo(memberId);
		List<SyCircleMember> circleMembers = this.syCircleMemberMapper.selectByExample(cmExample);
		if (!CollectionUtils.isEmpty(circleMembers)) {
			return circleMembers.get(0);
		}
		return null;
	}


	@Override
	public SyMember getMemberInfoByMemberName(String memberName) throws CoreServiceException {
		SyMemberExample syMemberExample = new SyMemberExample();
		syMemberExample.createCriteria().andMemberNameEqualTo(memberName);
		List<SyMember> members = syMemberMapper.selectByExample(syMemberExample);
		if(!CollectionUtils.isEmpty(members)){
			return members.get(0);
		}
		return null;
	}

	@Override
	public SyMember getMemberByToken(String token) {
		String memberId = "";
		Object memberidO = stringRedisTemplate.opsForHash().get(AuthConstant.RedisKey.USER_SESSION_TOKEN_PRE + token, "member_id");
		memberId = ObjectUtils.isEmpty(memberidO) ? null : memberidO.toString();
		if(StringUtils.isEmpty(memberId)){
			SyMbUserTokenExample mbUserTokenExample = new SyMbUserTokenExample();
			mbUserTokenExample.createCriteria().andTokenEqualTo(token);
			List<SyMbUserToken> syMbUserTokens = syMbUserTokenMapper.selectByExample(mbUserTokenExample);
			if(!ObjectUtils.isEmpty(syMbUserTokens)){
				memberId = syMbUserTokens.get(0).getMemberId().toString();
			}
		}
		SyMemberWithBLOBs syMember = null;
		if(!StringUtils.isEmpty(memberId)){
			syMember = syMemberMapper.selectByPrimaryKey(Integer.parseInt(memberId));
		}
		return syMember;
	}

	
	@Override
	public List<MemberBo> getPoorListBySupportMemberId(Integer memberId) {
		
		List<MemberBo> mInfoList = new ArrayList<>();
		MemberBo memberInfo = null;
		
		Map<String, Object> dataMap = new HashMap<>();
		dataMap.put("memberId", memberId);
		//dataMap.put("channel", channel);
		List<SyMember> list = syMemberMapper.selectPoorListBySupportMemberId(dataMap);
		
		if (!CollectionUtils.isEmpty(list)) {
			//mInfoList = new ArrayList<>();
			 for (SyMember m : list) {
				 memberInfo = new MemberBo();
				BeanUtils.copyProperties(m, memberInfo);
				//会员头像路径拼接
				memberInfo.setMemberAvatar(ImageUtil.getPoorHeadImgUrl(m.getMemberAvatar(), m.getMemberSex()));
				//touch_url 
				memberInfo.setTouchUrl(ImageUtil.getHeadImgClickedUrl(memberInfo.getMemberId()));
				mInfoList.add(memberInfo);
			}
			return mInfoList;
		}
		 
		 return mInfoList;
	}
	
	@Override
	public Integer getBocPointsRankByMemberId(Integer memberId) {
		
		SyMemberExample memberExample = new SyMemberExample();
		memberExample.createCriteria().andMemberIdEqualTo(memberId);
		List<SyMember> selectByExample = this.syMemberMapper.selectByExample(memberExample);
		if (!CollectionUtils.isEmpty(selectByExample)) {
			return selectByExample.get(0).getBocPointsRank();
		}
		
		return 0;
	}
	
	@Override
	public Integer getInviteNumByMember(Integer memberId) {
		
		SyInviteCircleLogExample inviteCircleLogExample = new SyInviteCircleLogExample();
		inviteCircleLogExample.createCriteria().andInvMemberIdEqualTo(memberId);
		
		return this.syInviteCircleLogMapper.countByExample(inviteCircleLogExample);
	}
	


	@Override
	public SyMember getMemberInfoByWxOpenId(String wxOpenId) throws CoreServiceException {
		SyWXAcountExample syWXAcountExample = new SyWXAcountExample();
		syWXAcountExample.createCriteria().andMemberWxopenidEqualTo(wxOpenId);
		List<SyWXAcount> records = this.syWxAccountMapper.selectByExample(syWXAcountExample);
		Integer memberId = 0;
		if(!CollectionUtils.isEmpty(records)){
			for (SyWXAcount syWXAcount : records) {
				if(!ObjectUtils.isEmpty(syWXAcount.getMemberId())){
					memberId = syWXAcount.getMemberId();
					break;
				}
			}
		}
		SyMember syMembers = this.syMemberMapper.selectByPrimaryKey(memberId);
		if(!ObjectUtils.isEmpty(syMembers)){
			return syMembers;
		}
		return null;
	}


	@Override
	public String getAgentRoleName(Integer goodsProjectType, Integer assistId, Integer publisherId)
			throws CoreServiceException {
		String name="";
		switch (goodsProjectType) {
		case 17:
			if(assistId>0) {
				name="集采";
			}else {
				SyRole roleAgent = this.getRoleAgent(publisherId);
				if(!ObjectUtils.isEmpty(roleAgent)) {
					name="助理人";
				}else if(!ObjectUtils.isEmpty(this.getPoorInfo(publisherId))) {
					name="贫困户";
				}
			}
			break;	
		case 24:
			name="善企";
			break;
		default:
			break;
		}
		return name;
	}


	@Override
	public String getUnpayOrderDetailTopText(Integer goodsProjectType, Integer assistId, Integer publisherId)
			throws CoreServiceException {
		String text="";
		switch (goodsProjectType) {
		case 17:
			if(!ObjectUtils.isEmpty(this.getPoorInfo(publisherId))) {
				text="贫困地区物流困难，发货速度可能较慢";
			}
			break;	
		case 24:
			break;
		}
		return text;
	}


	@Override
	public String getUnpayOrderDetailBottomText(Integer goodsProjectType, Integer assistId, Integer publisherId)
			throws CoreServiceException {
		String text="";
		switch (goodsProjectType) {
		case 17:
			if(assistId > 0) {
				text="电子扶贫码可用";
			}
			break;	
		case 24:
			break;
		}
		return text;
	}
	/**
	 * 显示用户真实姓名
	 * @author zy
	 * @param member
	 * @return
	 */
	@Override
	public  String getUserTrueName(SyMember member) {
		String truename="";
		if(!ObjectUtils.isEmpty(member)) {
			truename = ValidUtil.validPhone(member.getMemberTruename())?ValidUtil.getUserDispMobile(member.getMemberTruename()):
				member.getMemberTruename();
			if(ObjectUtils.isEmpty(truename)) {
				truename = member.getMemberDispName();
			}
			if(ObjectUtils.isEmpty(truename)) {
				truename = ValidUtil.validPhone(member.getMemberName())?
						ValidUtil.getUserDispMobile(member.getMemberName()):member.getMemberName();
			}
		}
		return truename;
	}


	@Override
	public SyMember getMemberInfoByMobile(String mobile) {
		SyMemberExample syMemberExample = new SyMemberExample();
		syMemberExample.createCriteria().andMemberMobileEqualTo(mobile);
		List<SyMember> list = this.syMemberMapper.selectByExample(syMemberExample);
		if(!CollectionUtils.isEmpty(list)){
			return list.get(0);
		}
		return null;
	}
	/**
	 * 获取用户基本信息
	 */
	@Override
	public UserBaseinfo getUserBaseinfo(SyMember member, String channel) throws CoreServiceException {
		UserBaseinfo baseinfo = new UserBaseinfo();
		//初始化userBaseinfo
		this.initBaseinfo(baseinfo,member);
		//初始化用户角色信息
		this.initRoleinfo(baseinfo,member,channel);
		
		return baseinfo;
	}
	/**
	 * 初始化userBaseinfo的角色信息
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return void
	 * @throws
	 */
	private void initRoleinfo(UserBaseinfo baseinfo, SyMember member, String channel) {
		Integer memberId = member.getMemberId();
		//是否部门管理员
		boolean isAdmin = this.isAdminBoc(memberId);
		//是否团组织管理员
		boolean isOrgAdmin = this.isOrgAdmin(memberId);
		
		baseinfo.setAdmin(isAdmin);
		baseinfo.setOrgAdmin(isOrgAdmin);
		
		//是否助理人
		SyRole agent = this.getAgent(memberId);
		if(!ObjectUtils.isEmpty(agent)){
			String roleNamePrefix = StringUtils.isEmpty(member.getMemberAreainfo()) ? "" : member.getMemberAreainfo();
			baseinfo.setRoleName(roleNamePrefix + " 扶贫助理人");
			baseinfo.setCode(UserConstant.UserRoleType.USER_ROLE_AGENT_USER + "");
			return;
		}
		
		//是否是贫困户
		SyPoor poor = this.getPoor(memberId);
		if(!ObjectUtils.isEmpty(poor)){
			String addr = (StringUtils.isEmpty(poor.getpAddr1()) ? "" : poor.getpAddr1()) + " "
				+ (StringUtils.isEmpty(poor.getpAddr2()) ? "" : poor.getpAddr2()) + " "
				+ (StringUtils.isEmpty(poor.getpAddr3()) ? "" : poor.getpAddr3()) + " ";		
			baseinfo.setRoleName(addr + " 贫困户");
			baseinfo.setCode(UserConstant.UserRoleType.USER_ROLE_POOR_USER + "");
			//我的帮扶人
			
			return;
		}
		
		//我关注的贫困户
		String noticePoor = "";
		List<SupportPoorBo> supportPoors = this.syPoorSupporterMapper.getMySupportPoorList(memberId,channel);
		if(!ObjectUtils.isEmpty(supportPoors)){
			if(supportPoors.size()>3){
				noticePoor = supportPoors.get(0).getTrueName() + "," 
						+ supportPoors.get(1).getTrueName() + "," 
						+supportPoors.get(2).getTrueName();
			}else{
				for (SupportPoorBo bo : supportPoors) {
					noticePoor += bo.getTrueName();
				}
			}
		}
		baseinfo.setNoticePoor(noticePoor);
		
		//获取扶贫联盟的circleMember信息
		SyCircleMember circleMember = this.getBocAllianceMemberInfo(memberId);
		//员工
		if(!ObjectUtils.isEmpty(circleMember) && UserConstant.CircleClub.CIRCLE_ID_WEAL_CLUB != circleMember.getCircleId()){
			String circleNamePrefix = StringUtils.isEmpty(circleMember.getCircleName()) ? "" : circleMember.getCircleName();
			baseinfo.setRoleName(circleNamePrefix + " 员工");
			baseinfo.setCode(UserConstant.UserRoleType.USER_ROLE_EMPLOYEE_USER + "");
			return;
		}
		//益客
		if(!ObjectUtils.isEmpty(circleMember) && UserConstant.CircleClub.CIRCLE_ID_WEAL_CLUB == circleMember.getCircleId()){
			SyInviteCircleMember inviteCircleMember = this.getInviteCircleMemberByMemberId(memberId);
			if(!ObjectUtils.isEmpty(inviteCircleMember) && !ObjectUtils.isEmpty(inviteCircleMember.getInviteMemberId())) {
				SyCircle circle = this.syCircleMapper.selectByPrimaryKey(inviteCircleMember.getCircleId());
				String circlePrefix = "";
				if(!ObjectUtils.isEmpty(circle)){
					circlePrefix = StringUtils.isEmpty(circle.getCircleName()) ? "" : circle.getCircleName();
				}
				baseinfo.setRoleName(circlePrefix + " 益客");
				baseinfo.setCode(UserConstant.UserRoleType.USER_ROLE_CODE_YIKE_USER + "");
				return;
			}else{
				baseinfo.setRoleName("中国银行  益客");
				baseinfo.setCode(UserConstant.UserRoleType.USER_ROLE_NOCODE_YIKE_USER + "");
				return;
			}
		}
		//普通员工
		if(ObjectUtils.isEmpty(circleMember)){
			baseinfo.setRoleName("普通用户");
			baseinfo.setCode(UserConstant.UserRoleType.USER_ROLE_COMMON_USER + "");
			return;
		}
	}
	/**
	 * 根据memberId获取SyInviteCircleMember信息
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return SyInviteCircleMember
	 * @throws
	 */
	private SyInviteCircleMember getInviteCircleMemberByMemberId(
			Integer memberId) {
		SyInviteCircleMemberExample example = new SyInviteCircleMemberExample();
		example.createCriteria().andMemberIdEqualTo(memberId);
		List<SyInviteCircleMember> list = this.syInviteCircleMemberMapper.selectByExample(example);
		if(!ObjectUtils.isEmpty(list)){
			return list.get(0);
		}
		return null;
	}
	/**
	 * 获取扶贫联盟的circleMember信息
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return SyCircleMember
	 * @throws
	 */
	private SyCircleMember getBocAllianceMemberInfo(Integer memberId) {
		List<String> bocOrgs = this.syBocOrgMapper.selectDistinctOrgCode();
		SyCircleMemberExample example = new SyCircleMemberExample();
		if(ObjectUtils.isEmpty(bocOrgs)){
			example.createCriteria().andMemberIdEqualTo(memberId);
		}else {
			example.createCriteria().andMemberIdEqualTo(memberId).andCodeIn(bocOrgs);
		}
		List<SyCircleMember> list = this.syCircleMemberMapper.selectByExample(example);
		if(!ObjectUtils.isEmpty(list)){
			return list.get(0);
		}
		return null;
	}
	/**
	 * 判断是否贫困户
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return boolean
	 * @throws
	 */
	private SyPoor getPoor(Integer memberId) {
		SyPoorExample example = new SyPoorExample();
		example.createCriteria().andMemberIdEqualTo(memberId);
		List<SyPoor> list = this.syPoorMapper.selectByExample(example);
		if(!ObjectUtils.isEmpty(list))
			return list.get(0);
		return null;
	}
	/**
	 * 判断是否助理人
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return boolean
	 * @throws
	 */
	private SyRole getAgent(Integer memberId) {
		List<Byte> roleTypes = new ArrayList<Byte>();
		roleTypes.add(UserConstant.RoleType.ROLE_TYPE_COOP);
		roleTypes.add(UserConstant.RoleType.ROLE_TYPE_WS);
		roleTypes.add(UserConstant.RoleType.ROLE_TYPE_GOV);
		roleTypes.add(UserConstant.RoleType.ROLE_TYPE_INDUSTRY);
		
		SyRoleExample example = new SyRoleExample();
		example.createCriteria().andMemberIdEqualTo(memberId).andRoleTypeIn(roleTypes);
		List<SyRole> list = this.syRoleMapper.selectByExample(example);
		if(!ObjectUtils.isEmpty(list)){
			return list.get(0);
		}
		return null;
	}
	/**
	 * 判断是否团组织管理员
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return boolean
	 * @throws
	 */
	private boolean isOrgAdmin(Integer memberId) {
		SyGroupManagerExample example = new SyGroupManagerExample();
		example.createCriteria().andMemberIdEqualTo(memberId);
		List<SyGroupManager> list = this.syGroupManagerMapper.selectByExample(example);
		return !ObjectUtils.isEmpty(list);
	}
	/**
	 * 判断是否部门管理员
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return boolean
	 * @throws
	 */
	private boolean isAdminBoc(Integer memberId) {
		SyAdminBocExample example = new SyAdminBocExample();
		example.createCriteria().andMemberIdEqualTo(memberId);
		List<SyAdminBoc> list = this.syAdminBocMapper.selectByExample(example);
		return !ObjectUtils.isEmpty(list);
	}
	/**
	 * 初始化userBaseinfo
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return void
	 * @throws
	 */
	private void initBaseinfo(UserBaseinfo baseinfo, SyMember member) {
		baseinfo.setMemberId(member.getMemberId().toString());
		baseinfo.setUserName(member.getMemberTruename());
		baseinfo.setAvatarUrl(member.getMemberAvatar());
		baseinfo.setPoints(ObjectUtils.isEmpty(member.getBocPoints()) ? "0" :member.getBocPoints().toString());
		baseinfo.setDonation(ObjectUtils.isEmpty(member.getMemberContributeMoney()) ? "0" :member.getMemberContributeMoney().toString());
		baseinfo.setWallet(ObjectUtils.isEmpty(member.getAvailablePredeposit()) ? "0" :member.getAvailablePredeposit().toString());
		if(!StringUtils.isEmpty(member.getMemberTime())){
			long registTime = Long.parseLong(member.getMemberTime());
			long nowTime = System.currentTimeMillis()/1000;
			int day = (int) ((nowTime - registTime) / (60 * 60 * 24));
			baseinfo.setSupportDay(day + "");
		}
		baseinfo.setMemberQq(member.getMemberQq());
		baseinfo.setStoreTel(member.getMemberMobile());
	}
	@Override
	public SyMbUserToken getTokenInfoByToken(String token) throws CoreServiceException {
		SyMbUserTokenExample syMbUserTokenExample = new SyMbUserTokenExample();
		syMbUserTokenExample.createCriteria().andTokenEqualTo(token);
		List<SyMbUserToken> selectByExample = this.syMbUserTokenMapper.selectByExample(syMbUserTokenExample);
		if(!CollectionUtils.isEmpty(selectByExample)){
			return selectByExample.get(0);
		}
		return null;
	}
	
}
