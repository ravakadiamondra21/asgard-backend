package com.example.asgard.dto;

public class EtudiantResponseDto {
	private String matricule;
	private String email;
	private String nom;
	private String profil;
	private String id_niveau;
	private String id_parcours;
	private String token;
	
	public EtudiantResponseDto(String matricule, String email, String nom, String profil, String id_niveau,
			String id_parcours, String token) {
		super();
		this.matricule = matricule;
		this.email = email;
		this.nom = nom;
		this.profil = profil;
		this.id_niveau = id_niveau;
		this.id_parcours = id_parcours;
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
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

	public String getId_niveau() {
		return id_niveau;
	}

	public void setId_niveau(String id_niveau) {
		this.id_niveau = id_niveau;
	}

	public String getId_parcours() {
		return id_parcours;
	}

	public void setId_parcours(String id_parcours) {
		this.id_parcours = id_parcours;
	}
	
	
}
