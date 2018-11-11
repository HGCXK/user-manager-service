package com.ql.hg.common.redis;

import javax.annotation.Resource;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ql.hg.user.service.RoleMenuService;


/**
 * 在服服务启动以后加载redis
 * @author HG
 *
 */
@Component
public class InitApplication implements ApplicationRunner{
	@Autowired
	private RedisTemplate<String, String> redisTemplate;
	
	@Resource(name="redisTemplate")
    private ListOperations<String, String> listOps;
	
	@Autowired
	private RoleMenuService service;
	


	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		System.out.println("------"+"初始化redis菜单"+"-------------");
		//加载一级菜单
		//加载二级菜单
		//加载三级菜单
		
		System.out.println("------"+"初始化redis菜单完成"+"-------------");
	}
	
}
