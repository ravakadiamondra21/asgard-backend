package com.example.asgard.dto;

import java.time.LocalDateTime;

public class Coursclub {
	private int id_coursclub;
	private String auteur;
	private String nomClubOuAss;
	private String theme;
	private String description_seance;
	private LocalDateTime date_seance;
	private String lieu;
	
	
	
	public Coursclub() {
		super();
	}
	public Coursclub(int id_coursclub, String auteur, String nomClubOuAss, String theme, String description_seance,
			LocalDateTime date_seance, String lieu) {
		super();
		this.id_coursclub = id_coursclub;
		this.auteur = auteur;
		this.nomClubOuAss = nomClubOuAss;
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
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
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
	
	
	
}
