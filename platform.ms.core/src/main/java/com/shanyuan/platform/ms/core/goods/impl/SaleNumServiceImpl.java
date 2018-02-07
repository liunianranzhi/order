package com.shanyuan.platform.ms.core.goods.impl;
 
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.goods.SaleNumService;
import com.shanyuan.platform.ms.core.goods.impl.exceptype.GoodsExcepType;
import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;
import com.shanyuan.platform.ms.dao.goods.entity.SySaleNum;
import com.shanyuan.platform.ms.dao.goods.entity.SySaleNumExample;
import com.shanyuan.platform.ms.dao.goods.mapper.SySaleNumMapper;
@Component
public class SaleNumServiceImpl implements SaleNumService{
	
	private static final Logger logger = LoggerFactory.getLogger(SaleNumServiceImpl.class);
	
	@Autowired
	private SySaleNumMapper sySaleNumMapper;
	
	@Override
	public void updateSaleNum(List<GoodsInfo> goodsInfoList) throws CoreServiceException {
		
		if(ObjectUtils.isEmpty(goodsInfoList)){
			return;
		}
		try {
			for(GoodsInfo goodsInfo:goodsInfoList) {
				Integer goodsId=goodsInfo.getGoodsId();
				Integer salenum=goodsInfo.getGoodsNum();
				Integer storeId=goodsInfo.getStoreId();
				Integer date=Integer.parseInt(DateUtil.getDays());
				SySaleNumExample example=new SySaleNumExample();
				example.createCriteria().andGoodsIdEqualTo(goodsId).andStoreIdEqualTo(storeId).andDateEqualTo(date);
				List<SySaleNum> listDetail=sySaleNumMapper.selectByExample(example);
				SySaleNum record=new SySaleNum();  
				
				if(ObjectUtils.isEmpty(listDetail)) {
					record.setDate(date);
					record.setGoodsId(goodsId);;
					record.setSalenum(salenum);
					record.setStoreId(storeId);
					sySaleNumMapper.insert(record);
				}else {
					SySaleNum updateSySaleNum=new SySaleNum();
					updateSySaleNum.setDate(date);
					updateSySaleNum.setGoodsId(goodsId);
					updateSySaleNum.setSalenum(salenum);
					updateSySaleNum.setStoreId(storeId);
					sySaleNumMapper.updateSaleNum(updateSySaleNum);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.info(" 增加销量失败  goodsInfoList={}",goodsInfoList.toString());
			throw new CoreServiceException(GoodsExcepType.UPDATE_SALE_FAIL,e.getMessage(),e);
		}
		
	}

}
