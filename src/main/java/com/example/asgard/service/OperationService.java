package com.example.asgard.service;

import org.springframework.stereotype.Service;

@Service
public class OperationService {
	
	private final CoursService cours;
	private final ClubService club;
	
	

	public OperationService(CoursService cours, ClubService club) {
		super();
		this.cours = cours;
		this.club = club;
	}



	public long countCourseClub() {
		return cours.countAllCourse() + club.counAllClubs();
	}
}
