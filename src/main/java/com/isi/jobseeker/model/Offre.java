package com.isi.jobseeker.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="offre")
public class Offre {
	
	@Id
	@GeneratedValue
	public Long idOffre;
	
	@Column(name="titre")
	public String titre;
	
	@Column(name="descriptionOffre")
	public String descriptionOffre;
	
	@Column(name="dateCreation")
	public Date dateCreation;
	
	@Column(name="dateExpiration")
	public Date dateExpiration;
	
	@Column(name="type")
	public Type type;
	
	@Column(name="niveauExige")
	public Niveau niveauExige;
	

	@Column(name="etatOffre")
	public EtatOffre etatOffre;
	
	@Column(name="dateLimite")
	public Date dateLimite;
	
	@OneToMany(mappedBy="offre")
	public List<Candidature> candidature;
	
	@ManyToOne
	@JoinColumn(name="idEntreprise")
	public Entreprise entreprise;
	
	
	

}
