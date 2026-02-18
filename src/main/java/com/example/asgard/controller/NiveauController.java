package com.example.asgard.controller;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.asgard.dto.NiveauDto;
import com.example.asgard.service.NiveauService;

@RestController
@RequestMapping("/api/niveau")
@CrossOrigin(origins = "${app.cors.allowed-origin}")
public class NiveauController {
	
	private final NiveauService service;
	
	public NiveauController(NiveauService service) {
		super();
		this.service = service;
	}

	@PreAuthorize("hasAnyRole('SUPER_ADMIN', 'ADMIN')")
	@PostMapping
	public NiveauDto createNiveau(NiveauDto dto) {
		return service.creerNiveau(dto);
	}
	
	@GetMapping("/findAll")
	public List<NiveauDto> findAll() {
		return this.service.getAllNiveau();
	}
}
