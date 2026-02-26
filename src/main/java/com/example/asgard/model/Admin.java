package com.example.asgard.model;


import java.util.List;

import com.example.asgard.model.Etudiant;
import com.example.asgard.model.enums.Statut;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin")
@PrimaryKeyJoinColumn(name = "matricule")
public class Admin extends Etudiant {
	
	@Enumerated(EnumType.STRING)
	@Column
	private Statut permission;

	
	

	public Admin() {
		super();
	}

	public Statut getPermission() {
		return permission;
	}

	public void setPermission(Statut permission) {
		this.permission = permission;
	}
	
	
	
}
