package com.shanyuan.platform.ms.core.order.impl;

import java.math.BigDecimal;
import java.util.List;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.core.constant.OrderConstant;
import com.shanyuan.platform.ms.core.order.CalculateFeeService;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.dao.order.mapper.SySettingMapper;
import com.shanyuan.platform.ms.dao.user.entity.SyShopAccount;
import com.shanyuan.platform.ms.dao.user.mapper.SyShopAccountMapper;
/**
 * 计算费率
 * @author zy
 *
 */
@Component
public class CalculateFeeServiceImpl implements CalculateFeeService {
	@Autowired
	private SySettingMapper settingMapper ;
	
	@Autowired
	private SyShopAccountMapper syShopAccountMapper ;
	/**
	 * 获得服务费
	 * zy
	 */
	@Override
	public BigDecimal getServiceFeeRate(Integer goodsProjectType, Integer member_id, String channel, Integer assistId) {
		  BigDecimal result=new BigDecimal(0);
		  result=OrderConstant.FeeRate.PWCN_DEFAULT_SERVICE_FEE_RATE_FOR_POOR_GOODS;
	       /* String settingName="";
	        //善源商场
	        if(goodsProjectType==OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP) {
	        	if((!ObjectUtils.isEmpty(member_id)&&member_id!=OrderUtil.getYiLiMemberId())) {
					settingName="pwcn_service_fee_rate";
					result=OrderConstant.FeeRate.PWCN_DEFAULT_SERVICE_FEE_RATE_FOR_POOR_GOODS;
				}else {
					settingName="service_fee_vendor_rate";
					result=OrderConstant.FeeRate.SYSHOP_DEFAULT_SERVICE_FEE_RATE;
				}
				SySetting settingInfo=settingMapper.selectByPrimaryKey(settingName);
				if(!ObjectUtils.isEmpty(settingInfo)&&!ObjectUtils.isEmpty(settingInfo.getValue())) {
					result= new BigDecimal(settingInfo.getValue());
				}
				//集采
	        }else if(assistId >0) {
	        	result=OrderConstant.FeeRate.PWCN_DEFAULT_SERVICE_FEE_RATE_FOR_POOR_GOODS;
	        }else {
	        	//大爱超市等等
	        	if((channel!=null&&!"".equals(channel)&&!"boc".equals(channel))) {
					result=OrderConstant.FeeRate.PWCN_DEFAULT_SERVICE_FEE_RATE_FOR_POOR_GOODS;
					settingName="pwcn_service_fee_rate";
				}else {
					settingName="pwcn_service_fee_rate";
					result=OrderConstant.FeeRate.PWCN_DEFAULT_SERVICE_FEE_RATE_FOR_POOR_GOODS;
				}
	        	SySetting settingInfo=settingMapper.selectByPrimaryKey(settingName);
	        	if(!ObjectUtils.isEmpty(settingInfo)&&!ObjectUtils.isEmpty(settingInfo.getValue())) {
	        		result= new BigDecimal(settingInfo.getValue());
				}
	        }
		*/
			return result;
	}
	/**
	 * 计算 公益基金比例
	 * zy
	 */
	@Override
	public BigDecimal getFundFeeRate(Integer goodsProjectType, Integer publisherId, String channel, Integer assistId,String ownerType) {
		 BigDecimal result=new BigDecimal(0);
		 //善源商场
		 if(goodsProjectType==OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP) {
			  List<SyShopAccount> selectByMemberId = syShopAccountMapper.selectByMemberId(publisherId);
			  if(!ObjectUtils.isEmpty(selectByMemberId)) {
				  SyShopAccount accountinfo =selectByMemberId.get(0);
				  if(!ObjectUtils.isEmpty(accountinfo)&&!ObjectUtils.isEmpty(accountinfo.getFundFeeRate())) {
			    		result= new BigDecimal(accountinfo.getFundFeeRate());
					}
			  }
			
				
		 }
		
		return result;
	}
	/***
	 * zy 
	 * 获得贫困户可获得的帮扶金额 每一单
	 */
	public BigDecimal getPoorSupportMoney(Integer goodsProjectType,Integer assistId,BigDecimal shipfee,BigDecimal goodsAmount,BigDecimal voucherAmount, String ownerType, BigDecimal mFeeRate) {
		BigDecimal poormoney=BigDecimal.ZERO;
		mFeeRate =ObjectUtils.isEmpty(mFeeRate)?BigDecimal.ZERO:mFeeRate;
		shipfee =ObjectUtils.isEmpty(shipfee)?BigDecimal.ZERO:shipfee;
		goodsAmount =ObjectUtils.isEmpty(goodsAmount)?BigDecimal.ZERO:goodsAmount;
		voucherAmount =ObjectUtils.isEmpty(voucherAmount)?BigDecimal.ZERO:voucherAmount;
		ownerType =ObjectUtils.isEmpty(ownerType)?"":ownerType;
		BigDecimal one = new BigDecimal("1.00");
		if(OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP.equals(goodsProjectType)) {
			
		}else if(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP.equals(goodsProjectType)){
			if(OrderConstant.ownerType.OWNER_TYPE_AGENT.equals(ownerType)) {
				//助理人  1-m_fee_rate/1000//也就是10% (商品金额-店铺优惠)*（1-m_fee_rate）
				BigDecimal  fee = one.subtract(mFeeRate.divide(new BigDecimal("1000"),3, BigDecimal.ROUND_HALF_UP));
				poormoney=(goodsAmount.subtract(voucherAmount)).multiply(fee);
				
			}else if(assistId >0) {
				//集采 订单实际金额 *0.1(数据库中存的金额是分) (商品金额-店铺优惠)*（1-m_fee_rate）
				poormoney=(goodsAmount.subtract(voucherAmount)).divide(new BigDecimal("10"),3, BigDecimal.ROUND_HALF_UP);
			}else {//if(OrderConstant.ownerType.OWNER_TYPE_POOR.equals(ownerType))
				BigDecimal serviceFeeRate = this.getServiceFeeRate(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP, null, null, 0);
				//1-(serviceFeeRate+fundFeeRate)/1000 （商品金额+运费）*（1-service_fee_rate）
				BigDecimal fee = one.subtract(serviceFeeRate.divide(new BigDecimal("1000"),3, BigDecimal.ROUND_HALF_UP));
				//poormoney=goodsAmount.add(shipfee).multiply(fee);
				poormoney=goodsAmount.multiply(fee);
			}
		}
	
		return poormoney.setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	/**
	 * zy 
	 */
	//注意预提交使用
	public void getPreSumbitOrderMoney(DisOrderGoodsInfo disOrderGoodsInfo){
		GoodsInfo goodsInfo = disOrderGoodsInfo.getGoodsInfoList().get(0);
		Integer publisherId = goodsInfo.getPublisherId();
		Integer goodsProjectType = goodsInfo.getGoodsProjectType();
		Integer assistId = goodsInfo.getAssistId();
		String ownerType = goodsInfo.getOwnerType();
		String channel = goodsInfo.getChannel();
		BigDecimal moneyPay = disOrderGoodsInfo.getMoneyPay();
		BigDecimal shipFee = disOrderGoodsInfo.getShipFee();
		BigDecimal goodsAmount = disOrderGoodsInfo.getAllGoodsAmount();
		BigDecimal storeDisCount = disOrderGoodsInfo.getStoreDisCount();
		BigDecimal platformDiscount = disOrderGoodsInfo.getPlatformDiscount();
		BigDecimal orderAmount = disOrderGoodsInfo.getOrderAmount();
		moneyPay = ObjectUtils.isEmpty(moneyPay)?BigDecimal.ZERO :moneyPay;
		shipFee = ObjectUtils.isEmpty(shipFee)?BigDecimal.ZERO :shipFee;
		goodsAmount = ObjectUtils.isEmpty(goodsAmount)?BigDecimal.ZERO :goodsAmount;
		storeDisCount = ObjectUtils.isEmpty(storeDisCount)?BigDecimal.ZERO :storeDisCount;
		platformDiscount = ObjectUtils.isEmpty(platformDiscount)?BigDecimal.ZERO :platformDiscount;
		orderAmount = ObjectUtils.isEmpty(orderAmount)?BigDecimal.ZERO :orderAmount;
		
		BigDecimal helpMoney=BigDecimal.ZERO;
		BigDecimal helpRate=OrderConstant.FeeRate.HELP_RATE;
		BigDecimal buyerGetPoints=BigDecimal.ZERO;
		BigDecimal buyerPointsRate=OrderConstant.FeeRate.BOC_POINT_RATE;//预提交 写死了
		//预设服务费
		BigDecimal  serviceRate = OrderConstant.FeeRate.SERVICE_RATE;
		BigDecimal  fundFeeRate = this.getFundFeeRate(goodsProjectType, publisherId, channel, assistId, ownerType);
		BigDecimal  serviceFee = moneyPay.multiply(serviceRate).divide(new BigDecimal(1000),3, BigDecimal.ROUND_HALF_UP);
		//fee
		BigDecimal fundFee =(goodsAmount.subtract(storeDisCount).subtract(serviceFee)).multiply(fundFeeRate).divide(new BigDecimal(1000),3, BigDecimal.ROUND_HALF_UP);
		//买家可获得积分
		if(!OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP.equals(goodsProjectType)) {
			buyerGetPoints =(goodsAmount.add(shipFee).subtract(storeDisCount).subtract(platformDiscount)
					).setScale(2, BigDecimal.ROUND_HALF_UP).multiply(buyerPointsRate);
		}
		//贫困户可金额
		if(OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP.equals(goodsProjectType)) {
		}else if(OrderConstant.ownerType.OWNER_TYPE_AGENT.equals(ownerType)) {
			helpMoney = (goodsAmount.subtract(storeDisCount).subtract(serviceFee)).multiply(helpRate).divide(new BigDecimal(1000),3, BigDecimal.ROUND_HALF_UP);
		}else if(assistId > 0) {
			helpMoney = (goodsAmount.subtract(storeDisCount).subtract(serviceFee)).multiply(helpRate).divide(new BigDecimal(1000),3, BigDecimal.ROUND_HALF_UP);
		}else {
			helpMoney = goodsAmount.add(shipFee).subtract(serviceFee);
			//贫困户是%
			helpRate = new BigDecimal(1000);
			
		}
		//贫苦户可获得金额
		disOrderGoodsInfo.setHelpFee(helpMoney.setScale(2, BigDecimal.ROUND_HALF_UP));
		disOrderGoodsInfo.setHelpRate(helpRate.setScale(2, BigDecimal.ROUND_HALF_UP));
		//买家可获得积分
		disOrderGoodsInfo.setBuyerGetPoint(buyerGetPoints);
		disOrderGoodsInfo.setBuyerGetRate(buyerPointsRate);
		disOrderGoodsInfo.setFundFee(fundFee.setScale(2, BigDecimal.ROUND_HALF_UP));
		disOrderGoodsInfo.setFundRate(fundFeeRate);
		disOrderGoodsInfo.setServiceFee(serviceFee.setScale(2, BigDecimal.ROUND_HALF_UP));
		disOrderGoodsInfo.setServiceRate(serviceRate);
	}
	/***
	 * zy 
	 * 获得贫困户已获得的帮扶金额 每一单 历史记录
	 * 暂时没有使用到
	 */
	public BigDecimal getPoorHaveGetMoney(Integer goodsProjectType,Integer assistId,BigDecimal shipfee,BigDecimal goodsAmount,
			BigDecimal voucherAmount, String ownerType, BigDecimal mFeeRate, BigDecimal serviceFee, BigDecimal fundFee) {
		BigDecimal poormoney=BigDecimal.ZERO;
		mFeeRate =ObjectUtils.isEmpty(mFeeRate)?BigDecimal.ZERO:mFeeRate;
		shipfee =ObjectUtils.isEmpty(shipfee)?BigDecimal.ZERO:shipfee;
		goodsAmount =ObjectUtils.isEmpty(goodsAmount)?BigDecimal.ZERO:goodsAmount;
		voucherAmount =ObjectUtils.isEmpty(voucherAmount)?BigDecimal.ZERO:voucherAmount;
		ownerType =ObjectUtils.isEmpty(ownerType)?"":ownerType;
		BigDecimal one = new BigDecimal("1.00");
		if(OrderConstant.ProjectType.PROJECT_TYPE_SY_SHOP.equals(goodsProjectType)) {
			
		}else if(OrderConstant.ProjectType.PROJECT_TYPE_DA_SHOP.equals(goodsProjectType)){
			if(OrderConstant.ownerType.OWNER_TYPE_AGENT.equals(ownerType)) {
				//助理人  1-m_fee_rate/1000//也就是10% (商品金额-店铺优惠)*（1-m_fee_rate）
				BigDecimal  fee = one.subtract(mFeeRate.divide(new BigDecimal("1000"),3, BigDecimal.ROUND_HALF_UP));
				poormoney=(goodsAmount.subtract(voucherAmount)).multiply(fee);
				
			}else if(assistId >0) {
				//集采 订单实际金额 *0.1(数据库中存的金额是分) (商品金额-店铺优惠)*（1-m_fee_rate）
				poormoney=(goodsAmount.subtract(voucherAmount)).divide(new BigDecimal("10"),3, BigDecimal.ROUND_HALF_UP);
			}else {//if(OrderConstant.ownerType.OWNER_TYPE_POOR.equals(ownerType))
				//历史中可能存又fund_fee
				poormoney=goodsAmount.add(shipfee).subtract(serviceFee).subtract(fundFee);
			}
		}
	
		return poormoney.setScale(2, BigDecimal.ROUND_HALF_UP);
	}

}
