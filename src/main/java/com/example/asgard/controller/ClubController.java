package com.example.asgard.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.asgard.dto.ClubDto;
import com.example.asgard.model.Club;
import com.example.asgard.service.ClubService;
import com.example.asgard.dto.ClubResponseDto;


@RestController
@RequestMapping("/api/club")
@CrossOrigin(origins = "${app.cors.allowed-origin}")
public class ClubController {
	
	private ClubService service;
	
	
	
	public ClubController(ClubService service) {
		super();
		this.service = service;
	}

	@PostMapping("/createClub")
	public ClubResponseDto createClub(@RequestBody ClubDto dto) {
		return this.service.createClub(dto);
	}
	
	@PreAuthorize("hasAnyRole('ADMIN', 'SUPER_ADMIN')")
	@PutMapping("/approve/{id_club}")
	public void approveClubCreation(@PathVariable int id_club) {
		this.service.approveClubCreation(id_club);
	}
}
