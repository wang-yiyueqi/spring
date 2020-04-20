package org.wangxin.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

@Component("logAfter")
public class LogAfter implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// returnValue ---->��Ϊ�����ķ���ֵ��void�����Բ���returnValue.toString�Ļ� �������ָ���쳣
		System.out.println("����֪ͨ��"+target+","+method.getName()+","+args.length+","+returnValue);
		// ����֪ͨ��org.wangxin.Impl.StudentServiceImpl@67a20f67,addStudent,1,null
	}

}
