package com.example.asgard.controller;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.asgard.dto.EvenementDto;
import com.example.asgard.service.EvenementService;

@RestController
@RequestMapping("/api/evenement")
@CrossOrigin(origins = "${app.cors.allowed-origin}")
public class EvenementController {

	private EvenementService eventService;

	public EvenementController(EvenementService eventService) {
		super();
		this.eventService = eventService;
	}
	
	@GetMapping("/getAllEvent")
	public List<EvenementDto> getAllEvent() {
		return this.eventService.getAllEvent();
	}
}
