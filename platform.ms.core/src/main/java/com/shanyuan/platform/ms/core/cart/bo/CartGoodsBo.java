package com.shanyuan.platform.ms.core.cart.bo;

import java.io.Serializable;
import java.math.BigDecimal;

/***
 * 
 * @author 钟颖
 *
 */
public class CartGoodsBo  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String image; 
	private String goodsimage; 
	private String goodsName; 
	private String orderKey; 
	private Integer goodsStorge;

	private Integer goodsId ;
	private Integer storeId ;
	private Integer assistId ;
	private Integer publisherId ;
	private Integer bizOperationMid;
	private String ownerType;

	private Integer goodsCommonId ;
	private Integer goodsProjectType;
	private BigDecimal goodsPrice;;
	private Integer goodsNum;
	private Integer cartId;
	private String checked;
	private String  storeName;
	private String  wholesaleType;
	private String  topicStatus;
	private String  isDailylimited;
	private String  startTime;
	private BigDecimal wholesalePrice;
	private boolean state ;
	private boolean storageState ;
	private Integer wholesaleNum;
	private Integer maxBuyNum;
	private Integer haveBuyNum;


	public String getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public String getIsDailylimited() {
		return isDailylimited;
	}
	public void setIsDailylimited(String isDailylimited) {
		this.isDailylimited = isDailylimited;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getTopicStatus() {
		return topicStatus;
	}
	public void setTopicStatus(String topicStatus) {
		this.topicStatus = topicStatus;
	}
	public String getGoodsimage() {
		return goodsimage;
	}
	public void setGoodsimage(String goodsimage) {
		this.goodsimage = goodsimage;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public Integer getAssistId() {
		return assistId;
	}
	public void setAssistId(Integer assistId) {
		this.assistId = assistId;
	}
	public Integer getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}
	public Integer getBizOperationMid() {
		return bizOperationMid;
	}
	public void setBizOperationMid(Integer bizOperationMid) {
		this.bizOperationMid = bizOperationMid;
	}
	public Integer getStoreId() {
		return storeId;
	}
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	public Integer getGoodsCommonId() {
		return goodsCommonId;
	}
	public void setGoodsCommonId(Integer goodsCommonId) {
		this.goodsCommonId = goodsCommonId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public String getOrderKey() {
		return orderKey;
	}
	public void setOrderKey(String orderKey) {
		this.orderKey = orderKey;
	}
	public Integer getGoodsStorge() {
		return goodsStorge;
	}
	public void setGoodsStorge(Integer goodsStorge) {
		this.goodsStorge = goodsStorge;
	}
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public Integer getGoodsProjectType() {
		return goodsProjectType;
	}
	public void setGoodsProjectType(Integer goodsProjectType) {
		this.goodsProjectType = goodsProjectType;
	}
	public BigDecimal getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(BigDecimal goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public Integer getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public String getChecked() {
		return checked;
	}
	public void setChecked(String checked) {
		this.checked = checked;
	}
	public String getWholesaleType() {
		return wholesaleType;
	}
	public void setWholesaleType(String wholesaleType) {
		this.wholesaleType = wholesaleType;
	}
	public BigDecimal getWholesalePrice() {
		return wholesalePrice;
	}
	public void setWholesalePrice(BigDecimal wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public boolean isStorageState() {
		return storageState;
	}
	public void setStorageState(boolean storageState) {
		this.storageState = storageState;
	}
	public Integer getWholesaleNum() {
		return wholesaleNum;
	}
	public void setWholesaleNum(Integer wholesaleNum) {
		this.wholesaleNum = wholesaleNum;
	}
	public Integer getMaxBuyNum() {
		return maxBuyNum;
	}
	public void setMaxBuyNum(Integer maxBuyNum) {
		this.maxBuyNum = maxBuyNum;
	}
	public Integer getHaveBuyNum() {
		return haveBuyNum;
	}
	public void setHaveBuyNum(Integer haveBuyNum) {
		this.haveBuyNum = haveBuyNum;
	}
	@Override
	public String toString() {
		return "CartGoodsBo [image=" + image + ", goodsimage=" + goodsimage + ", goodsName=" + goodsName + ", orderKey="
				+ orderKey + ", goodsStorge=" + goodsStorge + ", goodsId=" + goodsId + ", storeId=" + storeId
				+ ", assistId=" + assistId + ", publisherId=" + publisherId + ", bizOperationMid=" + bizOperationMid
				+ ", goodsCommonId=" + goodsCommonId + ", goodsProjectType=" + goodsProjectType + ", goodsPrice="
				+ goodsPrice + ", goodsNum=" + goodsNum + ", cartId=" + cartId + ", checked=" + checked + ", storeName="
				+ storeName + ", wholesaleType=" + wholesaleType + ", topicStatus=" + topicStatus + ", isDailylimited="
				+ isDailylimited + ", startTime=" + startTime + ", wholesalePrice=" + wholesalePrice + ", state="
				+ state + ", storageState=" + storageState + ", wholesaleNum=" + wholesaleNum + ", maxBuyNum="
				+ maxBuyNum + ", haveBuyNum=" + haveBuyNum + "]";
	}

}
