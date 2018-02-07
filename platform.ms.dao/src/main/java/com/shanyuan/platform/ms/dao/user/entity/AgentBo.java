package com.shanyuan.platform.ms.dao.user.entity;

import java.io.Serializable;

public class AgentBo implements Serializable{
	
	
	
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
    private String imageUrl;
    
    /**
     * 会员性别
     */
    private Byte memberSex;

	/**
	 * 评分
	 */
	private Double storeScore;
	
	
	/**
	 * 点击路径
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

	
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Byte getMemberSex() {
		return memberSex;
	}

	public void setMemberSex(Byte memberSex) {
		this.memberSex = memberSex;
	}


	public Double getStoreScore() {
		return storeScore;
	}

	public void setStoreScore(Double storeScore) {
		this.storeScore = storeScore;
	}

	public String getTouchUrl() {
		return touchUrl;
	}

	public void setTouchUrl(String touchUrl) {
		this.touchUrl = touchUrl;
	}
	

	

	
	


	


	


	
	
	
	
	

}
