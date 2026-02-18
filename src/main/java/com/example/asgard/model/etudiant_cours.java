package com.example.asgard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "etudiant_cours")
public class etudiant_cours {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_etudiantCours;
	
	@ManyToOne
	@JoinColumn(name = "matricule")
	private Etudiant etudiant;
	
	@ManyToOne
	@JoinColumn(name = "id_cours")
	private Cours cours;
}
