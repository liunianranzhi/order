/**
 * 
 */
package com.shanyuan.platform.ms.core.topic;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.core.topic.bo.TopicBo;
import com.shanyuan.platform.ms.core.topic.bo.TopicListBo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * @author 钟颖
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class SyTopicServiceTest {
	
	@Autowired
	private SyTopicService topicService;
	@Autowired
	private StringRedisTemplate redisTemplate;

	private String rkey_topic_goods_info = "sy_topic_goods_info_";
	
	//
	public void isTopicStartGoods(){
		boolean topicStartGoods = topicService.isTopicStartGoods(978165);
		System.out.println("qqq:"+topicStartGoods);
	}
	//@Test
	public void getFloorList(){
		List<List<TopicBo>> floorList = topicService.getFloorList(33);
		System.out.println("qqq:"+floorList);
	}

	//@Test
	public void getTopicFromRedis(){
		TopicListBo klist= topicService.getTopicFromRedis(33);
		System.out.println("qqq:"+klist);
	}
    //@Test
	public void testRedis() {
		List<String> list = new ArrayList<String>();
		String rkey=rkey_topic_goods_info+978165;
		HashOperations<String,String,String> ho =  redisTemplate. opsForHash();
		String topicId = ho.get(rkey, "topic_id");
		Integer tid= ObjectUtils.isEmpty(topicId)?0:Integer.parseInt(topicId);
		String goodsId = ho.get(rkey, "goods_id");
		Integer gid= ObjectUtils.isEmpty(goodsId)?0:Integer.parseInt(goodsId);
		String actSaleNum = ho.get(rkey, "act_sale_num");
		Integer salenum= ObjectUtils.isEmpty(actSaleNum)?0:Integer.parseInt(actSaleNum);
		String actGoodsStorage = ho.get(rkey, "act_goods_storage");
		Integer storage= ObjectUtils.isEmpty(actGoodsStorage)?0:Integer.parseInt(actGoodsStorage);
		String floorsSort = ho.get(rkey, "floor_sort");
		Integer fsort= ObjectUtils.isEmpty(floorsSort)?0:Integer.parseInt(floorsSort);
		String goodsCommonid = ho.get(rkey, "goods_commonid");
		Integer cid= ObjectUtils.isEmpty(goodsCommonid)?0:Integer.parseInt(goodsCommonid);
		String todaySale =  ho.get(rkey, "today_sale");
		Integer tsale= ObjectUtils.isEmpty(todaySale)?0:Integer.parseInt(todaySale);
		String todayNum =  ho.get(rkey, "today_num");
		Integer tnum= ObjectUtils.isEmpty(todayNum)?0:Integer.parseInt(todayNum);
		String actBocPoints =  ho.get(rkey, "act_boc_points");
		Integer bpoints= ObjectUtils.isEmpty(actBocPoints)?0:Integer.parseInt(actBocPoints);

		list.add("topic_id");
		list.add("goods_id");
		list.add("act_sale_num");
		list.add("act_goods_storage");
		list.add("floor_sort");
		list.add("goods_commonid");
		list.add("today_sale");
		list.add("today_num");
		list.add("act_boc_points");
        List<String> lists=	ho.multiGet(rkey,list);
        for(int i=0;i<lists.size();i++){
            String sy =lists.get(i);
            System.out.println(i+":"+sy);

        }
       /* ListOperations<String, String> llist=redisTemplate.opsForList();
        llist.trim("ni",0,9);
        for(int i=0;i<11;i++){
            Integer j=i;
            llist.leftPush("ni",j.toString());
            System.out.println("");
        }*/



	}

}
