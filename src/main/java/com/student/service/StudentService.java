package com.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.student.core.Student;

@Service
public class StudentService {
	
	public Student save(Student student) {
		student.setSno(1);
		return student;
	}

	public List<Student> getStudents() {
		List<Student> studList = new ArrayList<>();
		Student stud = new Student();
		stud.setSno(1);
		stud.setSname("Ganapathi");;
		stud.setAge(40);
		studList.add(stud);
		stud = new Student();
		stud.setSno(2);
		stud.setSname("Thaneesh");;
		stud.setAge(10);
		studList.add(stud);
		stud = new Student();
		stud.setSno(3);
		stud.setSname("Rishith");;
		stud.setAge(7);
		studList.add(stud);
		return studList;
	}

	public Student getStudentById(Integer sno) {
		Student stud = new Student();
		stud.setSno(sno);
		stud.setSname("Ganapathi");;
		stud.setAge(40);
		return stud;
	}

}
