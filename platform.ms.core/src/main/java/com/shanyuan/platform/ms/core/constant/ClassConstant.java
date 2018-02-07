package com.shanyuan.platform.ms.core.constant;
/** 
 * @author  wang chunru 
 * @date    2017年10月31日 下午3:25:10 
 * @Description  商品所属类型常量类描述 
 */
public interface ClassConstant {
	
	/**
	 * 商品类型所属模块常量定义
	 * @author wang chunru
	 *
	 */
	public interface ModuleType {
		/**
		 * 大爱超市分类
		 */
		Integer MODULE_LOVE_MARKET_TYPE = 1;
		
		/**
		 * 集采分类
		 */
		Integer MODULE_PURCHASE_TYPE = 2;
		
		/**
		 * 善源商场分类
		 */
		Integer MODULE_SY_SHOP_TYPE = 3;
	}
	
	/**
	 * 商品类型所属模块类型ID定义
	 * @author wang chunru
	 *
	 */
	public interface ModuleClassId {
		/**
		 * 大爱超市类型ID
		 */
		Integer MODULE_LOVE_MARKET_CLASS_ID = 1149;
		
		/**
		 * 善源商场类型ID
		 */
		Integer MODULE_SY_SHOP_TYPE_CLASS_ID = 1150;
		
		/**
		 * 集采分类类型ID
		 */
		Integer MODULE_PURCHASE_TYPE_CLASS_ID = 1151;
	}
}
