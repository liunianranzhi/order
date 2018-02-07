package com.shanyuan.platform.ms.core.order.bo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import com.alibaba.fastjson.JSON;
import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoods;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoodsCommon;

public class GoodsInfo {
		private Integer goodsId;
		private Integer goodsCommonid;

		private Integer storeId;
		private Integer brandId;//bu
		private BigDecimal goodsPrice ;
		private String goodsSpec;
		private Byte goodsState;
		private Byte goodsVerify;
		private Integer maxBuyNum;
		private String  goodsCode;
		private String goodsName;
		private Integer goodsClassId;//bu
		private String goodsImage;
		private Integer transportId;
		private BigDecimal bocPointsPrice  =new BigDecimal(0);;
		private Long goodsStorage;
		private Integer goodsProjectType;
		private Integer publisherId;
		private Integer sellerId;
		private String ownerType;
		private Integer assistId;
		private Integer bizOperationMid;
		private Byte poorType;
		private Integer poorMid;
		private Short mFeeRate;
		private String tradeMode;
		private Integer presellTime;
		private String specName;
		private String specValue;
		private String goodsAttr;
		
		private String channel;
		private Long supportCountyId;
		private Integer goodsNum;
		private BigDecimal goodsMoneyTotal  =new BigDecimal(0);
		private String storeName;
		private BigDecimal purchasePrice  =new BigDecimal(0);

		private Integer promotionsid;
		private String goodsType;


		private BigDecimal voucherGoodsAmount = BigDecimal.ZERO;
		//=========================
		private BigDecimal storeDiscount = BigDecimal.ZERO;
		private BigDecimal platDiscount = BigDecimal.ZERO;
		//=====================
		//卖家可以获得的积分
		 private 	BigDecimal sendPointRate;
		 private 	BigDecimal sendPoint;
		//贫困户可获得的金额
		 private 	BigDecimal helpRate;
		//贫困户可获得的金额
		 private 	BigDecimal helpFee;
		//公益捐赠的总和
	     private 	BigDecimal fundFee;
	 	//公益捐赠费率
	     private 	BigDecimal foundRate;
	     //by zy
	     
		//需要支付的积分 总积分
		 private 	Integer needPoint;
		 
		 private 	Integer needRate;
		 private 	String  touchUrl;
		//================================== by zy
		 private Byte wholesaleType;
	     private String wholesaleInfo;

		public Integer getPromotionsid() {
			return promotionsid;
		}
		public void setPromotionsid(Integer promotionsid) {
			this.promotionsid = promotionsid;
		}

		public String getGoodsType() {
			return goodsType;
		}
		public void setGoodsType(String goodsType) {
			this.goodsType = goodsType;
		}

		 public Byte getWholesaleType() {
			return wholesaleType;
		}
		public void setWholesaleType(Byte wholesaleType) {
			this.wholesaleType = wholesaleType;
		}
		
		public String getWholesaleInfo() {
			return wholesaleInfo;
		}
		public void setWholesaleInfo(String wholesaleInfo) {
			this.wholesaleInfo = wholesaleInfo;
		}
		public BigDecimal getStoreDiscount() {
				return storeDiscount;
			}
		public String getTouchUrl() {
			return touchUrl;
		}
		
		public void setTouchUrl(String touchUrl) {
			this.touchUrl = touchUrl;
		}
			public Integer getSellerId() {
			return sellerId;
		}
		public void setSellerId(Integer sellerId) {
			this.sellerId = sellerId;
		}
			public void setStoreDiscount(BigDecimal storeDiscount) {
				this.storeDiscount = storeDiscount;
			}
			public BigDecimal getPlatDiscount() {
				return platDiscount;
			}
			public void setPlatDiscount(BigDecimal platDiscount) {
				this.platDiscount = platDiscount;
			}
			public BigDecimal getSendPointRate() {
				return sendPointRate;
			}
			public void setSendPointRate(BigDecimal sendPointRate) {
				this.sendPointRate = sendPointRate;
			}
			public BigDecimal getSendPoint() {
				return sendPoint;
			}
			public void setSendPoint(BigDecimal sendPoint) {
				this.sendPoint = sendPoint;
			}
			public BigDecimal getHelpRate() {
				return helpRate;
			}
			public void setHelpRate(BigDecimal helpRate) {
				this.helpRate = helpRate;
			}
			public BigDecimal getHelpFee() {
				return helpFee;
			}
			public void setHelpFee(BigDecimal helpFee) {
				this.helpFee = helpFee;
			}
			public BigDecimal getFundFee() {
				return fundFee;
			}
			public void setFundFee(BigDecimal fundFee) {
				this.fundFee = fundFee;
			}
			public BigDecimal getFoundRate() {
				return foundRate;
			}
			public void setFoundRate(BigDecimal foundRate) {
				this.foundRate = foundRate;
			}
			public Integer getNeedPoint() {
				return needPoint;
			}
			public void setNeedPoint(Integer needPoint) {
				this.needPoint = needPoint;
			}
			public Integer getNeedRate() {
				return needRate;
			}
			public void setNeedRate(Integer needRate) {
				this.needRate = needRate;
			}
		 //================================ by  zy
		public GoodsInfo() {
			
		}
	
