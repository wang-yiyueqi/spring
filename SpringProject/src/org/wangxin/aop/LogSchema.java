package org.wangxin.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component("logSchema")
public class LogSchema {
	public void before() {
		System.out.println("`````前置通知");
	}

	public void afterReturning(JoinPoint jp, Object returnValue) {
		System.out.println("`````后置通知:" + jp.getTarget() + ", 结果：" + returnValue);
	}

	public void whenException(NullPointerException ne) {
		System.out.println("`````异常通知：" + ne.getMessage());
	}

	// 后置和异常通知用JoinPoint就可以， 但是around环绕通知需要用ProceedingJoinPoint对象, 并且没有result
	public Object around(ProceedingJoinPoint jp) {
		Object result = null;
		System.out.println("````环绕的前置通知");
		try {
			jp.proceed();
			System.out.println("````环绕的后置通知");
		} catch (Throwable e) {
			System.out.println("````环绕的捕捉异常");
		}
		return result;
	}

}
