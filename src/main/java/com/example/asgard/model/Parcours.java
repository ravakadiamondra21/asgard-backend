package com.example.asgard.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "parcours")
public class Parcours {
	@Id
	private String id_parcours;
	
	@Column
	private String nom_parcours;
	
	@OneToMany(mappedBy = "parcours")
	private List<Etudiant> etudiants;
	
	public Parcours() {}

	public String getId_parcours() {
		return id_parcours;
	}

	public void setId_parcours(String id_parcours) {
		this.id_parcours = id_parcours;
	}

	public String getNom_parcours() {
		return nom_parcours;
	}

	public void setNom_parcours(String nom_parcours) {
		this.nom_parcours = nom_parcours;
	}
}
