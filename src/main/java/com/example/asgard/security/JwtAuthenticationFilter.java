package com.example.asgard.security;

import java.io.IOException;
import java.util.List;

import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.example.asgard.model.Etudiant;
import com.example.asgard.repository.EtudiantRepository;

import io.jsonwebtoken.Claims;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {
	
	private final JwtService jwtService;
	private final EtudiantRepository etudiantrepo;
	
	public JwtAuthenticationFilter(JwtService jwtService, EtudiantRepository etudiantrepo) {
		super();
		this.jwtService = jwtService;
		this.etudiantrepo = etudiantrepo;
	}
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		final String authHeader = request.getHeader("Authorization");
		String token = null;
		String email = null;
		
		if(authHeader != null && authHeader.startsWith("Bearer ")) {
			
			token = authHeader.substring(7);
			
			try {
				Claims claims = jwtService.extractClaims(token);
				email = claims.getSubject();
				
			} catch(Exception e) {
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				response.getWriter().write("token invalide ou expiré");
				return;
			}
		}
		
		if(email != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			
			Etudiant etudiant = etudiantrepo.findByEmail(email).orElse(null);
			
			if(!etudiant.isEnable()) {
				response.setStatus(HttpServletResponse.SC_FORBIDDEN);
				response.getWriter().write("Compte pas encore approuvé");
				return;
			}
			
			if(etudiant != null && jwtService.isTokenValid(token, etudiant)) {
				
				String statut = etudiant.getStatut().name();
				
				var authority = new SimpleGrantedAuthority("ROLE_" + statut);
				
				UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(etudiant, null, List.of(authority));
				SecurityContextHolder.getContext().setAuthentication(authToken);
			}
		}
		
		
		filterChain.doFilter(request, response);
		
	}
}
