package com.isi.jobseeker.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Adresse {
	
	@Column(name="numRue")
	public int numRue;
	
	@Column(name="Rue")
	String rue;
	
	@Column(name="gouvernorat")
	Gouvernorat gouvernorat;
	
	@Column(name="codePostal")
	int codePostal;
	
	@Column(name="ville")
	String ville;
	
	/*@OneToOne(mappedBy = "adresse")
    private Seeker seeker;*/

}
