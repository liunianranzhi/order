package com.shanyuan.platform.ms.core.order;

import java.math.BigDecimal;
import java.text.ParseException;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
/**
 * 计算费率接口
 * @author zy
 *
 */
public interface CalculateFeeService {
	/**
	 * 获得服务费
	 * @param goodsProjectType
	 * @param member_id
	 * @param channel
	 * @param assistId
	 * @return
	 * @throws ParseException
	 */
	public BigDecimal getServiceFeeRate (Integer goodsProjectType,Integer member_id,String channel,Integer assistId) ;
	/**
	 * 预提交的一些费用
	 * @param disOrderGoodsInfo
	 * @return
	 */
	public void getPreSumbitOrderMoney(DisOrderGoodsInfo disOrderGoodsInfo);
	/**
	 * 计算公益 基金比例
	 * @param goodsProjectType
	 * @param publisherId
	 * @param channel
	 * @param assistId
	 * @return
	 */
	public BigDecimal getFundFeeRate(Integer goodsProjectType,Integer publisherId,String channel,Integer assistId ,String ownerType) ;



	/**
     * 贫困户可获得的帮扶金额
     * @param money   		商品的金额
     * @param ownerType     产品所有者类型 agent代理人产品 poor贫困户产品
     * @param m_fee_rate    管理费的比例，实际比例为该值除以1000
     * @return 可获的钱
     */
	//public BigDecimal getPoorSupportMoney(Integer goodsProjectType,Integer assistId,BigDecimal shipfee,BigDecimal goodsAmount,BigDecimal storeDisCount, String ownerType, BigDecimal mFeeRate) ;
}
