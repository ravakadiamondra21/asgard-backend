package com.example.asgard.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.asgard.dto.EtudiantResponseDto;
import com.example.asgard.dto.LoginDto;
import com.example.asgard.model.Etudiant;
import com.example.asgard.service.AuthService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {
	
	private final AuthService authService;

	public AuthController(AuthService authService) {
		super();
		this.authService = authService;
	}
	
	@PostMapping("/login")
	public EtudiantResponseDto login(@Valid @RequestBody LoginDto dto) {
		return authService.login(dto);
	}
}
