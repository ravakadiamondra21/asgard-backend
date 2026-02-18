package com.example.asgard.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.asgard.dto.EtudiantDto;
import com.example.asgard.model.Etudiant;
import com.example.asgard.model.Niveau;
import com.example.asgard.model.Parcours;
import com.example.asgard.model.enums.Statut;
import com.example.asgard.repository.EtudiantRepository;
import com.example.asgard.repository.NiveauRepository;
import com.example.asgard.repository.ParcoursRepository;

@Service
public class EtudiantService {
	private final EtudiantRepository etudiantRepo;
	private final ParcoursRepository parcoursRepo;
	private final NiveauRepository niveauRepo;
	private final PasswordEncoder passwordEncoder;

	public EtudiantService(
			EtudiantRepository etudiantRepo, 
			ParcoursRepository parcoursRepo, 
			NiveauRepository niveauRepo,
			PasswordEncoder passwordEncoder
			) {
		super();
		this.etudiantRepo = etudiantRepo;
		this.parcoursRepo = parcoursRepo;
		this.niveauRepo = niveauRepo;
		this.passwordEncoder = passwordEncoder;
		
	}
	
	public Etudiant creerEtudiant(EtudiantDto dto) {
		Etudiant etudiant = new Etudiant();
		Parcours parcours = parcoursRepo.findById(dto.getId_parcours()).orElseThrow(() -> new RuntimeException());
		Niveau niveau = niveauRepo.findById(dto.getId_niveau()).orElseThrow(() -> new RuntimeException());
		
		if(etudiantRepo.existsByEmail(dto.getEmail())) {
			 throw new RuntimeException("Email déjà utilisé");
		}
		
		etudiant.setMatricule(dto.getMatricule());
		etudiant.setEmail(dto.getEmail());
		etudiant.setNom(dto.getNom());
		etudiant.setParcours(parcours);
		etudiant.setNiveau(niveau);
		
		etudiant.setPassword(passwordEncoder.encode(dto.getPassword()));
		etudiant.setStatut(Statut.ETUDIANT);
		etudiant.setEnable(false);
		
		return etudiantRepo.save(etudiant);
		
	}
	
	public String saveProfil(String matricule, MultipartFile file) {
		
		try {
			String uploadDir = "upload/etudiant/";
			String fileName = matricule + ".jpg";
			
			Path path = Paths.get(uploadDir + fileName);
			
			Files.createDirectories(path.getParent());
			Files.write(path, file.getBytes());
			
			return "/upload/etudiant/" + fileName;
			
		} catch(IOException e) {
			
			throw new RuntimeException(e);
			
		}
		
	}
	
	public void approveEtudiantCreation(String matricule) {
		Etudiant etudiant = etudiantRepo.findByMatricule(matricule).orElseThrow();
		
		etudiant.setEnable(true);
		etudiantRepo.save(etudiant);
		
	}
	
	public void promteAdmin(String matricule) {
		Etudiant etudiant = etudiantRepo.findByMatricule(matricule).orElseThrow();
		
		etudiant.setStatut(Statut.ADMIN);;
		etudiantRepo.save(etudiant);
		
	}
	
	public void promteClub(String matricule) {
		Etudiant etudiant = etudiantRepo.findByMatricule(matricule).orElseThrow();
		
		etudiant.setStatut(Statut.CLUB);;
		etudiantRepo.save(etudiant);
		
	}

}
