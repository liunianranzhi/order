package com.shanyuan.platform.ms.dao.order.mapper;

import com.shanyuan.platform.ms.dao.order.entity.SyOrder;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SyOrderMapper {
    int countByExample(SyOrderExample example);

    int deleteByExample(SyOrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(SyOrder record);

    int insertSelective(SyOrder record);

    List<SyOrder> selectByExample(SyOrderExample example);

    SyOrder selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") SyOrder record, @Param("example") SyOrderExample example);

    int updateByExample(@Param("record") SyOrder record, @Param("example") SyOrderExample example);

    int updateByPrimaryKeySelective(SyOrder record);

    int updateByPrimaryKey(SyOrder record);
    /**
     * @author zhongying
     * @param record
     * @return
     */
    List<SyOrder> selectOrderPaySnList(SyOrder record);
    /**
     * @author zhongying
     * @param record
     * @return
     */
    List<SyOrder> selectOrderListByPaySn(SyOrder record);
    /**
     * @author zhongying
     * @param record
     * @return
     */
    List<SyOrder> selectOrderListByState(SyOrder record);
    /**
     * @author zhongying
     * @param record
     * @return
     */
    List<SyOrder> selectOrderListByIds(List<Integer> orderIds);
    /**
     * 根据支付钱数 根据单个pay_sn
     * @param record
     * @return
     */
   SyOrder selectOrderMoneyByPaySn(SyOrder record);
   /**
    * 获得商场fundfee
    * @param map
    * @return
    */
   List<SyOrder> selectFundFeeByOrderId(Map<String, Object> map);
   
   Integer selectCountByExample (SyOrderExample example);

   /**
    * 订单的总金额
    * @return
    * @author zhangwd
    */
   Double selectOrderAmount();
   /**
    * 获取发布者已经完成的帮扶金额
    * @Author wang chunru
    * @Description 
    * @param 
    * @return double
    * @throws
    */
   double selectOrderAmountByMemberId(Integer memberId);
   /**
    * 发货速度
    * @Author wang chunru
    * @Description 
    * @param 
    * @return long
    * @throws
    */
   long selectSendSpeed(@Param("memberId")Integer memberId, @Param("startTime")Long startTime, @Param("endTime")Long endTime);
   /**
    * 退款单数
    * @Author wang chunru
    * @Description 
    * @param 
    * @return int
    * @throws
    */
   long selectRefundCount(@Param("memberId")Integer memberId, @Param("startTime")Long startTime, @Param("endTime")Long endTime,
		   @Param("sendSpeed")Integer sendSpeed);
   /**
    * 获取总订单数
    * @Author wang chunru
    * @Description 
    * @param 
    * @return int
    * @throws
    */
   int selectOrderCount(@Param("memberId")Integer memberId, @Param("startTime")Long startTime, @Param("endTime")Long endTime);
    
}