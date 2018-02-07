package com.shanyuan.platform.ms.core.constant;

/**
 * 善源商场常量
 * @author yangjian
 * @date 2017/11/02
 *
 */
public interface SyShopConstant {
	
	/**
	 * 企业审核状态
	 *
	 */
	public interface ShopVerifyState{
		
		/**
		 * 通过
		 */
		public byte SYSHOP_COMPANY_STATUS_VERIFID = 1;
		
		/**
		 * 审核中
		 */
		public byte SYSHOP_COMPANY_STATUS_VERIFING = 2;
		
		/**
		 * 未通过
		 */
		public byte SYSHOP_COMPANY_STATUS_VERIFY_FAIL = 0;
		
	}

}
