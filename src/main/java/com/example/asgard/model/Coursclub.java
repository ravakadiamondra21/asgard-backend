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
public class Coursclub {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_coursclub;
	
	@Column
	private String theme;
	
	@Column
	private String description_seance;
	
	@Column(name="date_heure", nullable = false)
	private LocalDateTime date_seance;
	
	@Column
	private String lieu;
	
	@Column
	private String nomClubOuAss;
	
	@ManyToOne
	@JoinColumn(name = "id_etudiant")
	private Etudiant etudiant_createur;
	
	@Column
	private String mentor;
	
	public String getNomClubOuAss() {
		return nomClubOuAss;
	}

	public void setNomClubOuAss(String nomClubOuAss) {
		this.nomClubOuAss = nomClubOuAss;
	}

	public Etudiant getEtudiant_createur() {
		return etudiant_createur;
	}

	public void setEtudiant_createur(Etudiant etudiant_createur) {
		this.etudiant_createur = etudiant_createur;
	}

	
	
	public Coursclub() {
		super();
	}

	public int getId_cours() {
		return id_coursclub;
	}

	public void setId_cours(int id_cours) {
		this.id_coursclub = id_cours;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getDescription_seance() {
		return description_seance;
	}

	public void setDescription_seance(String description) {
		this.description_seance = description;
	}

	public LocalDateTime getDate_seance() {
		return date_seance;
	}

	public void setDate_seance(LocalDateTime dateHeure) {
		this.date_seance = dateHeure;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getMentor() {
		return mentor;
	}

	public void setMentor(String mentor) {
		this.mentor = mentor;
	}

	
	
	
	
	
}
