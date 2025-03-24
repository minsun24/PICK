package com.nob.pick.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.nob.pick", annotationClass = Mapper.class)
public class MybatisConfiguration {
}