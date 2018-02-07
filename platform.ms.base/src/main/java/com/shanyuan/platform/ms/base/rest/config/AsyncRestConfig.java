package com.shanyuan.platform.ms.base.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.AsyncClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.AsyncRestTemplate;

@Component
@Configuration
public class AsyncRestConfig {

	@Bean
	public AsyncRestTemplate asyncRestTemplate(){
		return new AsyncRestTemplate();
	}
	
	public AsyncClientHttpRequestFactory clientHttpRequestFactory(){
		SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
		factory.setReadTimeout(5000);
		factory.setReadTimeout(5000);
		return factory;
		
	}
}
