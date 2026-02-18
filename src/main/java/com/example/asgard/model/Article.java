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
@Table(name = "article")
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_article;
	
	@Column
	private String titre_article;
	
	@Column
	private String contenu_article;
	
	@Column
	private String image;
	
	@ManyToOne
	@JoinColumn(name = "id_etudiant")
	private Admin admin;

	public Article() {
		super();
	}

	public int getId_article() {
		return id_article;
	}

	public void setId_article(int id_article) {
		this.id_article = id_article;
	}

	public String getTitre_article() {
		return titre_article;
	}

	public void setTitre_article(String titre_article) {
		this.titre_article = titre_article;
	}

	public String getContenu_article() {
		return contenu_article;
	}

	public void setContenu_article(String contenu_article) {
		this.contenu_article = contenu_article;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
}
