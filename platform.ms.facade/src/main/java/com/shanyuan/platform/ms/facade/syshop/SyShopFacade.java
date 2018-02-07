package com.shanyuan.platform.ms.facade.syshop;

import java.util.Map;

/**
 * 善源商场
 * @author yangjian
 * @date 2017/11/02
 *
 */
public interface SyShopFacade {

	/**
	 * 善源商场一起善源列表
	 * @param showNums 显示条数
	 * @param totalNums 展区个数
	 * @return
	 */
//	Map<String, Object> getAreaInfo(Integer cols, Integer rows);
	
	Map<String, Object> getAreaInfo(Integer cols, Integer rows);
	
}
