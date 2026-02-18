package com.example.asgard.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * 
 */
public class EtudiantDto {
	@NotBlank
	private String matricule;
	
	@NotBlank
	@Email(message = "email not valid")
	private String email;
	
	@NotBlank()
	private String nom;
	
	@NotBlank
	@Size(min = 6)
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z0-9]).{6,}$", message = "password not valid")
	private String password;
	
	@NotNull
	private String id_parcours;
	
	@NotNull
	private String id_niveau;
	

	public EtudiantDto(String matricule, String email, String nom, String password, String id_parcours, String id_niveau) {
		super();
		this.matricule = matricule;
		this.email = email;
		this.nom = nom;
		this.password = password;
		this.id_parcours = id_parcours;
		this.id_niveau = id_niveau;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId_niveau() {
		return id_niveau;
	}

	public void setId_niveau(String id_niveau) {
		this.id_niveau = id_niveau;
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
	public String getId_parcours() {
		return id_parcours;
	}

	public void setId_parcours(String id_parcours) {
		this.id_parcours = id_parcours;
	}
	
	
}
