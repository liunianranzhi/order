package com.shanyuan.platform.ms.dao.user.entity;

/**
 * 描述:sy_address表的实体类
 * @version
 * @author:  k
 * @创建时间: 2017-10-17
 */
public class SyAddress {
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

    /**
     * 地址ID
     * @return address_id 地址ID
     */
    public Integer getAddressId() {
        return addressId;
    }

    /**
     * 地址ID
     * @param addressId 地址ID
     */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    /**
     * 会员ID
     * @return member_id 会员ID
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 会员ID
     * @param memberId 会员ID
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 会员姓名
     * @return true_name 会员姓名
     */
    public String getTrueName() {
        return trueName;
    }

    /**
     * 会员姓名
     * @param trueName 会员姓名
     */
    public void setTrueName(String trueName) {
        this.trueName = trueName == null ? null : trueName.trim();
    }

    /**
     * 地区ID
     * @return area_id 地区ID
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * 地区ID
     * @param areaId 地区ID
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    /**
     * 市级ID
     * @return city_id 市级ID
     */
    public Long getCityId() {
        return cityId;
    }

    /**
     * 市级ID
     * @param cityId 市级ID
     */
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    /**
     * 地区内容
     * @return area_info 地区内容
     */
    public String getAreaInfo() {
        return areaInfo;
    }

    /**
     * 地区内容
     * @param areaInfo 地区内容
     */
    public void setAreaInfo(String areaInfo) {
        this.areaInfo = areaInfo == null ? null : areaInfo.trim();
    }

    /**
     * 地址
     * @return address 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 座机电话
     * @return tel_phone 座机电话
     */
    public String getTelPhone() {
        return telPhone;
    }

    /**
     * 座机电话
     * @param telPhone 座机电话
     */
    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone == null ? null : telPhone.trim();
    }

    /**
     * 手机电话
     * @return mob_phone 手机电话
     */
    public String getMobPhone() {
        return mobPhone;
    }

    /**
     * 手机电话
     * @param mobPhone 手机电话
     */
    public void setMobPhone(String mobPhone) {
        this.mobPhone = mobPhone == null ? null : mobPhone.trim();
    }

    /**
     * 1默认收货地址
     * @return is_default 1默认收货地址
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * 1默认收货地址
     * @param isDefault 1默认收货地址
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    /**
     * 地址类型  0 为收货地址   1 为发货地址
     * @return address_type 地址类型  0 为收货地址   1 为发货地址
     */
    public Byte getAddressType() {
        return addressType;
    }

    /**
     * 地址类型  0 为收货地址   1 为发货地址
     * @param addressType 地址类型  0 为收货地址   1 为发货地址
     */
    public void setAddressType(Byte addressType) {
        this.addressType = addressType;
    }

    /**
     * 最后一级地区的ID
     * @return last_id 最后一级地区的ID
     */
    public Long getLastId() {
        return lastId;
    }

    /**
     * 最后一级地区的ID
     * @param lastId 最后一级地区的ID
     */
    public void setLastId(Long lastId) {
        this.lastId = lastId;
    }

	@Override
	public String toString() {
		return "SyAddress [addressId=" + addressId + ", memberId=" + memberId + ", trueName=" + trueName + ", areaId="
				+ areaId + ", cityId=" + cityId + ", areaInfo=" + areaInfo + ", address=" + address + ", telPhone="
				+ telPhone + ", mobPhone=" + mobPhone + ", isDefault=" + isDefault + ", addressType=" + addressType
				+ ", lastId=" + lastId + "]";
	}
    
}