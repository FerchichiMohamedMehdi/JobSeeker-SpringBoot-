package com.isi.jobseeker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isi.jobseeker.model.Entreprise;
import com.isi.jobseeker.repositories.EntrepriseRepository;

@Service
public class EntrepriseService {
	
	@Autowired EntrepriseRepository entrepriseRepository;
	
	public void ajoutEntreprise (Entreprise e) {
		entrepriseRepository.save(e);
	}
	
	public List<Entreprise> listerEntreprise(){
		return entrepriseRepository.findAll();
	}

}
