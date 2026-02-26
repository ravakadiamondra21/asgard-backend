package com.example.asgard.model;
import java.util.List;

import com.example.asgard.model.enums.Statut;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "etudiant")
@Inheritance(strategy = InheritanceType.JOINED)
public class Etudiant {
	@Id
	private String matricule;
	
	@Column(unique = true)
	private String email;
	
	@Column
	private String nom;
	
	@Column
	private String password;
	
	@OneToMany(mappedBy = "admin")
	private List<Club> club;
	
	@Column
	private String profil;
	
	@Enumerated(EnumType.STRING)
	private Statut statut;
	
	private boolean enable;
	
	@ManyToOne
	@JoinColumn(name = "id_parcours")
	private Parcours parcours;
	
	@ManyToOne
	@JoinColumn(name = "id_niveau")
	private Niveau niveau;
	
	@OneToMany(mappedBy = "etudiant")
	private List<Fichier> fichier;
	
	@OneToMany(mappedBy = "etudiant")
	private List<Forum> forum;
	
	@OneToMany(mappedBy = "etudiant")
	private List<etudiant_cours> etudiant_cours;
	
	@OneToMany(mappedBy = "etudiant")
	private List<etudiant_club> etudiant_club;
	
	@OneToMany(mappedBy = "etudiant")
	private List<Commentaire> commenataire;
	
	@OneToMany(mappedBy = "etudiant")
	private List<Reponse> reponse;
	
	@OneToMany(mappedBy = "admin")
	private List<Evenement> evenement;
	
	@OneToMany(mappedBy = "admin")
	private List<Cours> cours;
	
	@OneToMany(mappedBy = "admin")
	private List<Article> article;
	
	public Etudiant () {
	}
	
	public Statut getStatut() {
		return statut;
	}


	public void setStatut(Statut statut) {
		this.statut = statut;
	}


	public boolean isEnable() {
		return enable;
	}


	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	
	public List<Evenement> getEvenement() {
		return evenement;
	}


	public void setEvenement(List<Evenement> evenement) {
		this.evenement = evenement;
	}


	public String getMatricule() {
		return matricule;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getProfil() {
		return profil;
	}

	public void setProfil(String profil) {
		this.profil = profil;
	}

	public Parcours getParcours() {
		return parcours;
	}

	public void setParcours(Parcours parcours) {
		this.parcours = parcours;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}
	
	
	
}