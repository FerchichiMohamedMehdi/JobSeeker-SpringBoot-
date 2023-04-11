package com.isi.jobseeker.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name="entreprise")
public class Entreprise {
	@Id
	@GeneratedValue
	public Long id;
	
	@Column(name="dateSouscriptionEntreprise")
	public Date dateSouscriptionEntreprise;
	
	@Column(name="nomEntreprise")
	public String nomEntreprise;
	
	//@Column(name="adresseEntreprise")
	@Embedded
	public Adresse adresseEntreprise;
	
	@Column(name="telEntreprise")
	public int telEntreprise;
	
	@Column(name="mailEntreprise")
	public String mailEntreprise;
	
	@Column(name="descriptionEntreprise")
	public String descriptionEntreprise;
	
	@OneToMany(mappedBy="entreprise")
	public List<Offre> offre;

}
