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
		// ��ȡ�γ̹�����Ķ���Java����html����
		// ICourse i = CourseFactory.getCourse(name);
		//���ö���ķ���
		//i.learn();
		
		// ֱ�Ӵ�IOC�����л�ȡ����
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ICourse i = (ICourse)context.getBean(name);
		i.learn();
		
	}

	

}
