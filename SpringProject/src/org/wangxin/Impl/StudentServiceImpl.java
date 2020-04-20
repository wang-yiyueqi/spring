package org.wangxin.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wangxin.entity.Student;
import org.wangxin.service.IStudentService;


@Service("studentService")
public class StudentServiceImpl implements IStudentService {
	// �Զ�װ�� byType
	@Autowired
	private StudentDaoImpl studentdao;
	
	@Override
	public void addStudent(Student student) {
//		ʵ���쳣֪ͨ��
//		student = null;
		studentdao.addStudent(student);
	}

}
