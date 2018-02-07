package com.shanyuan.platform.ms.core.constant;

public interface StoreConstant {
	/**
	 * 商家入驻状态定义
	 * @author k
	 *
	 */
	public interface StoreStatus{
		/**
		 * 新申请
		 */
		int STORE_JOIN_STATE_NEW=10;
		/**
		 * 完成付款
		 */
		int STORE_JOIN_STATE_PAY=11;
		/**
		 *  自动创建店铺
		 */
		int STORE_JOIN_STATE_AUTO_CREATE=12;
		/**
		 * 初审成功
		 */
		int STORE_JOIN_STATE_VERIFY_SUCCESS=20;
		/**
		 * 初审失败
		 */
		int STORE_JOIN_STATE_VERIFY_FAIL=30;
		/**
		 * 付款审核失败
		 */
		int STORE_JOIN_STATE_PAY_FAIL=31;
		/**
		 *  开店成功
		 */
		int STORE_JOIN_STATE_FINAL=40;
	}
	public interface CircleMemberState{
		//申请中
		Byte CIRCLE_MEMBER_STATE_WAIT_AUTHEN_APPROVAL= 0 ;
		//已通过
		Byte CIRCLE_MEMBER_STATE_ENABLED= 1 ;
		//未通过
		Byte CIRCLE_MEMBER_STATE_DISABLED= 2 ;
	}
}
