package org.wangxin.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component("logSchema")
public class LogSchema {
	public void before() {
		System.out.println("`````ǰ��֪ͨ");
	}

	public void afterReturning(JoinPoint jp, Object returnValue) {
		System.out.println("`````����֪ͨ:" + jp.getTarget() + ", �����" + returnValue);
	}

	public void whenException(NullPointerException ne) {
		System.out.println("`````�쳣֪ͨ��" + ne.getMessage());
	}

	// ���ú��쳣֪ͨ��JoinPoint�Ϳ��ԣ� ����around����֪ͨ��Ҫ��ProceedingJoinPoint����, ����û��result
	public Object around(ProceedingJoinPoint jp) {
		Object result = null;
		System.out.println("````���Ƶ�ǰ��֪ͨ");
		try {
			jp.proceed();
			System.out.println("````���Ƶĺ���֪ͨ");
		} catch (Throwable e) {
			System.out.println("````���ƵĲ�׽�쳣");
		}
		return result;
	}

}
