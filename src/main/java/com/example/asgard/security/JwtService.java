package com.example.asgard.security;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.asgard.model.Etudiant;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {
	
	@Value("${jwt.secret}")
	private String secret;
	
	@Value("${jwt.expiration}")
	private long expiration;
	
	private Key getSigningKey() {
        return Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));
    }
	
	public String generateToken(Etudiant etudiant) {
		Map<String, Object> claims = new HashMap<String, Object>();
		
		claims.put("matricule", etudiant.getMatricule());
		claims.put("email", etudiant.getEmail());
		claims.put("nom", etudiant.getNom());
		claims.put("niveau", etudiant.getNiveau().getId_niveau());
		claims.put("parcours", etudiant.getParcours().getId_parcours());
		claims.put("statut", etudiant.getStatut().name());
		
		
		return Jwts.builder()
				.setClaims(claims)
				.setSubject(etudiant.getEmail())
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + expiration))
				.signWith(getSigningKey(), SignatureAlgorithm.HS512)
				.compact();
	}
	
	public Claims extractClaims(String token) {
		return Jwts.parserBuilder()
				.setSigningKey(getSigningKey())
				.build()
				.parseClaimsJws(token)
				.getBody();
	}
	
	public boolean isTokenExpired(String token) {
		return	extractClaims(token).getExpiration().before(new Date());
	}
	
	
	public boolean isTokenValid(String token, Etudiant etudiant) {
		final String email = extractClaims(token).getSubject();
		
		return (email.equals(etudiant.getEmail()) && !isTokenExpired(token));
	}
	
	
	
}
