package org.wangxin.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// ����ע����ʽ��AOPʵ��
@Component("logAspectAnnotation")
@Aspect
public class LogAspectAnnotation {
	
	@Before("execution(public void org.wangxin.Impl.StudentServiceImpl.addStudent(..))")
	public void mybefore(JoinPoint jp) {
		System.out.println("*****ע����ʽ--ǰ��֪ͨ");
		System.out.println("*****ע����ʽ--target: "+jp.getTarget()+", method:"+ jp.getSignature().getName()+", args:"+ jp.getArgs());
	}
	
	@AfterReturning(pointcut=("execution(public void org.wangxin.Impl.StudentServiceImpl.addStudent(..))"),returning="returningValue")
	public void myafter(JoinPoint jp, Object returningValue) {
		System.out.println("*****ע����ʽ--����֪ͨ");
		System.out.println("*****ע��-->Ŀ�����"+jp.getTarget()+"����������"+ jp.getSignature().getName()+",����:"+Arrays.toString(jp.getArgs())+",����ֵ��"+returningValue);
	}
	
	@AfterThrowing(pointcut=("execution(public void org.wangxin.Impl.StudentServiceImpl.addStudent(..))"), throwing = "e")
	public void myException(JoinPoint jp,Exception e) {
		System.out.println("exception is occuring...."+e.getMessage());
	}
	
	//����֪ͨ���������֪ͨ������һ��resultֵ
	@Around("execution(public void org.wangxin.Impl.StudentServiceImpl.addStudent(..))")
	public void myAround(ProceedingJoinPoint jp) {
		try {
		// before method
		System.out.println("*****around's before-method..");
		// execute..
		jp.proceed();
		//after method
		System.out.println("*****around's after-method");
		}catch(Throwable e){
			System.out.println("*****around's exception is occuring....");
		}finally{
			System.out.println("*****around's finanlly the massage");
		}
		
	}
	
	@After("execution(public void org.wangxin.Impl.StudentServiceImpl.addStudent(..))")
	public void myAfter() {
		System.out.println("final...");
	}

}
