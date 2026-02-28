package com.example.asgard.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.asgard.service.OperationService;

@RestController
@RequestMapping("/api/operation")
@CrossOrigin(origins = "${app.cors.allowed-origin}")
public class OperationController {

	private OperationService operation;

	public OperationController(OperationService operation) {
		super();
		this.operation = operation;
	}
	
	@PreAuthorize("hasAnyRole('SUPER_ADMIN', 'ADMIN')")
	@GetMapping("/countCourseClub")
	public float counCoursClub() {
		return this.operation.countCourseClub();
	}
	
}
