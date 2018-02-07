package com.shanyuan.platform.ms.core.user;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.user.bo.MemberBo;
import com.shanyuan.platform.ms.core.user.bo.MemberRoleInfo;
import com.shanyuan.platform.ms.core.user.bo.UserBaseinfo;
import com.shanyuan.platform.ms.dao.auth.entity.SyMbUserToken;
import com.shanyuan.platform.ms.dao.store.entity.SyCircleMember;
import com.shanyuan.platform.ms.dao.user.entity.SyAdminBoc;
import com.shanyuan.platform.ms.dao.user.entity.SyGroupManager;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.entity.SyPoor;
import com.shanyuan.platform.ms.dao.user.entity.SyRole;
import com.shanyuan.platform.ms.dao.user.entity.SyShopAccount;

/**
 * 用户相关接口
 * @author zhangwd
 *
 */
public interface UserCorrelationService {
	/**
	 * 显示用户真实姓名
	 * @author zy
	 * @param member
	 * @return
	 */
	public  String getUserTrueName(SyMember member);

	/**
	 * 获得会员map
	 * @auther zhongying
	 * @param memberIds
	 * @return
	 * @throws CoreServiceException
	 */
	Map<Integer,SyMember> getMemberMap(List<Integer>  memberIds) throws CoreServiceException;

	/**
	 * @auther zhongying
	 * @param memberIds
	 * @return
	 * @throws CoreServiceException
	 */
	Map<Integer,String> getMemberTrueNames(List<Integer>  memberIds) throws CoreServiceException;
	/**
	 *
	 * 获取待支付订单详情的底部文案
	 * @author zy
	 * @param goodsProjectType
	 * @param assistId
	 * @param publisherId
	 * @return
	 * @throws CoreServiceException
	 */
	String getUnpayOrderDetailBottomText(Integer goodsProjectType, Integer assistId, Integer publisherId) throws CoreServiceException;
	/**
	 * 获取待支付订单详情的顶部文案
	 * @author zy
	 * @param goodsProjectType
	 * @param assistId
	 * @param publisherId
	 * @return
	 * @throws CoreServiceException
	 */
	String getUnpayOrderDetailTopText(Integer goodsProjectType, Integer assistId, Integer publisherId) throws CoreServiceException;
	/**
	 * 获取产品所有者的身份标签
	 * @author zy
	 * @param goodsProjectType
	 * @param assistId
	 * @param publisherId
	 * @return
	 * @throws CoreServiceException
	 */
	String getAgentRoleName(Integer goodsProjectType, Integer assistId, Integer publisherId) throws CoreServiceException;
	
	/**
	 * 获取用户信息
	 * @return
	 * @throws Exception
	 */
	SyMember getMemberInfo(Integer  memberId) throws CoreServiceException;
	
	/**
	 * 根据用户名获取用户信息
	 * @param memberName
	 * @return
	 * @throws CoreServiceException
	 */
	SyMember getMemberInfoByMemberName(String memberName) throws CoreServiceException;
	
	/**
	 * 根据微信openID获取用户信息
	 * @param wxOpenId
	 * @return
	 * @throws CoreServiceException
	 */
	SyMember getMemberInfoByWxOpenId(String wxOpenId) throws CoreServiceException;
	
	/**
	 * 查询组织机构信息
	 * @param member_id
	 * @return
	 * @throws Exception
	 */
	SyCircleMember getCircleInfoOnlyBocOrg(Integer member_id) throws CoreServiceException;
	
	/**
	 * 查询贫困户信息
	 * @param memberId
	 * @return
	 * @throws Exception
	 */
	SyPoor getPoorInfo(Integer memberId) throws CoreServiceException;
	
	/**
	 * 查询用户角色类型信息（代理人角色）
	 * @param member_id
	 * @return
	 * @throws CoreServiceException
	 */
	SyRole getRoleAgent(Integer member_id) throws CoreServiceException;
	/**
	 * @author zy
	 * @param memberId
	 * @return
	 * @throws CoreServiceException
	 */
	SyShopAccount getVendor(Integer memberId) throws CoreServiceException;
	/**
	 * 获取用户 管理员
	 * @param member_id
	 * @return
	 * @throws CoreServiceException
	 */
	SyAdminBoc getAdminBoc(Integer member_id) throws CoreServiceException;
	
	/**
	 * 查询是否团组织管理员
	 * @param member_id
	 * @return
	 * @throws CoreServiceException
	 */
	SyGroupManager getGroupManager(Integer member_id) throws CoreServiceException;

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
	SyMember register(String userName ,String passwd,String mobile ,String trueName ,String idValue ,String channel, Byte memberSex ) throws CoreServiceException;
	
	/**
	 * 查询用户身份标识
	 * @param memberId
	 * @return
	 */
	MemberRoleInfo getMemberRoleInfo(Integer memberId);
	
	/**
	 * 根据token获取用户信息
	 * @param token
	 * @return
	 */
	SyMember getMemberByToken(String token);
	
	/**
	 * 获取帮扶人帮助的贫困户列表
	 * @param memberId 用户id
	 * @return  List<MemberBo>
	 * @author zhangwd
	 */
	List<MemberBo> getPoorListBySupportMemberId(Integer memberId);
	
	/**
	 * 获取用户中元积分总排名 
	 * @param memberId
	 * @return integer
	 * @author zhangwd
	 */
	Integer getBocPointsRankByMemberId(Integer memberId);
	
	/**
	 * 获取用户邀请的益客人数
	 * @param memberId
	 * @return
	 * @author zhangwd
	 */
	Integer getInviteNumByMember(Integer memberId);
	
	/**
	 * 根据用户id 查询用户部门信息
	 * @param memberId
	 * @author zhangwd
	 */
	SyCircleMember getCircleInfoByMemberId(Integer memberId);
	
	/**
	 * 根据手机号获取用户
	 * @param mobile
	 * @return
	 */
	SyMember getMemberInfoByMobile(String mobile);
	/**获得店主信息
	 * @author zhongying
	 * @param storeId
	 * @return
	 * @throws CoreServiceException
	 */
	List<SyMember> selectMemberByStoreIds(List<Integer>  storeId) throws CoreServiceException;
	/**
	 * @param channel 
	 * 获取用户基本信息
	 * @Author wang chunru
	 * @Description 
	 * @param 
	 * @return UserBaseinfo
	 * @throws
	 */
	public UserBaseinfo getUserBaseinfo(SyMember member, String channel) throws CoreServiceException ;
	
	/**
	 * @author yangjian 
	 * 根据token获取具体信息
	 * @param token
	 * @return
	 * @throws CoreServiceException
	 */
	public SyMbUserToken getTokenInfoByToken(String token) throws CoreServiceException;
}
