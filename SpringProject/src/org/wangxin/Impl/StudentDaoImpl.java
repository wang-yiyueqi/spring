package org.wangxin.Impl;

import org.springframework.stereotype.Component;
import org.wangxin.dao.IStudentDao;
import org.wangxin.entity.Student;

@Component("studentDao")
public class StudentDaoImpl implements IStudentDao{
	
	public void addStudent(Student student) {
		System.out.println("add the student..."+student.getStuName());
	}

}
