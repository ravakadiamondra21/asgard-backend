package com.example.asgard.model;

import java.time.LocalDateTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "AdminClub")
public class AdminClub {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_adminClub;
	
	 @ManyToOne
	 @JoinColumn(name = "id_club", nullable = false)
	 private Club id_club;
	 
	 @ManyToOne
	 @JoinColumn(name = "matricule", nullable = false)
	 private Etudiant matricule;
	 
	 private LocalDateTime dateAttribution;

	public int getId_adminClub() {
		return id_adminClub;
	}

	public void setId_adminClub(int id_adminClub) {
		this.id_adminClub = id_adminClub;
	}

	public Club getId_club() {
		return id_club;
	}

	public void setId_club(Club id_club) {
		this.id_club = id_club;
	}

	public Etudiant getMatricule() {
		return matricule;
	}

	public void setMatricule(Etudiant matricule) {
		this.matricule = matricule;
	}

	public LocalDateTime getDateAttribution() {
		return dateAttribution;
	}

	public void setDateAttribution(LocalDateTime dateAttribution) {
		this.dateAttribution = dateAttribution;
	}
	 
	 
	 
		 

}
