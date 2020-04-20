package org.wangxin.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component("logAround")
public class LogAround implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object result = null;

		try {

			System.out.println("用环绕通知实现的前置通知。。。。。");
			
			// 执行方法体 也就是切入点
			result = invocation.proceed();
			
			
			System.out.println("用环绕通知实现的后置通知。。。。。");
			System.out.println("------> target" + invocation.getThis() + ", method:" + invocation.getMethod().getName()
					+ ",args:" + invocation.getArguments() + ",returnType: " + result);

		} catch (Exception 
				e) {
			System.out.println("用环绕通知实现的异常通知。。。。。");

		}

		/*
		 * 后置通知AfterReturningAdvice 是从此取值 而不是上面 的result 
		 * 用环绕通知实现的后置通知。。。。。 ------>targetorg.wangxin.Impl.StudentServiceImpl@635eaaf1,method:addStudent,args:[Ljava.lang.Object;@5c30a9b0,returnType: null
		 * 后置通知：org.wangxin.Impl.StudentServiceImpl@635eaaf1,addStudent,1,abc
		 */
		return "abc";
	}

}
