package com.example.asgard.service;


import java.util.ArrayList;
import java.util.List;

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
	
	
	public List<ClubDto> getClubByApprove(boolean approve) {
		List<Club> allClub = this.repoClub.findByApprove(approve);
		List<ClubDto> clubDto = new ArrayList<ClubDto>();
		
		for (Club c : allClub) {
			ClubDto club = new ClubDto();
			
			club.setId_club(c.getId_club());
			club.setNom_club(c.getNom_club());
			club.setDescription_club(c.getDescription_club());
			club.setJour_default(c.getJour_default());
			club.setHeure_default(c.getHeure_default());
			club.setCreateur_club(c.getCreateur_club().getNom());
			
			clubDto.add(club);
		}
		
		return clubDto;
	}
	
}
