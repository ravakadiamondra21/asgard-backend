package com.example.asgard.dto;

import java.time.LocalDateTime;

public class CoursDto {
	private int id_cours;
	private String theme;
	private String description;
	private LocalDateTime dateHeure;
	private String lieu;
	private String montor;
	
	
	public CoursDto(int id_cours, String theme, String description, LocalDateTime dateHeure,String lieu, String montor) {
		super();
		this.id_cours = id_cours;
		this.theme = theme;
		this.description = description;
		this.lieu = lieu;
		this.dateHeure = dateHeure;
		
		this.montor = montor;
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