		//goodsinfo
		public GoodsInfo(SyGoods goods,SyGoodsCommon goodsCommon,Integer goodsNum) {
		    this.goodsId=goods.getGoodsId();
		    this.goodsCommonid=goodsCommon.getGoodsCommonid();
		    this.storeId=goodsCommon.getStoreId();
		    BigDecimal goodsPrice2 = goods.getGoodsPrice();
		    goodsPrice2 = ObjectUtils.isEmpty(goodsPrice2)?BigDecimal.ZERO:goodsPrice2;
		    Integer wholesaleNum2 = goodsCommon.getWholesaleNum();
		    Byte wholesaleType = goodsCommon.getWholesaleType();
		    this.goodsType="1";//默认
			this.promotionsid =0;//默认，活动价格的时候重置
		    
		    //零售价
		    Byte wType = ObjectUtils.isEmpty(wholesaleType)?OrderConstant.wholesaleType.retail:wholesaleType;
		    
		    //起批数量
		    wholesaleNum2 = ObjectUtils.isEmpty(wholesaleNum2)?0:wholesaleNum2;
		    //批发价
		    BigDecimal wholesalePrice = goods.getWholesalePrice();
	    	wholesalePrice = ObjectUtils.isEmpty(wholesalePrice)?BigDecimal.ZERO:wholesalePrice;
		    //判断是批发价
		    if(!ObjectUtils.isEmpty(goodsNum)&&OrderConstant.wholesaleType.all.equals(wType)&&goodsNum >= wholesaleNum2) {
		    	this.wholesaleType =wType;
		    	this.goodsPrice = wholesalePrice;
		    }else {
		    	this.goodsPrice= goodsPrice2;
		    	this.wholesaleType =OrderConstant.wholesaleType.retail;
		    }
		    
		    Map<String ,Object> wholesaleInfo2= new HashMap<String ,Object>();
		    wholesaleInfo2.put("retail_price", goodsPrice2);
		    wholesaleInfo2.put("wholesale_price", wholesalePrice);
		    //批发数量
		    wholesaleInfo2.put("wholesale_num", wholesaleNum2);
		    this.wholesaleInfo =JSON.toJSONString(wholesaleInfo2);
		    this.goodsSpec=goods.getGoodsSpec();
		    this.goodsState=goods.getGoodsState();
		    this.goodsVerify=goods.getGoodsVerify();
		    this.maxBuyNum=goods.getMaxBuyNum();
		    this.goodsCode=goods.getGoodsCode();
		    this.goodsName=goods.getGoodsName();
		    this.goodsClassId=goodsCommon.getGoodsCommonid();
		    this.goodsImage=goodsCommon.getGoodsImage();
		    this.transportId=goodsCommon.getTransportId();
		    this.bocPointsPrice=goods.getBocPointsPrice();
		    Long goodsStorage2 = goods.getGoodsStorage();
		    goodsStorage2 = ObjectUtils.isEmpty(goodsStorage2)?0L:goodsStorage2;
		    this.goodsStorage=goods.getGoodsStorage();
		    this.goodsProjectType=goodsCommon.getGoodsProjectType();
		    this.publisherId=goodsCommon.getPublisherId();
		    Integer bizOperationMid2 = goodsCommon.getBizOperationMid();
		    bizOperationMid2 = ObjectUtils.isEmpty(bizOperationMid2)?0:bizOperationMid2;
		    this.bizOperationMid=bizOperationMid2;
		    this.ownerType=goodsCommon.getOwnerType();
		    this.assistId=goodsCommon.getAssistId();
		    this.poorType= ObjectUtils.isEmpty(goodsCommon.getPoorType())?new Byte("0"):goodsCommon.getPoorType();
		    this.poorMid=goodsCommon.getPoorMid();
		    this.mFeeRate=goodsCommon.getmFeeRate();
		    this.tradeMode=goodsCommon.getTradeMode();
		    this.presellTime=goodsCommon.getPresellTime();
		    this.channel=goodsCommon.getChannel();
		    this.supportCountyId=goodsCommon.getSupportCountyId();
		    goodsNum=ObjectUtils.isEmpty(goodsNum)?0:goodsNum;
		    this.goodsNum=goodsNum;
		    this.purchasePrice=goods.getPurchasePrice();
		    this.goodsMoneyTotal=this.goodsPrice.multiply(new BigDecimal( this.goodsNum));
		    this.storeName=goodsCommon.getStoreName();
		    this.specName = goodsCommon.getSpecName();
		    this.specValue = goodsCommon.getSpecValue();
		    this.goodsAttr = goodsCommon.getGoodsAttr();
		}
		
