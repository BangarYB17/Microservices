package com.test.Service_Course.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.Service_Course.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Integer>{
	

}
