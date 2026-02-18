package com.example.asgard.dto;

public class ReponseDto {
	private int id_reponse;
	private String reponse;
	private float score;
	
	
	public ReponseDto(int id_reponse, String reponse, float score) {
		super();
		this.id_reponse = id_reponse;
		this.reponse = reponse;
		this.score = score;
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
