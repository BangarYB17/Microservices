package com.test.Service_Student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.Service_Student.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
