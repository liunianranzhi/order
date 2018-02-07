package com.shanyuan.platform.ms.core.user.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.util.ObjectUtils;


public class CouponPayInfo {
	private BigDecimal totalCouponMoney=new BigDecimal(0.00);
	private List<CouponPay> couponPayList=new ArrayList<CouponPay>();
	public void addDetail(String couponCode,Long couponBatchSn,BigDecimal pay) {
		totalCouponMoney =totalCouponMoney.add(pay);
		couponPayList.add(new CouponPay(couponCode,couponBatchSn,pay));
	}
	public class CouponPay{
		private String couponCode;
		private Long couponBatchSn;
		private BigDecimal pay;	
		public CouponPay(String couponCode,Long couponBatchSn,BigDecimal pay) {
			this.couponCode=couponCode;
			this.couponBatchSn=couponBatchSn;
			pay=ObjectUtils.isEmpty(pay)? BigDecimal.ZERO:pay;
			this.pay=pay;
		}
		public String getCouponCode() {
			return couponCode;
		}
		public Long getCouponBatchSn() {
			return couponBatchSn;
		}
		@Override
		public String toString() {
			return "CouponPay [couponCode=" + couponCode + ", couponBatchSn=" + couponBatchSn + ", pay=" + pay + "]";
		}
		public BigDecimal getPay() {
			return pay;
		}
		
		
	}
	public BigDecimal getTotalCouponMoney() {
		return totalCouponMoney;
	}	
	public List<CouponPay> getCouponPayList(){
		return this.couponPayList;
	}
	@Override
	public String toString() {
		return "CouponPayInfo [totalCouponMoney=" + totalCouponMoney + ", couponPayList=" + couponPayList + "]";
	}
	
}
