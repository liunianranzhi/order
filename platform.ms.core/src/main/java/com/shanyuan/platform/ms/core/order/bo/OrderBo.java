package com.shanyuan.platform.ms.core.order.bo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.common.util.OrderUtil;
import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.core.user.po.CouponPayInfo;


public class OrderBo {
	//订单金额要重新处理

	private String disOrderKey;
	private String OrderMessage="";
	private BigDecimal storeDisCount  = BigDecimal.ZERO;//店铺优惠券 优惠金额
	private BigDecimal platformDiscount  = BigDecimal.ZERO;//平台优惠  优惠金额
	private BigDecimal couponPay = BigDecimal.ZERO;
	private BigDecimal allGoodsAmount=BigDecimal.ZERO;
	private BigDecimal orderAmount=BigDecimal.ZERO;
	private BigDecimal shipFee=BigDecimal.ZERO;
	//贫困户可获得的总金额
	private BigDecimal poorSupportMoney = BigDecimal.ZERO;
	private Integer sendPoint = 0;//可获的的积分
	private Integer sendPointRate = 0;//可获的的积分
	private Integer allBocPointsUsed=0;//需要的积分
	private Integer helpRate=0;//需要的积分
	private Integer helpFee=0;//公益基金会费率 千分位
	private Integer foundRate=0;//贫困户帮扶金额
	private Integer foundFee=0;//公益基金会捐献金额
	private CouponPayInfo couponPayInfo;
	
	List<GoodsInfo> goodsInfoList=new ArrayList<GoodsInfo>();
	public void addGoodsInfo(GoodsInfo goodsInfo) {
		goodsInfoList.add(goodsInfo);
		BigDecimal goodsMoneyTotal = goodsInfo.getGoodsMoneyTotal();
		goodsMoneyTotal =ObjectUtils.isEmpty(goodsMoneyTotal)?new BigDecimal("0.00"):goodsMoneyTotal;
		allGoodsAmount =allGoodsAmount.add(goodsMoneyTotal);
		if(goodsInfo.getGoodsProjectType().compareTo(OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP)==0) {
			BigDecimal bocprice = goodsInfo.getBocPointsPrice();
			bocprice =ObjectUtils.isEmpty(bocprice)?BigDecimal.ZERO:bocprice;
			Integer goodsPoint =bocprice.multiply(OrderUtil.getBocPointsRate()).setScale(2, BigDecimal.ROUND_HALF_UP).intValue();
			Integer goodsNum = goodsInfo.getGoodsNum();
			goodsNum = ObjectUtils.isEmpty(goodsNum)?0:goodsNum;
			allBocPointsUsed += goodsPoint*goodsNum;
		}
	}
	public List<GoodsInfo> getGoodsInfoList(){
		return this.goodsInfoList;
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
		if(!ObjectUtils.isEmpty(couponPayInfo)) {
			BigDecimal totalCouponMoney = couponPayInfo.getTotalCouponMoney();
			this.couponPay = totalCouponMoney;
		}
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
		return OrderMessage;
	}
	public void setOrderMessage(String orderMessage) {
		OrderMessage = orderMessage;
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
	
	public String getDisOrderKey() {
		return disOrderKey;
	}
	public void setDisOrderKey(String disOrderKey) {
		this.disOrderKey = disOrderKey;
	}
	@Override
	public String toString() {
		return "DisOrderGoodsInfo [allGoodsAmount=" + allGoodsAmount + ", disOrderKey=" + disOrderKey
				+ ", OrderMessage=" + OrderMessage + ", storeDisCount=" + storeDisCount + ", platformDiscount="
				+ platformDiscount + ", couponPayInfo=" + couponPayInfo + ", allBocPointsUsed=" + allBocPointsUsed
				+ ", shipFee=" + shipFee + ", goodsInfoList=" + goodsInfoList + "]";
	}
	

}
