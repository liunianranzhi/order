package com.shanyuan.platform.ms.core.goods;
/**
 * 
 * @author 冯祚
 * 商品发布系统
 * 商品路由信息管理
 *
 */

import java.util.List;
import java.util.Map;

public interface GoodsPublicService {
	/**
	 * 商品路由信息查询
	 * @author 冯祚
	 */
	public Map<Integer, String> getRouteInfoList();
	/**
	 * 商品路由信息添加
	 * @author 冯祚
	 */
	public Integer addRouteInfo();
	/**
	 * 商品路由信息修改
	 * @author 冯祚
	 */
	public Integer updateRouteInfo();
	/**
	 * 根据商品id查询新一批的商品文件名称
	 * @author 冯祚
	 * @param goodsIds 商品id集合
	 */
	public Map<Integer, String> getRouteInfoById(List<Integer> goodsIds);
}
