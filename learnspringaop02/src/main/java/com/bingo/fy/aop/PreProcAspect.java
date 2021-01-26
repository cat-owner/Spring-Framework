package com.bingo.fy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

/**
 * 服务接口参数预处理切面类;
 * @Author: wyc
 * @Date 2021/1/26 14:58
 */
@Order(2)
@Aspect
public class PreProcAspect {

	/**
	 * 切入点
	 */
	@Pointcut("execution(public * com.bingo.fy.service..*.doService(..))")
	public void pointCut(){

	}
	@Around("pointCut()")
	public Object preProcAround(ProceedingJoinPoint joinPoint) throws Throwable
	{
		System.out.println("PreProcAspect before joinPoint");
		Object[] param = joinPoint.getArgs();
		if (null != param[0] && param[0] instanceof String)
		{
			String src = param[0].toString();
			if (src.length() > 5)
			{
				param[0] = src.substring(0,5);
			}

			System.out.println("PreProcAspect change input:" + src + " to:" + param[0]);
		}

		Object res = joinPoint.proceed(param);
		System.out.println("PreProcAcpect after joinPoint");

		return res;
	}
}
