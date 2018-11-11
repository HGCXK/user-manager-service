package com.ql.hg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

import com.ql.hg.common.redis.InitApplication;

@SpringBootApplication
/*@EnableDiscoveryClient*/
@EnableRedisHttpSession
public class UserManagerApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(UserManagerApplication.class, args);
		//如果配置文件加载完成以后
		
	}
	
	
	
}
