package com.example.asgard.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "fichier")
public class Fichier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_fichier;
	
	@Column
	private String titre_fichier;
	
	@Column
	private String description_fichier;
	
	@Column
	private String fichier;
	
	@ManyToOne
	@JoinColumn(name = "id_etudiant")
	private Etudiant etudiant;

	public Fichier() {
		super();
	}

	public int getId_fichier() {
		return id_fichier;
	}

	public void setId_fichier(int id_fichier) {
		this.id_fichier = id_fichier;
	}

	public String getTitre_fichier() {
		return titre_fichier;
	}

	public void setTitre_fichier(String titre_fichier) {
		this.titre_fichier = titre_fichier;
	}

	public String getDescription_fichier() {
		return description_fichier;
	}

	public void setDescription_fichier(String description_fichier) {
		this.description_fichier = description_fichier;
	}

	public String getFichier() {
		return fichier;
	}

	public void setFichier(String fichier) {
		this.fichier = fichier;
	}
	
	
}
