package com.example.asgard.dto;

import java.time.LocalDateTime;

public class CoursclubDto {
	private int id_coursclub;
	private String etudiant_createur;
	private String nomClubOuAss;
	private String theme;
	private String description_seance;
	private LocalDateTime date_seance;
	private String lieu;
	private String mentor;
	
	
	public CoursclubDto() {
		super();
	}
	public CoursclubDto(int id_coursclub, String etudiant_createur, String nomClubOuAss, String theme, String description_seance,
			LocalDateTime date_seance, String lieu, String mentor) {
		super();
		this.id_coursclub = id_coursclub;
		this.etudiant_createur = etudiant_createur;
		this.nomClubOuAss = nomClubOuAss;
		this.theme = theme;
		this.description_seance = description_seance;
		this.date_seance = date_seance;
		this.lieu = lieu;
		this.mentor = mentor;
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
	public void setEtudiant_createur(String auteur) {
		this.etudiant_createur = auteur;
	}
	public String getNomClubOuAss() {
		return nomClubOuAss;
	}
	public void setNomClubOuAss(String nomClubOuAss) {
		this.nomClubOuAss = nomClubOuAss;
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
	public String getMentor() {
		return mentor;
	}
	public void setMentor(String mentor) {
		this.mentor = mentor;
	}
	
	
	
}
