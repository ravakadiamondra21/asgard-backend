package com.example.asgard.model;

import java.time.LocalDateTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "evenement")
@Inheritance(strategy = InheritanceType.JOINED)
public class Evenement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_evenement;
	
	@Column
	private String titre_evenement;
	
	@Column
	private String desc_evenement;
	
	@Column(name = "date_time_evenement")
	private LocalDateTime date_time_evenement;
	
	@Column
	private String lieu_evenement;
	
	@Column
	private String image_evenement;
	
	@ManyToOne
	@JoinColumn(name = "id_etudiant")
	private Etudiant admin;
	
	

	

	public Evenement() {
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

	public Etudiant getAdmin() {
		return admin;
	}

	public void setAdmin(Etudiant admin) {
		this.admin = admin;
	}
	
	
	
}
