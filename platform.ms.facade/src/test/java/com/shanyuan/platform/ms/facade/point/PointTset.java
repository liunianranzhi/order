package com.shanyuan.platform.ms.facade.point;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.dao.user.entity.PointLogParam;
import com.shanyuan.platform.ms.dao.user.entity.SyPointsLog;
import com.shanyuan.platform.ms.facade.TestApplicationFacade;
import com.shanyuan.platform.ms.facade.point.PointFacade;

/** 
 * @author  wang chunru 
 * @date    2017年12月4日 下午5:35:27 
 * @Description   
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationFacade.class)
public class PointTset {
	@Autowired
	private PointFacade pointFacade;
	@Test
	public void getUserPointList(){
		Map<String, Object> map = pointFacade.getUserPointList(102412, 1);
		System.out.println(JSONObject.toJSONString(map));
	}
	@Test
	public void getPointList(){
		PointLogParam params = new PointLogParam();
		Map<String, Object> map = pointFacade.getPointList(params);
		System.out.println(JSONObject.toJSONString(map));
	}
	@Test
	public void addPoint(){
		SyPointsLog log = new SyPointsLog();
		log.setPlMemberid(102412);
		log.setPlMemberid2(0);
		log.setPlMembername("15829685362");
		log.setPlMemberTruename("郭仕源");
		log.setPlStage("login");
		log.setPlDesc("会员登录");
		log.setPlPoints(30);
		log.setPlAddtime((int)(System.currentTimeMillis()/1000));
		try {
			
			int res = pointFacade.addPoint(log);
			
			System.out.println(res);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void updatePoint(){
		SyPointsLog log = new SyPointsLog();
		log.setPlId(2532694);
		log.setPlPoints(0);
		log.setPlAddtime((int)(System.currentTimeMillis()/1000));
		try {
			
			int res = pointFacade.updatePoint(log);
			
			System.out.println(res);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void deletePoint(){
		try {
			int res = pointFacade.deletePoint(2532694);
			System.out.println(res);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
