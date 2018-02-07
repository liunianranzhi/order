package com.shanyuan.platform.ms.core.goods;

import java.util.List;

import com.shanyuan.platform.ms.core.order.bo.GoodsInfo;


public interface SaleNumService {
	void updateSaleNum(List<GoodsInfo> goodsInfoList);
}
