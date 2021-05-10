package com.bingo.fy.service.impl;

import com.bingo.fy.service.IService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @Author: wyc
 * @Date 2021/1/25 17:46
 */
@Component("c")
public class ServiceImpl implements IService {

	public ServiceImpl(){
		System.out.println("------------start initialization----------");
	}
	@Override
	public String doService(String data) throws Exception {
		{
			if (null == data || data.isEmpty()) {
				throw new Exception("input data is empty");
			}
			String ret = data + "@";
			System.out.println("ServiceImpl.doService input:" + data + " output:" + ret);

			return ret;
		}
	}
}
