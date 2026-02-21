package com.example.asgard.service;

import org.springframework.stereotype.Service;

import com.example.asgard.dto.CoursDto;
import com.example.asgard.model.Cours;
import com.example.asgard.repository.CoursRepository;

@Service
public class CoursService {
	private final CoursRepository repo;
	
	public CoursService(CoursRepository repo) {
		super();
		this.repo = repo;
	}



	public CoursDto createCours(CoursDto dto) {
		Cours cours = new Cours();
		
		cours.setId_cours(dto.getId_cours());
		cours.setTheme(dto.getTheme());
		cours.setDescription(dto.getDescription());
		cours.setDateHeure(dto.getDateHeure());
		cours.setLieu(dto.getLieu());
		cours.setMontor(dto.getMontor());
		
		repo.save(cours);
		
		return dto;
	}
	
	
	public long countAllCourse() {
		return repo.count();
	}
}
