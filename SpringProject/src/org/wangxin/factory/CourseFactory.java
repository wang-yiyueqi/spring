package org.wangxin.factory;

import org.wangxin.newInstance.HtmlCourse;
import org.wangxin.newInstance.ICourse;
import org.wangxin.newInstance.JavaCourse;

public class CourseFactory {
	public static ICourse getCourse(String name) {
		if(name == "java") {
			return new JavaCourse();
		}else {
			return new HtmlCourse();
		}
	}

}
