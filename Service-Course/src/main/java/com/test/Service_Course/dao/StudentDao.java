package com.test.Service_Course.dao;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class StudentDao {
	
	   private Integer id;
	   private String name;
	   private String email;
   
	 
}
