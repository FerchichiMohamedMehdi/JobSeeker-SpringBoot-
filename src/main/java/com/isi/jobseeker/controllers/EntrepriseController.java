package com.isi.jobseeker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isi.jobseeker.model.Entreprise;
import com.isi.jobseeker.services.EntrepriseService;

@RestController
@RequestMapping("/entreprise")
public class EntrepriseController {
	
	@Autowired EntrepriseService entrepriseService;
	
	@PostMapping("/add")
	public void addEntreprise (@RequestBody Entreprise e) {
		entrepriseService.ajoutEntreprise(e);
	}
	
	@GetMapping("/list")
	public List<Entreprise> listEntreprise (){
		return entrepriseService.listerEntreprise();
	}

}
