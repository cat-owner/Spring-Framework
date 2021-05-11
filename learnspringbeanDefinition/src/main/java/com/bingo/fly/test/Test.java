package com.bingo.fly.test;

import com.bingo.fly.app.AppConfig;
import com.bingo.fly.services.IndexService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(AppConfig.class);
		IndexService bean = applicationContext.getBean(IndexService.class);
	}
}
