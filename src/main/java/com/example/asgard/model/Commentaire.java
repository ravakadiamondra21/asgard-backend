package com.example.asgard.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "commentaire")
public class Commentaire {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_commentaire;
	
	@Column
	private String commentaire;
	
	@Column
	private double score;
	
	@ManyToOne
	@JoinColumn(name = "id_etudiant")
	private Etudiant etudiant;
	
	@ManyToOne
	@JoinColumn(name = "id_forum")
	private Forum forum;
	
	@OneToMany(mappedBy = "commentaire")
	private List<Reponse> reponse;

	public Commentaire() {
		super();
	}

	public int getId_commentaire() {
		return id_commentaire;
	}

	public void setId_commentaire(int id_commentaire) {
		this.id_commentaire = id_commentaire;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	
	
}
