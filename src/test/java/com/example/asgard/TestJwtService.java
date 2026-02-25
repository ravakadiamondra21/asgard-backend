package com.example.asgard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.ReflectionTestUtils;

import com.example.asgard.model.Etudiant;
import com.example.asgard.model.Niveau;
import com.example.asgard.model.Parcours;
import com.example.asgard.model.enums.Statut;
import com.example.asgard.security.JwtService;

import io.jsonwebtoken.Claims;

class TestJwtService {

	private JwtService service;
	private Etudiant mockEtudiant;
	
	@BeforeEach
	void setUp() {
		
		service = new JwtService();
		mockEtudiant = new Etudiant();
		
		ReflectionTestUtils.setField(service, "secret", "ma_super_cle_secrete_tres_longue_pour_le_test_12345_tres_tres_long_pour_passer_le_test");
		ReflectionTestUtils.setField(service, "expiration", 3600000L);
		
		mockEtudiant.setEmail("test@eni.com");
		mockEtudiant.setMatricule("2522");
		mockEtudiant.setNom("Rakoto");
		mockEtudiant.setProfil("string");
		mockEtudiant.setPassword("Parcours@1221");
		
		Niveau n = new Niveau();
		n.setId_niveau("L1");
		
		mockEtudiant.setNiveau(n);
		
		Parcours p = new Parcours();
		p.setId_parcours("FC");
		
		mockEtudiant.setParcours(p);
		
		mockEtudiant.setEnable(true);
		mockEtudiant.setStatut(Statut.ETUDIANT);
		
		
	}
	
	
	@Test
	void testGenerateToken() {
		String token = service.generateToken(mockEtudiant);
		
		assertNotNull(token);
		assertTrue(service.isTokenValid(token, mockEtudiant));
	}
	
	
	@Test
	void testExtractClaim() {
		
		String token = service.generateToken(mockEtudiant);
		Claims claims = service.extractClaims(token);
		
		assertEquals("test@eni.com", claims.getSubject());
		assertEquals("2522", claims.get("matricule"));
	}
	
	
	@Test
	void testIsTokenExpired() {
		ReflectionTestUtils.setField(service, "expiration", 5000L);
		String token = service.generateToken(mockEtudiant);
		
		
		assertFalse(service.isTokenExpired(token));
	}
	
	
	
	

}
