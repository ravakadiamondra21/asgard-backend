package com.example.asgard.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EdtclubDto {
	private int id_edt;
	private String theme;
	private LocalDateTime edt;
	private String salle;
	private String montor;
	
	
	public EdtclubDto(int id_edt, String theme, LocalDateTime edt, String salle, String montor) {
		super();
		this.id_edt = id_edt;
		this.theme = theme;
		this.edt = edt;
		this.salle = salle;
		this.montor = montor;
	}


	public int getId_edt() {
		return id_edt;
	}


	public void setId_edt(int id_edt) {
		this.id_edt = id_edt;
	}


	public String getTheme() {
		return theme;
	}


	public void setTheme(String theme) {
		this.theme = theme;
	}


	public LocalDateTime getEdt() {
		return edt;
	}


	public void setEdt(LocalDateTime edt) {
		this.edt = edt;
	}


	public String getSalle() {
		return salle;
	}


	public void setSalle(String salle) {
		this.salle = salle;
	}


	public String getMontor() {
		return montor;
	}


	public void setMontor(String montor) {
		this.montor = montor;
	}
	
	
}
