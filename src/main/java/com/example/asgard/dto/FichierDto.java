package com.example.asgard.dto;

public class FichierDto {
	private int id_fichier;
	private String titre_fichier;
	private String description_ficher;
	private String fichier;
	
	
	public FichierDto(int id_fichier, String titre_fichier, String description_ficher, String fichier) {
		super();
		this.id_fichier = id_fichier;
		this.titre_fichier = titre_fichier;
		this.description_ficher = description_ficher;
		this.fichier = fichier;
	}


	public int getId_fichier() {
		return id_fichier;
	}


	public void setId_fichier(int id_fichier) {
		this.id_fichier = id_fichier;
	}


	public String getTitre_fichier() {
		return titre_fichier;
	}


	public void setTitre_fichier(String titre_fichier) {
		this.titre_fichier = titre_fichier;
	}


	public String getDescription_ficher() {
		return description_ficher;
	}


	public void setDescription_ficher(String description_ficher) {
		this.description_ficher = description_ficher;
	}


	public String getFichier() {
		return fichier;
	}


	public void setFichier(String fichier) {
		this.fichier = fichier;
	}
	
	
	
}
