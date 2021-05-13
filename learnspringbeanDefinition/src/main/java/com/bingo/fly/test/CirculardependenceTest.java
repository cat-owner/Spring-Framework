package com.bingo.fly.test;

import com.bingo.fly.app.AppConfig;
import com.bingo.fly.services.circulardependence.X;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 循环依赖test
 * @Author: wyc
 * @Date 2021/5/11 16:51
 *
 * AnnotationConfigApplicationContext
 */
public class CirculardependenceTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(context.getBean(X.class));
	}
}
