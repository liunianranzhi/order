package com.shanyuan.platform.ms.core.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.core.order.bo.DisOrderGoodsInfo;
import com.shanyuan.platform.ms.core.order.bo.OrderGoods;
import com.shanyuan.platform.ms.core.order.bo.OrderInfo;
import com.shanyuan.platform.ms.core.order.bo.OrderListInfo;
import com.shanyuan.platform.ms.core.order.bo.OrderRecordInfo;
import com.shanyuan.platform.ms.dao.order.entity.SyOrder;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderCommon;
import com.shanyuan.platform.ms.dao.order.entity.SyOrderGoods;
/**
 * 
 * @author 冯祚
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class QueryOrderServiceTest {
	@Autowired
	private QueryOrderService queryOrderService;
	/**
	 * 评价id 获得相关ordergoods测试
	 */
	@Test
	public void getOrderGoodsMapByEidsTest() {
		List<Integer> gevalIds = new ArrayList<Integer>();
		gevalIds.add(0);
		Map<Integer ,SyOrderGoods> orderEval = queryOrderService.getOrderGoodsMapByEids(gevalIds);
		System.err.println(orderEval);
	}
	/**
	 * 根据orderids 获得以orderid 为key的order测试
	 */
	@Test
	public void getOrderMapByIdsTest() {
		List<Integer> orderids = new ArrayList<Integer>();
		orderids.add(271);
		Map<Integer,SyOrder> map = queryOrderService.getOrderMapByIds(orderids);
		System.err.println(map);
	}
	/**
	 * 获得基金费率测试
	 */
	@Test
	public void getFundFeeByOrderIdTest() {
		List<Integer> orderIds = new ArrayList<Integer>();
		orderIds.add(271);
		Integer goodsProjectType = 17;
		List<SyOrder> fundFeeList = queryOrderService.getFundFeeByOrderId(orderIds, goodsProjectType);
		System.err.println(fundFeeList);
	}
	/**
	 * 获得未支付订单相关的金额的详细列表测试
	 */
	@Test
	public void getUnPayOrderListDetailTest() {
		Long paySn = 560495380796325048l;
		List<OrderInfo> orderInfoList = queryOrderService.getUnPayOrderListDetail(paySn);
		System.err.println(orderInfoList);
	}
	/**
	 * 相关费用测试
	 */
	@Test
	public void getMoneyInfoTest() {
		List<SyOrder> orderlist = new ArrayList<SyOrder>();
		SyOrder syOrder = new SyOrder();
		syOrder.setOrderId(271);
		List<Integer> orderIds = new ArrayList<Integer>();
		List<OrderInfo> orderInfoList = queryOrderService.getMoneyInfo(orderlist, orderIds);
		System.out.println(orderInfoList);
	}
	/**
	 * 获得ordercommon信息
	 */
	@Test
	public void getOrderCommonInfo() {
		Integer orderId = 281;
		SyOrderCommon syOrderCommon = queryOrderService.getOrderCommonInfo(orderId);
		System.err.println(syOrderCommon);
	}
	/**
	 * 根据paysn 获得订单相关金额
	 */
	@Test
	public void getOrderMoneyByPaySnTest() {
		Long paySn = 560495380796325048l;
		Byte deleted = 0;
		SyOrder orderMoneyByPaySn = queryOrderService.getOrderMoneyByPaySn(paySn, deleted);
		System.err.println(orderMoneyByPaySn);
	}
	/**
	 * 获得申请退款id
	 */
	@Test
	public void getComplainIdsTest() {
		List<Integer> orderIds = new ArrayList<Integer>();
		orderIds.add(125051);
		Map<Integer,Integer> complain = queryOrderService.getComplainIds(orderIds);
		System.err.println(complain);
	}
	/**
	 * 获得卖家拒绝的次数
	 */
	@Test
	public void getRefundReturnIdsTest() {
		List<Integer> orderIds = new ArrayList<Integer>();
		orderIds.add(1026558);
		Map<Integer,Integer> refunds = queryOrderService.getRefundReturnIds(orderIds);
		System.err.println(refunds);
	}
	/**
	 * 获得已支付的订单列表 
	 */
	@Test
	public void getPayedInfoTest() {
		Integer buyerId = 48;
		String orderState = "40";
		Byte delete = 0;
		String orderBy = null;
		Integer pageSize = null;
		Integer currentpage = null;
		String fromType = null;
		List<SyOrder> orders = queryOrderService.getPayedInfo(buyerId, orderState, delete, orderBy, pageSize, currentpage, fromType);
		System.err.println(orders);
	}
	/**
	 * 根据状态获得图片信息
	 */
	@Test
	public void getOrderGoodsImagesTest() {
		
		//case1:不传参
	//	List<OrderGoods> oGoodsList = queryOrderService.getOrderGoodsImages(null, null, null);
		
		//case2：传参
		List<OrderGoods> oGoodsList = queryOrderService.getOrderGoodsImages(48, "40", (byte)0);
		
		System.err.println(oGoodsList);
	}
	/**
	 * 通过orderids 获得gooodsinfo
	 */
	@Test
	public void getOrderGoodsInfoByOrderIdsTest() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(271);
		list.add(272);
		
		//case1:传参
		List<OrderGoods> oGoodsList = queryOrderService.getOrderGoodsInfoByOrderIds(list);
		//case2:无参
	//	List<OrderGoods> oGoodsList = queryOrderService.getOrderGoodsInfoByOrderIds(null);
		
		System.err.println(oGoodsList);
	}
	/**
	 * 根据goods_id获取ordergoods
	 */
	@Test
	public void getOrderGoodsByGidsTest() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(100288);
		//case1:无参数
	//	Map<Integer,SyOrderGoods> map = queryOrderService.getOrderGoodsByGids(null, null);
		//case2：传递参数
		Map<Integer,SyOrderGoods> map = queryOrderService.getOrderGoodsByGids(271, list);
		System.err.println(map);
	}
	/**
	 * 获得单条记录
	 */
	@Test
	public void selectByPrimaryKeyTest() {
		//case1:无参数
	//	SyOrder order = queryOrderService.selectByPrimaryKey(null);
		//case2：传递参数
		SyOrder order = queryOrderService.selectByPrimaryKey(271);
		System.err.println(order);
	}
	/**
	 * getOrderListByParam
	 */
	@Test
	public void getOrderListByParamTest() {
		//case1:无参
	//	List<SyOrder> orderList = queryOrderService.getOrderListByParam(null, null, null, null);
		//case2:有参
		List<SyOrder> orderList = queryOrderService.getOrderListByParam("paySn", null, null, 560495380796325048l);
		System.err.println(orderList);
	}
	/**
	 * 获得支付信息列表
	 */
	@Test
	public void getOrderPaySnListTest() {
		//case1:无参
	//	List<SyOrder> orderPaySnList = queryOrderService.getOrderPaySnList(null, null, null);
		//case2:有参
		List<SyOrder> orderPaySnList = queryOrderService.getOrderPaySnList(48, null, (byte)0);
		System.err.println(orderPaySnList);
	}
	/**
	 * 订单列表
	 */
	@Test
	public void getOrderListInfoTest() {
		Map<String, DisOrderGoodsInfo> disOrderGoods = null;
		OrderListInfo orderListInfo = queryOrderService.getOrderListInfo(disOrderGoods);
		System.err.println(orderListInfo);
	}
	/**
	 * 获得已支付的总条数
	 */
	@Test
	public void getPayedInfoCountTest() {
		//case1:buyerId传参
	//	Integer num = queryOrderService.getPayedInfoCount(48, null, null);
		//case2:buyerId,orderState传参
	//	Integer num = queryOrderService.getPayedInfoCount(48, "40", null);
		//case3:buyerId,orderState,delete传参
		Integer num = queryOrderService.getPayedInfoCount(48, "40", (byte)0);
		System.err.println(num);
	}
	/**
	 * 处理未支付列表
	 */
	@Test
	public void doUnPayOrderTest() {
		List<OrderRecordInfo> orderInfoList = queryOrderService.doUnPayOrder(60, null, null);
		System.err.println(orderInfoList);
	}
	/**
	 * 转成每一单的数据
	 */
	@Test
	public void getOrderGoodsMapByOrderIdsTest() {
		List<Integer> orderIds = new ArrayList<Integer>();
		orderIds.add(1026558);
		//case1:无参
	//	Map<Integer, OrderRecordInfo> datamap = queryOrderService.getOrderGoodsMapByOrderIds(null);
		//case2:传参
		Map<Integer, OrderRecordInfo> datamap = queryOrderService.getOrderGoodsMapByOrderIds(orderIds);
		System.err.println(datamap);
	}
	/**
	 * selectOrderGoodsMap
	 */
	@Test
	public void selectOrderGoodsMapTest() {
		SyOrder syorder = new SyOrder();
		syorder.setBuyerId(48);
		syorder.setDeleted((byte)0);
		//case1:无参
	//	Map<Integer,SyOrderGoods> map = queryOrderService.selectOrderGoodsMap(null);
		//case2:传参
		Map<Integer,SyOrderGoods> map = queryOrderService.selectOrderGoodsMap(syorder);
		System.err.println(map);
	}
	/**
	 * 获得相关的ordergoods
	 */
	@Test
	public void selectOrderGoodsInfo() {
		SyOrder syorder = new SyOrder();
		syorder.setBuyerId(48);
		syorder.setDeleted((byte)0);
		//case1:无参
	//	List<SyOrderGoods> orderGoodsInfo = queryOrderService.selectOrderGoodsInfo(null);
		//case2:传参
		List<SyOrderGoods> orderGoodsInfo = queryOrderService.selectOrderGoodsInfo(syorder);
		System.err.println(orderGoodsInfo);
	}
	
}
