package org.wangxin.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

@Component("logAfter")
public class LogAfter implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// returnValue ---->因为方法的返回值是void，所以采用returnValue.toString的话 会产生空指针异常
		System.out.println("后置通知："+target+","+method.getName()+","+args.length+","+returnValue);
		// 后置通知：org.wangxin.Impl.StudentServiceImpl@67a20f67,addStudent,1,null
	}

}
