package com.example.asgard.service;

import org.springframework.stereotype.Service;

@Service
public class OperationService {
	
	private final CoursclubService cours;
	private final ClubService club;
	
	

	public OperationService(CoursclubService cours, ClubService club) {
		super();
		this.cours = cours;
		this.club = club;
	}



	public float countCourseClub() {
		return cours.count();
	}
}
