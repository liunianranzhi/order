/**
 * 
 */
package com.shanyuan.platform.ms.facade.constant;

/**
 * @author 曹勇军
 *
 */
public interface GoodsFacadeConstant {
	
	
	public interface GoodsListStyle{
		/**
		 * 左滑
		 */
		Integer LEFT_GO=1;
		/**
		 * 长方
		 */
		Integer FANG_FANG=2;
		/**
		 * 长*1
		 */
		Integer LONG1=3;
	}
	
	/**
	 *	新集采  商品分类id
	 */
	public interface GoodsClassRootGCID{
		
		/**
		 * 集采分类根节点
		 */
		Integer BIZ_GC_ID = 1771;
		
		/**
		 * 大爱超市
		 */
		Integer DAAI_GC_ID = 1149;
		
		/**
		 * 善缘商场
		 */
		Integer SY_SHOP_GC_ID = 1962;
	}
}
