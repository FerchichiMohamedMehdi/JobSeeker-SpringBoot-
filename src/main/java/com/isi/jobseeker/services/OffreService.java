package com.isi.jobseeker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isi.jobseeker.model.Offre;
import com.isi.jobseeker.repositories.OffreRepository;

@Service
public class OffreService {
	
	@Autowired OffreRepository offreReposioty;
	
	public void ajoutOffre (Offre o) {
		
		offreReposioty.save(o);
	}
	
	public List<Offre> listerOffre(){
		return offreReposioty.findAll();
		
	}

}
