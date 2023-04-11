package com.isi.jobseeker.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
@Table(name="ProfilUser")
public class ProfilUser {
	
	@Id
	@GeneratedValue
	public Long idProfil;
	
	@Column(name="niveau")
	public Niveau niveau;
	
	@Column(name="titreDiplome")
	public String titreDiplome;
	
	@Column(name="description")
	public String description;
	
	@Column(name="experience")
	public int experience;
	
	@Column(name="cv")
	public String cv;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idSeeker")
	public Seeker seeker;
	
	
}
