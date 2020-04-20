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

			System.out.println("�û���֪ͨʵ�ֵ�ǰ��֪ͨ����������");
			
			// ִ�з����� Ҳ���������
			result = invocation.proceed();
			
			
			System.out.println("�û���֪ͨʵ�ֵĺ���֪ͨ����������");
			System.out.println("------> target" + invocation.getThis() + ", method:" + invocation.getMethod().getName()
					+ ",args:" + invocation.getArguments() + ",returnType: " + result);

		} catch (Exception 
				e) {
			System.out.println("�û���֪ͨʵ�ֵ��쳣֪ͨ����������");

		}

		/*
		 * ����֪ͨAfterReturningAdvice �ǴӴ�ȡֵ ���������� ��result 
		 * �û���֪ͨʵ�ֵĺ���֪ͨ���������� ------>targetorg.wangxin.Impl.StudentServiceImpl@635eaaf1,method:addStudent,args:[Ljava.lang.Object;@5c30a9b0,returnType: null
		 * ����֪ͨ��org.wangxin.Impl.StudentServiceImpl@635eaaf1,addStudent,1,abc
		 */
		return "abc";
	}

}
