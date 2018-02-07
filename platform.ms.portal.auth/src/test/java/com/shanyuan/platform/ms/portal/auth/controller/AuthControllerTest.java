package com.shanyuan.platform.ms.portal.auth.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.shanyuan.platform.ms.base.common.util.ImageBase64;
import com.shanyuan.platform.ms.base.common.util.VerifyCodeUtils;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.alibaba.fastjson.JSONObject;
import com.netflix.discovery.converters.Auto;
import com.shanyuan.platform.ms.base.common.vo.CommonVO;
import com.shanyuan.platform.ms.facade.auth.AuthFacade;
import com.shanyuan.platform.ms.facade.auth.domain.SelectCircleDomain;

import javax.imageio.ImageIO;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AuthControllerTest {


	@Autowired
	private DefaultKaptcha defaultKaptcha;
	@Autowired
    private WebApplicationContext context;
	@Autowired
	private AuthFacade authFacade;
     

    private MockMvc mockMvc;
    @Before
    public void setupMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }


    @Test
	public void testKaptcha(){
        long st = System.currentTimeMillis();
        for(int i=0;i<5000;i++){
            BufferedImage createImage = this.defaultKaptcha.createImage("5ab6");
            try {

                ImageBase64.putImage(createImage);
//                FileOutputStream  fos = new FileOutputStream(new File("d:\\verify123\\as"+i+".jpg"));
//                ImageIO.write(createImage, "jpg", fos);

//                VerifyCodeUtils.outputImage(110, 40, new FileOutputStream(new File("d:\\verify123\\as"+i+".jpg")), "a5b6");

            } catch  (Exception e) {
                e.printStackTrace();
            }
        }
        long et = System.currentTimeMillis();

        System.err.println((et-st)/1000);
//		BufferedImage createImage = this.defaultKaptcha.createImage("5ab6");
//		try {
//			FileOutputStream  fos = new FileOutputStream(new File("d:\\as.jpg"));
//			ImageIO.write(createImage, "jpg", fos);
//
//			VerifyCodeUtils.outputImage(110, 40, new FileOutputStream(new File("d:\\verify123\\as"+i+".jpg")), "a5b6");
//
//		} catch  (Exception e) {
//			e.printStackTrace();
//		}

	}
	
//    @Test
    public void getCodeTest(){
    	try{
    		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/getmcode?mobile=13353441709&range=has"))  
		        .andDo(MockMvcResultHandlers.print())  
    				.andReturn();
    		MockHttpServletResponse response = result.getResponse();
    		String contentAsString = response.getContentAsString();
    		JSONObject parseObject = JSONObject.parseObject(contentAsString);
    		System.out.println(parseObject);
    	}catch (Exception e) {
			// TODO: handle exception
		}
    }

//	@Test
	public void testGetLoginMcode() {
		for(int i = 0; i < 10; i++){
			new Thread(new Runner()).start();
		}
		try {
			latch.await();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
//			MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/getmcode?mobile=18234075040&range=has"))  
//	                .andDo(MockMvcResultHandlers.print())  
//	                .andReturn();
		}catch (Exception e) {
 			e.printStackTrace();
 		}
	}

	private CountDownLatch latch = new CountDownLatch(100);
	
	class Runner implements Runnable{

		@Override
		public void run() {
			try {
				MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/getmcode?mobile=13353441709&range=has"))  
//				        .andDo(MockMvcResultHandlers.print())  
				        .andReturn();
				MockHttpServletResponse response = result.getResponse();
				String contentAsString = response.getContentAsString();
				JSONObject parseObject = JSONObject.parseObject(contentAsString);
				System.out.println(parseObject);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
	}
	
//	@Test
	public void testDoLogin(){
		ResultActions resultActions;
		try{
			resultActions = this.mockMvc.perform(post("/login").param("mobile", "13454545454").param("mcode", "791584").param("loginType", "code_login"));
			MvcResult mvcResult = resultActions.andReturn();
			Assert.assertNotNull(mvcResult);
			resultActions.andDo(print()).andExpect(status().isOk());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
//	@Test
	public void testWxAuth(){
		ResultActions resultActions;
		try{
			resultActions = this.mockMvc.perform(post("/wxauth").param("wxOpenid", "ozVNuwqzk--wrxGJbfsMhjUOnl44"));
			MvcResult mvcResult = resultActions.andReturn();
			Assert.assertNotNull(mvcResult);
			resultActions.andDo(print()).andExpect(status().isOk());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
//	@Test
	public void selectCircleInfoTest() {
		String circleName="扶贫联盟";
		String channel="boc";
		List<SelectCircleDomain> selectCircleInfo = authFacade.selectCircleInfo(circleName, channel);
		System.err.println(selectCircleInfo);
	}

}
