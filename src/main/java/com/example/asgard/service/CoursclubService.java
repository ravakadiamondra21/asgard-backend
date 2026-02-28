package com.example.asgard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.asgard.dto.CoursclubDto;
import com.example.asgard.model.Coursclub;
import com.example.asgard.repository.CoursclubRepository;

@Service
public class CoursclubService {
	
	private CoursclubRepository repo;

	public CoursclubService(CoursclubRepository repo) {
		super();
		this.repo = repo;
	}
	
	public List<CoursclubDto> findAllCoursclub() {
		List<CoursclubDto> allCours = new ArrayList<CoursclubDto>();
		List<Coursclub> coursclub = repo.findAll();
		
		for (Coursclub c : coursclub) {
			CoursclubDto dto = new CoursclubDto();
			
			dto.setId_coursclub(c.getId_cours());
			dto.setDate_seance(c.getDate_seace());
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
}
