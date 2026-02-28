package com.example.asgard.dto;

import com.example.asgard.model.Club;

public class ClubResponseDto {
	private int id_club;
    private String nom_club;
    private String description_club;
    private String jour_default;
    private String heure_default;
    private boolean approved;
    private String createurMatricule;

    public ClubResponseDto(Club club) {
        this.id_club = club.getId_club();
        this.nom_club = club.getNom_club();
        this.description_club = club.getDescription_club();
        this.jour_default = club.getJour_default();
        this.heure_default = club.getHeure_default();
        this.approved = club.isApproved();
        this.createurMatricule = club.getCreateur_club().getMatricule();
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

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public String getCreateurMatricule() {
		return createurMatricule;
	}

	public void setCreateurMatricule(String createurMatricule) {
		this.createurMatricule = createurMatricule;
	}
    
    
}
