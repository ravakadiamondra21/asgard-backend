package com.example.asgard.dto;

import java.time.LocalDateTime;

public class CoursclubCreateDto {
	private int id_coursclub;
	private String etudiant_createur;
	private String theme;
	private String description_seance;
	private LocalDateTime date_seance;
	private String lieu;
	//private String id_club;
	
	


	public CoursclubCreateDto(int id_coursclub, String etudiant_createur, String theme,
			String description_seance, LocalDateTime date_seance, String lieu) {
		super();
		this.id_coursclub = id_coursclub;
		this.etudiant_createur = etudiant_createur;
		this.theme = theme;
		this.description_seance = description_seance;
		this.date_seance = date_seance;
		this.lieu = lieu;
	}


	public int getId_coursclub() {
		return id_coursclub;
	}


	public void setId_coursclub(int id_coursclub) {
		this.id_coursclub = id_coursclub;
	}


	public String getEtudiant_createur() {
		return etudiant_createur;
	}


	public void setEtudiant_createur(String etudiant_createur) {
		this.etudiant_createur = etudiant_createur;
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


	public void setDescription_seance(String description_seance) {
		this.description_seance = description_seance;
	}


	public LocalDateTime getDate_seance() {
		return date_seance;
	}


	public void setDate_seance(LocalDateTime date_seance) {
		this.date_seance = date_seance;
	}


	public String getLieu() {
		return lieu;
	}


	public void setLieu(String lieu) {
		this.lieu = lieu;
	}



	
	
	
}
