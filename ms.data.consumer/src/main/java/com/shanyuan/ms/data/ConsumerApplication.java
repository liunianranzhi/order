package com.shanyuan.ms.data;

import java.io.IOException;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.common.json.JSON;
import com.shanyuan.ms.data.domain.user.MemberInfo;
import com.shanyuan.ms.data.service.DataService;
public class ConsumerApplication {

	public static void main(String[] args) {
		
		
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                 "application.xml" );  
        context.start();  
        DataService dataService = context.getBean(DataService.class);
        MemberInfo mi = null;
		try {
			mi = dataService.getMemberInfo(39);
			System.out.println(JSON.json(mi));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
        
        try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block 1231315
			e.printStackTrace();
		}
	}

}
