package com.shanyuan.platform.ms.core.order.impl.exceptype;

import com.shanyuan.platform.ms.base.exception.CoreServiceExcepType;

public interface OrderServiceExcepType extends CoreServiceExcepType{
	
	CoreServiceExcepType MISSING_PARAMETER = new ExcepType("missing_parameter");//参数丢失
	CoreServiceExcepType NO_ONLINE_GOODS = new ExcepType("no_online_goods");//没有在线商品
	CoreServiceExcepType GOODS_MISSING = new ExcepType("goods_missing");//没有此类商品
	CoreServiceExcepType GOODS_COMMON_MISSING = new ExcepType("goods_common_missing");//没有此类商品common
	CoreServiceExcepType COUPON_BALANCE_NOT_ENOUGH = new ExcepType("coupon_balance_not_enough");//扶贫码余额不足
	CoreServiceExcepType UPDATE_COUPON_BALANCE_FAIL = new ExcepType("update_coupon_balance_fail");//更新失败
	CoreServiceExcepType INSERT_ORDER_FAIL = new ExcepType("insert_order_fail");//插入订单表记录错误
	CoreServiceExcepType DELETE_ORDER_FAIL = new ExcepType("delete_order_fail");//插入订单表记录错误
	CoreServiceExcepType INSERT_ORDER_PAY_FAIL = new ExcepType("insert_order_pay_fail");//插入order_pay错误
	CoreServiceExcepType INSERT_ORDER_LOG_FAIL = new ExcepType("insert_order_log_fail");//插入order_log错误
	CoreServiceExcepType INSERT_ORDER_COMMON_FAIL = new ExcepType("insert_order_common_fail");//插入orderCommon记录错误
	CoreServiceExcepType INSERT_ORDER_GOODS_FAIL = new ExcepType("insert_order_goods_fail");//更新使用积分错误
	CoreServiceExcepType UPDATE_POINTS_USED_FAIL = new ExcepType("update_points_used_fail");//更新积分日志错误
	CoreServiceExcepType UPDATE_POINTS_LOG_FAIL = new ExcepType("update_points_log_fail");//购买善源商场数量
	CoreServiceExcepType SYSHOP_MAX_BUYNUM_FAIL = new ExcepType("syshop_max_buynum_fail");//购买善源商场数量超限
	CoreServiceExcepType BOC_POINTS_NOT_ENOUGH_FAIL = new ExcepType("boc_points_not_enough_fail");//积分不足
	CoreServiceExcepType STOCK_COUNT_NOT_ENOUGH_FAIL = new ExcepType("stock_count_not_enough_fail");//库存不足
	CoreServiceExcepType USE_Voucher_FAIL = new ExcepType("use_voucher_fail");//使用优惠券错误
	CoreServiceExcepType ORDER_EMPTY = new ExcepType("order_empty");//订单为空
	CoreServiceExcepType ORDER_WRONG_STATE = new ExcepType("order_wrong_state");//订单为空
	CoreServiceExcepType NOT_SUPPORTED = new ExcepType("not_supported");//
	
	CoreServiceExcepType UPDATE_REDIS_INFO = new ExcepType("update_redis_info");//
	
	CoreServiceExcepType ADDRESS_EMPTY = new ExcepType("address_empty");//收货地址错误
	CoreServiceExcepType CART_EMPTY = new ExcepType("cart_empty");//购物车为空
	CoreServiceExcepType GOODS_LIST_EMPTY = new ExcepType("goods_list_empty");//订单为空
	CoreServiceExcepType SUBMIT_ORDER_FAIL = new ExcepType("submit_order_fail");//
	CoreServiceExcepType UPDATE_STORE_FAIL = new ExcepType("update_sale_fail");//
	CoreServiceExcepType UPDATE_CART_FAIL = new ExcepType("update_cart_fail");//
	CoreServiceExcepType UPDATE_SALE_FAIL = new ExcepType("update_sale_fail");//
	CoreServiceExcepType ADD_VOUCHER_LOG_FAIL = new ExcepType("add_voucher_log_fail");//
	CoreServiceExcepType CANNOT_BUY_SELF_GOODS = new ExcepType("cannot_buy_self_goods");//
	CoreServiceExcepType QUERY_ORDER_FAIL = new ExcepType("QUERY_ORDER_FAIL");//
	
	
	/**
	 * 冲正扶贫码失败
	 */
	CoreServiceExcepType CHONGZHENG_COUPON_FAIL = new ExcepType("chongzheng_coupon_fail");
	
	/**
	 * mysql 数据回滚异常
	 */
	CoreServiceExcepType MYSQL_ROLLBACK_EXCEPTION = new ExcepType("mysql_rollback_exception");
}
