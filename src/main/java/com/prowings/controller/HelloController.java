package com.prowings.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloController {
	@GetMapping("/hello")
	public String hello()
	{
		return "hello";
	}
	
//	@GetMapping("/student")
//	public Student getStudent()
//	{	Student s1=new Student();
//		s1.setRoll(10);
//		s1.setAddress("pune");
//		s1.setName("ram");
//		return s1;
//	}
//	
//	@GetMapping("/students")
//	public List<Student> getAllStudents()
//	{
//		ArrayList<Student> list= new ArrayList<>();
//		list.add(new Student(20,"Sham","Sangli"));
//		list.add(new Student(21,"Radha","Satara"));
//		return list;
//	}
	
}
