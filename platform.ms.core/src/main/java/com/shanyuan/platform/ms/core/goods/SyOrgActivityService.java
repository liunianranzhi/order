/**
 * 
 */
package com.shanyuan.platform.ms.core.goods;

import java.util.List;

import com.shanyuan.platform.ms.dao.goods.entity.SyOrgActivity;

/**
 * @author 曹勇军
 *
 */
public interface SyOrgActivityService {
	List<SyOrgActivity> selectByGoodsId(Integer goodsId);
}
