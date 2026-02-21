package com.example.asgard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.asgard.dto.EvenementDto;
import com.example.asgard.model.Etudiant;
import com.example.asgard.model.Evenement;
import com.example.asgard.repository.EvenementRepository;

@Service
public class EvenementService {
	private final EvenementRepository eventRepo;

	public EvenementService(EvenementRepository eventRepo) {
		super();
		this.eventRepo = eventRepo;
	}
	
	public List<EvenementDto> getAllEvent() {
		List<Evenement> allEvent = eventRepo.findAll();
		List<EvenementDto> allDto = new ArrayList<EvenementDto>();
		
		for(Evenement e : allEvent) {
			EvenementDto dto = new EvenementDto();
			
			dto.setId_evenement(e.getId_evenement());
			dto.setTitre_evenement(e.getTitre_evenement());
			dto.setDesc_evenement(e.getDesc_evenement());
			dto.setLieu_evenement(e.getLieu_evenement());
			dto.setImage_evenement(e.getImage_evenement());
			dto.setId_etudiant(e.getAdmin().getMatricule());
			dto.setDate_time_evenement(e.getDate_time_evenement());
			
			allDto.add(dto);
			
		}
		
		return allDto;
	}
	
	
}
