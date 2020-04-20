package org.wangxin.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wangxin.entity.Student;
import org.wangxin.service.IStudentService;


@Service("studentService")
public class StudentServiceImpl implements IStudentService {
	// 自动装配 byType
	@Autowired
	private StudentDaoImpl studentdao;
	
	@Override
	public void addStudent(Student student) {
//		实现异常通知类
//		student = null;
		studentdao.addStudent(student);
	}

}
