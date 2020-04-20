package org.wangxin.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

// 前置通知类
// 使用注解 并且在applicationContext的扫描器中增加当前类的包
@Component("logBefore")
public class LogBefore implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("before.....");

	}

}
