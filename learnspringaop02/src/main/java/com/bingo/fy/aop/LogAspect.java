package com.bingo.fy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
@Aspect
public class LogAspect {
	/**
	 * 切入点
	 */
	@Pointcut("execution(public * com.bingo.fy.service.*.doService(..))")
	public void pointCut(){
	}
	@Before("pointCut()")
	public void logStart(JoinPoint joinPoint)
	{
		System.out.println("logStart: " + joinPoint.getTarget());
		System.out.println("logStart: "+joinPoint.getSignature().getName()+
				" "+ Arrays.toString(joinPoint.getArgs()));
	}

//	@AfterReturning(returning = "object",pointcut = "pointCut()")
//	public void logReturn(Object object)
//	{
//		System.out.println("logReturn: " + object);
//	}
//
//	@After("pointCut()")
//	public void logEnd(JoinPoint joinPoint) {
//		System.out.println("logEnd: "+joinPoint.getSignature().getName()+
//				" "+Arrays.toString(joinPoint.getArgs()));
//	}
//
//	@AfterThrowing(pointcut = "pointCut()",throwing = "e")
//	public void logException(Exception e)
//	{
//		System.out.println("logException: " + e);
//	}


}
