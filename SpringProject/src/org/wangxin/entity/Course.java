package org.wangxin.entity;

public class Course {
	private String courName;
	private int courHour;
	//����ע��
	//Teacher��Ķ��󣬺����ShowInfoҲ��ҪʱӦ��ָ��������ʦ�����֣�Ҫ��Ȼ������Ƕ�����ڴ��ַ
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
