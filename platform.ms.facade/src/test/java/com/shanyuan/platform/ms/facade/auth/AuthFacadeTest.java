package com.shanyuan.platform.ms.facade.auth;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.ObjectUtils;

import com.alibaba.fastjson.JSONObject;
import com.aliyun.openservices.shade.com.alibaba.fastjson.JSON;
import com.shanyuan.platform.ms.core.auth.ValidCodeService;
import com.shanyuan.platform.ms.core.auth.bo.ValidCodeEnum;
import com.shanyuan.platform.ms.core.user.bo.LoginInfo;
import com.shanyuan.platform.ms.facade.TestApplicationFacade;
import com.shanyuan.platform.ms.facade.auth.domain.CircleInfoDomain;
import com.shanyuan.platform.ms.facade.auth.domain.SelectCircleDomain;
import com.shanyuan.platform.ms.facade.auth.domain.UnionDomain;

/**
 * 
 * @author yangjian
 * @date 2017/10/20
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationFacade.class)
public class AuthFacadeTest {

	@Autowired
	private ValidCodeService validCodeService;
	
	@Autowired
	private AuthFacade authFacade;
	
	private CountDownLatch latch = new CountDownLatch(100);
	
	@Test
	public void sendSms(){
		for(int i = 0; i < 10; i++){
			new Thread(new Runner()).start();
		}
		try {
			latch.await();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	class Runner implements Runnable{

		@Override
		public void run() {
			validCodeService.sendValidCode("13888888888", "111111", ValidCodeEnum.SmsValidCode);
			latch.countDown();
		}
		
	}
	
	@Test
	public void sendValidCode(){
		validCodeService.sendValidCode("13888888888", "111111", ValidCodeEnum.SmsValidCode);
	}
	
	@Test
	public void testUserLogin(){
		validCodeService.sendValidCode("13888888884", "111111", ValidCodeEnum.SmsValidCode);
		LoginInfo loginInfo = new LoginInfo();
		loginInfo.setMobile("13888888884");
		loginInfo.setMcode("111111");
		loginInfo.setChannel("boc");
		loginInfo.setLoginType("code_login");
		loginInfo.setDeviceId("123123123123");
		loginInfo.setClient("ios");
		try {
			Map<String, Object> map = authFacade.doLogin(loginInfo);
			if(!ObjectUtils.isEmpty(map)){
				JSONObject j = JSONObject.parseObject(JSON.toJSONString(map));
				System.out.println("=========================" + j.toJSONString());
			}else{
				System.out.println("=========================" + "登录失败");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testUnion(){
		UnionDomain allUnion = this.authFacade.getAllUnion();
		System.out.println(JSONObject.toJSON(allUnion));
	}
	
	@Test
	public void testCircle(){
		CircleInfoDomain subCircleInfo = this.authFacade.getSubCircleInfo(82);
		System.err.println(JSONObject.toJSON(subCircleInfo));
	}
	
	@Test
	public void testSelect(){
		List<SelectCircleDomain> selectCircleInfo = this.authFacade.selectCircleInfo("深圳市宝安管辖支行党总支前进支行党支部", "boc");
		System.out.println(JSON.toJSONString(selectCircleInfo));
	}
	
}
