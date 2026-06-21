package com.test.Service_Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.Service_Student.entity.Student;
import com.test.Service_Student.repo.StudentRepo;

@RestController
@RequestMapping("/students")
public class StudentController {
       @Autowired
       private StudentRepo studentRepo;
       
       @PostMapping
       public Student addStudent(@RequestBody Student student) {
    	   return studentRepo.save(student);
       }
       
       @GetMapping
       public List<Student> getAllStudent(){
    	   return  studentRepo.findAll();
       }
       
       @GetMapping("/{id}")
    	 public Student getStudentById(@PathVariable Integer id) {
			return studentRepo.findById(id).orElse(null);
    	   
       }  
       
}
