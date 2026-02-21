package com.example.asgard.service;

import org.springframework.stereotype.Service;

import com.example.asgard.repository.ClubRepository;

@Service
public class ClubService {
	private ClubRepository repo;
	
	
	
	public ClubService(ClubRepository repo) {
		super();
		this.repo = repo;
	}



	public long counAllClubs() {
		return this.repo.count();
	}
}
