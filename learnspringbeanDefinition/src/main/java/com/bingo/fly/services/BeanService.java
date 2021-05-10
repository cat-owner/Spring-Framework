package com.bingo.fly.services;

import org.springframework.stereotype.Component;
/**
 *
 * @Author: wyc
 * @Date 2021/5/10 14:03
 */
//@Component
public class BeanService {
	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
