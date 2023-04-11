package com.isi.jobseeker.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.isi.jobseeker.model.Seeker;

public interface SeekerRepository extends JpaRepository<Seeker, Long> {

}
