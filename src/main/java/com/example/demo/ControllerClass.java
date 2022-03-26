package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
  @RequestMapping("/")
  public List<Student> getStudents(){
	  List<Student> students = new ArrayList<>();
	  Student s1 = new Student();
	  s1.setId(1);
	  s1.setName("sumukh");
	  students.add(s1);
	  return students;
  }
}
