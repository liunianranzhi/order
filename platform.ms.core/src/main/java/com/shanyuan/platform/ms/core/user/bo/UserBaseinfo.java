package com.shanyuan.platform.ms.core.user.bo;
/** 
 * @author  wang chunru 
 * @date    2017年11月22日 下午9:56:20 
 * @Description   
 */
public class UserBaseinfo {
	/**
	 * 用户id
	 */
	private String memberId;
	/**
	 * 头像
	 */
	private String avatarUrl;
	/**
	 * 姓名
	 */
	private String userName;
	/**
	 * 通道
	 */
	private String channelName;
	/**
	 * 加入天数
	 */
	private String supportDay;
	/**
	 * 积分
	 */
	private String points;
	/**
	 * qq
	 */
	private String memberQq;
	/**
	 * 店铺电话
	 */
	private String storeTel;
	/**
	 * 角色名称
	 */
	private String roleName;
	/**
	 * 钱包
	 */
	private String wallet;
	/**
	 * 捐赠
	 */
	private String donation;
	/**
	 * 关注的贫困户
	 */
	private String noticePoor;
	/**
	 * 关注的助理人
	 */
	private String noticeAgent;
	/**
	 * 用户身份标识
	 */
	private String code;
	/**
	 * 是否为管理员
	 */
	private boolean isAdmin = false;
	/**
	 * 是否组织管理员
	 */
	private boolean isOrgAdmin = false;
	/**
	 * 
	 */
	private boolean isBigBoss = false;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getAvatarUrl() {
		return avatarUrl;
	}
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getSupportDay() {
		return supportDay;
	}
	public void setSupportDay(String supportDay) {
		this.supportDay = supportDay;
	}
	public String getPoints() {
		return points;
	}
	public void setPoints(String points) {
		this.points = points;
	}
	public String getMemberQq() {
		return memberQq;
	}
	public void setMemberQq(String memberQq) {
		this.memberQq = memberQq;
	}
	public String getStoreTel() {
		return storeTel;
	}
	public void setStoreTel(String storeTel) {
		this.storeTel = storeTel;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getWallet() {
		return wallet;
	}
	public void setWallet(String wallet) {
		this.wallet = wallet;
	}
	public String getDonation() {
		return donation;
	}
	public void setDonation(String donation) {
		this.donation = donation;
	}
	public String getNoticePoor() {
		return noticePoor;
	}
	public void setNoticePoor(String noticePoor) {
		this.noticePoor = noticePoor;
	}
	public String getNoticeAgent() {
		return noticeAgent;
	}
	public void setNoticeAgent(String noticeAgent) {
		this.noticeAgent = noticeAgent;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public boolean isOrgAdmin() {
		return isOrgAdmin;
	}
	public void setOrgAdmin(boolean isOrgAdmin) {
		this.isOrgAdmin = isOrgAdmin;
	}
	public boolean isBigBoss() {
		return isBigBoss;
	}
	public void setBigBoss(boolean isBigBoss) {
		this.isBigBoss = isBigBoss;
	}
	
}
