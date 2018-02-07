package com.shanyuan.platform.ms.dao;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.shanyuan.platform.TestApplicationDao;
import com.shanyuan.platform.ms.base.queue.redis.PublishService;
import com.shanyuan.platform.ms.base.queue.redis.bean.Topic;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
import com.shanyuan.platform.ms.dao.user.entity.SyMemberWithBLOBs;
import com.shanyuan.platform.ms.dao.user.mapper.SyMemberMapper;
import com.shanyuan.platform.ms.dao.user.mapper.SyMessageMapper;
import com.shanyuan.platform.ms.remote.mns.TopicService;
import com.shanyuan.platform.ms.remote.mns.data.SyTopicMessage;

@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationDao.class)  
public class TestMemberMapper {
	@Autowired
	private SyMemberMapper memberMapper ;
	@Autowired
	private SyMessageMapper messageMapper ;
	@Autowired
	private TopicService topicService;
	@Autowired
	private PublishService pubService;
//	@Test
	public void testMemberMapper() {
		int i = this.memberMapper.countByExample(null);
		Assert.assertNotEquals(i, 0l);
		System.out.println("==============="+i);
		
	}
//	@Test
	public void testONSMessage() {
		Map<String,String> map = new HashMap<String,String>();
		map.put("testkey", "testValue");
		SyTopicMessage message = new SyTopicMessage("lee_test_01","tag",map);
		this.topicService.sendTopicMessage("lee_test_01", "tag", message);
	}
//	@Test
	@Rollback(true)
	@Transactional
	public void testRollback() {
	    SyMemberWithBLOBs sm = new SyMemberWithBLOBs();
	    sm.setMemberId(38);
	    sm.setSyId(2);
	    this.memberMapper.updateByPrimaryKeySelective(sm);
	}
	
//	@Test
	public void testSendMSG() {
	    Topic t = new Topic("test","");
	    for(int i=0; i<10 ; i++) {
	        pubService.publishStringMessage("test", "", UUID.randomUUID().toString().replaceAll("-", ""), "", "");
	    }
	   
	}
	
	@Test
	public void testSendOrder() {
	    Topic t = new Topic("order","dealOrder");
	    
	    SyMember member=new SyMember();
	    member.setMemberId(1);
	    member.setMemberName("测试");
	    
	    Map<String,Object> data=new HashMap<String,Object>();
	    data.put("member", member);
	    
	    Map<Integer,BigDecimal> data2=new HashMap<Integer,BigDecimal>();
	    data2.put(11, new BigDecimal(102.34));
	    data2.put(11, new BigDecimal(102.34));
	    
	    String orderId="1";
	    
	    Map<String,Object> map=new HashMap<String,Object>();
	    map.put("data", data);
	    map.put("data2", data2);
	    map.put("orderId", orderId);
	    
        pubService.publishStringMessage("order", "dealOrder", map.toString(), "", "");
        
        try {
			Thread.currentThread().sleep(10* 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
