package com.shanyuan.platform.ms.core.auth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.core.auth.bo.AuthInfo;
import com.shanyuan.platform.ms.dao.auth.entity.SyMbUserToken;
import com.shanyuan.platform.ms.dao.user.entity.SyMember;
//import com.shanyuan.platform.ms.core.user.bo.LoginInfo;
//import com.shanyuan.platform.ms.core.user.bo.LoginResult;


/**
 * 登陆认证服务测试
 * @author 冯祚
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class AuthServiceTest {
	@Autowired
	private AuthService authService;
	/**
	 * 验证用户的验证码测试
	 * @param userName pwd
	 * @param mobile mcode
	 */
	@Test
	public void validCodeTest() {
		SyMember validCodeTest = this.authService.validCode("13801321278", "123");
		System.out.println("用户信息：" + validCodeTest);
		boolean validMcode = this.authService.validMcode("13801321278", "123");
		System.out.println("是否正确：" + validMcode);
	}
	/**
	 * 验证用户的登录密码测试
	 * @param userName pwd
	 * @return 验证通过则返回用户信息，否则返回null或抛出异常
	 */
	@Test
	public void validPSWTest() {
		SyMember validPSW = this.authService.validPSW("13801321278", "123456");
		System.out.println("用户信息：" + validPSW);
	}
	/**
	 * 验证用户是否在白名单中测试
	 * @return 在白名单中返回true，否则返回false
	 */
	@Test
	public void isInWhiteListTest() {
		boolean isInWhiteList = this.authService.isInWhiteList("13801321278", "pc");
		System.out.println("是否在白名单中：" + isInWhiteList);
	}
	/**
	 * 创建AuthInfo信息
	 */
	@Test
	public void createAuthInfoTest() {
		SyMember syMember = new SyMember();
		SyMbUserToken userToken = new SyMbUserToken();
		syMember.setMemberName("fz");
		syMember.setMemberId(30);
		AuthInfo createAuthInfo = this.authService.createAuthInfo(syMember, "fz_626", userToken);
		System.out.println("用户信息：" + createAuthInfo.getMemeberInfo());
	}
	/**
	 * 创建session信息
	 */
	@Test
	public void createSessionTest() {
		AuthInfo authInfo = new AuthInfo();
		SyMember memeberInfo = new SyMember();
		memeberInfo.setMemberId(30);
		authInfo.setMemeberInfo(memeberInfo);
		AuthInfo authInfo2 = this.authService.createSession(authInfo);
		System.out.println(authInfo2);
	}
//	/**
//	 * 封装authInfo的redirect数据测试
//	 */
//	@Test
//	public void chargeToGo() {
//		LoginResult loginResult = this.authService.chargeToGo(new LoginResult(), new LoginInfo(), new SyMember());
//		System.out.println(loginResult);
//	}
	/**
	 * 获取用户的登录token测试
	 */
	@Test
	public void getUserTokenTest() {
		SyMbUserToken syMbUserToken = authService.getUserToken(38);
		System.out.println("用户的token：" + syMbUserToken.getToken());
	}
}
