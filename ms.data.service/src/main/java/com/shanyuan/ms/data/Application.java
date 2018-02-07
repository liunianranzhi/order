package com.shanyuan.ms.data;

import java.io.IOException;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@Configuration
public class Application {

	public static void main(String[] args) {
		
		
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                 "application.xml" );  
        context.start();  
        try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
