package com.example.asgard.dto;

public class ArticleSDto {
	private int id_article;
	private String titre_article;
	private String contenu_article;
	private String image;
	
	
	public ArticleSDto(int id_article, String titre_article, String contenu_article, String image) {
		super();
		this.id_article = id_article;
		this.titre_article = titre_article;
		this.contenu_article = contenu_article;
		this.image = image;
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
