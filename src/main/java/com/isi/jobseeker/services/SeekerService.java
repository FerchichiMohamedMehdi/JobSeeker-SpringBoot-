package com.isi.jobseeker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isi.jobseeker.model.Seeker;
import com.isi.jobseeker.repositories.SeekerRepository;

@Service
public class SeekerService {
	
	@Autowired  SeekerRepository seekerRepository;
	
	
	public void ajoutSeeker (Seeker s) {
		seekerRepository.save(s);
	}
	
	public List<Seeker> listerSeeker(){
		return seekerRepository.findAll();
	}

}
