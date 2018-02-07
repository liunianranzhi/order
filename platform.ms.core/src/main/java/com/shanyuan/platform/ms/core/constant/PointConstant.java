package com.shanyuan.platform.ms.core.constant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface PointConstant {
	
	public float BOC_SHARED_GOODS_POINT_RATE = 0.05f;
	
	public interface PointStage {
		/**
		 * 分享注册
		 */
		public String SHARED_RGEGIST = "shared_regist";
		/**
		 * 由分享注册
		 */
		public String REGIST_BY_SHARE = "regist_by_share";
		/**
		 * 益客积分
		 */
		public String YIKE_POINT = "yike_points";
		
		public String ORDER = "order";
		public String FUND_FEE = "fund_fee";
		public String DONATE_MONEY = "donate_money";
		public String ORDER_POINTS = "order_points";
		public String SYS_ADJUST = "sys_adjust";
		public String SY_WALLET = "sy_wallet";
		public String DONATE_GOODS_ORDER = "donate_goods_order";
		public String SY_BAZAAR = "sy_bazaar";
		public String SY_ACTIVITY = "sy_activity";
		public String SHARED_BUY = "shared_buy";
		
		/**
		 * 满足益客加积分的stage
		 */
		public List<String> YIKE_POINT_LIST = new ArrayList<String>(Arrays.asList("donate_money" ,"order" ,"sy_bazaar", "sy_activity"));
		
	}
	public interface FromType {
		public String order = "爱心帮扶农产品";
		public String fund_fee = "公益捐赠";
		public String donate_money = "参与爱心捐款";
		public String order_points = "pl_desc";
		public String sys_adjust = "pl_desc";
		public String sy_wallet = "pl_desc";
		public String donate_goods_order = "参与爱心捐物";
		public String sy_bazaar = "参与爱心义卖";
		public String sy_activity = "参与志愿队任务";
		public String yike_points = "您邀请的好友做了公益";
		public String regist_by_share = "通过分享注册";
		public String shared_buy = "好友通过您的分享购买了产品";
		public String shared_regist = "好友通过您的分享注册";
    }
	
	public interface PointType{
		/**
		 * 只加会员积分
		 */
		public Integer MEMBER_TYPE = 1;
		/**
		 * 加会员和中元积分
		 */
		public Integer BOC_MEMBER_TYPE = 2;
		/**
		 * 只加中元积分
		 */
		public Integer BOC_TYPE = 3;
	}
	
	public interface PointsTagNum{
		/**
		 * 统计不同积分段累计人数的字段名
		 */
		String TOTAL_POINTS_NUM = "tatolPointNum";
		
		String VALID_POINTS_NUM = "validPointNum";
	}

}
