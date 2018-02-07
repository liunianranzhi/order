package com.shanyuan.platform.ms.core.user;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shanyuan.platform.TestApplicationCore;
import com.shanyuan.platform.ms.dao.user.entity.SyWXAcount;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestApplicationCore.class)
public class BindThirdPlatformIDServiceTest {

	
	@Autowired
	private BindThirdPlatformIDService bPlatformIDService;
	
	
	/**
	 * @author Rzm
	 * 为memeberid的用户绑定openid的微信(memberid已绑定微信则使用就的微信openId)
	 */
	@Test
	public void bindWxOpenidV1Test() {
		Integer memberId=0;
		String openId="oqpZGwCdFnUIOipalPGNpD";
		Boolean bindWxOpenidV1 = bPlatformIDService.bindWxOpenidV1(memberId, openId);
		System.out.println(bindWxOpenidV1);
	}
	/**
	 * @author Rzm
	 * 绑定第三方
	 */
	@Test
	public void bindCorpUidTes() {
		String chnlId="7iYXM4irWDWSZMwi";
		Integer memberId=0;
		String corpUid="004401723970816";
		Boolean bindCorpUid = bPlatformIDService.bindCorpUid(chnlId, memberId, corpUid);
		System.out.println(bindCorpUid);
	}
	
	/**
	 * @author Rzm
	 * 根据memberId查询wx绑定情况
	 */
	@Test
	public void wxAccounts() {
		Integer memberId =38;
		List<SyWXAcount> wxAccounts = bPlatformIDService.wxAccounts(memberId);
		System.out.println(wxAccounts);
	}
//	@Test
//	public void bindWxOpenidV1() {
//		
//		Boolean flag = bPlatformIDService.bindWxOpenidV1(411, "oqpZGwKsIqRDOThhzWD65SOYrKQQ");
//		System.err.println(flag);
//	}
//	
//	@Test
//	public void bindCorpUid() throws Exception {
//		Boolean bindCorpUid = bPlatformIDService.bindCorpUid("7iYXM4irWDWSZMwi", 38, "46737411");
//		System.err.println(bindCorpUid);
//	}
//	
}
