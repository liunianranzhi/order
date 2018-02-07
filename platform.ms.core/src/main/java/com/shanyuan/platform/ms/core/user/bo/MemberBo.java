package com.shanyuan.platform.ms.core.user.bo;

import java.io.Serializable;

/**
 * 贫困户基本信息封装
 * @author zhangwd
 *
 */
public class MemberBo implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	/**
     * 会员id
     */
    private Integer memberId;
    
    /**
     * 真实姓名
     */
    private String memberTruename;
    
    /**
     * 会员头像
     */
    private String memberAvatar;
    
    /**
     * 会员性别
     */
    private Byte memberSex;
    
	/**
	 * 贫困户头像点击url
	 */
    private String touchUrl;

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getMemberTruename() {
		return memberTruename;
	}

	public void setMemberTruename(String memberTruename) {
		this.memberTruename = memberTruename;
	}

	public String getMemberAvatar() {
		return memberAvatar;
	}

	public void setMemberAvatar(String memberAvatar) {
		this.memberAvatar = memberAvatar;
	}

	public Byte getMemberSex() {
		return memberSex;
	}

	public void setMemberSex(Byte memberSex) {
		this.memberSex = memberSex;
	}

	public String getTouchUrl() {
		return touchUrl;
	}

	public void setTouchUrl(String touchUrl) {
		this.touchUrl = touchUrl;
	}
    
    
}
