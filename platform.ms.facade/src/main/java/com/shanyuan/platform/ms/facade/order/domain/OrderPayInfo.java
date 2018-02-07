package com.shanyuan.platform.ms.facade.order.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;

import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
import com.shanyuan.platform.ms.dao.user.entity.SyAddress;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucher;

public class OrderPayInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4492469973220609069L;
	private String status;
	private String paySn;
	private String joinTime;
	private String startTime;
	private String executeTime;
	private String time;
	//
	private String voucherCode;
	private Integer voucherTid;
	private Integer voucherId;
	//
	private Integer memberId;
	private String memberTruename;
	private String addressTruename;
	private String addressAreaInfo;
	private String address;
	//
	private SyAddress addressInfo;
	private String telPhone;
	private String vourchType;
	private Map<Integer,BigDecimal> vourchGoods;
	private Integer sharedMid;
	private Integer sharedGoodsGommonid;
	private Integer needPoints;
	private Map<String,Object> newDisOrderGoodsInfoMap;
	
	
	public Integer getVoucherId() {
		return voucherId;
	}
	public void setVoucherId(Integer voucherId) {
		this.voucherId = voucherId;
	}
	public SyAddress getAddressInfo() {
		return addressInfo;
	}
	public void setAddressInfo(SyAddress addressInfo) {
		this.addressInfo = addressInfo;
	}
	public String getJoinTime() {
		return joinTime;
	}
	public void setJoinTime(String joinTime) {
		this.joinTime = joinTime;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getExecuteTime() {
		return executeTime;
	}
	public void setExecuteTime(String executeTime) {
		this.executeTime = executeTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPaySn() {
		return paySn;
	}
	public void setPaySn(String paySn) {
		this.paySn = paySn;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getVoucherCode() {
		return voucherCode;
	}
	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}
	public Integer getVoucherTid() {
		return voucherTid;
	}
	public void setVoucherTid(Integer voucherTid) {
		this.voucherTid = voucherTid;
	}
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
	public String getAddressTruename() {
		return addressTruename;
	}
	public void setAddressTruename(String addressTruename) {
		this.addressTruename = addressTruename;
	}
	public String getAddressAreaInfo() {
		return addressAreaInfo;
	}
	public void setAddressAreaInfo(String addressAreaInfo) {
		this.addressAreaInfo = addressAreaInfo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelPhone() {
		return telPhone;
	}
	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}
	public String getVourchType() {
		return vourchType;
	}
	public void setVourchType(String vourchType) {
		this.vourchType = vourchType;
	}
	public Map<Integer, BigDecimal> getVourchGoods() {
		return vourchGoods;
	}
	public void setVourchGoods(Map<Integer, BigDecimal> vourchGoods) {
		this.vourchGoods = vourchGoods;
	}
	public Integer getSharedMid() {
		return sharedMid;
	}
	public void setSharedMid(Integer sharedMid) {
		this.sharedMid = sharedMid;
	}
	public Integer getSharedGoodsGommonid() {
		return sharedGoodsGommonid;
	}
	public void setSharedGoodsGommonid(Integer sharedGoodsGommonid) {
		this.sharedGoodsGommonid = sharedGoodsGommonid;
	}
	public Integer getNeedPoints() {
		return needPoints;
	}
	public void setNeedPoints(Integer needPoints) {
		this.needPoints = needPoints;
	}
	public Map<String, Object> getNewDisOrderGoodsInfoMap() {
		return newDisOrderGoodsInfoMap;
	}
	public void setNewDisOrderGoodsInfoMap(Map<String, Object> newDisOrderGoodsInfoMap) {
		this.newDisOrderGoodsInfoMap = newDisOrderGoodsInfoMap;
	}
		
}