package com.shanyuan.platform.ms.core.user.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.util.ObjectUtils;



/**
 * 相关用户信息封装
 * @author zhangwd
 *
 */

public class MemberInfo implements Serializable{

	private static final long serialVersionUID = -8665847922095484207L;

	/**
	 * 用户角色
	 */
	private String role;
	
	/**
	 * 角色英文名称  用于前端取值判断
	 */
	private String code;
	
	/**
	 * 是否为部门管理员
	 */
	private Boolean isAdmin;
	
	/**
	 * 是否为团组织管理员
	 */
	private Boolean isOrgAdmin;
	
	/**
	 * 是否登录
	 */
	private Boolean isLogin;
	
	/**
	 * 用户当前所在通道
	 */
	private String curChannel;
	
	/**
	 * 用户当前所在联盟名称
	 */
	private String curChannelText;
	
	/**
     * 中元积分 boc_points
     */
    private String bocPoints;
    
    /**
     * 会员头像
     */
    private String memberAvatar;
	
    /**
     * 取用户手机
     */
    private String memberMobile;
    
    /**
     * 取用户手机后4位
     */
    private String mobileFourNum;
    
    /**
     * 扶贫天数
     */
    private String supportDay;
    
    /**
     * 用户积分排名
     */
    private String deptRank;

    /**
     * 用户积分排名url
     */
    private String deptRankUrl;
    
    /**
     * 用户邀请益客人数
     */
    private String inviteNum;
    
    /**
     * 用户以支付订单数(不含退款)
     */
    private String buyNum;
    
    /**
     * 用户参与的公益项目次数（含义卖、捐款）
     */
    private String wealNum;
    
    /**
     * 用户 结队的贫困户
     */
    private List<MemberBo> poorMemberList;
    
    /**
     * 用户头像url
     * @return
     */
    private String realAvatar;
    
    /**
     * 用户信息完善url
     * @return
     */
    private String codeFalseUrl;
    
    /**
     * buyNum = 0 益客 公益消费 去逛逛url
     * @return
     */
    private String buyNumUrl;
    
    /**
     * wealNum = 0 益客 公益项目 去围观url
     * @return
     */
    private String wealNumUrl;
    
    /**
     * 邀请益客url
     * @return
     */
    private String InviteNumUrl;
    
    /**
     * bocPoints 查看积分url
     * @return
     */
    private String bocPointsUrl;
    
    /**
     * 结队贫困户url
     * @return
     */
    private String poorUrl;
    
    
    
	public String getPoorUrl() {
		return poorUrl == null ? "" : poorUrl;
	}

	public void setPoorUrl(String poorUrl) {
		this.poorUrl = poorUrl;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getBocPointsUrl() {
		return bocPointsUrl == null ? "" : bocPointsUrl;
	}

	public void setBocPointsUrl(String bocPointsUrl) {
		this.bocPointsUrl = bocPointsUrl;
	}

	public String getDeptRankUrl() {
		return deptRankUrl == null ? "" : deptRankUrl;
	}

	public void setDeptRankUrl(String deptRankUrl) {
		this.deptRankUrl = deptRankUrl;
	}

	public String getInviteNumUrl() {
		return InviteNumUrl == null ? "" : InviteNumUrl ;
	}

	public void setInviteNumUrl(String inviteNumUrl) {
		InviteNumUrl = inviteNumUrl;
	}

	public String getWealNumUrl() {
		return wealNumUrl == null ? "" : wealNumUrl;
	}

	public void setWealNumUrl(String wealNumUrl) {
		this.wealNumUrl = wealNumUrl;
	}

	public String getBuyNumUrl() {
		return buyNumUrl == null ? "" : buyNumUrl;
	}

	public void setBuyNumUrl(String buyNumUrl) {
		this.buyNumUrl = buyNumUrl;
	}

	public String getRole() {
		return role == null ? "" : role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCode() {
		return code == null ? "" : code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getIsAdmin() {
		return isAdmin == null ? false : isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Boolean getIsOrgAdmin() {
		return isOrgAdmin == null ? false : isOrgAdmin;
	}

	public void setIsOrgAdmin(Boolean isOrgAdmin) {
		this.isOrgAdmin = isOrgAdmin;
	}

	public Boolean getIsLogin() {
		return isLogin;
	}

	public void setIsLogin(Boolean isLogin) {
		this.isLogin = isLogin;
	}

	public String getCurChannel() {
		return curChannel == null ? "" : curChannel;
	}

	public void setCurChannel(String curChannel) {
		this.curChannel = curChannel;
	}

	public String getCurChannelText() {
		return curChannelText  == null ? "" : curChannelText;
	}

	public void setCurChannelText(String curChannelText) {
		this.curChannelText = curChannelText;
	}

	public String getBocPoints() {
		return bocPoints == null ? "" : bocPoints;
	}

	public void setBocPoints(String bocPoints) {
		this.bocPoints = bocPoints;
	}

	public String getMemberAvatar() {
		return memberAvatar == null ? "" : memberAvatar;
	}

	public void setMemberAvatar(String memberAvatar) {
		this.memberAvatar = memberAvatar;
	}

	public String getMemberMobile() {
		return memberMobile == null ? "" : memberMobile;
	}

	public void setMemberMobile(String memberMobile) {
		this.memberMobile = memberMobile;
	}

	public String getMobileFourNum() {
		return mobileFourNum == null ? "" : mobileFourNum;
	}

	public void setMobileFourNum(String mobileFourNum) {
		this.mobileFourNum = mobileFourNum;
	}

	public String getSupportDay() {
		return supportDay == null ? "" : supportDay;
	}

	public void setSupportDay(String supportDay) {
		this.supportDay = supportDay;
	}

	public String getDeptRank() {
		return deptRank == null ? "" : deptRank;
	}

	public void setDeptRank(String deptRank) {
		this.deptRank = deptRank;
	}

	public String getInviteNum() {
		return inviteNum == null ? "" : inviteNum;
	}

	public void setInviteNum(String inviteNum) {
		this.inviteNum = inviteNum;
	}

	public String getBuyNum() {
		return buyNum == null ? "" : buyNum;
	}

	public void setBuyNum(String buyNum) {
		this.buyNum = buyNum;
	}

	public String getWealNum() {
		return wealNum == null ? "" : wealNum;
	}

	public void setWealNum(String wealNum) {
		this.wealNum = wealNum;
	}

	public List<MemberBo> getPoorMemberList() {
		if (ObjectUtils.isEmpty(poorMemberList)) {
			poorMemberList = new ArrayList<>();
		}
		return poorMemberList;
	}

	public void setPoorMemberList(List<MemberBo> poorMemberList) {
		this.poorMemberList = poorMemberList;
	}

	public String getRealAvatar() {
		return realAvatar == null ? "" : realAvatar;
	}

	public void setRealAvatar(String realAvatar) {
		this.realAvatar = realAvatar;
	}

	public String getCodeFalseUrl() {
		return codeFalseUrl == null ? "" : codeFalseUrl;
	}

	public void setCodeFalseUrl(String codeFalseUrl) {
		this.codeFalseUrl = codeFalseUrl;
	}
	
	
	
}
