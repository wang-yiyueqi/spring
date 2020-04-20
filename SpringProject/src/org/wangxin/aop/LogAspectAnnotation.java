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

// 基于注解形式的AOP实现
@Component("logAspectAnnotation")
@Aspect
public class LogAspectAnnotation {
	
	@Before("execution(public void org.wangxin.Impl.StudentServiceImpl.addStudent(..))")
	public void mybefore(JoinPoint jp) {
		System.out.println("*****注解形式--前置通知");
		System.out.println("*****注解形式--target: "+jp.getTarget()+", method:"+ jp.getSignature().getName()+", args:"+ jp.getArgs());
	}
	
	@AfterReturning(pointcut=("execution(public void org.wangxin.Impl.StudentServiceImpl.addStudent(..))"),returning="returningValue")
	public void myafter(JoinPoint jp, Object returningValue) {
		System.out.println("*****注解形式--后置通知");
		System.out.println("*****注解-->目标对象："+jp.getTarget()+"，方法名："+ jp.getSignature().getName()+",参数:"+Arrays.toString(jp.getArgs())+",返回值："+returningValue);
	}
	
	@AfterThrowing(pointcut=("execution(public void org.wangxin.Impl.StudentServiceImpl.addStudent(..))"), throwing = "e")
	public void myException(JoinPoint jp,Exception e) {
		System.out.println("exception is occuring...."+e.getMessage());
	}
	
	//环绕通知不用像后置通知那样设一个result值
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
