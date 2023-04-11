package com.isi.jobseeker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isi.jobseeker.model.Offre;
import com.isi.jobseeker.services.OffreService;

@RestController
@RequestMapping("/offre")
public class OffreController {
	
	@Autowired OffreService offreService;
	
	@PostMapping("add")
	public void addOffre (@RequestBody Offre o) {
		offreService.ajoutOffre(o);
	}
	
	@GetMapping("/list")
	public List<Offre> listOffre(){
		return offreService.listerOffre();
	}

}
