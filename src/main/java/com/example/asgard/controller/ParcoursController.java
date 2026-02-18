package com.example.asgard.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.asgard.dto.ParcoursDto;
import com.example.asgard.service.ParcoursService;

@RestController
@RequestMapping("/api/parcours")
@CrossOrigin(origins = "${app.cors.allowed-origin}")
public class ParcoursController {

	private final ParcoursService service;
	
	public ParcoursController(ParcoursService service) {
		super();
		this.service = service;
	}

	@PreAuthorize("hasAnyRole('SUPER_ADMIN', 'ADMIN')")
	@PostMapping("/create")
	public ParcoursDto create(@RequestBody ParcoursDto dto) {
		return service.creerParcours(dto);
	}

	@GetMapping("/findAll")
	public List<ParcoursDto> findAll() {
		return service.getAllParcours();
	}

	@GetMapping("/findById/{id_parcours}")
	public ParcoursDto findById(@PathVariable String id_parcours) {
		ParcoursDto dto = service.getById(id_parcours);
		
		if(dto == null) {
			return null;
		}
		
		return dto;
	}
	
	@PreAuthorize("hasAnyRole('SUPER_ADMIN', 'ADMIN')")
	@PatchMapping("/update/{id_parcours}")
	public void update(@PathVariable String id_parcours, @RequestBody ParcoursDto dto) {
		service.updateParcours(id_parcours, dto);
	}
	
	@PreAuthorize("hasAnyRole('SUPER_ADMIN', 'ADMIN')")
	@DeleteMapping("/delete/{id_parcours}")
	public void delete(@PathVariable String id_parcours) {
		service.deleteById(id_parcours);
	}
	
}
