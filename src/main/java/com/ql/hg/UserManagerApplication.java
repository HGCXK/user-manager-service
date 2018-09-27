package com.ql.hg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

import com.ql.hg.common.filter.UserAuthorityFilter;

@SpringBootApplication
@EnableDiscoveryClient
@EnableRedisHttpSession
@EnableZuulProxy
public class UserManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagerApplication.class, args);
	}
	
	
	/**
	 * 配置用户权限过滤器
	 * @return
	 */
	@Bean  
	public  UserAuthorityFilter userAuthorityFilter(){
		return new UserAuthorityFilter();
	}
}
