package com.example.asgard.service;

import org.springframework.stereotype.Service;

import com.example.asgard.repository.ForumRepository;

@Service
public class ForumService {
	private ForumRepository repo;

	public ForumService(ForumRepository repo) {
		super();
		this.repo = repo;
	}
	
	public long countForum() {
		return this.repo.count();
	}
}
