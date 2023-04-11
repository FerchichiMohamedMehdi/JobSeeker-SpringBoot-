package com.isi.jobseeker.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name="candidature")
public class Candidature {
	
	@Id
	@GeneratedValue
	public Long idCadidature;
	
	@Column(name="datePostule")
	public Date datePostule;
	
	@Column(name="etatCandidature")
	public EtatCandidature etatCandidature;
	
	@ManyToOne
	@JoinColumn(name="idSeeker")
	public Seeker seeker;
	
	@ManyToOne
	@JoinColumn(name="idOffre")
	public Offre offre;
}
