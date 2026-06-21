package com.test.Service_Course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.test.Service_Course.dao.StudentDao;
import com.test.Service_Course.entity.Course;
import com.test.Service_Course.repo.CourseRepo;


@RestController
@RequestMapping("/course")
public class CourseController {
       @Autowired
       private CourseRepo courseRepo;
       
       @Autowired
       private RestTemplate restTemplate;
       
        
       @PostMapping
       public Course addcourse(@RequestBody Course course) {
    	   return courseRepo.save(course);
       }
       
       @GetMapping
       public List<Course> getAllcourses(){
    	   return  courseRepo.findAll();
       }
       
       @GetMapping("/{id}")
    	 public Course getcourseById(@PathVariable Integer id) {
			return courseRepo.findById(id).orElse(null);
    	   
       } 
       
       //student service call
       @GetMapping("/{id}/student")
       public StudentDao getStudentByCourse(@PathVariable int id) {
    	   Course course = courseRepo.findById(id).orElse(null);
    	   int studentid = course.getStudentid();
    	   String url = "http://localhost:8081/students/"+studentid;
    	  StudentDao student =restTemplate.getForObject(url, StudentDao.class);
    	  return student;
       }
       
       
}
