package com.bingo.fy.service.impl;

import com.bingo.fy.service.IService;
import org.springframework.stereotype.Service;

/**
 *
 * @Author: wyc
 * @Date 2021/1/25 17:46
 */
@Service
public class ServiceImpl implements IService {
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
