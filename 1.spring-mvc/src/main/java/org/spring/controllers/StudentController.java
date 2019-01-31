package org.spring.controllers;

import java.util.List;

import org.spring.model.Course;
import org.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	//@GetMapping("/students/{studentId}/courses")
	@RequestMapping(value = "/students/{studentId}/courses", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE )

	public List<Course> retrieveCoursesForStudent(@PathVariable String studentId) {
		System.out.println("studentId::"+studentId);
		return studentService.retrieveCourses(studentId);
	}
	
	
	@RequestMapping(value = "/students/{studentId}/cour", method = RequestMethod.GET, produces = { "application/json", "application/xml" })

	public List<Course> retrieveCoursesForStudent1(@PathVariable String studentId) {
		System.out.println("studentId::"+studentId);
		return studentService.retrieveCourses(studentId);
	}
	
	
	//@GetMapping("/test{test}")  produces = { "application/json", "application/xml" },
	@RequestMapping(value = "/test{test}", method = RequestMethod.GET)

	public String test(@PathVariable String test) {
		System.out.println("test::"+test);
		return "Test HI : "+test;
	}
}
