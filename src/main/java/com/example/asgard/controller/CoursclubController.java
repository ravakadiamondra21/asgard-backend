package com.example.asgard.controller;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.asgard.dto.CoursclubDto;
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
	
	@PreAuthorize("hasAnyRole=('ADMIN', 'SUPER_ADMIN')")
	@GetMapping("/countAll")
	public float countAll() {
		return this.service.count();
	}
}
