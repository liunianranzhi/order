/**
 * 
 */
package com.shanyuan.platform.ms.core.constant;

/**
 * @author 曹勇军
 *
 */
public interface ProjectConstant {
	/**
	 * @author 曹勇军
	 * 项目类型
	 */
	public interface ProjectType {
		Integer PROJECT_TYPE_B_SUPPORT_POOR_WAREHOUSE = 18;//企业扶贫仓库
		
		Integer PROJECT_TYPE_SUPPORT_POOR=17;//贫困户产品
		Integer PROJECT_TYPE_SY_SHOP=24;//善源商场供应商的产品
		Integer PROJECT_TYPE_SY_BAZAAR=25;//义卖商品
		Integer PROJECT_TYPE_SY_MONEY=26;//捐款项目
		
		Integer[] SUPPORT_POOR_TYPES={PROJECT_TYPE_SUPPORT_POOR,PROJECT_TYPE_SY_SHOP,PROJECT_TYPE_SY_BAZAAR,PROJECT_TYPE_SY_MONEY};
		
		Integer PROJECT_TYPE_WS=19;//商业主体代理人的产品
		Integer PROJECT_TYPE_COOP=20;//农业主体代理人的产品
		Integer PROJECT_TYPE_DEFAULT_AGENT=21;//其他代理人自己的产品
		Integer PROJECT_TYPE_GOV=22;//责任主体代理人的产品
		Integer PROJECT_TYPE_INDUSTRY=23;//工业主体代理人的产品
		
		Integer[] AGENT_TYPES={PROJECT_TYPE_WS,PROJECT_TYPE_COOP,PROJECT_TYPE_DEFAULT_AGENT,PROJECT_TYPE_GOV,PROJECT_TYPE_INDUSTRY};
	}
}
