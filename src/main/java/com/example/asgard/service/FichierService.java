package com.example.asgard.service;

import org.springframework.stereotype.Service;

import com.example.asgard.repository.FichierRepository;

@Service
public class FichierService {
	private FichierRepository repo;

	public FichierService(FichierRepository repo) {
		super();
		this.repo = repo;
	}
	
	
}
