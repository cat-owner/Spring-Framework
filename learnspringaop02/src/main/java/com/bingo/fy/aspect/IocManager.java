package com.bingo.fy.aspect;


import com.bingo.fy.aop.LogAspect;
import com.bingo.fy.aop.PreProcAspect;
import com.bingo.fy.service.IService;
import com.bingo.fy.service.impl.ServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan("com.bingo.fy")
public class IocManager {
//	@Bean
//	public IService createServiceBen()
//	{
//		return new ServiceImpl();
//	}
//
//	@Bean
//	public LogAspect logAspect() {
//		return new LogAspect();
//	}
//
//	@Bean
//	public PreProcAspect preProcAspect() {
//		return new PreProcAspect();
//	}
}
