package com.isi.jobseeker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isi.jobseeker.model.Seeker;
import com.isi.jobseeker.services.SeekerService;
//@CrossOrigin(origins = "http://localhost:8083")
@RestController
@RequestMapping("/seeker")
public class SeekerController {
	
	@Autowired SeekerService seekerService;
	
	@PostMapping("/add")
	public void addSeeker(@RequestBody Seeker s) {
		seekerService.ajoutSeeker(s);		
	}
	
	@GetMapping("/list")
	public List<Seeker> listSeeker(){
		return seekerService.listerSeeker();
	}
	
	

}
