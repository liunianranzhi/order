package com.shanyuan.platform.ms.core.store.bo;

public class StoreInfo {
	
	 /**
     * 会员id
     */
    private Integer memberId;

    /**
     * 会员名称
     */
    private String memberName;

    /**
     * 店主卖家用户名
     */
    private String sellerName;
    
    /**
     * 店铺等级
     */
    private Integer gradeId;

    /**
     * 身份证
     */
    private String storeOwnerCard;
    /**
     * 店铺名称
     */
    private String storeName;
    /**
     * 店铺分类
     */
    private Integer scId;
    /**
     * 店铺公司名称
     */
    private String storeCompanyName;

    /**
     * 地区id
     */
    private Integer areaId;
    /**
     * 地区内容，冗余数据
     */
    private String areaInfo;

    /**
     * 详细地区
     */
    private String storeAddress;
    /**
     * 邮政编码
     */
    private String storeZip;

    /**
     * 电话号码
     */
    private String storeTel;
    /**
     * 店铺状态，0关闭，1开启，2审核中
     */
    private Byte storeState;
    /**
     * 店铺时间
     */
    private String storeTime;
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public Integer getGradeId() {
		return gradeId;
	}
	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}
	public String getStoreOwnerCard() {
		return storeOwnerCard;
	}
	public void setStoreOwnerCard(String storeOwnerCard) {
		this.storeOwnerCard = storeOwnerCard;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public Integer getScId() {
		return scId;
	}
	public void setScId(Integer scId) {
		this.scId = scId;
	}
	public String getStoreCompanyName() {
		return storeCompanyName;
	}
	public void setStoreCompanyName(String storeCompanyName) {
		this.storeCompanyName = storeCompanyName;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public String getAreaInfo() {
		return areaInfo;
	}
	public void setAreaInfo(String areaInfo) {
		this.areaInfo = areaInfo;
	}
	public String getStoreAddress() {
		return storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
	public String getStoreZip() {
		return storeZip;
	}
	public void setStoreZip(String storeZip) {
		this.storeZip = storeZip;
	}
	public String getStoreTel() {
		return storeTel;
	}
	public void setStoreTel(String storeTel) {
		this.storeTel = storeTel;
	}
	public Byte getStoreState() {
		return storeState;
	}
	public void setStoreState(Byte storeState) {
		this.storeState = storeState;
	}
	public String getStoreTime() {
		return storeTime;
	}
	public void setStoreTime(String storeTime) {
		this.storeTime = storeTime;
	}
    
    



}
