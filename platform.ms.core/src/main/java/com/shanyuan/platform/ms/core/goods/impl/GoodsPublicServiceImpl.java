package com.shanyuan.platform.ms.core.goods.impl;

import com.shanyuan.platform.ms.core.goods.SyGoodsService;
import com.shanyuan.platform.ms.dao.goods.entity.SyGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GoodsPublicServiceImpl {


    @Autowired
    private SyGoodsService syGoodsService;

    //查询最新商品明细 生成静态页
    public void buildGoodsStaticPage(){

      SyGoods goods =  syGoodsService.selectGoodsInfo(123);

    }



}
