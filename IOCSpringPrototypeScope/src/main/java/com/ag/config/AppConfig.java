package com.ag.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.ag.comp")
public class AppConfig 
{
	public AppConfig()
	{
		System.out.println("AppConfig: 0-param constructor");
	}
	
	@Bean
	public LocalTime createTime()
	{
		return LocalTime.now();
	}

}
