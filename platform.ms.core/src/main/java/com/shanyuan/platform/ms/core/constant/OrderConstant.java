package com.shanyuan.platform.ms.core.constant;

import java.math.BigDecimal;

public interface OrderConstant {

	public interface FreightType{
		String DEFAULT="1";//'是否默认运费1是2否
		String CALCULATE="2";
	}
	
	public interface PayMentCode {
		 String  PAYMENT_CODE_BIZ_PAY="biz_pay";//扶贫码支付
		 String  PAYMENT_CODE_POINTS_PAY="points_pay";//积分支付
		 String  PAYMENT_CODE_ONLINE_PAY="online";
	}
	/**
	 * @author zy
	 * 商品判定类型
	 */
	public interface goodsDiff {
		/**
		 * 上架
		 */
		Integer GOODS_STATE1=1;//
		/**
		 * 审核通过
		 */
		Integer  GOODS_VERIFY1=1;
		//贫困户
		String OWNER_TYPE_POOR="poor";
		
	}
	/**
	 * @author zy
	 * 商品判定类型
	 */
	public interface payCenter {
		String boc ="中银支付";
		String alipayna ="支付宝原生支付";
        String alipayh5 ="支付宝wap支付";
		String wechatna ="微信app支付";
		String wechatmp ="微信公众号";
		
	}
	/**
	 * @author zy
	 * 商品判定类型
	 */
	public interface creatorType {
		Byte platform=(byte)1;
		Byte store=(byte)2;
		Byte syShop=(byte)3;
	}
	/**
	 * 
	 * @author zy
	 *
	 */
	public interface wholesaleType {
		//批发
		Byte all=new Byte("1");
		//零售
		Byte retail =new  Byte("0");
		
	}
	/**
	 * @author zy
	 * 商品判定类型
	 * @param ORDER_STATE_NEW 待支付
	 * 
	 */
	public interface OrderState {
		//待支付
		String ORDER_STATE_NEW ="1";
		//已完成
		String ORDER_STATE_SUCCESS ="40";
		String ORDER_STATE_PAYED ="15";
		
	}
	/**
	 * 所有者类型
	 * @author k
	 *
	 */
	public interface ownerType {
		 String  OWNER_TYPE_AGENT="agent";//代理人的产品
		 String  OWNER_TYPE_POOR="poor";//贫困户的产品
	}
	 /* 订单类型
	 * @author k
	 *
	 */
	public interface orderType {
		 String  order_agent="agent";//代理人的产品
		 String  order_poor="poor";//贫困户的产品
		 String  order_biz="bizbuy";//线上集采
		 String  order_syshop="syshop";//善源商场
		 String  order_personal="personal";//代理人的产品
		 String  order_company="company";//贫困户的产品
	}
	/**
	 * 交易类型
	 * @author k
	 *
	 */
	public interface TradeType {
		 String  TRADE_MODE_QKYS="qkys";//全款预售
		 String  TRADE_MODE_PT="pt";//普通交易
	}
	/**
	 * 项目类型
	 * @author k
	 *
	 */
	public interface ProjectType {
		Integer PROJECT_TYPE_SY_SHOP=24;//善源商场
		Integer PROJECT_TYPE_DA_SHOP=17;//大爱超市
	}
	/**
	 * 费率
	 * @author zy
	 *
	 */
	public interface FeeRate{
		BigDecimal POINT_RATE= new BigDecimal("20.0");//积分费率
		BigDecimal BOC_POINT_RATE= new BigDecimal("10.0");//中元
		//帮扶比例 千分制
		BigDecimal HELP_RATE= new BigDecimal("100");//中元
		//预设服务费比例  千分制
		BigDecimal SERVICE_RATE= new BigDecimal("6.0");//
		BigDecimal POOR_GOODS_DEFAULT_SERVICE_FEE_RATE= new BigDecimal("20.0");//大爱超市默认的平台服务费(千分制)
		BigDecimal PWCN_DEFAULT_SERVICE_FEE_RATE_FOR_POOR_GOODS= new BigDecimal("6.0");//联盟默认的平台服务费比例(千分制)
		BigDecimal SYSHOP_DEFAULT_SERVICE_FEE_RATE= new BigDecimal("20.0");//善源商场默认的平台服务费比例(千分制)
		BigDecimal DEFAULT_FUND_FEE_RATE= new BigDecimal("30.0");//大爱超市默认的公益捐赠比例(千分制)
	}
	/**
	 * @author 曹勇军
	 * 代金券状态(1-未用,2-已用,3-过期,4-收回)
	 */
	public interface VoucherType {
		Byte UN_USED = 1;
		Byte USED = 2;
		Byte EXPIRE = 3;
		Byte RECOVERY = 4;
	}
	
	/**
	 * @author 曹勇军
	 * 代金券模板状态(1-有效,2-失效)
	 */
	public interface VoucherTemplateType {
		Byte USE = 1;
		Byte EXPIRE = 2;
	}
	
	/**
	 * @author 曹勇军
	 * 费用承担方式（1、平台；2、商家）
	 */
	public interface VoucherTCostMode {
		Byte PLATFORM = 1;
		Byte STORE = 2;
	}
	/**
	 * @author caoyongjun
		下单渠道
	 */
	public interface OrderChannelType {
		String BOC="boc";
	}
}
