package com.example.asgard.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "AdminClub")
public class AdminClub {
	@Id
	private int id_adminClub;
	
	 @ManyToMany
	 @JoinColumn(name = "id_club", nullable = false)
	 private int id_club;
	 
	 @ManyToMany
	 @JoinColumn(name = "matricule", nullable = false)
	 private String matricule;
	 
	 private LocalDateTime dateAttribution;

	public int getId_adminClub() {
		return id_adminClub;
	}

	public void setId_adminClub(int id_adminClub) {
		this.id_adminClub = id_adminClub;
	}

	public int getId_club() {
		return id_club;
	}

	public void setId_club(int id_club) {
		this.id_club = id_club;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public LocalDateTime getDateAttribution() {
		return dateAttribution;
	}

	public void setDateAttribution(LocalDateTime dateAttribution) {
		this.dateAttribution = dateAttribution;
	}
	 
	 
	 
		 

}
