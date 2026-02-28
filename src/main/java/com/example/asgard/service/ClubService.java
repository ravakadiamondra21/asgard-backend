package com.example.asgard.service;


import org.springframework.stereotype.Service;

import com.example.asgard.dto.ClubDto;
import com.example.asgard.model.Club;
import com.example.asgard.model.Etudiant;
import com.example.asgard.repository.ClubRepository;
import com.example.asgard.repository.EtudiantRepository;
import com.example.asgard.dto.ClubResponseDto;

@Service
public class ClubService {
	private ClubRepository repoClub;
	private EtudiantRepository repoEtudiant;
	
	public ClubService(ClubRepository repo, EtudiantRepository repoEtudiant) {
		super();
		this.repoClub = repo;
		this.repoEtudiant = repoEtudiant;
	}

	public long countAllClubs() {
		return this.repoClub.count();
	}
	
	public ClubResponseDto createClub(ClubDto club) {
		Club newclub = new Club();
		
		Etudiant createur_club = this.repoEtudiant
		        .findById(club.getCreateur_club())
		        .orElseThrow(() -> new RuntimeException("Etudiant non trouvé"));
		
		newclub.setId_club(club.getId_club());
		newclub.setDescription_club(club.getDescription_club());
		newclub.setNom_club(club.getNom_club());
		newclub.setJour_default(club.getJour_default());
		newclub.setHeure_default(club.getHeure_default());
		newclub.setCreateur_club(createur_club);
		newclub.setApproved(false);
		
		Club saved = repoClub.save(newclub);
		
		return new ClubResponseDto(saved);
		
	}
	
	public void approveClubCreation(int id_club) {
		Club club = this.repoClub.findById(id_club).orElseThrow(() -> new RuntimeException("Club non trouvé"));;
		
		club.setApproved(true);
		this.repoClub.save(club);
		
	}
	
}
