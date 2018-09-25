package com.ql.hg.user.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages={"com.ql.hg.user.mapper*"})
public class MybatisConfig {

}
