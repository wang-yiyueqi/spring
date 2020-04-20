package org.wangxin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.wangxin.Impl.StudentDaoImpl;
import org.wangxin.Impl.StudentServiceImpl;
import org.wangxin.dao.IStudentDao;
import org.wangxin.entity.AllCollectionType;
import org.wangxin.entity.Course;
import org.wangxin.entity.Student;
import org.wangxin.newInstance.ICourse;
import org.wangxin.service.IStudentService;

public class Test {
//	EP2 1.�Լ�new����
	public static void learn() {
		Student s = new Student();
		//EP2 1. �Լ�new����֮����һ��һ����
//		s.learnHtml();
//		s.learnJava();
		
		//EP2 2.����ģʽ
		s.learn("htmlCourse");
	}
	
	
	public static void testDI() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Course i = (Course)context.getBean("course");
		System.out.println(i.ShowInfo());
	}
	

	public static void testCollection() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AllCollectionType i = (AllCollectionType)context.getBean("collections");
		System.out.println(i.toString());
	}
	
	public static void testAnnocation() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentService i = (IStudentService)context.getBean("studentService");
		Student s = (Student)context.getBean("student");
		i.addStudent(s);
	}
	
	
	
	public static void main(String[] args) {
		
//		EP1 ��һ��springProject ��ȡapplicationContext�������
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Student student = (Student)context.getBean("student");
//		System.out.print(student);
		//learn();
//		testDI();
		testAnnocation();
	
		
		
	}

}
