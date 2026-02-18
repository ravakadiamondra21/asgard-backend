package com.example.asgard.dto;

public class AdminDto {

	private String matricule;
	private String email;
	private String nom;
	private String profil;
	private String permission;
	
	
	public AdminDto(String matricule, String email, String nom, String profil, String permission) {
		super();
		this.matricule = matricule;
		this.email = email;
		this.nom = nom;
		this.profil = profil;
		this.permission = permission;
	}


	public String getMatricule() {
		return matricule;
	}


	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getProfil() {
		return profil;
	}


	public void setProfil(String profil) {
		this.profil = profil;
	}


	public String getPermission() {
		return permission;
	}


	public void setPermission(String permission) {
		this.permission = permission;
	}
	
	
	
}
