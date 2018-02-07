package com.shanyuan.platform.ms.core.goods.bo;

import java.math.BigDecimal;

import com.shanyuan.platform.ms.dao.goods.entity.SyGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;
/**
 * 商品信息
 * @author sunyue
 *
 */
public class SyGoodsBo {
	private Integer goodsId;
	private Integer goodsCommonid;
	private Integer storeId;
	private Integer brandId;
	private BigDecimal goodsPrice;
	private String goodsSpec;
	private Byte goodsState;
	private Byte goodsVerify;
	private Integer maxBuyNum;
	private String  goodsCode;
	private String goodsName;
	private Integer goodsClassId;
	private String goodsImage;
	private Integer transportId;
	private BigDecimal bocPointsPrice;
	private Long goodsStorage;
	private Integer goodsProjectType;
	private Integer publisherId;
	private String ownerType;
	private Integer assistId;
	private Byte poorType;
	private Integer poorMid;
	private Short mFeeRate;
	private String tradeMode;
	private Integer presellTime;
	private String channel;
	private Long supportCountyId;
	private Integer goodsNum;
	private BigDecimal goodsMoneyTotal;
	private String store_name;
	
	public SyGoodsBo() {
		
	}
	
	public SyGoodsBo(SyGoods goods,SyGoodsCommon goodsCommon,Integer goodsNum) {
	    this.goodsId=goods.getGoodsId();
	    this.goodsCommonid=goodsCommon.getGoodsCommonid();
	    this.storeId=goodsCommon.getStoreId();
	    this.goodsPrice= goods.getGoodsPrice();
	    this.goodsSpec=goods.getGoodsSpec();
	    this.goodsState=goods.getGoodsState();
	    this.goodsVerify=goods.getGoodsVerify();
	    this.maxBuyNum=goods.getMaxBuyNum();
	    this.goodsCode=goods.getGoodsCode();
	    this.goodsName=goodsCommon.getGoodsName();
	    this.goodsClassId=goodsCommon.getGoodsCommonid();
	    this.goodsImage=goodsCommon.getGoodsImage();
	    this.transportId=goodsCommon.getTransportId();
	    this.bocPointsPrice=goods.getBocPointsPrice();
	    this.goodsStorage=goods.getGoodsStorage();
	    this.goodsProjectType=goodsCommon.getGoodsProjectType();
	    this.publisherId=goodsCommon.getPublisherId();
	    this.ownerType=goodsCommon.getOwnerType();
	    this.assistId=goodsCommon.getAssistId();
	    this.poorType=goodsCommon.getPoorType();
	    this.poorMid=goodsCommon.getPoorMid();
	    this.mFeeRate=goodsCommon.getmFeeRate();
	    this.tradeMode=goodsCommon.getTradeMode();
	    this.presellTime=goodsCommon.getPresellTime();
	    this.channel=goodsCommon.getChannel();
	    this.supportCountyId=goodsCommon.getSupportCountyId();
	    this.goodsNum=goodsNum;
	    this.goodsMoneyTotal=this.goodsPrice.multiply(new BigDecimal( this.goodsNum));
	    this.store_name=goodsCommon.getStoreName();
		
	}
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public Integer getGoodsCommonid() {
		return goodsCommonid;
	}
	public void setGoodsCommonid(Integer goodsCommonid) {
		this.goodsCommonid = goodsCommonid;
	}
	public Integer getStoreId() {
		return storeId;
	}
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	public BigDecimal getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(BigDecimal goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public String getGoodsSpec() {
		return goodsSpec;
	}
	public void setGoodsSpec(String goodsSpec) {
		this.goodsSpec = goodsSpec;
	}
	public Byte getGoodsState() {
		return goodsState;
	}
	public void setGoodsState(Byte goodsState) {
		this.goodsState = goodsState;
	}
	public Byte getGoodsVerify() {
		return goodsVerify;
	}
	public void setGoodsVerify(Byte goodsVerify) {
		this.goodsVerify = goodsVerify;
	}
	public Integer getMaxBuyNum() {
		return maxBuyNum;
	}
	public void setMaxBuyNum(Integer maxBuyNum) {
		this.maxBuyNum = maxBuyNum;
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Integer getGoodsClassId() {
		return goodsClassId;
	}
	public void setGoodsClassId(Integer goodsClassId) {
		this.goodsClassId = goodsClassId;
	}
	public String getGoodsImage() {
		return goodsImage;
	}
	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}
	public Integer getTransportId() {
		return transportId;
	}
	public void setTransportId(Integer transportId) {
		this.transportId = transportId;
	}
	public BigDecimal getBocPointsPrice() {
		return bocPointsPrice;
	}
	public void setBocPointsPrice(BigDecimal bocPointsPrice) {
		this.bocPointsPrice = bocPointsPrice;
	}
	public Long getGoodsStorage() {
		return goodsStorage;
	}
	public void setGoodsStorage(Long goodsStorage) {
		this.goodsStorage = goodsStorage;
	}
	public Integer getGoodsProjectType() {
		return goodsProjectType;
	}
	public void setGoodsProjectType(Integer goodsProjectType) {
		this.goodsProjectType = goodsProjectType;
	}
	public Integer getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}
	public String getOwnerType() {
		return ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}
	public Integer getAssistId() {
		return assistId;
	}
	public void setAssistId(Integer assistId) {
		this.assistId = assistId;
	}
	public Byte getPoorType() {
		return poorType;
	}
	public void setPoorType(Byte poorType) {
		this.poorType = poorType;
	}
	public Integer getPoorMid() {
		return poorMid;
	}
	public void setPoorMid(Integer poorMid) {
		this.poorMid = poorMid;
	}
	public Short getmFeeRate() {
		return mFeeRate;
	}
	public void setmFeeRate(Short mFeeRate) {
		this.mFeeRate = mFeeRate;
	}
	public String getTradeMode() {
		return tradeMode;
	}
	public void setTradeMode(String tradeMode) {
		this.tradeMode = tradeMode;
	}
	public Integer getPresellTime() {
		return presellTime;
	}
	public void setPresellTime(Integer presellTime) {
		this.presellTime = presellTime;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public Long getSupportCountyId() {
		return supportCountyId;
	}
	public void setSupportCountyId(Long supportCountyId) {
		this.supportCountyId = supportCountyId;
	}
	public Integer getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}
	public String getDisOrderKey() {
		return this.storeId+"-"+this.publisherId+"-"+this.assistId;
	}
	public BigDecimal getGoodsMoneyTotal() {
		return goodsMoneyTotal;
	}
	public String getStoreName() {
		return store_name;
	}
	public void setStoreName(String storeName) {
		this.store_name =storeName;
	}
	

}
