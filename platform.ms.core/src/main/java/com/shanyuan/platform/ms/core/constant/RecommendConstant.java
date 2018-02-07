package com.shanyuan.platform.ms.core.constant;


/**
 * 推荐系统项目常量
 * @author yangjian
 * @date 2017/10/31
 *
 */
public interface RecommendConstant {
	
	public interface RecommendModuleCode{
		
		/**
		 * 首页模块
		 */
		public String INDEX_PAGE = "indexPage";
		
		/**
		 * 慈善项目模块
		 */
		public String PROJECT = "project";
		
		/**
		 * 活动模块
		 */
		public String ACTIVITY = "activity";
		
		/**
		 * 店铺模块
		 */
		public String SHOP = "shop";
		
		/**
		 * 全部
		 */
		public String ALLUNION = "allunion";
		
		/**
		 * 集采模板
		 */
		public String BIZBUY = "bizbuy";
		
	}
	
	/**
	 * 推荐系统项目模板可用状态
	 */
	public interface RecommendStatus{
		
		/**
		 * 可用
		 */
		byte  ENABLE = 1;
		/**
		 * 不可用
		 */
		byte UNUSER = 0;
	}

}
