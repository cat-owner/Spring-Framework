package com.bingo.fly.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Scope("prototype")
public class IndexService {
	/**
	 *
	 * @param beanService:有值的原因如下：
	 * 	Constructor<?>[] ctors = determineConstructorsFromBeanPostProcessors(beanClass, beanName);
	 * 		if (ctors != null || mbd.getResolvedAutowireMode() == AUTOWIRE_CONSTRUCTOR ||
	 * 				mbd.hasConstructorArgumentValues() || !ObjectUtils.isEmpty(args)) {
	 * 			return autowireConstructor(beanName, mbd, ctors, args);
	 *                }
	 *  代码位置在：AbstractAutowireCapableBeanFactory --1205行代码；
	 * 有且只有一个合理的构造方法；
	 */
	public IndexService(BeanService beanService){
		System.out.println("得到的beanService:"+beanService);
	}
	public void query(){
		System.out.println("logic");
	}
}
