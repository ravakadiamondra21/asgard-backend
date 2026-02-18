package com.example.asgard.dto;

public class ParcoursDto {
	private String id_parcours;
	private String nom_parcours;
	
	
	public ParcoursDto(String id_parcours, String nom_parcours) {
		super();
		this.id_parcours = id_parcours;
		this.nom_parcours = nom_parcours;
	}
	

	public ParcoursDto() {
		super();
	}

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