		public void setGoodsMoneyTotal(BigDecimal goodsMoneyTotal) {
			this.goodsMoneyTotal = goodsMoneyTotal;
		}
		//新增=============start
		public String getSpecName() {
			return specName;
		}
		public void setSpecName(String specName) {
			this.specName = specName;
		}
		public String getSpecValue() {
			return specValue;
		}
		public void setSpecValue(String specValue) {
			this.specValue = specValue;
		}
		public String getGoodsAttr() {
			return goodsAttr;
		}
		public void setGoodsAttr(String goodsAttr) {
			this.goodsAttr = goodsAttr;
		}
		//新增=============end
		@Override
		public String toString() {
			return "GoodsInfo [goodsId=" + goodsId + ", goodsCommonid=" + goodsCommonid + ", storeId=" + storeId
					+ ", brandId=" + brandId + ", goodsPrice=" + goodsPrice + ", goodsSpec=" + goodsSpec
					+ ", goodsState=" + goodsState + ", goodsVerify=" + goodsVerify + ", maxBuyNum=" + maxBuyNum
					+ ", goodsCode=" + goodsCode + ", goodsName=" + goodsName + ", goodsClassId=" + goodsClassId
					+ ", goodsImage=" + goodsImage + ", transportId=" + transportId + ", bocPointsPrice="
					+ bocPointsPrice + ", goodsStorage=" + goodsStorage + ", goodsProjectType=" + goodsProjectType
					+ ", publisherId=" + publisherId + ", ownerType=" + ownerType + ", assistId=" + assistId
					+ ", bizOperationMid=" + bizOperationMid + ", poorType=" + poorType + ", poorMid=" + poorMid
					+ ", mFeeRate=" + mFeeRate + ", tradeMode=" + tradeMode + ", presellTime=" + presellTime
					+ ", channel=" + channel + ", supportCountyId=" + supportCountyId + ", goodsNum=" + goodsNum
					+ ", goodsMoneyTotal=" + goodsMoneyTotal + ", store_name=" + storeName + ", purchasePrice="
					+ purchasePrice + "]";
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
		  /**
	     * 采购价
	     * @return purchase_price 采购价
	     */
	    public BigDecimal getPurchasePrice() {
	        return purchasePrice;
	    }

	    /**
	     * 采购价
	     * @param purchasePrice 采购价
	     */
	    public void setPurchasePrice(BigDecimal purchasePrice) {
	        this.purchasePrice = purchasePrice;
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
		public Integer getBizOperationMid() {
			return bizOperationMid;
		}
		public void setBizOperationMid(Integer bizOperationMid) {
			this.bizOperationMid = bizOperationMid;
		}
		public String getDisOrderKey() {
			return this.storeId+"-"+this.publisherId+"-"+this.assistId+"-"+this.bizOperationMid;
		}
		public BigDecimal getGoodsMoneyTotal() {
			return goodsMoneyTotal;
		}
		public String getStoreName() {
			return storeName;
		}
		public void setStoreName(String storeName) {
			this.storeName =storeName;
		}
		public BigDecimal getVoucherGoodsAmount() {
			return voucherGoodsAmount;
		}
		public void setVoucherGoodsAmount(BigDecimal voucherGoodsAmount) {
			this.voucherGoodsAmount = voucherGoodsAmount;
		}
		
		
}
