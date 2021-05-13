package com.bingo.fly.services.circulardependence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * 循环依赖
 * @Author: wyc
 * @Date 2021/5/11 16:31
 */
@Component
public class Y {
	@Autowired
	X x;
	public Y(){
		System.out.println("Y create");
	}
}
