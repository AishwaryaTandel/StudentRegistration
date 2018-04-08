package com.service;

import java.util.List;

import com.bean.Student;
import com.dao.StudentDao;

public class StudentService {
	
	public static boolean registerStudent(Student student) {
		
		StudentDao dao=new StudentDao();
		
		boolean status=dao.registerStudent(student);
		
		return status;
	}
	public static boolean deleteStudent(String studentId) {
		StudentDao dao=new StudentDao();
		
		boolean status=dao.deleteStudent(studentId);
		
		return status;
	}
	public static boolean updateStudent(Student student) {
		StudentDao dao=new StudentDao();
		
		boolean status=dao.updateStudent(student);
		
		return status;
	}
	public static List<Student> viewStudent(String lastName){
		StudentDao dao=new StudentDao();
		
		List<Student> studentList=dao.viewStudent(lastName);
		return studentList;
	}
}
