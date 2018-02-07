package com.shanyuan.platform.ms.core.project;

import java.util.List;

import com.shanyuan.platform.ms.dao.goods.entity.SyOrgActivity;
import com.shanyuan.platform.ms.dao.project.entity.SyProject;

/**
 * @author 曹勇军
 *
 */
public interface ProjectService {

	SyProject selectProjectAndStoreByPrimaryKey(Integer projId);

	/**
	 * 查询用户捐款项目的订单数量
	 * @param memberId  用户id
	 * @param orderStateSuccess 订单状态
	 * @return
	 * @author zhangwd
	 */
	Integer getJuanKuanProjectOrderCount(Integer memberId, String orderStateSuccess);

	/**
	 * 查询用户义卖项目的订单数量
	 * @param memberId 用户id
	 * @param orderStateSuccess 订单状态
	 * @return
	 * @author zhangwd
	 */
	Integer getBazaarOrderCount(Integer memberId, String orderStateSuccess);
	
	/**
	 * 义卖 交易总金额
	 * @return
	 * @author zhangwd
	 */
	Integer getBazaarOrderSumMoney();
	
	/**
	 * 捐款交易总金额
	 * @author zhangwd
	 */
	Integer getJuanKuanOrderSumMoney();
	
	
	List<SyProject> selectByActivityIds(List<SyOrgActivity> list);
}

