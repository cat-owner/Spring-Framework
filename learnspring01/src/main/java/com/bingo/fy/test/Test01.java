package com.bingo.fy.test;

import com.bingo.fy.app.App;
import com.bingo.fy.service.X;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test01 {

	public static void main(String[] args) {
		//初始化spring的容器;
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		System.out.println(context.getBean(X.class));
	}
}
