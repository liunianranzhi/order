package com.shanyuan.platform.ms.core.auth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.core.auth.bo.ValidCodeEnum;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class ValidCodeServiceTest {

	@Autowired
	private ValidCodeService validCodeService;
	
	@Test
	public void sendTest(){
		boolean sendValidCode = this.validCodeService.sendValidCode("13353441709", "123123", ValidCodeEnum.SmsValidCode);
		System.out.println(sendValidCode);
	}
	
	/**
	 * 校验验证码接口
	 * @author 冯祚
	 * @return true:验证通过 false：验证失败
	 */
	
	@Test
	public void validCodeTest() {
		boolean validCode = this.validCodeService.validCode("17611583598", "123");
		System.out.println(validCode);
	}
	/**
	 * 判断发送短信是否已经冷却
	 * @author 冯祚
	 * @return true:已经冷却  false：未冷却
	 */
	@Test
	public void sendCoolDownTest() {
		boolean sendCoolDown = this.validCodeService.sendCoolDown(30, "17611583598");
		System.out.println("发送短信是否冷却：" + sendCoolDown);
	}
}
