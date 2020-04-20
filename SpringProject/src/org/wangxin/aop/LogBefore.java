package org.wangxin.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

// ǰ��֪ͨ��
// ʹ��ע�� ������applicationContext��ɨ���������ӵ�ǰ��İ�
@Component("logBefore")
public class LogBefore implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("before.....");

	}

}
