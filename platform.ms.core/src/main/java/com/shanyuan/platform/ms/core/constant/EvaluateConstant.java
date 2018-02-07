/**
 * 
 */
package com.shanyuan.platform.ms.core.constant;


/**
 * @author 钟颖
 *
 */
public interface EvaluateConstant {

	/**
	 * @author 钟颖
	 * 商品评论类型
	 */
	public interface evalType {
		/**
		 * 订单
		 */
		String order = "order";
		/**
		 * 商品详情
		 */
		String goods = "goods";
		/**
		 * 全部
		 */
		String all = "all";
		/**
		 * 好评
		 */
		String well = "well";
		/**
		 * 中评
		 */
		String middle = "middle";
		/**
		 * 差评
		 */
		String negative = "negative";
		/**
		 * 晒图
		 */
		String picture = "picture";
	}
	public interface doType {
		/**
		 * 添加
		 */
		String add = "add";
		/**
		 *编辑
		 */
		String edit = "edit";
	}
}
