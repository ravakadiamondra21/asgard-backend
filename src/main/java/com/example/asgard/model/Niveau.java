package com.example.asgard.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "niveau")
public class Niveau {
	@Id
	private String id_niveau;
	
	@OneToMany(mappedBy = "niveau")
	private List<Etudiant> etudiants;

	public Niveau() {
	}

	public String getId_niveau() {
		return id_niveau;
	}

	public void setId_niveau(String id_niveau) {
		this.id_niveau = id_niveau;
	}
	
	
}
