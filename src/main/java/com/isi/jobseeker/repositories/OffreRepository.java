package com.isi.jobseeker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isi.jobseeker.model.Offre;

public interface OffreRepository extends JpaRepository<Offre, Long> {
	
}
