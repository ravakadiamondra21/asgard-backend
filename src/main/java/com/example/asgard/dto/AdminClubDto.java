package com.example.asgard.dto;

import java.time.LocalDateTime;

public class AdminClubDto {
	private int id_adminClub;
	private int id_club;
	private String matricule;
	private LocalDateTime dateAttribution;
	
	
	public AdminClubDto(int id_adminClub, int id_club, String matricule, LocalDateTime dateAttribution) {
		super();
		this.id_adminClub = id_adminClub;
		this.id_club = id_club;
		this.matricule = matricule;
		this.dateAttribution = dateAttribution;
	}


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
