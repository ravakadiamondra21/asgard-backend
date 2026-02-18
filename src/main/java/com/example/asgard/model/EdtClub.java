package com.example.asgard.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
@Table(name = "edtclub")
public class EdtClub {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_edt;
	
	@Column
	private String theme;
	
	@Column(name = "edt")
	private LocalDateTime edt;
	
	@Column
	private String salle;
	
	@Column
	private String montor;
	
	@ManyToOne
	@JoinColumn(name = "id_club")
	private Club club;
	
	@OneToMany(mappedBy = "edtclub")
	private List<etudiant_club> etudiant_club;

	public EdtClub() {
		super();
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
