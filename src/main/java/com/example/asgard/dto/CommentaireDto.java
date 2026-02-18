package com.example.asgard.dto;

public class CommentaireDto {
	private int id_commentaire;
	private String commentaire;
	private float score;
	
	
	public CommentaireDto(int id_commentaire, String commentaire, float score) {
		super();
		this.id_commentaire = id_commentaire;
		this.commentaire = commentaire;
		this.score = score;
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


	public float getScore() {
		return score;
	}


	public void setScore(float score) {
		this.score = score;
	}
	
	
}
