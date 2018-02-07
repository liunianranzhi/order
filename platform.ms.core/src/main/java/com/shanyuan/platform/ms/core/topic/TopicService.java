package com.shanyuan.platform.ms.core.topic;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;

public interface TopicService {
    /**
     * 判断是否可以用活动价购买商品
     * @auther zhongying
     * @param goodsid
     * @return
     *          no_start:活动没开始,或者是非活动商品
     *          limit_time:没有到达开始抢购时间
     *          today_finish:今日购买数量已经完成
     *          can_buy:可以用活动价格购买
     *          no_storage:没有库存
     */
  String  getTopicGoodsStatus(Integer goodsid) throws CoreServiceException;
    /** 判断商品是否是活动期间的商品
     * @auther zhongying
     * @param goodsid
     * @return
     * @throws CoreServiceException
     */
  boolean isTopicStartGoods(Integer goodsid) throws CoreServiceException;
    /***
     * 得到商品专题活动库存
     * @auther zhongying
     * @param goodsid
     * @return
     * @throws CoreServiceException
     */
  Integer getTopicGoodsStorage(Integer goodsid) throws CoreServiceException;

}
