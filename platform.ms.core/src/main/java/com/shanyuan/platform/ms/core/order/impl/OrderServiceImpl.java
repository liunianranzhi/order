package com.shanyuan.platform.ms.core.order.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.constant.OrderConstant.FreightType;
import com.shanyuan.platform.ms.core.order.OrderService;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderExample;
import com.shanyuan.platform.ms.dao.order.entity.SyTransportExtendExample;
import com.shanyuan.platform.ms.dao.order.entity.SyTransportExtendWithBLOBs;
import com.shanyuan.platform.ms.dao.order.mapper.SyOrderMapper;
import com.shanyuan.platform.ms.dao.order.mapper.SyTransportExtendMapper;


/**
 * 
 * @author 曹勇军
 *
 */
@Component
public class OrderServiceImpl implements OrderService {

	@Autowired
	private SyTransportExtendMapper syTransportExtendMapper;
	
	@Autowired
	private SyOrderMapper syOrderMapper;
	
	/**
	 * @author 曹勇军
	 * key 对应 多个商品
	 * for循环多个商品
	 * 为了计算相同的模板有多少个数量
	 * 
	 * 结果是  一个key有多个运费模板* 数量 = 金额
	 */
	public Map<String,BigDecimal> goodsFreight(Map<String,DisOrderGoodsInfo> disOrderGoods,Long cityId) throws CoreServiceException {
			
		Map<String,Map<Integer,Integer>> storeTransPort=new HashMap<String,Map<Integer,Integer>>();
		//将商品按照运费模板id分组
		for (String key :disOrderGoods.keySet()) {
			List<GoodsInfo> goodsInfoList=disOrderGoods.get(key).getGoodsInfoList();
			Map<Integer,Integer> transPort=storeTransPort.get(key);//模板id有多少个商品数量
			if(ObjectUtils.isEmpty(transPort)) {
			    transPort=new HashMap<Integer,Integer>();
			}
			for(int i=0;i<goodsInfoList.size();i++) {
				GoodsInfo goodsInfo=goodsInfoList.get(i);
				if(goodsInfo.getTransportId()>0) {
					Integer goodsNum=transPort.get(goodsInfo.getTransportId());
					if(ObjectUtils.isEmpty(goodsNum)) {
						goodsNum=0;
					}
					transPort.put(goodsInfo.getTransportId(),goodsNum+goodsInfo.getGoodsNum());
				}
			}
			//key 对应的运费map
			if(!ObjectUtils.isEmpty(transPort)) {
				storeTransPort.put(key,transPort);
			}
		}
		//无运费
		if(ObjectUtils.isEmpty(storeTransPort)) {
			return null;
		}
		Map<String,BigDecimal> result=new HashMap<String,BigDecimal>();
		//计算运费
		BigDecimal storeTransportFee=null;
		for(String key :storeTransPort.keySet()) {
			Map<Integer,Integer> transPort=storeTransPort.get(key);
			storeTransportFee=BigDecimal.ZERO;
			for(Integer transPortId:transPort.keySet()) {
				 storeTransportFee=storeTransportFee.add(calcTransport(transPortId,transPort.get(transPortId),cityId));
			}
			if(storeTransportFee.compareTo(BigDecimal.ZERO)>0) {
				result.put(key,storeTransportFee);
			}
			
		}
		return result;
	}
	/**
	 * @author 曹勇军
	 * 计算运费
	 * 
	 * 购买数量超出首件数量时
	 * 		首件运费 + ((购买数量-首件数量)/续件数量)*续件运费
	 * 没有超过时
	 * 		首件运费
	 */
	private BigDecimal calcTransport(Integer transPortId,Integer buyNum,Long cityId) {
		BigDecimal calcTotal=BigDecimal.ZERO;
		BigDecimal calcDefaultTotal=BigDecimal.ZERO;
		SyTransportExtendExample syTransportExtendExample=new SyTransportExtendExample();
		syTransportExtendExample.createCriteria().andTransportIdEqualTo(transPortId);
		List<SyTransportExtendWithBLOBs> syTransportExtendList=syTransportExtendMapper.selectByExampleWithBLOBs(syTransportExtendExample);
		if(ObjectUtils.isEmpty(syTransportExtendList)) {
			return calcTotal;
		}
		
		for(int i=0;i<syTransportExtendList.size();i++) {
			SyTransportExtendWithBLOBs syTransportExtend=syTransportExtendList.get(i);
			if(syTransportExtend.getAreaId().indexOf(","+cityId+",")>-1) {
				if(buyNum<=syTransportExtend.getSnum()) {
					calcTotal=calcTotal.add(syTransportExtend.getSprice());
				}else {
					calcTotal=calcTotal.add(syTransportExtend.getSprice().add(new BigDecimal(
							Math.ceil((buyNum-syTransportExtend.getSnum())/syTransportExtend.getXnum()))
							.multiply(syTransportExtend.getXprice())));
				}
			}
			if(FreightType.DEFAULT.equals(syTransportExtend.getIsDefault())) {//默认运费 
				if(buyNum<=syTransportExtend.getSnum()) {
					calcDefaultTotal=calcDefaultTotal.add(syTransportExtend.getSprice());
				}else {
					calcDefaultTotal=calcDefaultTotal.add(syTransportExtend.getSprice().add(new BigDecimal(
							Math.ceil((buyNum-syTransportExtend.getSnum())/syTransportExtend.getXnum()))
							.multiply(syTransportExtend.getXprice())));
				}
				
			}
			
		}
		
		if(calcTotal.compareTo(BigDecimal.ZERO)<=0) {
			calcTotal=calcDefaultTotal;
		}
		
		return calcTotal;
	}
	
	public static void main(String[] args) {
		Map<String,Map<Integer,Integer>> storeTransPort=new HashMap<String,Map<Integer,Integer>>();
		Map<Integer,Integer> transPort=new HashMap<Integer,Integer>();
		System.out.println(transPort.get(12));
	}
	
	@Override
	public Integer getMemberBuyNum(Integer memberId, String orderStateSuccess) {
		
		SyOrderExample orderExample = new SyOrderExample();
		orderExample.createCriteria().andBuyerIdEqualTo(memberId).andOrderStateEqualTo(orderStateSuccess);
		
		return  this.syOrderMapper.countByExample(orderExample);
	}
}
