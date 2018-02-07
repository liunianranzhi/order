package com.shanyuan.platform.ms.core.constant;

import java.math.BigDecimal;



/**
 * 
 * @author sunyue
 *
 */
public interface GoodsConstant {
	/**
	 *
	 * @author zy
	 *
	 */
	public interface QueryType{
		String ONLINE_VERIFY="ONLINE_VERIFY";
		String QUERY_ALL="query_all";
	}
	/**
	 *活动状态
	 * @author zy
	 *
	 */
	public interface TopicStatus{
		String can_buy="can_buy";
		String no_start="no_start";
		String no_storage="no_storage";
		String today_finish="today_finish";
		String limit_time="limit_time";
  }
	public interface goodsType{
		String isTopic="6";
		String notTopic="1";
	}
	/**
	 * 商品的类型
	 * @author sunyue
	 *
	 */
	public interface GoodsState {
		/**
		 * 上架
		 */
		byte GOODS_STATE1=1;
		
		/**
		 * 下架
		 */
		byte GOODS_STATE0=0;
		/**
		 * 违规
		 */
		byte GOODS_STATE10=10;
		/**
		 * 删除
		 */
		byte GOODS_STATE20=20;
		/**
		 * 审核状态
		 */
		byte GOODS_STATE30=30;
	}
	/**
	 * 商品的审核状态
	 * @author sunyue
	 *
	 */
	public interface GoodsVerify{
		/**
		 * 审核通过
		 */
		byte  GOODS_VERIFY1=1;
		/**
		 * 审核失败
		 */
		byte  GOODS_VERIFY0=0;
		/**
		 * 等待审核
		 */
		byte  GOODS_VERIFY10=10;
	}
	
	/**
	 * 商品的类型
	 * @author caoyongjun
	 *
	 */
	public interface GoodsTypes{
		/**
		 * 自产
		 */
		String  POOR_SELF_GOODS="self_goods";
		/**
		 * 代销
		 */
		String  POOR_REPLACE_GOODS="replace_goods";
	}
	
	/**
	 * 认证类型
	 * @author yangjian
	 *
	 */
	public interface GoodsCerts{
		String eu = "欧盟认证";
		String organic = "有机认证";
		String green = "绿色认证";
		String wgh = "无公害认证";
	}
	
	/**
	 * 产品经营者
	 * @author yangjian
	 *
	 */
	public interface GoodsOwnerType{
		String all = "全部";
		String poor = "贫困户自营";
		String agent = "助理人助理";
	}
	
	
	
	/**
	 * 存 redis的key
	 * @author k
	 *
	 */
	public interface RedisKey{
		/**
		 * redis存部门配置的县的key的头部
		 */
		String CIRCL_AREA ="circle_area";
	}
	
	public interface AgentChannelType{
		byte AREA_CHANNEL_SUPPORT = 1;	//供给侧
		byte AREA_CHANNEL_HELP =2;	//帮扶侧
	}
	/**
	 * boc
	 */
	public interface SpecialBocGoodsType{
		
		public static final  String club_circle = "shanxi";	//部门排名中的channel
		/**
		 * 淳化
		 */
		public static final  Long areaid_3_ch = 610430000000l;	
		/**
		 * 旬邑
		 */
		public static final  Long areaid_3_xy = 610429000000l;
		/**
		 * 长武
		 */
		public static final  Long areaid_3_cw = 610428000000l;	
		/**
		 * 永寿
		 */
		public static final  Long areaid_3_ys = 610426000000l;	
		
	}
	/**
	 * 天津
	 * @author k
	 *
	 */
	public interface SpecialTianJinGoodsType{
		/**
		 * 蓟州
		 */
		public static final  Long areaid_3_jx = 120225000000l;	//蓟县 120225000000
		/**
		 * 宝坻
		 */
		public static final  Long areaid_3_bd = 120115000000l;	//宝坻
		
	}
	/**
	 * 山西
	 * @author k
	 *
	 */
	public interface SpecialShanxiGoodsType{
		/**
		 * 广灵
		 */
		public static final  Long areaid_3_gl = 140223000000l;	//广灵县
		
		/**
		 * 兴县
		 */
		public static final  Long areaid_3_xx = 141123000000l;	//兴县
		
	}
	
	public interface  ProvinceType{
		/**
		 * 陕西省
		 */
		public static final String SHAN_XI="610";
		
		/**
		 * 河北省
		 */
		public static final String HE_BEI="120";
		
		/**
		 * 山西省
		 */
		public static final String S_X="140";

	}
	
	public interface  CityType{
		/**
		 * 咸阳市
		 */
		public static final String XIAN_YANG="610400000000";
		
		/**
		 * 天津市  市辖县
		 */
		public static final String TIAN_JIN_X="120200000000";
		
		/**
		 * 天津市  市辖区
		 */
		public static final String TIAN_JI_Q="120100000000";
		
		/**
		 * 大同市
		 */
		public static final String DA_TONG="140200000000";
		
		
		/**
		 * 吕梁市
		 */
		public static final String LV_LIANG="141100000000";

	} 
	/**
	 * @author 曹勇军
	 * 商品支付积分
	 */
	public interface GoodsPayPointType{
		BigDecimal BOC_POINT_RATE=new BigDecimal(10);
	}
	/**
	 * 北四县范围
	 */
	public interface NorthFourCounty{
		/**
		 * 北四县
		 */
		public static final Long[] NORTH_FOUR_COUNTY = {610430000000L,610429000000L,610428000000L,610426000000L};
		
