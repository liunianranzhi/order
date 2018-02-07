package com.shanyuan.platform.ms.core.topic;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.core.topic.bo.TopicBo;
import com.shanyuan.platform.ms.core.topic.bo.TopicGoodsInfo;
import com.shanyuan.platform.ms.core.topic.bo.TopicListBo;

import java.util.List;


public interface SyTopicService {
    /** 判断商品是否是活动期间的商品
     * @auther zhongying
     * @param goodsid
     * @return
     * @throws CoreServiceException
     */
  boolean isTopicStartGoods(Integer goodsid) throws CoreServiceException;

  /**
   * 获得活动相关
   * @param goodsid
   * @return
   * @throws CoreServiceException
   */
  TopicGoodsInfo getTopicGoods(Integer goodsid) throws CoreServiceException;

  /**
   * 修改活动商品的销量
   * @param goodsid
   * @param salenum
   * @return
   * @throws CoreServiceException
   */
  Integer updateTopicGoodsSaleNum(Integer goodsid,Integer salenum) throws CoreServiceException;

  /**
   *  @auther zhongying
   * @param topicid
   * @return
   * @throws CoreServiceException TopicBo
   */
  List<List<TopicBo>>  getFloorList(Integer topicid) throws CoreServiceException;


  /**得到专题信息
   * @auther zhongying
   * @param topicid
   * @return
   * @throws CoreServiceException
   */
  TopicListBo getTopicFromRedis(Integer topicid) throws CoreServiceException;
  /**
   * 
   * @param keys
   * @return
   */
  List<String> getStringRedis(List<String> keys) ;

}
