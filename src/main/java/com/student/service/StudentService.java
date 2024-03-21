package com.student.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.student.core.Student;

@Service
public class StudentService {
	private static final Logger LOGGER =
			LoggerFactory.getLogger(StudentService.class);
	public Student save(Student student) {
		LOGGER.info("StudentService: call the save method");
		student.setSno(1);
		return student;
	}
	public List<Student> getStudents() {
		LOGGER.info("StudentService: call the getStudents method");
		List<Student> studList = new ArrayList<>();
		Student stud = new Student();
		stud.setSno(1);
		stud.setSname("Ganapathi");
		stud.setAge(40);
		studList.add(stud);
		stud = new Student();
		stud.setSno(2);
		stud.setSname("Thaneesh");
		stud.setAge(10);
		studList.add(stud);
		stud = new Student();
		stud.setSno(3);
		stud.setSname("Rishith");
		stud.setAge(7);
		studList.add(stud);
		return studList;
	}
	public Student getStudentById(Integer sno) {
		LOGGER.info("StudentService: call the getStudentById method");
		Student stud = new Student();
		stud.setSno(sno);
		stud.setSname("Ganapathi");
		stud.setAge(40);
		return stud;
	}

}
