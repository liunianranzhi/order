package com.shanyuan.platform.ms.facade.index;



import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.base.common.util.DateUtil;
import com.shanyuan.platform.ms.base.exception.CoreServiceException;
import com.shanyuan.platform.ms.facade.TestApplicationFacade;
import com.shanyuan.platform.ms.facade.index.domain.AdDomain;
import com.shanyuan.platform.ms.facade.index.domain.AgreementDomain;
import com.shanyuan.platform.ms.facade.index.domain.IndexGoodsDomain;


/**
 * 
 * @author yangjian
 * @date 2017/10/31
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationFacade.class)
public class IndexFacadeTest {
	
	@Autowired
	public IndexFacade indexFacade;

	@Autowired
	IndexGoods indexGoods;
	
	//@Test
	public void testIndexObserver() {
		int i = 0;
		for(;;) {
			//Map<String	, IndexGoodsDomain> mao = this.indexFacade.getIndexGoods(null, null);
			i++; 
		//	System.out.println("==============="+JSON.toJSONString(mao));
			if(i>3) {
				break;
			}
		}
		
	}
	
	@Test
	public void indexFacadeTest(){
		try {
			System.out.println(JSON.toJSONString(indexFacade.getCommonData("boc", "2", "c7e9029c30f1841877ef1df67d071693")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 大家帮
	 */
	@Test
	public void getHelpGoodsTest() {
		IndexGoodsDomain json = indexGoods.getHelpGoodsList(null, "boc");
		 System.out.println(json);
	}
	
	/**
	 * 特产馆
	 */
//	@Test
	public void getSpecialList() {
		IndexGoodsDomain goodsList = indexGoods.getSpecialGoodsList(null,null);
		System.out.println(JSON.toJSONString(goodsList));
	}
	
	@Test
	public void getAgentList() {
		IndexGoodsDomain agentList = null;
		try {
			agentList = indexGoods.getAgentList(null,null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(DateUtil.getNowInt());
		System.out.println("----==============="+JSON.toJSONString(agentList));
	}
	
	@Test
	public void getAdList(){
		List<AdDomain> adList = indexFacade.getAdList(null, "");
		System.out.println(JSON.toJSONString(adList));
	}
	
	@Test
	public void getIndexPop(){
		Map<String, Object> indexPop = indexFacade.getIndexPop("boc", "");
		System.out.println(JSON.toJSON(indexPop));
	}
	
	@Test
	public void getAgreePop(){
		AgreementDomain indexAgreePop = indexFacade.getIndexAgreePop("9982c5d4b5574fdfbe8a93708b26357e");
		System.out.println((JSONObject) JSONObject.toJSON(indexAgreePop));
	}

}

