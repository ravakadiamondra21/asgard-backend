package com.example.asgard.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.asgard.dto.ParcoursDto;
import com.example.asgard.model.Parcours;
import com.example.asgard.repository.ParcoursRepository;

@Service
public class ParcoursService {
	private final ParcoursRepository parcoursrepo;

	public ParcoursService(ParcoursRepository parcoursrepo) {
		super();
		this.parcoursrepo = parcoursrepo;
	}
	
	public ParcoursDto creerParcours(ParcoursDto dto) {
		Parcours parcours = new Parcours();
		
		parcours.setId_parcours(dto.getId_parcours());
		parcours.setNom_parcours(dto.getNom_parcours());
		
		parcoursrepo.save(parcours);
		
		return dto;
	}
	
	public List<ParcoursDto> getAllParcours() {
		List<Parcours> allParcours = parcoursrepo.findAll();
		List<ParcoursDto> listParcours = new ArrayList<ParcoursDto>();
		
		for(Parcours parcours : allParcours) {
			ParcoursDto dto = new ParcoursDto();
			
			dto.setId_parcours(parcours.getId_parcours());
			dto.setNom_parcours(parcours.getNom_parcours());
			
			listParcours.add(dto);
		}
		
		return listParcours;
		
	}
	
	public ParcoursDto getById(String id_parcours) {
		Optional<Parcours> parcours = parcoursrepo.findById(id_parcours);
		
		if(parcours.isPresent()) {
			ParcoursDto dto = new ParcoursDto();
			
			dto.setId_parcours(parcours.get().getId_parcours());
			dto.setNom_parcours(parcours.get().getNom_parcours());
			return dto;
		} else {
			return null;
		}
		
	}
	
	public ResponseEntity<ParcoursDto> updateParcours(String id_parcours, ParcoursDto newParcours) {
		Parcours p = parcoursrepo.findById(id_parcours).orElseThrow(() -> new RuntimeException("Parcours introuvable"));
		
		p.setNom_parcours(newParcours.getNom_parcours());
		
		parcoursrepo.save(p);
		
		return ResponseEntity.ok(newParcours);
		
		
	}
	
	public void deleteById(String id_parcours) {
		Parcours p = parcoursrepo.findById(id_parcours).orElseThrow(() -> new RuntimeException("Parcours introuvable"));
		
		parcoursrepo.delete(p);
	}
}
