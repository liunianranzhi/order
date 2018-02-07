/**
 * 
 */
package com.shanyuan.platform.ms.facade.constant;

/**
 * @author 曹勇军
 *
 */
public interface OrderFacadeConstant {
	
	public interface CartCheckedType{
		/**
		 * 购物车里已勾选的状态
		 */
		Byte CHECKED=1;
		/**
		 * 购物车里未勾选的状态
		 */
		Byte UN_CHECKED=0;
	}
	
	/**
	 * 
	 * @author 曹勇军
	 * topic
	 */
	public interface PublishType{
		/**
		 * 处理订单的
		 */
		String ORDER_TOPIC="order";
		/**
		 * 处理订单
		 */
		String ORDER_TAGNAME="dealOrder";
	}
}
