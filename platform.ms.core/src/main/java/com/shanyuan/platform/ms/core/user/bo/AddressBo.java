package com.shanyuan.platform.ms.core.user.bo;

import java.io.Serializable;

public class AddressBo implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 地址ID
     */
    private Integer addressId;

    /**
     * 会员ID
     */
    private Integer memberId;

    /**
     * 会员姓名
     */
    private String trueName;

    /**
     * 省ID
     */
    private Long provinceId;
    /**
     * 地区ID
     */
    private Long areaId;

    /**
     * 市级ID
     */
    private Long cityId;

    /**
     * 地区内容
     */
    private String areaInfo;

    /**
     * 地址
     */
    private String address;

    /**
     * 座机电话
     */
    private String telPhone;

    /**
     * 手机电话
     */
    private String mobPhone;

    /**
     * 1默认收货地址
     */
    private String isDefault;

    /**
     * 地址类型  0 为收货地址   1 为发货地址
     */
    private Byte addressType;

    /**
     * 最后一级地区的ID
     */
    private Long lastId;

	public Long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public String getAreaInfo() {
		return areaInfo;
	}

	public void setAreaInfo(String areaInfo) {
		this.areaInfo = areaInfo;
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

	public String getMobPhone() {
		return mobPhone;
	}

	public void setMobPhone(String mobPhone) {
		this.mobPhone = mobPhone;
	}

	public String getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}

	public Byte getAddressType() {
		return addressType;
	}

	public void setAddressType(Byte addressType) {
		this.addressType = addressType;
	}

	public Long getLastId() {
		return lastId;
	}

	public void setLastId(Long lastId) {
		this.lastId = lastId;
	}

}
