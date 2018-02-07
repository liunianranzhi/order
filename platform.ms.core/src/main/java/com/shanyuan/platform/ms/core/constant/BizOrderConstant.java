package com.shanyuan.platform.ms.core.constant;

/**
 * 集采订单
 * @author yangjian
 * @date 2018/01/03
 *
 */
public interface BizOrderConstant {
	
	/**
	 * 支付状态
	 * @author yangjian
	 *
	 */
	public interface PayStatus{
		/**
		 * 未支付
		 */
		public String UNPAY = "10";
		/**
		 * 买家确认
		 */
		public String BUYER_SURE = "20";
		/**
		 * 卖家确认
		 */
		public String SELLER_SURE = "30";
	}
	
	/**
	 * 商品订单发货状态
	 */
	public interface GoodsState{
		/**
		 * 待同意发货
		 */
		public String DELIVERY_AGREE = "10";
		
		/**
		 *待发货
		 */
		public String DELIVERY_SURE = "20";
		
		/**
		 * 已经发货
		 */
		public String DELIVERY_FINISH = "30";
		
		/**
		 * 已经全部发货
		 */
		public String DELIVERY_ALL_FINISH = "40";
		
		/**
		 * 已经收获
		 */
		public String TAKE_DELIVERY = "50";
	}
	
	/**
	 * 订单类型
	 */
	public interface OrderType{
		/**
		 * 购买集采已有的产品
		 */
		public String BIZ_HAVE_GOODS = "biz_have_goods";
		
		/**
		 * 集采意向产品
		 */
		public String BIZ_INTENTION_GOODS = "biz_intention_goods";
		
		/**
		 * 购买扶贫卡 
		 */
		public String COUNPPON = "coupon";
	}
	
	/**
	 * 订单是否取消
	 * @author yangjian
	 *
	 */
	public interface CancleStatus{
		public String YES = "yes";
		public String NO = "no";
	}

}
