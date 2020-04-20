package org.wangxin.aop;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

@Component("logException")
public class LogException implements ThrowsAdvice {
	public void afterThrowing(Method method, Object[] args, Object target, Throwable ex) {
		System.out.println("Òì³£Í¨Öª£º"+ target + ","+method+","+args.length+","+ex);
	}

}
