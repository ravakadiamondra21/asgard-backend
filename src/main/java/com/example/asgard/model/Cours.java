package com.example.asgard.model;

import java.time.LocalDateTime;
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
@Table(name = "cours")
public class Cours {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cours;
	
	@Column
	private String theme;
	
	@Column
	private String description;
	
	@Column(name="date_heure", nullable = false)
	private LocalDateTime dateHeure;
	
	@Column
	private String lieu;
	
	@Column
	private String montor;
	
	@ManyToOne
	@JoinColumn(name = "id_etudiant")
	private Admin admin;
	
	@OneToMany(mappedBy = "cours")
	private List<etudiant_cours> etudiantCours;

	public Cours() {
		super();
	}

	public int getId_cours() {
		return id_cours;
	}

	public void setId_cours(int id_cours) {
		this.id_cours = id_cours;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getDateHeure() {
		return dateHeure;
	}

	public void setDateHeure(LocalDateTime dateHeure) {
		this.dateHeure = dateHeure;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getMontor() {
		return montor;
	}

	public void setMontor(String montor) {
		this.montor = montor;
	}
	
	
	
	
	
}
