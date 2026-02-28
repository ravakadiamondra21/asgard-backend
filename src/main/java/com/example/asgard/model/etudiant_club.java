package com.example.asgard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "etudiant_club")
public class etudiant_club {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_etudiantClub;
	

	@ManyToOne
	@JoinColumn(name = "id_etudiant")
	private Etudiant etudiant;
	
	@ManyToOne
	@JoinColumn(name = "id_edt")
	private Coursclub courclub;
}
