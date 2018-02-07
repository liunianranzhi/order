package com.shanyuan.platform.ms.core.constant;

/**
 * 数据统计常量
 * @author yangjian
 * @date 2017/12/27
 *
 */
public interface StatisticsConstant {
	
	/**
	 * 分页常量
	 */
	public interface Page{
		/**
		 * 每页显示的数据pageSize
		 */
		public Integer PAGE_SIZE = 20;
	}

	/**
	 * 表名
	 * @author yangjian
	 *
	 */
	public interface TableName{
		
		/**
		 * 基础数据表
		 */
		public String BASE_DATA_TABLE_NAME = "statistics_order_base_data";
		
		/**
		 * 联盟买家分表前缀
		 */
		public String UNION_DATA_TABLE_NAME_BUYER = "statistics_order_union_buyer_";
		

		/**
		 * 联盟卖家分表前缀
		 */
		public String UNION_DATA_TABLE_NAME_SELLER = "statistics_order_union_seller_";
		
		/**
		 * 区域分表前缀
		 */
		public String AREA_DATA_TABLE_NAME = "statistics_order_area_";
		
		/**
		 * 积分标签临时表
		 */
		public String POINT_DETAILS_TAG_TEMP = "statistics_point_details_tag_temp";
		
		/**
		 * 积分标签表
		 */
		public String POINT_DETAILS_TAG = "statistics_point_details_tag";
		
	}
	
	public interface RedisKey{
		
		/**
		 * 上次执行统计时间
		 */
		public String LAST_TIME = "statistics:order:lasttime";
		
		/**
		 * 上次执行结果
		 */
		public String STATISTICS_STATUS = "statistics:order:status";
		
		/**
		 * 执行结果set
		 */
		public String STATISTICS_STATUS_SET = "statistics:order:statusset";
		
		/**
		 * 上次供给侧统计时间
		 */
		public String PROVIDE_LAST_TIME = "statistics:provide:lasttime";
		
		/**
		 * 累计供给侧统计结果
		 */
		public String PROVIDE_RESULT_SET = "statistics:provide:set";
		
		/**
		 * 上次帮扶侧统计时间
		 */
		public String ASSIST_LAST_TIME = "statistics:assist:lasttime";
		
		/**
		 * 累计帮扶侧统计结果
		 */
		public String ASSIST_RESULT_SET = "statistics:assist:set";
		
		/**
		 * 上次联盟购买统计时间
		 */
		public String UNION_BUY_LAST_TIME = "statistics:union:buy:lasttime";
		
		/**
		 * 累计联盟购买结果
		 */
		public String UNION_BUY_RESULT_SET = "statistics:union:buy:set";
		
		/**
		 * 上次联盟销售统计时间
		 */
		public String UNION_SELL_LAST_TIME = "statistics:union:sell:lasttime";
		
		/**
		 * 累计联盟销售结果
		 */
		public String UNION_SELL_SET = "statistics:union:sell:set";
		
		/**
		 * 上次扶贫成果总览统计时间
		 */
		public String OVERVIEW_LAST_TIME = "statistics:overview:lasttime";
		
		/**
		 * 累计扶贫成果总览结果
		 */
		public String OVERVIEW_SET = "statistics:overview:set";
		
		/**
		 * 上次平台销量统计时间
		 */
		public String PLATFORM_LAST_TIME = "statistics:platform:lasttime";
		
		/**
		 * 累计平台销量结果
		 */
		public String PLATFORM_SET = "statistics:platform:set";
		
		/**
		 * 上次积分统计结果
		 */
		public String POINT_LAST_TIME = "statistics:point:lasttime";
		
		/**
		 * 累计积分统计结果
		 */
		public String POINT_SET = "statistics:point:set";
		
		/**
		 * 统计接口请求key
		 */
		public String STATISTICS_REQUEST_KEY = "sy_statistics_request_key";
		
		
	}
	
	/**
	 * 助理人assistId
	 */
	public interface AssistId{
		public Integer ASSIST_ID_0 = 0;
		public Integer ASSIST_ID_1 = 1;
	}
	
	public interface StatisticsStatus{
		
		/**
		 * 执行成功
		 */
		public String STATISTICS_SUCCESS = "1";
		
		/**
		 * 执行失败
		 */
		public String STATISTICS_FAIL = "0";
		
	}
	
	public interface currentPage{
		
		public Integer CURRENT_PAGE = 30;
		
		public Integer FIRST_PAGE = 1;
		
		public Integer LIMIT_PAGE = 10000;
		
	}
	
	/**
	 * 请求类型
	 * @author yangjian
	 *
	 */
	public interface ReqType{
		/**
		 * 列表展示
		 */
		Integer LIST = 1;
		/**
		 * 导出
		 */
		Integer EXPORT = 2;
	}
	
}
