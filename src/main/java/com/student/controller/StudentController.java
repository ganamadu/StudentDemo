package com.student.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.core.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	private static final Logger LOGGER =
			LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentService;

	
	@PostMapping
	public Student save(@RequestBody Student student) {
		LOGGER.info("Called the save Student method....");
		return studentService.save(student);
	}
	
	@GetMapping
	public List<Student> getStudents() {
		LOGGER.info("Called the getStudents List method....");
		return studentService.getStudents();
	}
	
	@GetMapping("/{sno}")
	public Student getStudentById(@PathVariable Integer sno) {
		LOGGER.info("Called the getStudentById method....");
		return studentService.getStudentById(sno);
	}
	
	
}
