package com.example.asgard.dto;

public class ClubDto {
	private int id_club;
	private String nom_club;
	private String description_club;
	private String jour_default;
	private String heure_default;
	
	
	public ClubDto(int id_club, String nom_club, String description_club, String jour_default, String heure_default) {
		super();
		this.id_club = id_club;
		this.nom_club = nom_club;
		this.description_club = description_club;
		this.jour_default = jour_default;
		this.heure_default = heure_default;
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
