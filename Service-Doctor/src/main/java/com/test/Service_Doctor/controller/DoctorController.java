package com.test.Service_Doctor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {
       @GetMapping("/doctor")
       public String getDoctor() {
		return "Doctor Name: Yogeshwar Bangar";
    	   
       }
}
