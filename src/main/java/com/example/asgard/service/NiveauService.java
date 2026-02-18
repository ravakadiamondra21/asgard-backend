package com.example.asgard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.asgard.dto.NiveauDto;
import com.example.asgard.model.Niveau;
import com.example.asgard.repository.NiveauRepository;

@Service
public class NiveauService {
	private final NiveauRepository repo;

	public NiveauService(NiveauRepository repo) {
		super();
		this.repo = repo;
	}
	
	public NiveauDto creerNiveau(NiveauDto dto) {
		Niveau niveau = new Niveau();
		
		niveau.setId_niveau(dto.getId_niveau());
		
		repo.save(niveau);
		
		return dto;
	}
	
	public List<NiveauDto> getAllNiveau() {
		List<Niveau> niveau = repo.findAll();
		List<NiveauDto> listNiveau = new ArrayList<NiveauDto>();
		
		for(Niveau n : niveau) {
			NiveauDto dto = new NiveauDto();
			
			dto.setId_niveau(n.getId_niveau());
			
			listNiveau.add(dto);
		}
		
		return listNiveau;
	}
	
	
}
