package com.example.asgard.service;

import javax.management.RuntimeErrorException;

import org.springframework.security.authentication.DisabledException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.asgard.dto.EtudiantDto;
import com.example.asgard.dto.EtudiantResponseDto;
import com.example.asgard.dto.LoginDto;
import com.example.asgard.model.Etudiant;
import com.example.asgard.model.Niveau;
import com.example.asgard.model.Parcours;
import com.example.asgard.repository.EtudiantRepository;
import com.example.asgard.repository.NiveauRepository;
import com.example.asgard.repository.ParcoursRepository;
import com.example.asgard.security.JwtService;

@Service
public class AuthService {
	
	private final EtudiantRepository etudiantRepo;
	private final PasswordEncoder passwordEnc;
	private final JwtService jwtService;
	private final NiveauRepository niveauRepo;
	private final ParcoursRepository parcoursRepo;
	private final PasswordEncoder passwordEncoder;
	
	public AuthService(
			EtudiantRepository etudiantRepo, 
			PasswordEncoder passwordEnc, 
			JwtService jwtService, 
			NiveauRepository niveauRepo, 
			ParcoursRepository parcoursRepo,
			PasswordEncoder passwordEncoder
			) {
		super();
		this.etudiantRepo = etudiantRepo;
		this.passwordEnc = passwordEnc;
		this.jwtService = jwtService;
		this.niveauRepo = niveauRepo;
		this.parcoursRepo = parcoursRepo;
		this.passwordEncoder = passwordEncoder;
	}
	
	public EtudiantResponseDto login(LoginDto dto) {
		
		Etudiant etudiant = etudiantRepo.findByEmail(dto.getEmail()).orElseThrow(() -> new RuntimeException());
		
		if(!etudiant.isEnable()) {
			throw new DisabledException("Compte en attente d'approbation");
		}
		
		if(!passwordEnc.matches(dto.getPassword(), etudiant.getPassword())) {
			throw new RuntimeException("Login failed");
		}
		
		String token = jwtService.generateToken(etudiant);
		
		return new EtudiantResponseDto(etudiant.getMatricule(), etudiant.getNom(), etudiant.getEmail(), etudiant.getProfil(), etudiant.getNiveau().getId_niveau(), etudiant.getParcours().getId_parcours(), token, etudiant.getStatut().name());
	}
	
	
}
