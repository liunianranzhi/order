package com.shanyuan.platform.ms.dao.user.entity;
/** 
 * @author  wang chunru 
 * @date    2017年11月24日 下午1:47:42 
 * @Description   
 */
public class SupportPoorBo {
	/**
	 * 贫困户id
	 */
	private String poorId;
	/**
	 * 会员ID
	 */
	private String memberId;
	/**
	 * 真实姓名
	 */
	private String trueName;
	/**
	 * 贫困户家庭人数
	 */
	private String familyNum;
	/**
	 * 没有指定配额时，贫困户没人帮扶金额
	 */
	private String defaultMoney;
	/**
	 * 指定配额
	 */
	private String targetMoney;
	/**
	 * 已完成的配额
	 */
	private String finishMoney;
	public String getPoorId() {
		return poorId;
	}
	public void setPoorId(String poorId) {
		this.poorId = poorId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public String getFamilyNum() {
		return familyNum;
	}
	public void setFamilyNum(String familyNum) {
		this.familyNum = familyNum;
	}
	public String getDefaultMoney() {
		return defaultMoney;
	}
	public void setDefaultMoney(String defaultMoney) {
		this.defaultMoney = defaultMoney;
	}
	public String getTargetMoney() {
		return targetMoney;
	}
	public void setTargetMoney(String targetMoney) {
		this.targetMoney = targetMoney;
	}
	public String getFinishMoney() {
		return finishMoney;
	}
	public void setFinishMoney(String finishMoney) {
		this.finishMoney = finishMoney;
	}
	
}
