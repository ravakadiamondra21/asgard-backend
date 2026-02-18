package com.example.asgard.dto;

public class NiveauDto {
	private String id_niveau;

	public NiveauDto(String id_niveau) {
		super();
		this.id_niveau = id_niveau;
	}
	
	public NiveauDto() {
		super();
	}

	public String getId_niveau() {
		return id_niveau;
	}

	public void setId_niveau(String id_niveau) {
		this.id_niveau = id_niveau;
	}
	
	
}
