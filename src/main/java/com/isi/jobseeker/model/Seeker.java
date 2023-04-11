package com.isi.jobseeker.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.Nullable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name="seeker")
public class Seeker {
	
	@Id
	@GeneratedValue
	public Long idSeeker;
	
	@Column(name="dateSouscritptionSeeker")
	public Date dateSouscritptionSeeker;
	
	@Column(name="telSeeker")
	public int telSeeker;
	
	@Column(name="nomSeeker")
	public String nomSeeker;
	
	@Column(name="prenom")
	public String prenom;
	
	//@Column(name="adresseSeeker")
	@Embedded
	public Adresse adresseSeeker;
	
	@Column(name="mailSeeker")
	public String mailSeeker;
	
	@Column(name="civilite")
	public Civilite civilite;
	
	@Column(name="dateNaissance")
	public Date dateNaissance;
	
	@Column(name="situationSocial")
	public SituationSociale situationSocial;
	@Nullable
	@OneToMany(mappedBy="seeker")
	public List<Candidature> candidature;
	@Nullable
	@OneToOne(mappedBy = "seeker")
	public ProfilUser profilUser;
	
    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idAdresse")
    private Adresse address;*/

}
