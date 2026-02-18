package com.example.asgard.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.asgard.model.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, String> {

	boolean existsByEmail(String email);
	
	Optional<Etudiant> findByEmail(String email);
	
	Optional<Etudiant> findByMatricule(String matricule);
}
