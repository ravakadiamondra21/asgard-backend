package com.example.asgard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.asgard.dto.CoursclubCreateDto;
import com.example.asgard.dto.CoursclubDto;
import com.example.asgard.model.Club;
import com.example.asgard.model.Coursclub;
import com.example.asgard.model.Etudiant;
import com.example.asgard.model.enums.Statut;
import com.example.asgard.repository.ClubRepository;
import com.example.asgard.repository.CoursclubRepository;
import com.example.asgard.repository.EtudiantRepository;

@Service
public class CoursclubService {
	
	private CoursclubRepository repo;
	private EtudiantRepository etudiant_repo;

	public CoursclubService(CoursclubRepository repo, EtudiantRepository etudiant_repo) {
		super();
		this.repo = repo;
		this.etudiant_repo = etudiant_repo;
	}
	
	public List<CoursclubDto> findAllCoursclub() {
		List<CoursclubDto> allCours = new ArrayList<CoursclubDto>();
		List<Coursclub> coursclub = repo.findAll();
		
		for (Coursclub c : coursclub) {
			CoursclubDto dto = new CoursclubDto();
			
			dto.setId_coursclub(c.getId_cours());
			dto.setDate_seance(c.getDate_seance());
			dto.setDescription_seance(c.getDescription_seance());
			dto.setEtudiant_createur(c.getEtudiant_createur().getMatricule());
			dto.setLieu(c.getLieu());
			dto.setNomClubOuAss(c.getNomClubOuAss());
			dto.setTheme(c.getTheme());
			
			allCours.add(dto);
		}
		
		return allCours;
	}
	
	public float count() {
		return this.repo.count();
	}
	
	public Coursclub createCoursclub(CoursclubCreateDto dto, String id_club) {
		
		Coursclub coursclub = new Coursclub();
		Etudiant ec = this.etudiant_repo.findById(dto.getEtudiant_createur()).orElseThrow(() -> new RuntimeException());
		
		coursclub.setId_cours(dto.getId_coursclub());
		coursclub.setEtudiant_createur(ec);
		coursclub.setTheme(dto.getTheme());
		coursclub.setDescription_seance(dto.getDescription_seance());
		coursclub.setLieu(dto.getLieu());
		coursclub.setDate_seance(dto.getDate_seance());
		coursclub.setNomClubOuAss(id_club);
		
		repo.save(coursclub);
		
		return coursclub;
		
	}
	
	
	public Coursclub createCoursclub(CoursclubCreateDto dto) {
		
		Coursclub coursclub = new Coursclub();
		Etudiant ec = this.etudiant_repo.findById(dto.getEtudiant_createur()).orElseThrow(() -> new RuntimeException());
		
		coursclub.setId_cours(dto.getId_coursclub());
		coursclub.setEtudiant_createur(ec);
		coursclub.setTheme(dto.getTheme());
		coursclub.setDescription_seance(dto.getDescription_seance());
		coursclub.setLieu(dto.getLieu());
		coursclub.setDate_seance(dto.getDate_seance());
		coursclub.setNomClubOuAss("Association");
		
		repo.save(coursclub);
		
		return coursclub;
		
	}
	
	public List<CoursclubDto> findByClub(String club) {
		
		List<Coursclub> allClub = this.repo.findByClub(club);
		List<CoursclubDto> allClubdto = new ArrayList<CoursclubDto>();
		
		for (Coursclub cc : allClub) {
			
			System.out.println(cc.getNomClubOuAss());
			
			CoursclubDto dto = new CoursclubDto();
			
			dto.setId_coursclub(cc.getId_cours());
			dto.setEtudiant_createur(cc.getEtudiant_createur().getNom());
			dto.setNomClubOuAss(cc.getNomClubOuAss());
			dto.setTheme(cc.getTheme());
			dto.setDescription_seance(cc.getDescription_seance());
			dto.setDate_seance(cc.getDate_seance());
			dto.setLieu(cc.getLieu());
			
			allClubdto.add(dto);
			
			
		}
		
		return allClubdto;
	}
	
	
	
	
	
	
}
