package org.wangxin.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.wangxin.factory.CourseFactory;
import org.wangxin.newInstance.HtmlCourse;
import org.wangxin.newInstance.ICourse;
import org.wangxin.newInstance.JavaCourse;

public class Student {
	private int stuNo;
	private String stuName;
	private int stuAge;
	
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	@Override
	public String toString() {
		return "stuNo=" + stuNo + ", stuName=" + stuName + ", stuAge=" + stuAge ;
	}
	
	public void learnJava() {
		ICourse ic = new JavaCourse();
		ic.learn();
	}
	
	public void learnHtml() {
		ICourse ic = new HtmlCourse();
		ic.learn();
	}
	
	public void learn(String name) {
		// 获取课程工厂里的对象，Java或者html对象
		// ICourse i = CourseFactory.getCourse(name);
		//调用对象的方法
		//i.learn();
		
		// 直接从IOC容器中获取对象
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ICourse i = (ICourse)context.getBean(name);
		i.learn();
		
	}

	

}
