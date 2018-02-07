package com.shanyuan.platform.ms.facade.union;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.shanyuan.platform.ms.facade.TestApplicationFacade;

@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = TestApplicationFacade.class)
public class UnionTest {
	
	@Autowired
	private UnionFacade unionFacade;
	
	@Test
	public void selectUnionTest(){
		Map<String, Object> selectUnion = unionFacade.selectUnion();
		System.out.println(new JSONObject(selectUnion));
	}

}
