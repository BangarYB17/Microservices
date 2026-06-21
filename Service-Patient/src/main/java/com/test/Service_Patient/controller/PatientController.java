package com.test.Service_Patient.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
       @GetMapping("/patient")
       public String getPatient() {
		return "Patient Name: Jayesh Jadhav";
       }
}
