package syplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author lee
 * 网关 默认路由方式为  
 * /{spring.application.name}   --->eureka上的 对应微服务url
 * 例：
 * http://192.168.1.183:8040/rs-auth/login/check_register?channel=1&mobile=13716777707&mcode=123
 * 
 */
@EnableZuulProxy
@SpringBootApplication
public class ZuulApplication { 
//    RibbonLoadBalancingHttpClient
	public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