		public static final String[] NORTH_FOUR_Name = {"淳化县","旬邑县","长武县","永寿县"};
		
		
	}
	/**
	 * 区域标签
	 */
	public interface AreaTag{
		/**
		 * 贫困
		 */
		public static final String AREA_TAG_POOR = "poor";
		
	}
	/**
	 * 精准扶贫产品所有者的类型
	 */
	public interface OwnerType{
		/**
		 * 代理人的产品
		 */
		public static final String OWNER_TYPE_AGENT = "agent";
		
		/**
		 * 贫困户的产品
		 */
		public static final String OWNER_TYPE_POOR = "poor";
		
	}
	
	/**
	 * 帮扶贫困户类型
	 */
	public interface PoorType{
		/**
		 * 贫困户产品
		 */
		public static final byte POOR_TYPE_PRE_BUY = 1;
		
		/**
		 * 贫困户加工
		 */
		public static final byte POOR_TYPE_LABOR = 2;
		/**
		 * 贫困户加工
		 */
		public static final byte POOR_TYPE_RENT = 3;
		
		/**
		 * 助理人产品
		 */
		public static final byte POOR_TYPE_POST_PAY = 4;
		
		/**
		 * 贫困户自产
		 */
		public static final String POOR_SELF_GOODS = "self_goods";
		
		/**
		 * 贫困户代销
		 */
		public static final String POOR_REPLACE_GOODS = "replace_goods";
		
	}
 
	/**
	 * 产品标签
	 */
	public interface TagType{
		/**
		 * 贫困户产品
		 */
		public static final String TAG_POOR_TYPE_PRE_BUY = "贫困户产品";
		/**
		 * 贫困户加工
		 */
		public static final String TAG_POOR_TYPE_LABOR = "贫困户加工";
		/**
		 * 贫困户加工
		 */
		public static final String TAG_POOR_TYPE_RENT = "贫困户加工";
		/**
		 * 助理人产品
		 */
		public static final String TAG_POOR_TYPE_POST_PAY = "助理人产品";
		/**
		 * 贫困户自产
		 */
		public static final String TAG_POOR_SELF_GOODS = "贫困户自产";
		/**
		 * 贫困户代销
		 */
		public static final String TAG_POOR_REPLACE_GOODS = "贫困户代销";
		
		/**
		 * 扶贫码可用
		 */
		public static final String TAG_POOR_CODE_ABLED = "扶贫码可用";
		/**
		 * 预售中
		 */
		public static final String TAG_PRE_SALE = "预售中";
		/**
		 * 现采现发
		 */
		public static final String TAG_FRESH = "现采现发";
		
	}
	/**
	 * 交易方式
	 */
	public interface TradeMode{
		/**
		 * 普通交易
		 */
		public static final String TRADE_MODE_PT = "pt";
		
		/**
		 * 全款预售
		 */
		public static final String TRADE_MODE_QKYS = "qkys";
		
	}
	
	/**
	 * 商品详情类型
	 */
	public interface GoodsDetailType{
		/**
		 * 助理人产品
		 */
		public static final String GOODS_DETAIL_AGENT = "agent";
		
		/**
		 * 贫困户产品
		 */
		public static final String GOODS_DETAIL_POOR = "poor";
		
		/**
		 * 集采产品
		 */
		public static final String GOODS_DETAIL_ASSIST = "assist";
		
	}
	/**
	 * 对贫困户产品收取的平台服务费率
	 */
	public interface ServiceRate{
		/**
		 * 贫困户产品收取的平台服务费率
		 */
		public static final double SERVICE_FEE_RATE_FOR_POOR_GOODS = 0.02;
		
		/**
		 * 
		 */
		public static final double PWCN_SERVICE_FEE_RATE_FOR_POOR_GOODS = 0.006;
		
	}
	/**
	 * 基金会对精准扶贫产品收取的费率
	 */
	public interface FundRate{
		/**
		 *  非工业主体
		 */
		public static final double FUND_FEE_RATE_FOR_BOC = 0.03;
		
		/**
		 * 工业主体
		 */
		public static final double FUND_FEE_RATE_FOR_BOC_INDUSTRY = 0.20;
		
	}
	
	/**
	 * 积分比例
	 */
	public interface PointsRate{
		/**
		 *  1元RMB = 10中元
		 */
		public static final int BOC_POINT_RATE = 10;
		
	}
	
	/**
	 * 搜索goods时比对金额
	 */
	public interface CompareGoodsPrice{
		int GT_PRICE = 1;
		int EQ_PRICE = 0;
		int LT_PRICE = -1;
	}
	
	/**
	 * 更新opensearch项目
	 */
	public interface UpdateOpenSearchType{
		int HOT_DATA = 1;
		int COLD_DATA = 0;
	}
	
	
	/**
	 * 商品归属名称
	 * @author zhangwd
	 */
	public interface GoodsOfShop{
		/**
		 * 集采
		 */
		String BIZ_BUY = "bizbuy";
		
		/**
		 * 善缘商场
		 */
		String SY_SHOP = "syshop";
		
		/**
		 * 大爱超市
		 */
		String DAAI_SHOP = "daaishop";
		
	}
}
