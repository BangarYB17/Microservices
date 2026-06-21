package com.test.Service_Appointment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AppointmentController {
       @GetMapping("/appointment")
       public String bookAppointment() {
		      RestTemplate restTemplate = new RestTemplate();
		     
		      //call patient
		     // String patient = restTemplate.getForObject("http://localhost:8081/patient",String.class);
		      String p1 = restTemplate.getForObject("http://localhost:8081/patient", String.class);
		    //call doctor
		      String doctor = restTemplate.getForObject("http://localhost:8082/doctor",String.class);
		      
			return "Appointment booked successfully! \n" + p1 +"\n"+ doctor;
       }
}
