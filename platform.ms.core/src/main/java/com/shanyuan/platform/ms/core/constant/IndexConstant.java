package com.shanyuan.platform.ms.core.constant;

/**
 * 首页常量
 * @author yangjian
 * @date 2017/10/31
 *
 */
public interface IndexConstant {

	/**
	 * 首页弹窗发布状态
	 *
	 */
	public interface IndexPopStatus{
		/**
		 * 未发布
		 */
		public Byte INDEX_POP_A = 1;
		/**
		 * 发布中
		 */
		public Byte INDEX_POP_B = 2;
		/**
		 * 已下线
		 */
		public Byte INDEX_POP_C = 3;
	}
	
	/**
	 * 渠道信息
	 *
	 */
	public interface Channels{
		/**
		 * 国家光电
		 */
		public String CHNL_ID_APP_GD = "gd";
		/**
		 * 山西
		 */
		public String SHANXI1 = "shanxi1";
		/**
		 * 全部联盟 
		 */
		public String ALLUNION = "AllUnion";
	}
	
	/**
	 * 首页按钮图片类型
	 * @author yangjian
	 *
	 */
	public interface IOSImageType{
		/**
		 * 2倍图
		 */
		public String TWO_TYEP = "2";
		/**
		 * 3倍图
		 */
		public String THREE_TYPE = "3";
	}
	
	/**
	 * 是否同意用户协议
	 * @author yangjian
	 * @date 2017/12/05
	 */
	public interface UserAgreememt{
		
		/**
		 * 同意
		 */
		public byte AGREE = 1;
		
		/**
		 * 不同意
		 */
		public byte NOT_AGREE = 0;
		
	}
	
}
