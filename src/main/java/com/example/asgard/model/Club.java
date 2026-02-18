package com.example.asgard.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "club")
public class Club {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_club;
	
	@Column
	private String nom_club;
	
	@Column
	private String description_club;
	
	@Column
	private String jour_default;
	
	@Column
	private String heure_default;
	
	@ManyToOne
	@JoinColumn(name = "id_etudiant")
	private Admin admin;
	
	@OneToMany(mappedBy = "club")
	private List<EdtClub> edtClub;

	public Club() {
		super();
	}

	public int getId_club() {
		return id_club;
	}

	public void setId_club(int id_club) {
		this.id_club = id_club;
	}

	public String getNom_club() {
		return nom_club;
	}

	public void setNom_club(String nom_club) {
		this.nom_club = nom_club;
	}

	public String getDescription_club() {
		return description_club;
	}

	public void setDescription_club(String description_club) {
		this.description_club = description_club;
	}

	public String getJour_default() {
		return jour_default;
	}

	public void setJour_default(String jour_default) {
		this.jour_default = jour_default;
	}

	public String getHeure_default() {
		return heure_default;
	}

	public void setHeure_default(String heure_default) {
		this.heure_default = heure_default;
	}
	
	
	
}
