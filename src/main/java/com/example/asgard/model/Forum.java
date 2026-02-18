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
@Table(name = "forum")
public class Forum {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_forum;
	
	@Column
	private String sujet;
	
	@Column
	private String media_forum;
	
	@Column
	private String message;
	
	@ManyToOne
	@JoinColumn(name = "id_etudiant")
	private Etudiant etudiant;
	
	@OneToMany(mappedBy = "forum")
	private List<Commentaire> commentaire;

	public Forum() {
		super();
	}

	public int getId_forum() {
		return id_forum;
	}

	public void setId_forum(int id_forum) {
		this.id_forum = id_forum;
	}

	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public String getMedia_forum() {
		return media_forum;
	}

	public void setMedia_forum(String media_forum) {
		this.media_forum = media_forum;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
