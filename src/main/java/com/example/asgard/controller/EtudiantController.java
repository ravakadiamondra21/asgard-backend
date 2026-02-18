package com.example.asgard.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.asgard.dto.EtudiantDto;
import com.example.asgard.model.Etudiant;
import com.example.asgard.repository.EtudiantRepository;
import com.example.asgard.service.EtudiantService;

import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/etudiant")
@CrossOrigin(origins = "${app.cors.allowed-origin")
public class EtudiantController {

	private final EtudiantService service;
	
    public EtudiantController(EtudiantService service) {
        this.service = service;
    }

	@PostMapping(value= "/create")
	public Etudiant create(@Valid @RequestBody EtudiantDto dto) {
		return service.creerEtudiant(dto);
	}
	
	@PostMapping(value = "/saveProfil/{matricule}", consumes = "multipart/form-data")
	public String saveProfil(@RequestParam("file") MultipartFile file, @PathVariable String matricule) {
		return service.saveProfil(matricule, file);
	}
	
	@PreAuthorize("hasAnyRole('SUPER_ADMIN', 'ADMIN')")
	@PutMapping("/approve/{matricule}")
	public void approveEtudiant(@PathVariable String matricule) {
		
		service.approveEtudiantCreation(matricule);
	}
	
	@PreAuthorize("hasRole('SUPER_ADMIN')")
	@PutMapping("/promoteAdmin/{matricule}")
	public void promoteAdmin(@PathVariable String matricule) {
		
		service.promteAdmin(matricule);
	}
	
	@PreAuthorize("hasAnyRole('SUPER_ADMIN', 'ADMIN')")
	@PutMapping("/promoteClub/{matricule}")
	public void promoteClub(@PathVariable String matricule) {
		
		service.promteClub(matricule);
	}
}
