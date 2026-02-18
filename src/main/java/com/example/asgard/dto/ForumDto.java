package com.example.asgard.dto;

public class ForumDto {
	private int id_forum;
	private String sujet;
	private String media_forum;
	private String message;
	
	
	public ForumDto(int id_forum, String sujet, String media_forum, String message) {
		super();
		this.id_forum = id_forum;
		this.sujet = sujet;
		this.media_forum = media_forum;
		this.message = message;
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
