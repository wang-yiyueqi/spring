package org.wangxin.entity;

public class Course {
	private String courName;
	private int courHour;
	//依赖注入
	//Teacher类的对象，后面的ShowInfo也需要时应该指定得是老师的名字，要不然输出的是对象的内存地址
	private Teacher courTeacher;
	
	public int getCourHour() {
		return courHour;
	}
	public void setCourHour(int courHour) {
		this.courHour = courHour;
	}

	
	
	public String getCourName() {
		return courName;
	}
	public void setCourName(String courName) {
		this.courName = courName;
	}
	
	

	
	public Teacher getCourTeacher() {
		return courTeacher;
	}
	public void setCourTeacher(Teacher courTeacher) {
		this.courTeacher = courTeacher;
	}
	
	
	public Course(String courName, int courHour, Teacher courTeacher) {
		this.courName = courName;
		this.courHour = courHour;
		this.courTeacher = courTeacher;
	}
	public Course() {
		// TODO Auto-generated constructor stub
	}
	
	public String ShowInfo() {
		return "Course [courName=" + courName + ", courHour=" + courHour + ", courTeacher=" + courTeacher.getName() + "]";
	}
	
	

}
