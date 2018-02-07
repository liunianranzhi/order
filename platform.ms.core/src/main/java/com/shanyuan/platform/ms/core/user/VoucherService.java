package com.shanyuan.platform.ms.core.user;

import java.util.List;
import java.util.Map;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucher;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucherOrder;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucherTemplate;

/**
 * 
 * @author 曹勇军
 *	优惠券接口
 */
public interface VoucherService {
	
	/**
	 * @author 曹勇军
	 * 使用优惠券
    * 将购物卷添加到订单记录
    * 包含order_id,goods_id,voucher_code,use_time,amount,buyer_id
	*/
	void useVoucher(SyVoucherOrder syVoucherOrder) throws CoreServiceException;
	
	void updateVoucherStatus(String voucherCode)throws CoreServiceException;
	
	/**
	 * @author 曹勇军
	 * 退回优惠券
	*/
	void deleteVoucherOrder(Integer orderId) throws CoreServiceException;
	
	/**
	 * @author 曹勇军
	 * 查询可用的代金券详细信息，包括店铺信息
	 * @param voucherTId   代金券模版编号
	 */
	SyVoucherTemplate getUsableTemplateInfo(Integer voucherTId);
	
	/**
	 * @author 曹勇军
	 * 计算订单满减详细信息:
	 */
	Map<String,Object> calOrderVoucherInfoDetail(Integer memberId,Map<String,DisOrderGoodsInfo> disOrderGoodsInfo,Integer voucherId)throws CoreServiceException;
	/**
	 * 挑选一张面额最大，过期时间最早，领取时间最早的优惠券
	 * @author zhongying
	 * @param voucherList 可用优惠券
	 * @param activityMap 活动分组的goodslist
	 * @return
	 */
	Map<String,Object> getOneVocher(List<SyVoucher>voucherList ,Map<Integer,List<GoodsInfo>> activityMap,String type);
	/**
	 * 店铺优惠券列表
	 * @author钟颖
	 * @param storeid
	 * @return
	 * @throws CoreServiceException
	 */
	List<SyVoucherTemplate> getVoucherTemByStoreid(Integer storeid)throws CoreServiceException;
	/**
	 * @author zy
	 * @param record
	 * @throws CoreServiceException
	 */
	void updateVouchertused(SyVoucher record)throws CoreServiceException;

	/**
	 * 按价格排序
	 * @param list
	 * @param desc
	 */
	void sortGoodsByPrice( List<GoodsInfo> list,boolean desc);

}
