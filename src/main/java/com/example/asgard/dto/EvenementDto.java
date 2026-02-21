package com.example.asgard.dto;

import java.time.LocalDateTime;

import com.example.asgard.model.Etudiant;

public class EvenementDto {
	private int id_evenement;
	private String titre_evenement;
	private String desc_evenement;
	private LocalDateTime date_time_evenement;
	private String lieu_evenement;
	private String image_evenement;
	private String id_etudiant;
	
	
	public EvenementDto(int id_evenement, String titre_evenement, String desc_evenement,
			LocalDateTime date_time_evenement, String lieu_evenement, String image_evenement, String id_etudiant) {
		super();
		this.id_evenement = id_evenement;
		this.titre_evenement = titre_evenement;
		this.desc_evenement = desc_evenement;
		this.date_time_evenement = date_time_evenement;
		this.lieu_evenement = lieu_evenement;
		this.image_evenement = image_evenement;
		this.id_etudiant = id_etudiant;
	}
	
	


	public EvenementDto() {
		super();
	}




	public int getId_evenement() {
		return id_evenement;
	}


	public void setId_evenement(int id_evenement) {
		this.id_evenement = id_evenement;
	}


	public String getTitre_evenement() {
		return titre_evenement;
	}


	public void setTitre_evenement(String titre_evenement) {
		this.titre_evenement = titre_evenement;
	}


	public String getDesc_evenement() {
		return desc_evenement;
	}


	public void setDesc_evenement(String desc_evenement) {
		this.desc_evenement = desc_evenement;
	}


	public LocalDateTime getDate_time_evenement() {
		return date_time_evenement;
	}


	public void setDate_time_evenement(LocalDateTime date_time_evenement) {
		this.date_time_evenement = date_time_evenement;
	}


	public String getLieu_evenement() {
		return lieu_evenement;
	}


	public void setLieu_evenement(String lieu_evenement) {
		this.lieu_evenement = lieu_evenement;
	}


	public String getImage_evenement() {
		return image_evenement;
	}


	public void setImage_evenement(String image_evenement) {
		this.image_evenement = image_evenement;
	}


	public String getId_etudiant() {
		return id_etudiant;
	}


	public void setId_etudiant(String id_etudiant) {
		this.id_etudiant = id_etudiant;
	}

	
	
	
	
}
