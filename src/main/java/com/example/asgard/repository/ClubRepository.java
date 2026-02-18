package com.example.asgard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.asgard.model.Club;

public interface ClubRepository extends JpaRepository<Club, String>{
	
}
