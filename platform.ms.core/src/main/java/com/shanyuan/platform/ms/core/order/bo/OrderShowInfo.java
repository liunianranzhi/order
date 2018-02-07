package com.shanyuan.platform.ms.core.order.bo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.common.util.SerializeUtil;
import com.shanyuan.platform.ms.core.goods.bo.GoodsBo;
import com.shanyuan.platform.ms.core.user.po.CouponPayInfo;

public class OrderShowInfo {
	//订单金额要重新处理
		private BigDecimal allGoodsAmount=BigDecimal.ZERO;
		private String disOrderKey;
		private String orderMessage="";
		private BigDecimal storeDisCount ;//店铺优惠券 优惠金额
		private BigDecimal platformDiscount ;//平台优惠  优惠金额
		private BigDecimal couponPay =BigDecimal.ZERO ;//
		private Integer goodsProjectType;
		private Integer assistId;
		private String ownerType;
		private CouponPayInfo couponPayInfo;
		private Integer allBocPointsUsed=0;
		private BigDecimal orderAmount=BigDecimal.ZERO;
		private BigDecimal shipFee=BigDecimal.ZERO;
		private Integer orderGoodsNum = 0;
		List<GoodsBo> goodsInfoList=new ArrayList<GoodsBo>();
		
		public OrderShowInfo() {
			
		}
		/**goodsId
		 * goodsName
		 * goodsprice
		 * goodsnum
		 * @param goodsInfo
		 */
		public OrderShowInfo(DisOrderGoodsInfo ds) {
			this.allBocPointsUsed = ds.getAllBocPointsUsed();
			this.disOrderKey = ds.getDisOrderKey();
			this.allGoodsAmount = ds.getAllGoodsAmount();
			this.orderMessage = ds.getOrderMessage();
			this.couponPayInfo=ds.getCouponPayInfo();
			this.storeDisCount = ds.getStoreDisCount();
			this.platformDiscount = ds.getPlatformDiscount();
			this.shipFee = ds.getShipFee();
			this.orderAmount = ds.getOrderAmount();
			this.couponPay = ds.getCouponPay();
			List<GoodsInfo> goodsInfoList2 = ds.getGoodsInfoList();
			
			for(GoodsInfo gd :goodsInfoList2) {
				Integer goodsProjectType = gd.getGoodsProjectType();
				Integer assistId = gd.getAssistId();
				String ownerType = gd.getOwnerType();
				this.goodsProjectType = ObjectUtils.isEmpty(this.goodsProjectType)?goodsProjectType:this.goodsProjectType;
				this.assistId = ObjectUtils.isEmpty(this.assistId)?assistId:this.assistId;
				this.ownerType = ObjectUtils.isEmpty(this.ownerType)?ownerType:this.ownerType;
				GoodsBo bo=	new GoodsBo();
				BeanUtils.copyProperties(gd, bo);
				Integer goodsNum = gd.getGoodsNum();
				String goodsSpec1 = gd.getGoodsSpec();
				String goodsSpec2= SerializeUtil.getSpecUnSerialize(goodsSpec1);
				bo.setGoodsSpec(goodsSpec2);; 
				goodsNum =ObjectUtils.isEmpty(goodsNum)?0:goodsNum;
				this.orderGoodsNum += goodsNum;
				goodsInfoList.add(bo);
			}
		}
		
		public String getDisOrderKey() {
			return disOrderKey;
		}
		public void setDisOrderKey(String disOrderKey) {
			this.disOrderKey = disOrderKey;
		}
		public BigDecimal getCouponPay() {
			return couponPay;
		}
		public void setCouponPay(BigDecimal couponPay) {
			this.couponPay = couponPay;
		}
		public Integer getGoodsProjectType() {
			return goodsProjectType;
		}
		public void setGoodsProjectType(Integer goodsProjectType) {
			this.goodsProjectType = goodsProjectType;
		}
		public Integer getAssistId() {
			return assistId;
		}
		public void setAssistId(Integer assistId) {
			this.assistId = assistId;
		}
		public String getOwnerType() {
			return ownerType;
		}
		public void setOwnerType(String ownerType) {
			this.ownerType = ownerType;
		}
		public Integer getOrderGoodsNum() {
			return orderGoodsNum;
		}
		public void setOrderGoodsNum(Integer orderGoodsNum) {
			this.orderGoodsNum = orderGoodsNum;
		}
		public List<GoodsBo> getGoodsInfoList() {
			return goodsInfoList;
		}
		public void setGoodsInfoList(List<GoodsBo> goodsInfoList) {
			this.goodsInfoList = goodsInfoList;
		}
		public void setAllBocPointsUsed(Integer allBocPointsUsed) {
			this.allBocPointsUsed = allBocPointsUsed;
		}
		public BigDecimal getAllGoodsAmount() {
			return allGoodsAmount;
		}
		public void setAllGoodsAmount(BigDecimal allGoodsAmount) {
			this.allGoodsAmount = allGoodsAmount;
		}
		public CouponPayInfo getCouponPayInfo() {
			return couponPayInfo;
		}
		public void setCouponPayInfo(CouponPayInfo couponPayInfo) {
			this.couponPayInfo = couponPayInfo;
		}
		public BigDecimal getShipFee() {
			return shipFee;
		}
		public void setShipFee(BigDecimal shipFee) {
			if(shipFee==null) {
				shipFee=new BigDecimal(0.0);
			}
			this.shipFee = shipFee;
		}
		public BigDecimal getOrderAmount() {
			
			return this.allGoodsAmount.add(this.shipFee);
		}
		public void setOrderAmount(BigDecimal orderAmount) {
			this.orderAmount = orderAmount;
		}
		public String getOrderMessage() {
			return orderMessage;
		}
		public void setOrderMessage(String orderMessage) {
			this.orderMessage = orderMessage;
		}
		public Integer getAllBocPointsUsed() {
			return allBocPointsUsed;
		}
		public BigDecimal getStoreDisCount() {
			return storeDisCount;
		}
		public void setStoreDisCount(BigDecimal storeDisCount) {
			this.storeDisCount = storeDisCount;
		}
		public BigDecimal getPlatformDiscount() {
			return platformDiscount;
		}
		public void setPlatformDiscount(BigDecimal platformDiscount) {
			this.platformDiscount = platformDiscount;
		}
		@Override
		public String toString() {
			return "OrderShowInfo [allGoodsAmount=" + allGoodsAmount + ", disOrderKey=" + disOrderKey
					+ ", orderMessage=" + orderMessage + ", storeDisCount=" + storeDisCount + ", platformDiscount="
					+ platformDiscount + ", couponPayInfo=" + couponPayInfo + ", allBocPointsUsed=" + allBocPointsUsed
					+ ", orderAmount=" + orderAmount + ", shipFee=" + shipFee + ", orderGoodsNum=" + orderGoodsNum
					+ ", goodsInfoList=" + goodsInfoList + "]";
		}
		
		

}
