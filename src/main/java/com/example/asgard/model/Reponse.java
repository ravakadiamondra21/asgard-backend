package com.example.asgard.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reponse")
public class Reponse {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_reponse;
	
	@Column
	private String reponse;
	
	@Column
	private float score;
	
	@ManyToOne
	@JoinColumn(name = "id_etudiant")
	private Etudiant etudiant;
	
	@ManyToOne
	@JoinColumn(name = "id_commentaire")
	private Commentaire commentaire;

	public Reponse() {
		super();
	}

	public int getId_reponse() {
		return id_reponse;
	}

	public void setId_reponse(int id_reponse) {
		this.id_reponse = id_reponse;
	}

	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
	
	
	
}
