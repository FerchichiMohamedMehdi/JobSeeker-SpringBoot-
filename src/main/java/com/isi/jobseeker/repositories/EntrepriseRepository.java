package com.isi.jobseeker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isi.jobseeker.model.Entreprise;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Long>{
	
	
}
