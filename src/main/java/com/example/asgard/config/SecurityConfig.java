package com.example.asgard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.asgard.security.JwtAuthenticationFilter;

@Configuration
@EnableMethodSecurity(prePostEnabled = true)
public class SecurityConfig {
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http, JwtAuthenticationFilter jwtFilter) throws Exception {
		http
			.csrf(csrf -> csrf.disable())
			.authorizeHttpRequests(auth -> auth
					.requestMatchers(
							"/swagger-ui/**",
							"/v3/api-docs/**",
							"/api/auth/login",
							"/error",
							"/api/etudiant/create",
							"/api/parcours/findAll",
							"/api/parcours/findById",
							"/api/niveau/findAll",
							"/api/niveau.findAll"
							).permitAll()
					.anyRequest().authenticated()
					)
			.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)
			.formLogin(login -> login.disable())
			.httpBasic(basic -> basic.disable());
			
		return http.build();
	}
}
