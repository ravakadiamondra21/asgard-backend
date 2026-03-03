package com.example.asgard.controller;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.asgard.dto.CoursclubCreateDto;
import com.example.asgard.dto.CoursclubDto;
import com.example.asgard.model.Coursclub;
import com.example.asgard.service.CoursclubService;



@RestController
@RequestMapping("/api/coursclub")
@CrossOrigin(origins = "${app.cors.allowed-origin}")
public class CoursclubController {

	private CoursclubService service;

	public CoursclubController(CoursclubService service) {
		super();
		this.service = service;
	}
	
	
	@GetMapping("/findAll")
	public List<CoursclubDto> findAll() {
		return this.service.findAllCoursclub();
	}
	
	@PreAuthorize("hasAnyRole('ADMIN', 'SUPER_ADMIN')")
	@GetMapping("/countAll")
	public float countAll() {
		return this.service.count();
	}
	
	@PreAuthorize("hasRole('CLUB')")
	@PostMapping("/createClub/{id_club}")
	public Coursclub createClub(@PathVariable String id_club, @RequestBody CoursclubCreateDto dto) {
		return this.service.createCoursclub(dto, id_club);
	}
	
	@PreAuthorize("hasAnyRole('ADMIN', 'SUPER_ADMIN')")
	@PostMapping("/createCours")
	public Coursclub createCours(@RequestBody CoursclubCreateDto dto) {
		return this.service.createCoursclub(dto);
	}
	
	@GetMapping("/findByClub/{nom_club}")
	public List<CoursclubDto> findByClub(@PathVariable String nom_club) {
		return this.service.findByClub(nom_club);
	}
}
