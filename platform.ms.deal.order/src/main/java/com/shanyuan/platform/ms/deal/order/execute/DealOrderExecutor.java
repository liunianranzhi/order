package com.shanyuan.platform.ms.deal.order.execute;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.alibaba.fastjson.JSON;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.base.queue.redis.TaskQueueExecute;
import com.shanyuan.platform.ms.base.queue.redis.bean.BaseMessage;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.dao.user.entity.SyAddress;
import com.shanyuan.platform.ms.dao.user.entity.SyVoucher;
import com.shanyuan.platform.ms.facade.order.OrderFacade;


/**
 * @author 曹勇军
 *
 */
@Component
public class DealOrderExecutor implements TaskQueueExecute {
	
	private final Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private OrderFacade orderFacade;
	
	@SuppressWarnings("unchecked")
	@Override
	public void executeTask(BaseMessage data) throws CoreServiceException {
		
		
		Map<String,Object> jsonData = JSON.parseObject(data.getJsonData(), Map.class);
		Long paySn=(Long)jsonData.get("paySn");
		SyVoucher voucherInfo=JSON.parseObject(JSON.toJSONString(jsonData.get("voucherInfo")), SyVoucher.class);
		Integer memberId=(Integer)jsonData.get("memberId");
		String memberName=(String)jsonData.get("memberName");
		String memberTruename=(String)jsonData.get("memberTruename");
		SyAddress syAddress=JSON.parseObject(JSON.toJSONString(jsonData.get("syAddress")), SyAddress.class);
		String resultKey=(String)jsonData.get("resultKey");
		Integer sharedMid=(Integer)jsonData.get("sharedMid");
		Integer sharedGoodsCommonid=(Integer)jsonData.get("sharedGoodsCommonid");
		Integer needPoints=(Integer)jsonData.get("needPoints");
		String orderStatus=(String)jsonData.get("orderStatus");
		
		//为了json转成对象不然消费出现问题
		Map<String,Object> resultVourchGoods=JSON.parseObject(JSON.toJSONString(jsonData.get("vourchGoods")), Map.class);
		Map<Integer,BigDecimal> vourchGoods=null;
		if(!ObjectUtils.isEmpty(resultVourchGoods)){
			vourchGoods=new HashMap<Integer,BigDecimal>();
			for(String key:resultVourchGoods.keySet()){
				vourchGoods.put(Integer.parseInt(key), JSON.parseObject(JSON.toJSONString(resultVourchGoods.get(key)), BigDecimal.class));
			}
		}
		
		Map<String,Object> resultGoodsIdMap=JSON.parseObject(JSON.toJSONString(jsonData.get("goodsIdMap")), Map.class);
		Map<Integer,Integer> goodsIdMap=null;
		if(!ObjectUtils.isEmpty(resultGoodsIdMap)){
			goodsIdMap=new HashMap<Integer,Integer>();
			for(String key:resultGoodsIdMap.keySet()){
				goodsIdMap.put(Integer.parseInt(key), JSON.parseObject(JSON.toJSONString(resultGoodsIdMap.get(key)), Integer.class));
			}
		}
		
		List<Object> goodsInfoList=JSON.parseObject(JSON.toJSONString(jsonData.get("goodsInfoList")), List.class);
		List<GoodsInfo> newGoodsInfoList=null;
		if(!ObjectUtils.isEmpty(goodsInfoList)){
			newGoodsInfoList=new ArrayList<GoodsInfo>();
			for(Object info:goodsInfoList){
				newGoodsInfoList.add(JSON.parseObject(JSON.toJSONString(info), GoodsInfo.class));
			}
		}
		
		Map<String,DisOrderGoodsInfo> disOrderGoodsInfo=JSON.parseObject(JSON.toJSONString(jsonData.get("disOrderGoodsInfo")), Map.class);
		if(!ObjectUtils.isEmpty(disOrderGoodsInfo)){
			for(String key:disOrderGoodsInfo.keySet()){
				disOrderGoodsInfo.put(key, JSON.parseObject(JSON.toJSONString(disOrderGoodsInfo.get(key)), DisOrderGoodsInfo.class));
			}
		}
    	
		orderFacade.dealOrder(paySn, voucherInfo, disOrderGoodsInfo, memberId, memberName, memberTruename, 
				syAddress, resultKey, vourchGoods, sharedMid, sharedGoodsCommonid, needPoints, orderStatus,newGoodsInfoList,goodsIdMap);
	}

	@Override
	public void fallbackTask(BaseMessage data) throws CoreServiceException {
		logger.info("======================= fallbackTask  "+ data.getJsonData());
	}

}
