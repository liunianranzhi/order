package com.shanyuan.platform.ms.base.common;

public interface CommonRedisKey {

	/**
	 * 用户信息key
	 * @author yangjian
	 *
	 */
	public interface UserInfoRedisKey{
		public String USER_INFO_PRE = "ui_";
		public String USER_INFO_SET = "uiset";
	}
	
	public interface GoodsInfoRedisKey{
		String GOODS_INFO_PRE = "ghi_";
	}
	
	public interface AgentInfoRedisKey{
		public String AGENT_INFO_DEFAULT="default";
		
	}
	
	public interface UnionInfoRedisKey{
		public String UNION_INFO_PRE="uni_";
		public String UNION_INFO_SET="uniset";
		
	}
	
	/**
	 * 首页key
	 * @author yangjian
	 *
	 */
	public interface IndexRedisKey{
		/**
		 * 首页广告
		 */
		public String INDEX_AD_LIST = "index_ad_list";
		/**
		 * 首页轮播图
		 */
		public String INDEX_FOCUS_LIST = "index_focus_list";
		/**
		 * 首页优秀主理人
		 */
		public String INDEX_AGENT_LIST = "index_agent_list";
		/**
		 * 首页大家帮
		 */
		public String INDEX_HELP_GOODS = "index_gl_most_needed";
		/**
		 * 首页特产馆
		 */
		public String INDEX_SPECIAL_GOODS = "index_specialty_stores";
		/**
		 * 首页子联盟
		 */
		public String INDEX_UNIONITEM_GOODS = "index_union_item_list";
		
	}
	
	/**
	 * 大爱超市筛选key
	 * @author yangjian
	 *
	 */
	public interface GoodsFilterRedisKey{
		
		/**
		 * 大爱超市区域列表
		 */
		public String DACS_SUPPORT_AREA_LIST = "dacs_support_area_list";
		/**
		 * 大爱超市商品分类
		 */
		public String DACS_GOODS_CLASS = "dacs_goods_class";
		/**
		 * 大爱超市商品分类set
		 */
		public String DACS_GOODS_CLASS_SET = "dacs_goods_class_set";
	}

	/**
	 * 集采分类key
	 * @author  zhangwd
	 */
	public interface  BizGoodsClass{

		public String BIZ_GOODS_CLASS_LIST = "biz_goods_class_list";
		public String BIZ_GOODS_CLASS_SET = "biz_goods_class_set";
	}
	/**
	 * 集采分类key
	 * @author  wangchunru
	 */
	public interface  GoodsClass{

		public String GOODS_CLASS_LIST = "goods_class";
		public String GOODS_CLASS_SET = "goods_class_set";
	}
	
	/**
	 * opensearch的key缓存
	 * @author  caoyongjun
	 */
	public interface  OpenSearchKey{
		String OPEN_SEARCH_LIST = "opensearch-list";
	}
	
	public interface OrderStatistics{
		public String STATISTICS_ORDER_MEMBER_CIRCLE = "statistics_order_member_circle_";
		public String STATISTICS_ORDER_MEMBER_CIRCLE_SET = "statistics_order_member_circle_set";
		public String STATISTICS_BIZ_ORDER = "statistics:biz:order:";
		public String STATISTICS_BIZ_ORDER_GOODS = "statistics:biz:order:goods:";
		public String STATISTICS_BIZ_ORDER_SET = "statistics:biz:order:set";
		public String STATISTICS_BIZ_ORDER_GOODS_SET = "statistics:biz:order:goods:set";
	}
	
	public interface MemberChannel{
		public String MEMBER_CHANNEL_SET = "member_channel_set";
		public String MEMBER_CHANNEL_PRE = "member_channel_";
	}
	
	
}
