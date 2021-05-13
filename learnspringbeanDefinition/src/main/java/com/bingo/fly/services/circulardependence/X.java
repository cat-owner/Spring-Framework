package com.bingo.fly.services.circulardependence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * 循环依赖
 * @Author: wyc
 * @Date 2021/5/11 16:30
 */
@Component
public class X {
	@Autowired
	Y y;

	public X(){
		System.out.println("X create");
	}
}
